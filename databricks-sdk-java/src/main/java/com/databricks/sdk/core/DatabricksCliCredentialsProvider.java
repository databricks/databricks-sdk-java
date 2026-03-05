package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.CachedTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.OSUtils;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InternalApi
public class DatabricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(DatabricksCliCredentialsProvider.class);

  public static final String DATABRICKS_CLI = "databricks-cli";

  private static final ObjectMapper MAPPER = new ObjectMapper();

  /**
   * offline_access controls whether the IdP issues a refresh token. It does not grant any API
   * permissions, so its presence or absence should not cause a scope mismatch error.
   */
  private static final Set<String> SCOPES_IGNORED_FOR_COMPARISON =
      Collections.singleton("offline_access");

  @Override
  public String authType() {
    return DATABRICKS_CLI;
  }

  /**
   * Builds the CLI command arguments using --host (legacy path).
   *
   * @param cliPath Path to the databricks CLI executable
   * @param config Configuration containing host, account ID, workspace ID, etc.
   * @return List of command arguments
   */
  List<String> buildHostArgs(String cliPath, DatabricksConfig config) {
    List<String> cmd =
        new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.getExperimentalIsUnifiedHost() != null && config.getExperimentalIsUnifiedHost()) {
      // For unified hosts, pass account_id, workspace_id, and experimental flag
      cmd.add("--experimental-is-unified-host");
      if (config.getAccountId() != null) {
        cmd.add("--account-id");
        cmd.add(config.getAccountId());
      }
      if (config.getWorkspaceId() != null) {
        cmd.add("--workspace-id");
        cmd.add(config.getWorkspaceId());
      }
    } else if (config.getClientType() == ClientType.ACCOUNT) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return cmd;
  }

  private CliTokenSource getDatabricksCliTokenSource(DatabricksConfig config) {
    String cliPath = config.getDatabricksCliPath();
    if (cliPath == null) {
      cliPath = OSUtils.get(config.getEnv()).getDatabricksCliPath();
    }
    if (cliPath == null) {
      LOG.debug("Databricks CLI could not be found");
      return null;
    }

    List<String> cmd;
    List<String> fallbackCmd = null;

    if (config.getProfile() != null) {
      // When profile is set, use --profile as the primary command.
      // The profile contains the full config (host, account_id, etc.).
      cmd =
          new ArrayList<>(
              Arrays.asList(cliPath, "auth", "token", "--profile", config.getProfile()));
      // Build a --host fallback for older CLIs that don't support --profile.
      if (config.getHost() != null) {
        fallbackCmd = buildHostArgs(cliPath, config);
      }
    } else {
      cmd = buildHostArgs(cliPath, config);
    }

    return new CliTokenSource(
        cmd, "token_type", "access_token", "expiry", config.getEnv(), fallbackCmd);
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    if (host == null) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getDatabricksCliTokenSource(config);
      if (tokenSource == null) {
        return null;
      }

      CachedTokenSource cachedTokenSource =
          new CachedTokenSource.Builder(tokenSource)
              .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
              .build();
      Token token =
          cachedTokenSource.getToken(); // We need this for checking if databricks CLI is installed.

      if (config.isScopesExplicitlySet()) {
        validateTokenScopes(token, config.getScopes(), config.getHost());
      }

      return OAuthHeaderFactory.fromTokenSource(cachedTokenSource);
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        LOG.warn("Most likely databricks CLI is not installed");
        return null;
      }
      if (stderr.contains("databricks OAuth is not")) {
        LOG.info("OAuth not configured or not available");
        return null;
      }
      // Scope validation failed. When the user explicitly selected databricks-cli auth,
      // surface the mismatch immediately so they get an actionable error. When we're being
      // tried as part of the default credential chain, step aside so other providers get
      // a chance.
      if (stderr.contains("do not match the configured scopes")) {
        if (DATABRICKS_CLI.equals(config.getAuthType())) {
          throw e;
        }
        LOG.warn("Databricks CLI token scope mismatch, skipping: {}", e.getMessage());
        return null;
      }
      throw e;
    }
  }

  /**
   * Validate that the token's scopes match the requested scopes from the config.
   *
   * <p>The {@code databricks auth token} command does not accept scopes yet. It returns whatever
   * token was cached from the last {@code databricks auth login}. If a user configures specific
   * scopes in the SDK config but their cached CLI token was issued with different scopes, requests
   * will silently use the wrong scopes. This check surfaces that mismatch early with an actionable
   * error telling the user how to re-authenticate with the correct scopes.
   */
  static void validateTokenScopes(Token token, List<String> requestedScopes, String host) {
    Map<String, Object> claims = getJwtClaims(token.getAccessToken());
    if (claims == null) {
      LOG.debug("Could not decode token as JWT to validate scopes");
      return;
    }

    Object tokenScopesRaw = claims.get("scope");
    if (tokenScopesRaw == null) {
      LOG.debug("Token does not contain 'scope' claim, skipping scope validation");
      return;
    }

    Set<String> tokenScopes = parseScopeClaim(tokenScopesRaw);
    if (tokenScopes == null) {
      LOG.debug("Unexpected 'scope' claim type: {}", tokenScopesRaw.getClass());
      return;
    }

    tokenScopes.removeAll(SCOPES_IGNORED_FOR_COMPARISON);
    Set<String> requested = new HashSet<>(requestedScopes);
    requested.removeAll(SCOPES_IGNORED_FOR_COMPARISON);

    if (!tokenScopes.equals(requested)) {
      List<String> sortedTokenScopes = new ArrayList<>(tokenScopes);
      Collections.sort(sortedTokenScopes);
      List<String> sortedRequested = new ArrayList<>(requested);
      Collections.sort(sortedRequested);

      // Build a re-auth command hint with scopes (excluding offline_access)
      String scopesArg = String.join(",", sortedRequested);

      throw new DatabricksException(
          String.format(
              "Token issued by Databricks CLI has scopes %s which do not match "
                  + "the configured scopes %s. Please re-authenticate with the desired scopes "
                  + "by running `databricks auth login --host %s --scopes %s`.",
              sortedTokenScopes, sortedRequested, host, scopesArg));
    }
  }

  /**
   * Decode a JWT access token and return its payload claims. Returns null if the token is not a
   * valid JWT.
   */
  private static Map<String, Object> getJwtClaims(String accessToken) {
    try {
      String[] parts = accessToken.split("\\.");
      if (parts.length != 3) {
        LOG.debug(
            "Tried to decode access token as JWT, but failed: {} components", parts.length);
        return null;
      }
      byte[] payloadBytes = Base64.getUrlDecoder().decode(parts[1]);
      String payloadJson = new String(payloadBytes, StandardCharsets.UTF_8);
      @SuppressWarnings("unchecked")
      Map<String, Object> claims = MAPPER.readValue(payloadJson, Map.class);
      return claims;
    } catch (Exception e) {
      LOG.debug("Failed to decode JWT claims: {}", e.getMessage());
      return null;
    }
  }

  /**
   * Parse the JWT "scope" claim, which can be either a space-delimited string or a JSON array.
   * Returns null if the type is unexpected.
   */
  private static Set<String> parseScopeClaim(Object scopeClaim) {
    if (scopeClaim instanceof String) {
      return new HashSet<>(Arrays.asList(((String) scopeClaim).split("\\s+")));
    } else if (scopeClaim instanceof List) {
      Set<String> scopes = new HashSet<>();
      for (Object s : (List<?>) scopeClaim) {
        scopes.add(String.valueOf(s));
      }
      return scopes;
    }
    return null;
  }
}
