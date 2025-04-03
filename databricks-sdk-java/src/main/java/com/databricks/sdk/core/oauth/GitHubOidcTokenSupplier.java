package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

public class GitHubOidcTokenSupplier {

  private final ObjectMapper mapper = new ObjectMapper();

  private final DatabricksConfig config;

  public GitHubOidcTokenSupplier(DatabricksConfig config) {
    this.config = config;
  }

  /** Checks if the required parameters are present to request a GitHub's OIDC token. */
  public Boolean enabled() {
    return config.getActionsIdTokenRequestUrl() != null
        && config.getActionsIdTokenRequestToken() != null;
  }

  /**
   * Requests a GitHub's OIDC token.
   *
   * @return A GitHub OIDC token.
   */
  public String getOidcToken() {
    if (!enabled()) {
      throw new DatabricksException("Failed to request ID token: missing required parameters");
    }

    String requestUrl = config.getActionsIdTokenRequestUrl();
    if (config.getTokenAudience() != null) {
      requestUrl += "&audience=" + config.getTokenAudience();
    }

    Request req =
        new Request("GET", requestUrl)
            .withHeader("Authorization", "Bearer " + config.getActionsIdTokenRequestToken());

    Response resp;
    try {
      resp = config.getHttpClient().execute(req);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token from " + requestUrl + ":" + e.getMessage(), e);
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

    return jsonResp.get("value").textValue();
  }
}
