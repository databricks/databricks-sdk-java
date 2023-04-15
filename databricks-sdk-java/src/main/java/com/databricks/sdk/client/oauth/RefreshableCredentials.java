package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.http.HttpClient;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * An implementation of RefreshableTokenSource implementing the refresh_token OAuth grant type.
 *
 * <p>RefreshableCredentials are OAuth credentials with a short-lived access token, used to make
 * requests to an API, and a long-lived refresh token, which can be used to fetch new access tokens.
 * Calling refresh() uses the refresh token to retrieve a new access token to authenticate to APIs.
 */
public class RefreshableCredentials extends RefreshableTokenSource {
  static class Builder {
    private HttpClient hc;
    private Token token;
    private URI tokenUrl;
    private URI redirectUrl;
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

    public Builder withTokenUrl(URI tokenUrl) {
      this.tokenUrl = tokenUrl;
      return this;
    }

    public Builder withRedirectUrl(URI redirectUrl) {
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

    public RefreshableCredentials build() {
      return new RefreshableCredentials(this);
    }
  }

  private final HttpClient hc;
  private final URI tokenUrl;
  private final URI redirectUrl;
  private final String clientId;
  private final String clientSecret;

  private RefreshableCredentials(Builder b) {
    super(b.token);
    this.hc = b.hc;
    this.tokenUrl = b.tokenUrl;
    this.redirectUrl = b.redirectUrl;
    this.clientId = b.clientId;
    this.clientSecret = b.clientSecret;
  }

  @Override
  Token refresh() {
    String refreshToken = this.token.getRefreshToken();
    if (refreshToken == null) {
      throw new DatabricksException("oauth2: token expired and refresh token is not set");
    }

    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "refresh_token");
    params.put("refresh_token", refreshToken);
    Map<String, String> headers = new HashMap<>();
    if (tokenUrl.toString().contains("microsoft")) {
      // Tokens issued for the 'Single-Page Application' client-type may only be redeemed via
      // cross-origin requests
      headers.put("Origin", redirectUrl.toString());
    }
    return retrieveToken(
        hc, clientId, clientSecret, tokenUrl, params, headers, AuthParameterPosition.BODY);
  }
}
