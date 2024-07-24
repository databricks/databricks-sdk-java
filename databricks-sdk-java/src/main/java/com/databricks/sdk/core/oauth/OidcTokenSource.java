package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * {@code OidcTokenSource} is responsible for obtaining OAuth tokens using the OpenID Connect (OIDC)
 * protocol. It communicates with an OAuth server to request access tokens using the client
 * credentials grant type instead of a client secret.
 */
class OidcTokenSource extends RefreshableTokenSource {

  private static final Logger LOG = LoggerFactory.getLogger(OidcTokenSource.class);

  private final HttpClient httpClient;
  private final String tokenUrl;
  private final ImmutableMap<String, String> params;

  /**
   * Constructs an {@code OidcTokenSource} with the specified parameters.
   *
   * @param httpClient The HttpClient used to make HTTP requests.
   * @param tokenUrl The URL of the token endpoint.
   * @param clientId The client ID for the OAuth application.
   * @param resource The resource for which the token is requested.
   * @param clientAssertion The client assertion used for authentication.
   * @param clientAssertionType The type of the client assertion.
   */
  public OidcTokenSource(
      HttpClient httpClient,
      String tokenUrl,
      String clientId,
      String resource,
      String clientAssertion,
      String clientAssertionType) {
    this.httpClient = httpClient;
    this.tokenUrl = tokenUrl;

    ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<>();
    putIfDefined(builder, "grant_type", "client_credentials");
    putIfDefined(builder, "resource", resource);
    putIfDefined(builder, "client_id", clientId);
    putIfDefined(builder, "client_assertion_type", clientAssertionType);
    putIfDefined(builder, "client_assertion", clientAssertion);
    this.params = builder.build();

    LOG.warn("URL: {}", tokenUrl);
  }

  // Add the key-value pair to the builder iff the value is a non-empty string.
  private static void putIfDefined(
      ImmutableMap.Builder<String, String> builder, String key, String value) {
    if (!Strings.isNullOrEmpty(value)) {
      builder.put(key, value);
    }
  }

  protected Token refresh() {
    Response rawResp;
    try {
      rawResp = httpClient.execute(new FormRequest(tokenUrl, params));
    } catch (IOException e) {
      throw new DatabricksException("Failed to request auth token: " + e.getMessage(), e);
    }

    OAuthResponse resp;
    try {
      resp = new ObjectMapper().readValue(rawResp.getBody(), OAuthResponse.class);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request auth token: corrupted token: " + e.getMessage());
    }

    if (resp.getErrorCode() != null) {
      throw new IllegalArgumentException(resp.getErrorCode() + ": " + resp.getErrorSummary());
    }
    LocalDateTime expiry = LocalDateTime.now().plusSeconds(resp.getExpiresIn());
    return new Token(resp.getAccessToken(), resp.getTokenType(), resp.getRefreshToken(), expiry);
  }
}
