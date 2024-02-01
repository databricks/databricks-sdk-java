package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import com.databricks.sdk.core.utils.AzureUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    AzureUtils.ensureHostPresent(config, mapper);
    RefreshableTokenSource inner = AzureUtils.tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    RefreshableTokenSource cloud =
        AzureUtils.tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + inner.getToken().getAccessToken());
      AzureUtils.addWorkspaceResourceId(config, headers);
      AzureUtils.addSpManagementToken(cloud, headers);
      return headers;
    };
  }
}
