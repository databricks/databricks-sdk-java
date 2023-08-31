package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import com.databricks.sdk.core.utils.AzureUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request,
 * while automatically resolving different Azure environment endpoints.
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider, AzureUtils {
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
    ensureHostPresent(config, mapper);
    RefreshableTokenSource innerToken;
    RefreshableTokenSource cloudToken;
    Optional<String> subscription = getSubscription(config);
    if (subscription.isPresent()) {
      try {
        // This will fail if the service principal has access to the workspace, but not to the subscription itself.
        // In such case, we fall back to not using the subscription.
        innerToken = tokenSourceFor(config, config.getEffectiveAzureLoginAppId(), subscription.get());
        cloudToken = tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint(), subscription.get());
        innerToken.getToken();
        cloudToken.getToken();
      } catch (DatabricksException e) {
        LOG.warn("Failed to get token for subscription. Using resource only token.");
        innerToken = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
        cloudToken = tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());
      }
    } else {
      LOG.warn("azure_workspace_resource_id field not provided. " +
              "It is recommended to specify this field in the Databricks configuration to avoid authentication errors.");
      innerToken = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
      cloudToken = tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());
    }

    RefreshableTokenSource inner = innerToken;
    RefreshableTokenSource cloud = cloudToken;

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + inner.getToken().getAccessToken());
      addWorkspaceResourceId(config, headers);
      addSpManagementToken(cloud, headers);
      return headers;
    };
  }
}
