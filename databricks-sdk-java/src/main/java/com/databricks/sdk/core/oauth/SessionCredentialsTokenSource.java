package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.support.InternalApi;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TokenSource that handles OAuth token refresh for SessionCredentials.
 *
 * <p>Implements the refresh_token OAuth grant type with optional token caching.
 */
@InternalApi
public class SessionCredentialsTokenSource implements TokenSource {
  private static final Logger LOGGER = LoggerFactory.getLogger(SessionCredentialsTokenSource.class);

  // The token to use for the session
  private Token token;
  // HTTP client for making token refresh requests
  private final HttpClient hc;
  // OAuth token endpoint URL for refresh requests
  private final String tokenUrl;
  // OAuth redirect URL, used for Microsoft OAuth endpoints
  private final Optional<String> redirectUrl;
  // OAuth client ID for authentication
  private final String clientId;
  // OAuth client secret for authentication
  private final String clientSecret;
  // Optional token cache for persisting refreshed tokens
  private final Optional<TokenCache> tokenCache;

  /**
   * Constructs a new SessionCredentialsTokenSource.
   *
   * @param token The initial token to use
   * @param hc The HTTP client for making token refresh requests
   * @param tokenUrl The OAuth token endpoint URL
   * @param clientId The OAuth client ID
   * @param clientSecret The OAuth client secret
   * @param redirectUrl The OAuth redirect URL (optional)
   * @param tokenCache The token cache for persisting refreshed tokens (optional)
   */
  public SessionCredentialsTokenSource(
      Token token,
      HttpClient hc,
      String tokenUrl,
      String clientId,
      String clientSecret,
      Optional<String> redirectUrl,
      Optional<TokenCache> tokenCache) {
    this.token = token;
    this.hc = hc;
    this.tokenUrl = tokenUrl;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.redirectUrl = redirectUrl;
    this.tokenCache = tokenCache;
  }

  /**
   * Refreshes the OAuth token using the refresh_token grant type.
   *
   * <p>This method attempts to refresh the current token using the refresh token. If successful,
   * the new token is automatically saved to the token cache if one is configured. For Microsoft
   * OAuth endpoints, it includes the Origin header.
   *
   * @return A new {@link Token} with updated access and refresh tokens.
   * @throws DatabricksException if the token is not set, refresh token is missing, or the refresh
   *     request fails.
   */
  @Override
  public Token getToken() {
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
      redirectUrl.ifPresent(url -> headers.put("Origin", url));
    }
    this.token =
        TokenEndpointClient.retrieveToken(
            hc, clientId, clientSecret, tokenUrl, params, headers, AuthParameterPosition.BODY);

    // Save the refreshed token directly to cache
    tokenCache.ifPresent(
        cache -> {
          cache.save(this.token);
          LOGGER.debug("Saved refreshed token to cache");
        });
    return this.token;
  }
}
