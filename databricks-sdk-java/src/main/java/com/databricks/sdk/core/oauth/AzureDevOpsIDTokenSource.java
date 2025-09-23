package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Strings;
import java.io.IOException;

/**
 * AzureDevOpsIDTokenSource retrieves JWT Tokens from Azure DevOps Pipelines. This class implements
 * the IDTokenSource interface and provides a method for obtaining ID tokens specifically from Azure
 * DevOps Pipeline environment.
 * 
 * <p>This implementation follows the Azure DevOps OIDC token API as documented at:
 * https://learn.microsoft.com/en-us/rest/api/azure/devops/distributedtask/oidctoken/create
 */
public class AzureDevOpsIDTokenSource implements IDTokenSource {
  /* Access token for authenticating with Azure DevOps API */
  private final String azureDevOpsAccessToken;
  /* Team Foundation Collection URI (e.g., https://dev.azure.com/organization) */
  private final String azureDevOpsTeamFoundationCollectionUri;
  /* Plan ID for the current pipeline run */
  private final String azureDevOpsPlanId;
  /* Job ID for the current pipeline job */
  private final String azureDevOpsJobId;
  /* Team Project ID where the pipeline is running */
  private final String azureDevOpsTeamProjectId;
  /* Host type (e.g., "build", "release") */
  private final String azureDevOpsHostType;
  /* HTTP client for making requests to Azure DevOps */
  private final HttpClient httpClient;
  /* JSON mapper for parsing response data */
  private static final ObjectMapper mapper = new ObjectMapper();

  /**
   * Constructs a new AzureDevOpsIDTokenSource by reading environment variables.
   * This constructor implements fail-early validation - if any required environment
   * variables are missing, it will throw a DatabricksException immediately.
   *
   * @param httpClient The HTTP client to use for making requests
   * @throws DatabricksException if any required environment variables are missing
   */
  public AzureDevOpsIDTokenSource(HttpClient httpClient) {
    if (httpClient == null) {
      throw new DatabricksException("HttpClient cannot be null");
    }
    this.httpClient = httpClient;

    // Fail early: validate all required environment variables
    this.azureDevOpsAccessToken = validateEnvironmentVariable("SYSTEM_ACCESSTOKEN");
    this.azureDevOpsTeamFoundationCollectionUri = validateEnvironmentVariable("SYSTEM_TEAMFOUNDATIONCOLLECTIONURI");
    this.azureDevOpsPlanId = validateEnvironmentVariable("SYSTEM_PLANID");
    this.azureDevOpsJobId = validateEnvironmentVariable("SYSTEM_JOBID");
    this.azureDevOpsTeamProjectId = validateEnvironmentVariable("SYSTEM_TEAMPROJECTID");
    this.azureDevOpsHostType = validateEnvironmentVariable("SYSTEM_HOSTTYPE");
  }

  /**
   * Validates that an environment variable is present and not empty.
   *
   * @param varName The environment variable name
   * @return The environment variable value
   * @throws DatabricksException if the environment variable is missing or empty
   */
  private String validateEnvironmentVariable(String varName) {
    String value = System.getenv(varName);
    if (Strings.isNullOrEmpty(value)) {
      throw new DatabricksException(
          String.format("Missing %s, likely not calling from Azure DevOps Pipeline", varName));
    }
    return value;
  }

  /**
   * Retrieves an ID token from Azure DevOps Pipelines. This method makes an authenticated request
   * to Azure DevOps to obtain a JWT token that can later be exchanged for a Databricks access token.
   *
   * 
   * <p>Note: The audience parameter is ignored for Azure DevOps OIDC tokens as they have a
   * hardcoded audience for Azure AD integration.
   *
   * @param audience Ignored for Azure DevOps OIDC tokens
   * @return An IDToken object containing the JWT token value
   * @throws DatabricksException if the token request fails
   */
  @Override
  public IDToken getIDToken(String audience) {

    // Build Azure DevOps OIDC endpoint URL
    // Format: {collectionUri}/{teamProjectId}/_apis/distributedtask/hubs/{hostType}/plans/{planId}/jobs/{jobId}/oidctoken?api-version=7.2-preview.1
    String requestUrl = String.format(
        "%s/%s/_apis/distributedtask/hubs/%s/plans/%s/jobs/%s/oidctoken?api-version=7.2-preview.1",
        azureDevOpsTeamFoundationCollectionUri,
        azureDevOpsTeamProjectId,
        azureDevOpsHostType,
        azureDevOpsPlanId,
        azureDevOpsJobId);

    Request req = new Request("POST", requestUrl)
        .withHeader("Authorization", "Bearer " + azureDevOpsAccessToken)
        .withHeader("Content-Type", "application/json");

    Response resp;
    try {
      resp = httpClient.execute(req);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token from Azure DevOps at " + requestUrl + ": " + e.getMessage(), e);
    }

    if (resp.getStatusCode() != 200) {
      throw new DatabricksException(
          "Failed to request ID token from Azure DevOps: status code "
              + resp.getStatusCode()
              + ", response body: "
              + resp.getBody().toString());
    }

    // Parse the JSON response
    // Azure DevOps returns {"oidcToken":"***"} format, not {"value":"***"} like GitHub Actions
    ObjectNode jsonResp;
    try {
      jsonResp = mapper.readValue(resp.getBody(), ObjectNode.class);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to parse Azure DevOps OIDC token response: " + e.getMessage(), e);
    }

    // Validate response structure and token value
    if (!jsonResp.has("oidcToken")) {
      throw new DatabricksException("Azure DevOps OIDC token response missing 'oidcToken' field");
    }

    try {
      String tokenValue = jsonResp.get("oidcToken").textValue();
      if (Strings.isNullOrEmpty(tokenValue)) {
        throw new DatabricksException("Received empty OIDC token from Azure DevOps");
      }
      return new IDToken(tokenValue);
    } catch (IllegalArgumentException e) {
      throw new DatabricksException("Received invalid OIDC token from Azure DevOps: " + e.getMessage(), e);
    }
  }
}
