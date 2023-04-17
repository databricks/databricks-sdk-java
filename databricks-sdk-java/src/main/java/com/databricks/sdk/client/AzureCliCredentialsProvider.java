package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AzureCliCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();

  public static final String AZURE_CLI = "azure-cli";

  private CliTokenSource getAzureCliTokenSource(DatabricksConfig config) {
    String resource = config.getEffectiveAzureLoginAppId();
    List<String> cmd =
        Arrays.asList(
            "az", "account", "get-access-token", "--resource", resource, "--output", "json");
    return new CliTokenSource.Builder()
        .withCmd(cmd)
        .withTokenTypeField("tokenType")
        .withAccessTokenField("accessToken")
        .withExpiryField("expiresOn")
        .build();
  }

  @Override
  public String authType() {
    return AZURE_CLI;
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getAzureCliTokenSource(config);
      Utils.ensureHostPresent(config, mapper);
      Token token = tokenSource.refresh();
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
      return () -> headers;
    } catch (Exception e) { // TODO: FileNotFoundException
      String doc = "https://docs.microsoft.com/en-us/cli/azure/?view=azure-cli-latest";
      throw new DatabricksException(
          String.format("Most likely Azure CLI is not installed. See %s for details", doc));
    }
  }
}
