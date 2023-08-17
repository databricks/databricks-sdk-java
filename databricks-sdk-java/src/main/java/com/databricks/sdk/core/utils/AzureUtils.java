package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.oauth.AuthParameterPosition;
import com.databricks.sdk.core.oauth.ClientCredentials;
import com.databricks.sdk.core.oauth.RefreshableTokenSource;
import com.databricks.sdk.core.oauth.Token;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface AzureUtils {

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
  default RefreshableTokenSource tokenSourceFor(DatabricksConfig config, String resource) {
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

  default String getWorkspaceFromJsonResponse(ObjectNode jsonResponse) throws IOException {
    JsonNode properties = jsonResponse.get("properties");
    if (properties == null) {
      throw new IOException("Properties not found");
    }

    JsonNode workspaceUrl = properties.get("workspaceUrl");
    if (workspaceUrl == null) {
      throw new IOException("Workspace Url not found in properties");
    }

    return workspaceUrl.asText();
  }

  /** Resolves Azure Databricks workspace URL from ARM Resource ID */
  default void ensureHostPresent(DatabricksConfig config, ObjectMapper mapper) {
    if (config.getHost() != null) {
      return;
    }

    if (config.getAzureWorkspaceResourceId() == null) {
      return;
    }

    String armEndpoint = config.getAzureEnvironment().getResourceManagerEndpoint();
    Token token = tokenSourceFor(config, armEndpoint).getToken();
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
      String workspaceUrl = getWorkspaceFromJsonResponse(jsonResponse);
      config.setHost("https://" + workspaceUrl);
    } catch (IOException e) {
      throw new DatabricksException("Unable to fetch workspace URL: " + e.getMessage(), e);
    }
  }

  default Map<String, String> addWorkspaceResourceId(DatabricksConfig config, Map<String, String> headers) {
    if (config.getAzureWorkspaceResourceId() != null) {
      headers.put(
          "X-Databricks-Azure-Workspace-Resource-Id", config.getAzureWorkspaceResourceId());
    }
    return headers;
  }

  default Map<String, String> addSpManagementToken(RefreshableTokenSource tokenSource, Map<String, String> headers) {
    headers.put("X-Databricks-Azure-SP-Management-Token", tokenSource.getToken().getAccessToken());
    return headers;
  }
}
