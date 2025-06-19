package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.HttpClient;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of RefreshableTokenSource implementing the refresh_token OAuth grant type.
 *
 * <p>SessionCredentials are OAuth credentials with a short-lived access token, used to make
 * requests to an API, and a long-lived refresh token, which can be used to fetch new access tokens.
 * Calling refresh() uses the refresh token to retrieve a new access token to authenticate to APIs.
 */
public class SessionCredentials implements CredentialsProvider, Serializable {
  private static final long serialVersionUID = 3083941540130596650L;
  private static final Logger LOGGER = LoggerFactory.getLogger(SessionCredentials.class);

  private final SessionCredentialsTokenSource tokenSource;

  private SessionCredentials(Builder b) {
    this.tokenSource =
        new SessionCredentialsTokenSource.Builder(
                b.token, b.hc, b.tokenUrl, b.clientId, b.clientSecret)
            .withRedirectUrl(b.redirectUrl)
            .withTokenCache(b.tokenCache)
            .build();
  }

  @Override
  public String authType() {
    return "oauth-u2m";
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    return OAuthHeaderFactory.fromTokenSource(tokenSource);
  }

  static class Builder {
    private HttpClient hc;
    private Token token;
    private String tokenUrl;
    private String redirectUrl;
    private String clientId;
    private String clientSecret;
    private TokenCache tokenCache;

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public Builder withToken(Token token) {
      this.token = token;
      return this;
    }

    public Builder withTokenUrl(String tokenUrl) {
      this.tokenUrl = tokenUrl;
      return this;
    }

    public Builder withRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    public Builder withTokenCache(TokenCache tokenCache) {
      this.tokenCache = tokenCache;
      return this;
    }

    public SessionCredentials build() {
      return new SessionCredentials(this);
    }
  }
}
