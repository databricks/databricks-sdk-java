package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.AzureMsiTokenSource;
import com.databricks.sdk.core.oauth.CachedTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.AzureUtils;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds refreshed Azure Active Directory (AAD) tokens obtained via Azure Managed Service Identity
 * (MSI) to every request. This provider authenticates using the Azure Instance Metadata Service
 * (IMDS) endpoint, which is available on Azure VMs and other compute resources with managed
 * identities enabled.
 */
@InternalApi
public class AzureMsiCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(AzureMsiCredentialsProvider.class);
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public String authType() {
    return "azure-msi";
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()) {
      return null;
    }

    if (!isAzureUseMsi(config)) {
      return null;
    }

    if (config.getAzureWorkspaceResourceId() == null && config.getHost() == null) {
      return null;
    }

    LOG.debug("Generating AAD token via Azure MSI");

    AzureUtils.ensureHostPresent(config, mapper, this::tokenSourceFor);

    CachedTokenSource inner = tokenSourceFor(config, config.getEffectiveAzureLoginAppId());
    CachedTokenSource cloud =
        tokenSourceFor(config, config.getAzureEnvironment().getServiceManagementEndpoint());

    return OAuthHeaderFactory.fromSuppliers(
        inner::getToken,
        () -> {
          Token token = inner.getToken();
          Map<String, String> headers = new HashMap<>();
          headers.put("Authorization", "Bearer " + token.getAccessToken());
          AzureUtils.addSpManagementToken(cloud, headers);
          AzureUtils.addWorkspaceResourceId(config, headers);
          return headers;
        });
  }

  /**
   * Null-safe check for the azureUseMsi config flag. The underlying field is a boxed Boolean, but
   * the getter auto-unboxes to primitive boolean, which would NPE when the field is null. This
   * helper treats null as false.
   */
  private static boolean isAzureUseMsi(DatabricksConfig config) {
    try {
      return config.getAzureUseMsi();
    } catch (NullPointerException e) {
      return false;
    }
  }

  /**
   * Creates a CachedTokenSource for the specified Azure resource using MSI authentication.
   *
   * @param config The DatabricksConfig instance containing the required authentication parameters.
   * @param resource The Azure resource for which OAuth tokens need to be fetched.
   * @return A CachedTokenSource instance capable of fetching OAuth tokens for the specified Azure
   *     resource.
   */
  CachedTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    AzureMsiTokenSource tokenSource =
        new AzureMsiTokenSource(config.getHttpClient(), resource, config.getAzureClientId());
    return new CachedTokenSource.Builder(tokenSource)
        .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
        .build();
  }
}
