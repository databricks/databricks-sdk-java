package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AzureCliCredentialsProvider implements CredentialsProvider, AzureUtils {
  private final ObjectMapper mapper = new ObjectMapper();

  public static final String AZURE_CLI = "azure-cli";

  @Override
  public String authType() {
    return AZURE_CLI;
  }

  public CliTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    List<String> cmd =
            Arrays.asList(
                    "az", "account", "get-access-token", "--resource", resource, "--output", "json");
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
      Token token = tokenSource.refresh();
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
      return () -> headers;
    }
    catch (DatabricksException e) {
      if(e.getMessage().contains("command not found")) return null;
      throw e;
    }
    catch (Exception e) { // TODO: FileNotFoundException
      String doc = "https://docs.microsoft.com/en-us/cli/azure/?view=azure-cli-latest";
      throw new DatabricksException(
          String.format("Most likely Azure CLI is not installed. See %s for details", doc));
    }
  }
}
