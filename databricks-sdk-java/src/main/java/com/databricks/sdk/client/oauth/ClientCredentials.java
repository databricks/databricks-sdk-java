package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import java.util.*;

/**
 * An implementation of RefreshableTokenSource implementing the client_credentials OAuth grant type.
 *
 * <p>Using the provided client ID, secret, and token URL, this class makes requests using its
 * HttpClient to fetch OAuth tokens. Additional parameters and scopes can be specified as well. To
 * support all OAuth endpoints, authentication parameters can be passed in the request body or in
 * the Authorization header.
 */
public class ClientCredentials extends RefreshableTokenSource {
  static class Builder {
    private String clientId;
    private String clientSecret;
    private String tokenUrl;
    private HttpClient hc = new CommonsHttpClient(30);
    private Map<String, String> endpointParams = Collections.emptyMap();
    private List<String> scopes = Collections.emptyList();
    private AuthParameterPosition position = AuthParameterPosition.BODY;

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    public Builder withTokenUrl(String tokenUrl) {
      this.tokenUrl = tokenUrl;
      return this;
    }

    public Builder withEndpointParameters(Map<String, String> params) {
      this.endpointParams = params;
      return this;
    }

    public Builder withScopes(List<String> scopes) {
      this.scopes = scopes;
      return this;
    }

    public Builder withAuthParameterPosition(AuthParameterPosition position) {
      this.position = position;
      return this;
    }

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public ClientCredentials build() {
      Objects.requireNonNull(this.clientId, "clientId must be specified");
      Objects.requireNonNull(this.clientSecret, "clientSecret must be specified");
      Objects.requireNonNull(this.tokenUrl, "tokenUrl must be specified");
      return new ClientCredentials(
          hc, clientId, clientSecret, tokenUrl, endpointParams, scopes, position);
    }
  }

  private String clientId;
  private String clientSecret;
  private String tokenUrl;
  private Map<String, String> endpointParams;
  private List<String> scopes;
  private AuthParameterPosition position;

  private ClientCredentials(
      HttpClient hc,
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> endpointParams,
      List<String> scopes,
      AuthParameterPosition position) {
    super(hc);
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.tokenUrl = tokenUrl;
    this.endpointParams = endpointParams;
    this.scopes = scopes;
    this.position = position;
  }

  @Override
  public Token refresh() {
    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "client_credentials");
    if (scopes != null) {
      params.put("scope", String.join(" ", scopes));
    }
    if (endpointParams != null) {
      params.putAll(endpointParams);
    }
    return retrieveToken(clientId, clientSecret, tokenUrl, params, new HashMap<>(), position);
  }
}
