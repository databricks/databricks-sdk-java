package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * {@code AzureGithubOidcCredentialsProvider} is a credentials provider for GitHub Actions that use
 * an Azure Active Directory Federated Identity. It authenticates with Azure by exchanging GitHub's
 * OIDC token for an Azure Active Directory (AAD) Service Principal OAuth token. This class handles
 * the process of obtaining, refreshing, and attaching the necessary tokens to each HTTP request.
 */
public class AzureGithubOidcCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public String authType() {
    return "github-oidc-azure";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (!config.isAzure()
        || config.getAzureClientId() == null
        || config.getAzureTenantId() == null
        || config.getHost() == null) {
      return null;
    }

    Optional<String> idToken = requestIdToken(config);
    if (!idToken.isPresent()) {
      return null;
    }

    TokenSource tokenSource =
        new OidcTokenSource(
            config.getHttpClient(),
            "",
            config.getClientId(),
            config.getEffectiveAzureLoginAppId(),
            idToken.get(),
            "urn:ietf:params:oauth:client-assertion-type:jwt-bearer");

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + tokenSource.getToken().getAccessToken());
      return headers;
    };
  }

  /**
   * Requests an Azure access token using GitHub's OIDC token.
   *
   * @param config The DatabricksConfig instance containing the required authentication parameters.
   * @return An optional Azure access token.
   */
  private Optional<String> requestIdToken(DatabricksConfig config) {
    if (config.getActionsIdTokenRequestUrl() == null
        || config.getActionsIdTokenRequestToken() == null) {
      return Optional.empty();
    }

    String requestUrl =
        config.getActionsIdTokenRequestUrl() + "&audience=api://AzureADTokenExchange";
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
              + resp.getBody());
    }

    ObjectNode jsonResp;
    try {
      jsonResp = mapper.readValue(resp.getBody(), ObjectNode.class);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request ID token: corrupted token: " + e.getMessage());
    }

    return Optional.ofNullable(jsonResp.get("value").textValue());
  }
}
