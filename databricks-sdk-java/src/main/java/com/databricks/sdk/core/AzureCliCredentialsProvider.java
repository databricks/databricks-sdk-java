package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.AzureUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AzureCliCredentialsProvider implements CredentialsProvider, AzureUtils {
  private final ObjectMapper mapper = new ObjectMapper();
  private static final Logger LOG = LoggerFactory.getLogger(AzureCliCredentialsProvider.class);

  public static final String AZURE_CLI = "azure-cli";

  @Override
  public String authType() {
    return AZURE_CLI;
  }

  @Override
  public CliTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    List<String> cmd =
        new ArrayList<>(
            Arrays.asList(
                "az", "account", "get-access-token", "--resource", resource, "--output", "json"));
    return new CliTokenSource(cmd, "tokenType", "accessToken", "expiresOn", config::getAllEnv);
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()) {
      return null;
    }

    try {
      ensureHostPresent(config, mapper);
      String resource = config.getEffectiveAzureLoginAppId();
      CliTokenSource tokenSource = tokenSourceFor(config, resource);
      CliTokenSource mgmtTokenSource =
          tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());
      tokenSource.getToken(); // We need this for checking if Azure CLI is installed.
      try {
        mgmtTokenSource.getToken();
      } catch (Exception e) {
        LOG.debug("Not including service management token in headers", e);
        mgmtTokenSource = null;
      }
      CliTokenSource finalMgmtTokenSource = mgmtTokenSource;
      return () -> {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        if (finalMgmtTokenSource != null) {
          addSpManagementToken(finalMgmtTokenSource, headers);
        }
        return addWorkspaceResourceId(config, headers);
      };
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        String doc = "https://docs.microsoft.com/en-us/cli/azure/?view=azure-cli-latest";
        LOG.info(String.format("Most likely Azure CLI is not installed. See %s for details", doc));
        return null;
      }
      throw e;
    }
  }
}
