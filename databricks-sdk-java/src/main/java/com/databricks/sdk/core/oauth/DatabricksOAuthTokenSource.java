package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of TokenSource that handles OAuth token exchange for Databricks authentication.
 * This class manages the OAuth token exchange flow using ID tokens to obtain access tokens.
 */
public class DatabricksOAuthTokenSource implements TokenSource {
  /** OAuth client ID used for token exchange */
  private final String clientId;
  /** Databricks account ID, used as audience if provided */
  private final String accountId;
  /** OpenID Connect endpoints configuration */
  private final OpenIDConnectEndpoints endpoints;
  /** Custom audience value for token exchange */
  private final String audience;
  /** Source of ID tokens used in token exchange */
  private final IDTokenSource idTokenSource;
  /** HTTP client for making token exchange requests */
  private final HttpClient httpClient;

  private DatabricksOAuthTokenSource(Builder builder) {
    this.clientId = builder.clientId;
    this.accountId = builder.accountId;
    this.endpoints = builder.endpoints;
    this.audience = builder.audience;
    this.idTokenSource = builder.idTokenSource;
    this.httpClient = builder.httpClient;
  }

  /**
   * Builder class for constructing DatabricksOAuthTokenSource instances. Provides a fluent
   * interface for setting required and optional parameters.
   */
  public static class Builder {
    private final String clientId;
    private final String host;
    private final OpenIDConnectEndpoints endpoints;
    private final IDTokenSource idTokenSource;
    private final HttpClient httpClient;
    private String accountId;
    private String audience;

    /**
     * Validates that a value is non-empty and non-null for required fields.
     *
     * @param value The value to validate
     * @param fieldName The name of the field being validated
     * @throws IllegalArgumentException if validation fails
     */
    private static void validate(Object value, String fieldName) {
      if (value == null) {
        throw new IllegalArgumentException(fieldName + " must be non-null");
      }
      if (value instanceof String && ((String) value).isEmpty()) {
        throw new IllegalArgumentException(fieldName + " must be non-empty");
      }
    }

    /**
     * Creates a new Builder with required parameters.
     *
     * @param clientId OAuth client ID
     * @param host Databricks host URL
     * @param endpoints OpenID Connect endpoints configuration
     * @param idTokenSource Source of ID tokens
     * @param httpClient HTTP client for making requests
     */
    public Builder(
        String clientId,
        String host,
        OpenIDConnectEndpoints endpoints,
        IDTokenSource idTokenSource,
        HttpClient httpClient) {
      validate(clientId, "ClientID");
      validate(host, "Host");
      validate(endpoints, "Endpoints");
      validate(idTokenSource, "IDTokenSource");
      validate(httpClient, "HttpClient");

      this.clientId = clientId;
      this.host = host;
      this.endpoints = endpoints;
      this.idTokenSource = idTokenSource;
      this.httpClient = httpClient;
    }

    /**
     * Sets the Databricks account ID.
     *
     * @param accountId The account ID
     * @return This builder instance
     */
    public Builder accountId(String accountId) {
      validate(accountId, "AccountID");
      this.accountId = accountId;
      return this;
    }

    /**
     * Sets a custom audience value for token exchange.
     *
     * @param audience The audience value
     * @return This builder instance
     */
    public Builder audience(String audience) {
      validate(audience, "Audience");
      this.audience = audience;
      return this;
    }

    /**
     * Builds a new DatabricksOAuthTokenSource instance.
     *
     * @return A new DatabricksOAuthTokenSource
     */
    public DatabricksOAuthTokenSource build() {
      return new DatabricksOAuthTokenSource(this);
    }
  }

  /**
   * Retrieves an OAuth token by exchanging an ID token. Implements the OAuth token exchange flow to
   * obtain an access token.
   *
   * @return A Token containing the access token and related information
   * @throws DatabricksException if token exchange fails
   */
  @Override
  public Token getToken() {
    String effectiveAudience = determineAudience();
    IDToken idToken = idTokenSource.getIDToken(effectiveAudience);

    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange");
    params.put("subject_token", idToken.getValue());
    params.put("subject_token_type", "urn:ietf:params:oauth:token-type:jwt");
    params.put("scope", "all-apis");
    params.put("client_id", clientId);

    Response rawResponse;
    try {
      rawResponse = httpClient.execute(new FormRequest(endpoints.getTokenEndpoint(), params));
    } catch (IOException e) {
      throw new DatabricksException(
          String.format(
              "Failed to exchange ID token for access token at %s: %s",
              endpoints.getTokenEndpoint(), e.getMessage()),
          e);
    }

    OAuthResponse response;
    try {
      response = new ObjectMapper().readValue(rawResponse.getBody(), OAuthResponse.class);
    } catch (IOException e) {
      throw new DatabricksException(
          String.format(
              "Failed to parse OAuth response from token endpoint %s: %s",
              endpoints.getTokenEndpoint(), e.getMessage()));
    }

    if (response.getErrorCode() != null) {
      throw new IllegalArgumentException(
          String.format(
              "Token exchange failed with error: %s - %s",
              response.getErrorCode(), response.getErrorSummary()));
    }
    LocalDateTime expiry = LocalDateTime.now().plusSeconds(response.getExpiresIn());
    return new Token(
        response.getAccessToken(), response.getTokenType(), response.getRefreshToken(), expiry);
  }

  /**
   * Determines the appropriate audience value for token exchange. Uses the following precedence: 1.
   * Custom audience if provided 2. Account ID if provided 3. Token endpoint URL as fallback
   *
   * @return The determined audience value
   */
  private String determineAudience() {
    if (!Strings.isNullOrEmpty(audience)) {
      return audience;
    }

    if (!Strings.isNullOrEmpty(accountId)) {
      return accountId;
    }

    return endpoints.getTokenEndpoint();
  }
}
