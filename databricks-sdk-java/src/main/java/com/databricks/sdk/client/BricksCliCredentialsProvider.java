package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.Token;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>BricksCliCredentialsProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(BricksCliCredentialsProvider.class);

  /** Constant <code>BRICKS_CLI="bricks-cli"</code> */
  public static final String BRICKS_CLI = "bricks-cli";

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return BRICKS_CLI;
  }

  private CliTokenSource getBricksCliTokenSource(DatabricksConfig config) {
    String cliPath = config.getBricksCliPath();
    if (cliPath == null) {
      cliPath = "bricks";
    }
    List<String> cmd = Arrays.asList(cliPath, "auth", "token", "--host", config.getHost());
    if (config.isAccountClient()) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return new CliTokenSource(cmd, "token_type", "access_token", "expiry", config::getAllEnv);
  }

  /** {@inheritDoc} */
  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    if (host == null || !config.isAws()) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getBricksCliTokenSource(config);
      tokenSource.getToken(); // We need this for checking if bricks CLI is installed.
      return () -> {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        return headers;
      };
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("command not found")) {
        LOG.info("Most likely Bricks CLI is not installed");
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
