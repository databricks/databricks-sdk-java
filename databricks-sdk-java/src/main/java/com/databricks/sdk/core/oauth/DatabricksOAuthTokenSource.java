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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of TokenSource that handles OAuth token exchange for Databricks authentication.
 * This class manages the OAuth token exchange flow using ID tokens to obtain access tokens.
 */
public class DatabricksOAuthTokenSource implements TokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(DatabricksOAuthTokenSource.class);

  /** OAuth client ID used for token exchange. */
  private final String clientId;
  /** Databricks host URL. */
  private final String host;
  /** Databricks account ID, used as audience if provided. */
  private final String accountId;
  /** OpenID Connect endpoints configuration. */
  private final OpenIDConnectEndpoints endpoints;
  /** Custom audience value for token exchange. */
  private final String audience;
  /** Source of ID tokens used in token exchange. */
  private final IDTokenSource idTokenSource;
  /** HTTP client for making token exchange requests. */
  private final HttpClient httpClient;

  private static final String GRANT_TYPE = "urn:ietf:params:oauth:grant-type:token-exchange";
  private static final String SUBJECT_TOKEN_TYPE = "urn:ietf:params:oauth:token-type:jwt";
  private static final String SCOPE = "all-apis";
  private static final String GRANT_TYPE_PARAM = "grant_type";
  private static final String SUBJECT_TOKEN_PARAM = "subject_token";
  private static final String SUBJECT_TOKEN_TYPE_PARAM = "subject_token_type";
  private static final String SCOPE_PARAM = "scope";
  private static final String CLIENT_ID_PARAM = "client_id";

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  private DatabricksOAuthTokenSource(Builder builder) {
    this.clientId = builder.clientId;
    this.host = builder.host;
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
     * Creates a new Builder with required parameters.
     *
     * @param clientId OAuth client ID.
     * @param host Databricks host URL.
     * @param endpoints OpenID Connect endpoints configuration.
     * @param idTokenSource Source of ID tokens.
     * @param httpClient HTTP client for making requests.
     */
    public Builder(
        String clientId,
        String host,
        OpenIDConnectEndpoints endpoints,
        IDTokenSource idTokenSource,
        HttpClient httpClient) {
      this.clientId = clientId;
      this.host = host;
      this.endpoints = endpoints;
      this.idTokenSource = idTokenSource;
      this.httpClient = httpClient;
    }

    /**
     * Sets the Databricks account ID.
     *
     * @param accountId The account ID.
     * @return This builder instance.
     */
    public Builder accountId(String accountId) {
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
      this.audience = audience;
      return this;
    }

    /**
     * Builds a new DatabricksOAuthTokenSource instance.
     *
     * @return A new DatabricksOAuthTokenSource.
     */
    public DatabricksOAuthTokenSource build() {
      return new DatabricksOAuthTokenSource(this);
    }
  }

  /**
   * Validates that a value is non-null for required fields. If the value is a string, it also
   * checks that it is non-empty.
   *
   * @param value The value to validate.
   * @param fieldName The name of the field being validated.
   * @return true if validation passes, false otherwise
   */
  private static boolean validate(Object value, String fieldName) {
    if (value == null) {
      return false;
    }
    if (value instanceof String && ((String) value).isEmpty()) {
      return false;
    }
    return true;
  }

  /**
   * Retrieves an OAuth token by exchanging an ID token. Implements the OAuth token exchange flow to
   * obtain an access token.
   *
   * @return A Token containing the access token and related information.
   * @throws DatabricksException when the token exchange fails.
   * @throws IllegalArgumentException when there is an error code in the response or when required
   *     parameters are missing.
   */
  @Override
  public Token getToken() {
    // Validate all required parameters
    if (!validate(clientId, "ClientID")
        || !validate(host, "Host")
        || !validate(endpoints, "Endpoints")
        || !validate(idTokenSource, "IDTokenSource")
        || !validate(httpClient, "HttpClient")) {
      LOG.error("Missing required parameters for token exchange");
      throw new IllegalArgumentException("Missing required parameters for token exchange.");
    }

    String effectiveAudience = determineAudience();
    IDToken idToken = idTokenSource.getIDToken(effectiveAudience);

    Map<String, String> params = new HashMap<>();
    params.put(GRANT_TYPE_PARAM, GRANT_TYPE);
    params.put(SUBJECT_TOKEN_PARAM, idToken.getValue());
    params.put(SUBJECT_TOKEN_TYPE_PARAM, SUBJECT_TOKEN_TYPE);
    params.put(SCOPE_PARAM, SCOPE);
    params.put(CLIENT_ID_PARAM, clientId);

    Response rawResponse;
    try {
      rawResponse = httpClient.execute(new FormRequest(endpoints.getTokenEndpoint(), params));
    } catch (IOException e) {
      LOG.error(
          "Failed to exchange ID token for access token at {}: {}",
          endpoints.getTokenEndpoint(),
          e.getMessage(),
          e);
      throw new DatabricksException(
          String.format(
              "Failed to exchange ID token for access token at %s: %s",
              endpoints.getTokenEndpoint(), e.getMessage()),
          e);
    }

    OAuthResponse response;
    try {
      response = OBJECT_MAPPER.readValue(rawResponse.getBody(), OAuthResponse.class);
    } catch (IOException e) {
      LOG.error(
          "Failed to parse OAuth response from token endpoint {}: {}",
          endpoints.getTokenEndpoint(),
          e.getMessage(),
          e);
      throw new DatabricksException(
          String.format(
              "Failed to parse OAuth response from token endpoint %s: %s",
              endpoints.getTokenEndpoint(), e.getMessage()));
    }

    if (response.getErrorCode() != null) {
      LOG.error(
          "Token exchange failed with error: {} - {}",
          response.getErrorCode(),
          response.getErrorSummary());
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
