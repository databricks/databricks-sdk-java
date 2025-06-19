package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TokenSource that handles OAuth token refresh for SessionCredentials.
 *
 * <p>Implements the refresh_token OAuth grant type with optional token caching.
 *
 * @see RefreshableTokenSource
 * @see Token
 * @see TokenCache
 */
public class SessionCredentialsTokenSource extends RefreshableTokenSource {
  private static final Logger LOGGER = LoggerFactory.getLogger(SessionCredentialsTokenSource.class);

  // HTTP client for making token refresh requests
  private final HttpClient hc;
  // OAuth token endpoint URL for refresh requests
  private final String tokenUrl;
  // OAuth redirect URL, used for Microsoft OAuth endpoints
  private final String redirectUrl;
  // OAuth client ID for authentication
  private final String clientId;
  // OAuth client secret for authentication
  private final String clientSecret;
  // Optional token cache for persisting refreshed tokens
  private final TokenCache tokenCache;

  /**
   * Constructs a new SessionCredentialsTokenSource with the given builder.
   *
   * @param builder The builder containing all configuration parameters
   */
  private SessionCredentialsTokenSource(Builder builder) {
    super(builder.token);
    this.hc = builder.hc;
    this.tokenUrl = builder.tokenUrl;
    this.redirectUrl = builder.redirectUrl;
    this.clientId = builder.clientId;
    this.clientSecret = builder.clientSecret;
    this.tokenCache = builder.tokenCache;
  }

  /**
   * Refreshes the OAuth token using the refresh_token grant type.
   *
   * <p>This method attempts to refresh the current token using the refresh token. If successful,
   * the new token is automatically saved to the token cache if one is configured. For Microsoft
   * OAuth endpoints, it includes the Origin header.
   *
   * @return A new {@link Token} with updated access and refresh tokens
   * @throws DatabricksException if the token is not set, refresh token is missing, or the refresh
   *     request fails
   */
  @Override
  protected Token refresh() {
    if (this.token == null) {
      throw new DatabricksException("oauth2: token is not set");
    }
    String refreshToken = this.token.getRefreshToken();
    if (refreshToken == null) {
      throw new DatabricksException("oauth2: token expired and refresh token is not set");
    }

    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "refresh_token");
    params.put("refresh_token", refreshToken);
    Map<String, String> headers = new HashMap<>();
    if (tokenUrl.contains("microsoft")) {
      // Tokens issued for the 'Single-Page Application' client-type may only be redeemed via
      // cross-origin requests
      headers.put("Origin", redirectUrl);
    }
    Token newToken =
        retrieveToken(
            hc, clientId, clientSecret, tokenUrl, params, headers, AuthParameterPosition.BODY);

    // Save the refreshed token directly to cache
    if (tokenCache != null) {
      tokenCache.save(newToken);
      LOGGER.debug("Saved refreshed token to cache");
    }
    return newToken;
  }

  /** Builder for creating SessionCredentialsTokenSource instances. */
  public static class Builder {
    private final Token token;
    private final HttpClient hc;
    private final String tokenUrl;
    private final String clientId;
    private final String clientSecret;
    private String redirectUrl;
    private TokenCache tokenCache;

    /**
     * Creates a new Builder for SessionCredentialsTokenSource with required parameters.
     *
     * @param token The initial token to use
     * @param hc The HTTP client for making token refresh requests
     * @param tokenUrl The OAuth token endpoint URL
     * @param clientId The OAuth client ID
     * @param clientSecret The OAuth client secret
     */
    public Builder(
        Token token, HttpClient hc, String tokenUrl, String clientId, String clientSecret) {
      this.token = token;
      this.hc = hc;
      this.tokenUrl = tokenUrl;
      this.clientId = clientId;
      this.clientSecret = clientSecret;
    }

    /**
     * Sets the redirect URL (optional).
     *
     * @param redirectUrl The OAuth redirect URL
     * @return This Builder instance for method chaining
     */
    public Builder withRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    /**
     * Sets the token cache (optional).
     *
     * @param tokenCache The token cache for persisting refreshed tokens
     * @return This Builder instance for method chaining
     */
    public Builder withTokenCache(TokenCache tokenCache) {
      this.tokenCache = tokenCache;
      return this;
    }

    /**
     * Builds the SessionCredentialsTokenSource instance.
     *
     * @return A new SessionCredentialsTokenSource instance
     */
    public SessionCredentialsTokenSource build() {
      return new SessionCredentialsTokenSource(this);
    }
  }
}
