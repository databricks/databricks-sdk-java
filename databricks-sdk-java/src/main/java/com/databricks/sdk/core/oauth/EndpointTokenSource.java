package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a token source that exchanges a control plane token for an endpoint-specific dataplane
 * token. It utilizes an underlying {@link DatabricksOAuthTokenSource} to obtain the initial control
 * plane token.
 */
public class EndpointTokenSource extends RefreshableTokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(EndpointTokenSource.class);
  private static final String JWT_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
  private static final String GRANT_TYPE_PARAM = "grant_type";
  private static final String AUTHORIZATION_DETAILS_PARAM = "authorization_details";
  private static final String ASSERTION_PARAM = "assertion";
  private static final String TOKEN_ENDPOINT = "/oidc/v1/token";

  private final DatabricksOAuthTokenSource cpTokenSource;
  private final String authDetails;
  private final HttpClient httpClient;

  /**
   * Constructs a new EndpointTokenSource.
   *
   * @param cpTokenSource The {@link DatabricksOAuthTokenSource} used to obtain the control plane
   *     token. Cannot be null.
   * @param authDetails The authorization details required for the token exchange. Cannot be null or
   *     empty.
   * @param httpClient The {@link HttpClient} used to make the token exchange request. Cannot be
   *     null.
   * @throws IllegalArgumentException if any of the parameters are null or invalid.
   */
  public EndpointTokenSource(
      DatabricksOAuthTokenSource cpTokenSource, String authDetails, HttpClient httpClient) {

    validate(cpTokenSource, "ControlPlaneTokenSource");
    validate(authDetails, "AuthDetails");
    validate(httpClient, "HttpClient");

    this.cpTokenSource = cpTokenSource;
    this.authDetails = authDetails;
    this.httpClient = httpClient;
  }

  /**
   * Validates that a given parameter value is not null, and if it's a String, not empty. This is a
   * helper method used to ensure constructor and method arguments meet preconditions.
   *
   * @param value The parameter value to validate.
   * @param fieldName The name of the parameter, used for logging and error messages.
   * @throws IllegalArgumentException if the value is null, or if it is a String and is empty.
   */
  private static void validate(Object value, String fieldName) {
    if (value == null) {
      LOG.error("Required parameter '{}' is null", fieldName);
      throw new IllegalArgumentException(
          String.format("Required parameter '%s' cannot be null", fieldName));
    }
    if (value instanceof String && ((String) value).isEmpty()) {
      LOG.error("Required parameter '{}' is empty", fieldName);
      throw new IllegalArgumentException(
          String.format("Required parameter '%s' cannot be empty", fieldName));
    }
  }

  /**
   * Fetches an endpoint-specific dataplane token by exchanging a control plane token.
   *
   * <p>This method first obtains a control plane token from the configured {@code cpTokenSource}.
   * It then uses this token (as an assertion) along with the provided {@code authDetails} to
   * request a new, more scoped dataplane token from the Databricks OAuth token endpoint ({@value
   * #TOKEN_ENDPOINT}).
   *
   * @return A new {@link Token} containing the exchanged dataplane access token, its type, any
   *     accompanying refresh token, and its expiry time.
   * @throws DatabricksException if the token exchange with the OAuth endpoint fails.
   */
  @Override
  protected Token refresh() {
    Token cpToken = cpTokenSource.getToken();

    Map<String, String> params = new HashMap<>();
    params.put(GRANT_TYPE_PARAM, JWT_GRANT_TYPE);
    params.put(AUTHORIZATION_DETAILS_PARAM, authDetails);
    params.put(ASSERTION_PARAM, cpToken.getAccessToken());

    OAuthResponse oauthResponse;
    try {
      oauthResponse = TokenEndpointClient.requestToken(this.httpClient, TOKEN_ENDPOINT, params);
    } catch (DatabricksException e) {
      LOG.error(
          "Failed to fetch token for endpoint source using {}: {}",
          TOKEN_ENDPOINT,
          e.getMessage(),
          e);
      throw e;
    }

    LocalDateTime expiry = LocalDateTime.now().plusSeconds(oauthResponse.getExpiresIn());
    return new Token(
        oauthResponse.getAccessToken(),
        oauthResponse.getTokenType(),
        oauthResponse.getRefreshToken(),
        expiry);
  }
}
