package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import com.databricks.sdk.core.http.HttpClient;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHeaders;

/**
 * An implementation of RefreshableTokenSource implementing the refresh_token OAuth grant type.
 *
 * <p>SessionCredentials are OAuth credentials with a short-lived access token, used to make
 * requests to an API, and a long-lived refresh token, which can be used to fetch new access tokens.
 * Calling refresh() uses the refresh token to retrieve a new access token to authenticate to APIs.
 */
public class SessionCredentials extends RefreshableTokenSource
    implements CredentialsProvider, Serializable {
  private static final long serialVersionUID = 3083941540130596650L;

  @Override
  public String authType() {
    return "oauth-u2m";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put(
          HttpHeaders.AUTHORIZATION, getToken().getTokenType() + " " + getToken().getAccessToken());
      return headers;
    };
  }

  static class Builder {
    private HttpClient hc;
    private Token token;
    private String tokenUrl;
    private String redirectUrl;
    private String clientId;
    private String clientSecret;

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

    public SessionCredentials build() {
      return new SessionCredentials(this);
    }
  }

  private final HttpClient hc;
  private final String tokenUrl;
  private final String redirectUrl;
  private final String clientId;
  private final String clientSecret;

  private SessionCredentials(Builder b) {
    super(b.token);
    this.hc = b.hc;
    this.tokenUrl = b.tokenUrl;
    this.redirectUrl = b.redirectUrl;
    this.clientId = b.clientId;
    this.clientSecret = b.clientSecret;
  }

  @Override
  protected Token refresh() {
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
    return retrieveToken(
        hc, clientId, clientSecret, tokenUrl, params, headers, AuthParameterPosition.BODY);
  }
}
