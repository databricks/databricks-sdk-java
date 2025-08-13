package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import com.databricks.sdk.core.utils.AzureUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request,
 * while automatically resolving different Azure environment endpoints.
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider {
  private static final Logger logger =
      LoggerFactory.getLogger(AzureServicePrincipalCredentialsProvider.class);
  private final ObjectMapper mapper = new ObjectMapper();
  private String tenantId;

  @Override
  public String authType() {
    return "azure-client-secret";
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()
        || config.getAzureClientId() == null
        || config.getAzureClientSecret() == null) {
      return null;
    }

    try {
      this.tenantId =
          config.getAzureTenantId() != null
              ? config.getAzureTenantId()
              : AzureUtils.inferTenantId(config);
    } catch (Exception e) {
      logger.warn("Failed to infer Azure tenant ID: {}", e.getMessage());
      return null;
    }

    AzureUtils.ensureHostPresent(config, mapper, this::tokenSourceFor);

    CachedTokenSource inner = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    CachedTokenSource cloud =
        tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

    return OAuthHeaderFactory.fromSuppliers(
        inner::getToken,
        () -> {
          Map<String, String> headers = new HashMap<>();
          headers.put("Authorization", "Bearer " + inner.getToken().getAccessToken());
          AzureUtils.addWorkspaceResourceId(config, headers);
          AzureUtils.addSpManagementToken(cloud, headers);
          return headers;
        });
  }

  /**
   * Creates a CachedTokenSource for the specified Azure resource.
   *
   * <p>This function constructs a CachedTokenSource instance that fetches OAuth tokens for the
   * given Azure resource. It uses the authentication parameters provided by the DatabricksConfig
   * instance to generate the tokens.
   *
   * @param config The DatabricksConfig instance containing the required authentication parameters.
   * @param resource The Azure resource for which OAuth tokens need to be fetched.
   * @return A CachedTokenSource instance capable of fetching OAuth tokens for the specified Azure
   *     resource.
   */
  private CachedTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    String aadEndpoint = config.getAzureEnvironment().getActiveDirectoryEndpoint();
    String tokenUrl = aadEndpoint + this.tenantId + "/oauth2/token";
    Map<String, String> endpointParams = new HashMap<>();
    endpointParams.put("resource", resource);

    ClientCredentials clientCredentials =
        new ClientCredentials.Builder()
            .withHttpClient(config.getHttpClient())
            .withClientId(config.getAzureClientId())
            .withClientSecret(config.getAzureClientSecret())
            .withTokenUrl(tokenUrl)
            .withEndpointParametersSupplier(() -> endpointParams)
            .withAuthParameterPosition(AuthParameterPosition.BODY)
            .build();
    return new CachedTokenSource.Builder(clientCredentials)
        .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
        .build();
  }
}
