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
    String tokenUrl = aadEndpoint + config.getAzureTenantId() + "/oauth2/token";
    Map<String, String> endpointParams = new HashMap<>();
    endpointParams.put("resource", resource);
    return new ClientCredentials.Builder()
        .withHttpClient(config.getHttpClient())
        .withClientId(config.getAzureClientId())
        .withClientSecret(config.getAzureClientSecret())
        .withTokenUrl(tokenUrl)
        .withEndpointParameters(endpointParams)
        .withAuthParameterPosition(AuthParameterPosition.BODY)
        .build();
  }

  /** Resolves Azure Databricks workspace URL from ARM Resource ID */
  public void ensureHostPresent(DatabricksConfig config) {
    if (config.getHost() != null) {
      return;
    }

    String armEndpoint = config.getAzureEnvironment().getResourceManagerEndpoint();
    Token token = tokenSourceFor(config, armEndpoint).refresh();
    String requestUrl =
        armEndpoint + config.getAzureWorkspaceResourceId() + "?api-version=2018-04-01";
    Request req = new Request("GET", requestUrl);
    req.withHeader("Authorization", "Bearer " + token.getAccessToken());

    try {
      Response resp = config.getHttpClient().execute(req);
      if (resp.getStatusCode() != 200) {
        throw new DatabricksException(
            "Failed fetching workspace URL: status code "
                + resp.getStatusCode()
                + ", response body: "
                + resp.getBody());
      }

      ObjectNode jsonResponse = mapper.readValue(resp.getBody(), ObjectNode.class);
      String workspaceUrl = jsonResponse.get("properties").get("workspaceUrl").asText();
      config.setHost("https://" + workspaceUrl);
    } catch (IOException e) {
      throw new DatabricksException("Unable to fetch workspace URL: " + e.getMessage(), e);
    }
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()
        || config.getAzureClientId() == null
        || config.getAzureClientSecret() == null
        || config.getAzureTenantId() == null) {
      return null;
    }
    ensureHostPresent(config);
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
