package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.oauth.*;
import com.databricks.sdk.service.provisioning.Workspace;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;

public class AzureUtils {

  public static String getWorkspaceFromJsonResponse(ObjectNode jsonResponse) throws IOException {
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
  public static void ensureHostPresent(
      DatabricksConfig config,
      ObjectMapper mapper,
      BiFunction<DatabricksConfig, String, TokenSource> tokenSourceFor) {
    if (config.getHost() != null) {
      return;
    }

    if (config.getAzureWorkspaceResourceId() == null) {
      return;
    }

    String armEndpoint = config.getAzureEnvironment().getResourceManagerEndpoint();
    Token token = tokenSourceFor.apply(config, armEndpoint).getToken();
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

  public static Map<String, String> addWorkspaceResourceId(
      DatabricksConfig config, Map<String, String> headers) {
    if (config.getAzureWorkspaceResourceId() != null) {
      headers.put("X-Databricks-Azure-Workspace-Resource-Id", config.getAzureWorkspaceResourceId());
    }
    return headers;
  }

  public static Map<String, String> addSpManagementToken(
      TokenSource tokenSource, Map<String, String> headers) {
    headers.put("X-Databricks-Azure-SP-Management-Token", tokenSource.getToken().getAccessToken());
    return headers;
  }

  public static Optional<String> getAzureWorkspaceResourceId(Workspace workspace) {
    if (workspace.getAzureWorkspaceInfo() == null) {
      return Optional.empty();
    }

    String resourceId =
        String.format(
            "/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Databricks/workspaces/%s",
            workspace.getAzureWorkspaceInfo().getSubscriptionId(),
            workspace.getAzureWorkspaceInfo().getResourceGroup(),
            workspace.getWorkspaceName());
    return Optional.of(resourceId);
  }
}
