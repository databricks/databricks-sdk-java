package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request,
 * while automatically resolving different Azure environment endpoints.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider, AzureUtils {
  private final ObjectMapper mapper = new ObjectMapper();

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return "azure-client-secret";
  }

  /** {@inheritDoc} */
  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()
        || config.getAzureClientId() == null
        || config.getAzureClientSecret() == null
        || config.getAzureTenantId() == null) {
      return null;
    }
    ensureHostPresent(config, mapper);
    RefreshableTokenSource inner = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    RefreshableTokenSource cloud =
        tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

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
