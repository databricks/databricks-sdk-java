package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.http.client.methods.HttpGet;

/**
 * Adds refreshed Azure Active Directory (AAD) Service Principal OAuth tokens to every request,
 * while automatically resolving different Azure environment endpoints.
 */
public class AzureServicePrincipalCredentialsProvider implements CredentialsProvider {
  private final HttpClient hc;

  public AzureServicePrincipalCredentialsProvider(HttpClient hc) {
    this.hc = hc;
  }

  @Override
  public String authType() {
    return "azure-client-secret";
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
  RefreshableTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
    String aadEndpoint = config.getAzureEnvironment().getActiveDirectoryEndpoint();
    Map<String, String> endpointParams = new HashMap<>();
    endpointParams.put("resource", resource);
    return new ClientCredentials(
        this.hc,
        config.getAzureClientId(),
        config.getAzureClientSecret(),
        aadEndpoint + config.getAzureTenantId() + "/oauth2/token",
        endpointParams,
        null,
        true,
        false);
  }

  /** Resolves Azure Databricks workspace URL from ARM Resource ID */
  public void ensureHostPresent(
      DatabricksConfig cfg,
      BiFunction<DatabricksConfig, String, RefreshableTokenSource> tokenSourceFor) {
    if (cfg.getHost() != null) {
      return;
    }

    String armEndpoint = cfg.getAzureEnvironment().getResourceManagerEndpoint();
    Token token = tokenSourceFor.apply(cfg, armEndpoint).refresh();
    String requestUrl = armEndpoint + cfg.getAzureWorkspaceResourceId() + "?api-version=2018-04-01";
    HttpGet httpGet = new HttpGet(requestUrl);
    httpGet.setHeader("Authorization", "Bearer " + token.getAccessToken());

    ObjectNode jsonResponse = hc.execute(httpGet, ObjectNode.class);
    String workspaceUrl = jsonResponse.get("properties").get("workspaceUrl").asText();
    cfg.setHost("https://" + workspaceUrl);
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure() || config.getAzureClientId() == null || config.getAzureClientSecret() == null || config.getAzureTenantId() == null) {
      return null;
    }
    ensureHostPresent(config, this::tokenSourceFor);
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
