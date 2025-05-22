package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;

/**
 * A credentials provider that uses a TokenSource to obtain and manage authentication tokens. This
 * class serves as a base implementation for token-based authentication, handling the conversion of
 * tokens into HTTP authorization headers.
 *
 * <p>The provider validates token availability during configuration and creates. appropriate
 * authorization headers for API requests.
 */
public class TokenSourceCredentialsProvider implements CredentialsProvider {
  private final TokenSource tokenSource;
  private final String authType;

  /**
   * Creates a new TokenSourceCredentialsProvider with the specified token source and auth type.
   *
   * @param tokenSource The token source responsible for token acquisition and management.
   * @param authType The authentication type identifier.
   */
  public TokenSourceCredentialsProvider(TokenSource tokenSource, String authType) {
    this.tokenSource = tokenSource;
    this.authType = authType;
  }

  /**
   * Configures the credentials provider and creates a HeaderFactory for generating authentication
   * headers. This method validates token availability by attempting to obtain an access token
   * before returning the HeaderFactory.
   *
   * @param config The Databricks configuration object.
   * @return A HeaderFactory that generates "Bearer" token authorization headers, or null if token
   *     acquisition fails.
   */
  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    try {
      // Validate that we can get a token before returning a HeaderFactory
      tokenSource.getToken().getAccessToken();

      return OAuthHeaderFactory.fromTokenSource(tokenSource);
    } catch (Exception e) {
      return null;
    }
  }

  /**
   * Returns the authentication type identifier for this credentials provider. This is used to
   * identify the authentication method being used.
   *
   * @return The authentication type string
   */
  @Override
  public String authType() {
    return authType;
  }
}
