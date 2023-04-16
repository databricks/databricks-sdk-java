package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.*;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request,
 * while automatically resolving different Azure environment endpoints.
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public String authType() {
    return "azure-client-secret";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()
        || config.getAzureClientId() == null
        || config.getAzureClientSecret() == null
        || config.getAzureTenantId() == null) {
      return null;
    }
    Utils.ensureHostPresent(config, mapper);
    RefreshableTokenSource inner = Utils.tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    RefreshableTokenSource cloud =
        Utils.tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + inner.getToken().getAccessToken());
      headers.put("X-Databricks-Azure-SP-Management-Token", cloud.getToken().getAccessToken());
      if (config.getAzureWorkspaceResourceId() != null) {
        headers.put(
            "X-Databricks-Azure-Workspace-Resource-Id", config.getAzureWorkspaceResourceId());
      }
      return headers;
    };
  }
}
