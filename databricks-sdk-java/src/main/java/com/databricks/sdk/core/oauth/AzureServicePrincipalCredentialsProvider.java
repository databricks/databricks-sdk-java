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
    AzureUtils.ensureHostPresent(
        config, mapper, AzureServicePrincipalCredentialsProvider::tokenSourceFor);
    RefreshableTokenSource inner = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    RefreshableTokenSource cloud =
        tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + inner.getToken().getAccessToken());
      AzureUtils.addWorkspaceResourceId(config, headers);
      AzureUtils.addSpManagementToken(cloud, headers);
      return headers;
    };
  }

  /**
   * Creates a RefreshableTokenSource for the specified Azure resource.
   *
   * <p>This function constructs a RefreshableTokenSource instance that fetches OAuth tokens for the
   * given Azure resource. It uses the authentication parameters provided by the DatabricksConfig
   * instance to generate the tokens.
   *
   * @param config The DatabricksConfig instance containing the required authentication parameters.
   * @param resource The Azure resource for which OAuth tokens need to be fetched.
   * @return A RefreshableTokenSource instance capable of fetching OAuth tokens for the specified
   *     Azure resource.
   */
  private static RefreshableTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    String aadEndpoint = config.getAzureEnvironment().getActiveDirectoryEndpoint();
    String tokenUrl = aadEndpoint + config.getAzureTenantId() + "/oauth2/token";
    Map<String, String> endpointParams = new HashMap<>();
    endpointParams.put("resource", resource);
    return new ClientCredentials.Builder()
        .withHttpClient(config.getHttpClient())
        .withClientId(config.getAzureClientId())
        .withClientSecret(config.getAzureClientSecret())
        .withTokenUrl(tokenUrl)
        .withEndpointParametersSupplier(() -> endpointParams)
        .withAuthParameterPosition(AuthParameterPosition.BODY)
        .build();
  }
}
