package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.utils.OSUtils;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(DatabricksCliCredentialsProvider.class);

  public static final String DATABRICKS_CLI = "databricks-cli";

  @Override
  public String authType() {
    return DATABRICKS_CLI;
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
    List<String> cmd =
        new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.isAccountClient()) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return new CliTokenSource(cmd, "token_type", "access_token", "expiry", config.getEnv());
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
      tokenSource.getToken(); // We need this for checking if databricks CLI is installed.
      return OAuthHeaderFactory.fromTokenSource(tokenSource);
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
