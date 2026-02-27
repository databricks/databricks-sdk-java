package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.CachedTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.utils.OSUtils;
import com.databricks.sdk.support.InternalApi;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InternalApi
public class DatabricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(DatabricksCliCredentialsProvider.class);

  public static final String DATABRICKS_CLI = "databricks-cli";

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
      cachedTokenSource.getToken(); // We need this for checking if databricks CLI is installed.

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
      throw e;
    }
  }
}
