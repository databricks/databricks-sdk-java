package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.Token;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(BricksCliCredentialsProvider.class);

  public static final String BRICKS_CLI = "databricks-cli";

  @Override
  public String authType() {
    return BRICKS_CLI;
  }

  private CliTokenSource getBricksCliTokenSource(DatabricksConfig config) {
    String cliPath = config.getBricksCliPath();
    if (cliPath == null) {
      cliPath = "databricks";
    }
    List<String> cmd =
        new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.isAccountClient()) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return new CliTokenSource(cmd, "token_type", "access_token", "expiry", config::getAllEnv);
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    if (host == null || !config.isAws()) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getBricksCliTokenSource(config);
      tokenSource.getToken(); // We need this for checking if Databricks CLI is installed.
      return () -> {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        return headers;
      };
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        LOG.info("Most likely Databricks CLI is not installed");
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
