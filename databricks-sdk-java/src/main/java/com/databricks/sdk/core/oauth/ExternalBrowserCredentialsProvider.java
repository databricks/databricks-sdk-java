package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.InternalApi;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application. Uses a specified TokenCache or creates a
 * default one if none is provided.
 */
@InternalApi
public class ExternalBrowserCredentialsProvider implements CredentialsProvider {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(ExternalBrowserCredentialsProvider.class);

  private TokenCache tokenCache;

  /**
   * Creates a new ExternalBrowserCredentialsProvider with the specified TokenCache.
   *
   * @param tokenCache the TokenCache to use for caching tokens
   */
  public ExternalBrowserCredentialsProvider(TokenCache tokenCache) {
    this.tokenCache = tokenCache;
  }

  /**
   * Creates a new ExternalBrowserCredentialsProvider with a default TokenCache. A FileTokenCache
   * will be created when credentials are configured.
   */
  public ExternalBrowserCredentialsProvider() {
    this(null);
  }

  @Override
  public String authType() {
    return "external-browser";
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    if (config.getHost() == null || !Objects.equals(config.getAuthType(), "external-browser")) {
      return null;
    }

    // Use the utility class to resolve client ID and client secret
    String clientId = OAuthClientUtils.resolveClientId(config);
    String clientSecret = OAuthClientUtils.resolveClientSecret(config);
    OpenIDConnectEndpoints oidcEndpoints = null;
    try  {
      oidcEndpoints = OAuthClientUtils.resolveOidcEndpoints(config);
    } catch (IOException e) {
      LOGGER.error("Failed to resolve OIDC endpoints: {}", e.getMessage());
      return null;
    }

    try {
      if (tokenCache == null) {
        // Create a default FileTokenCache based on config
        Path cachePath =
            TokenCacheUtils.getCacheFilePath(config.getHost(), clientId, config.getScopes());
        tokenCache = new FileTokenCache(cachePath);
      }

      // First try to use the cached token if available (will return null if disabled)
      Token cachedToken = tokenCache.load();
      if (cachedToken != null) {
        LOGGER.debug("Found cached token for {}:{}", config.getHost(), clientId);

        try {
          // Create SessionCredentialsTokenSource with the cached token and try to refresh if needed
          SessionCredentialsTokenSource tokenSource =
              new SessionCredentialsTokenSource(
                  cachedToken,
                  config.getHttpClient(),
                  oidcEndpoints.getTokenEndpoint(),
                  clientId,
                  clientSecret,
                  Optional.of(config.getEffectiveOAuthRedirectUrl()),
                  Optional.of(tokenCache));

          CachedTokenSource cachedTokenSource =
              new CachedTokenSource.Builder(tokenSource)
                  .setToken(cachedToken)
                  .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
                  .build();
          LOGGER.debug("Using cached token, will refresh if necessary");
          cachedTokenSource.getToken();
          return OAuthHeaderFactory.fromTokenSource(cachedTokenSource);
        } catch (Exception e) {
          // If token refresh fails, log and continue to browser auth
          LOGGER.info("Token refresh failed: {}, falling back to browser auth", e.getMessage());
        }
      }

      // If no cached token or refresh failed, perform browser auth
      CachedTokenSource cachedTokenSource =
          performBrowserAuth(config, clientId, clientSecret, tokenCache, oidcEndpoints);
      tokenCache.save(cachedTokenSource.getToken());
      return OAuthHeaderFactory.fromTokenSource(cachedTokenSource);
    } catch (IOException | DatabricksException e) {
      LOGGER.error("Failed to authenticate: {}", e.getMessage());
      return null;
    }
  }

  protected List<String> getScopes(DatabricksConfig config, OpenIDConnectEndpoints oidcEndpoints) {
    // Get user-provided scopes and add required default scopes.
    Set<String> scopes = new HashSet<>(config.getScopes());
    // Requesting a refresh token is most of the time the right thing to do from a
    // user perspective to enable long-lived access to the API. However, some Identity
    // Providers do not support refresh tokens.
    if (!config.getDisableOauthRefreshToken()) {
      scopes.add("offline_access");
    }
    if (config.isAzure()) {
      scopes.add(config.getEffectiveAzureLoginAppId() + "/user_impersonation");
    }
    return new ArrayList<>(scopes);
  }

  CachedTokenSource performBrowserAuth(
      DatabricksConfig config, String clientId, String clientSecret, TokenCache tokenCache, OpenIDConnectEndpoints oidcEndpoints)
      throws IOException {
    LOGGER.debug("Performing browser authentication");

    OAuthClient client =
        new OAuthClient.Builder()
            .withHttpClient(config.getHttpClient())
            .withClientId(clientId)
            .withClientSecret(clientSecret)
            .withHost(config.getHost())
            .withAccountId(config.getAccountId())
            .withRedirectUrl(config.getEffectiveOAuthRedirectUrl())
            .withBrowserTimeout(config.getOAuthBrowserAuthTimeout())
            .withScopes(getScopes(config, oidcEndpoints))
            .withOpenIDConnectEndpoints(oidcEndpoints)
            .build();
    Consent consent = client.initiateConsent();

    // Use the existing browser flow to get credentials.
    Token token = consent.getTokenFromExternalBrowser();

    // Create a SessionCredentialsTokenSource with the token from browser auth.
    SessionCredentialsTokenSource tokenSource =
        new SessionCredentialsTokenSource(
            token,
            config.getHttpClient(),
            oidcEndpoints.getTokenEndpoint(),
            config.getClientId(),
            config.getClientSecret(),
            Optional.ofNullable(config.getEffectiveOAuthRedirectUrl()),
            Optional.ofNullable(tokenCache));

    return new CachedTokenSource.Builder(tokenSource)
        .setToken(token)
        .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
        .build();
  }
}
