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
 * GithubIDTokenSource retrieves JWT Tokens from GitHub Actions. This class implements the
 * IDTokenSource interface and provides a method for obtaining ID tokens specifically from GitHub
 * Actions environment.
 */
public class GithubIDTokenSource implements IDTokenSource {
  // URL endpoint for requesting ID tokens from GitHub Actions
  private final String actionsIDTokenRequestURL;
  // Authentication token required to request ID tokens from GitHub Actions
  private final String actionsIDTokenRequestToken;
  // HTTP client for making requests to GitHub Actions
  private final HttpClient httpClient;
  // JSON mapper for parsing response data
  private final ObjectMapper mapper = new ObjectMapper();

  /**
   * Constructs a new GithubIDTokenSource.
   *
   * @param actionsIDTokenRequestURL The URL to request the ID token from GitHub Actions.
   * @param actionsIDTokenRequestToken The token used to authenticate the request.
   * @param httpClient The HTTP client to use for making requests.
   */
  public GithubIDTokenSource(
      String actionsIDTokenRequestURL, String actionsIDTokenRequestToken, HttpClient httpClient) {
    this.actionsIDTokenRequestURL = actionsIDTokenRequestURL;
    this.actionsIDTokenRequestToken = actionsIDTokenRequestToken;
    this.httpClient = httpClient;
  }

  /**
   * Retrieves an ID token from GitHub Actions. This method makes an authenticated request to GitHub
   * Actions to obtain a JWT token that later can be exchanged for a Databricks access token.
   *
   * @param audience Optional audience claim for the token. If provided, it will be included in the
   *     token request to GitHub Actions.
   * @return An IDToken object containing the JWT token value
   * @throws DatabricksException if the token request fails or if required configuration is missing
   */
  @Override
  public IDToken getIDToken(String audience) {
    // Validate required configuration
    if (Strings.isNullOrEmpty(actionsIDTokenRequestURL)) {
      throw new DatabricksException("Missing ActionsIDTokenRequestURL");
    }
    if (Strings.isNullOrEmpty(actionsIDTokenRequestToken)) {
      throw new DatabricksException("Missing ActionsIDTokenRequestToken");
    }
    if (httpClient == null) {
      throw new DatabricksException("HttpClient cannot be null");
    }

    String requestUrl = actionsIDTokenRequestURL;
    if (!Strings.isNullOrEmpty(audience)) {
      requestUrl = String.format("%s&audience=%s", requestUrl, audience);
    }

    Request req =
        new Request("GET", requestUrl)
            .withHeader("Authorization", "Bearer " + actionsIDTokenRequestToken);

    Response resp;
    try {
      resp = httpClient.execute(req);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token from " + requestUrl + ": " + e.getMessage(), e);
    }

    // Validate response status code
    if (resp.getStatusCode() != 200) {
      throw new DatabricksException(
          "Failed to request ID token: status code "
              + resp.getStatusCode()
              + ", response body: "
              + resp.getBody().toString());
    }

    // Parse the JSON response
    ObjectNode jsonResp;
    try {
      jsonResp = mapper.readValue(resp.getBody(), ObjectNode.class);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token: corrupted token: " + e.getMessage());
    }

    // Validate response structure and token value
    if (!jsonResp.has("value")) {
      throw new DatabricksException("ID token response missing 'value' field");
    }

    String tokenValue = jsonResp.get("value").textValue();
    if (Strings.isNullOrEmpty(tokenValue)) {
      throw new DatabricksException("Received empty ID token from GitHub Actions");
    }

    return new IDToken(tokenValue);
  }
}
