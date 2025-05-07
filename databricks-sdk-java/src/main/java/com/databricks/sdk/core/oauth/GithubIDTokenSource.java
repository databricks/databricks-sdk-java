package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Strings;
import java.io.IOException;

/** GithubIDTokenSource retrieves JWT Tokens from GitHub Actions. */
public class GithubIDTokenSource implements IDTokenSource {
  private final String actionsIDTokenRequestURL;
  private final String actionsIDTokenRequestToken;
  private final HttpClient httpClient;
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

  @Override
  public IDToken getIDToken(String audience) {
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

    if (resp.getStatusCode() != 200) {
      throw new DatabricksException(
          "Failed to request ID token: status code "
              + resp.getStatusCode()
              + ", response body: "
              + resp.getBody().toString());
    }

    ObjectNode jsonResp;
    try {
      jsonResp = mapper.readValue(resp.getBody(), ObjectNode.class);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token: corrupted token: " + e.getMessage());
    }

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
