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
import java.net.URL;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AzureUtils {

  private static final Logger logger = LoggerFactory.getLogger(AzureUtils.class);

  /** Azure authentication endpoint for tenant ID discovery */
  private static final String AZURE_AUTH_ENDPOINT = "/aad/auth";

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

  /**
   * Infers the Azure tenant ID from the Databricks workspace login page.
   * 
   * @param config The DatabricksConfig instance
   * @return the discovered tenant ID, or null if discovery fails
   */
  public static String inferTenantId(DatabricksConfig config) {
    if (config.getAzureTenantId() != null) {
      return config.getAzureTenantId();
    }
    
    if (!config.isAzure() || config.getHost() == null) {
      logger.warn("Cannot infer tenant ID: workspace is not Azure or host is missing");
      return null;
    }
    
    String loginUrl = config.getHost() + AZURE_AUTH_ENDPOINT;

    try {
      String redirectLocation = getRedirectLocation(config, loginUrl);
      if (redirectLocation == null) {
        logger.warn("Failed to get redirect location from Azure auth endpoint: {}", loginUrl);
        return null;
      }
      
      String extractedTenantId = extractTenantIdFromUrl(redirectLocation);
      if (extractedTenantId == null) {
        logger.warn("Failed to extract tenant ID from redirect URL: {}", redirectLocation);
        return null;
      }
      
      logger.info("Successfully discovered Azure tenant ID: {}", extractedTenantId);
      return extractedTenantId;
      
    } catch (Exception e) {
      logger.warn("Exception occurred while inferring Azure tenant ID from {}: {}", loginUrl, e.getMessage());
      return null;
    }
  }
  
  private static String getRedirectLocation(DatabricksConfig config, String loginUrl) throws IOException {
    Request request = new Request("GET", loginUrl);
    request.setRedirectionBehavior(false);
    Response response = config.getHttpClient().execute(request);
    
    if (response.getStatusCode() != 302) {
      logger.warn("Expected redirect (302) from {}, got status code: {}", loginUrl, response.getStatusCode());
      return null;
    }
    
    String location = response.getFirstHeader("Location");
    if (location == null) {
      logger.warn("No Location header in redirect response from {}", loginUrl);
    }
    
    return location;
  }
  
  private static String extractTenantIdFromUrl(String redirectUrl) {
    try {
      // Parse: https://login.microsoftonline.com/<tenant-id>/oauth2/authorize?...
      URL entraIdUrl = new URL(redirectUrl);
      String[] pathSegments = entraIdUrl.getPath().split("/");
      
      if (pathSegments.length < 2) {
        logger.warn("Invalid path in Location header: {}", entraIdUrl.getPath());
        return null;
      }

        return pathSegments[1];
    } catch (Exception e) {
      logger.warn("Failed to parse tenant ID from URL {}: {}", redirectUrl, e.getMessage());
      return null;
    }
  }
}
