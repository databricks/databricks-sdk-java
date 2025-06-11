package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import java.util.*;
import java.util.function.Supplier;

/**
 * An implementation of RefreshableTokenSource implementing the client_credentials OAuth grant type.
 *
 * <p>Using the provided client ID, secret, and token URL, this class makes requests using its
 * HttpClient to fetch OAuth tokens. Additional parameters and scopes can be specified as well. To
 * support all OAuth endpoints, authentication parameters can be passed in the request body or in
 * the Authorization header.
 */
public class ClientCredentials implements TokenSource {
  public static class Builder {
    private String clientId;
    private String clientSecret;
    private String tokenUrl;
    private HttpClient hc = new CommonsHttpClient.Builder().withTimeoutSeconds(30).build();

    // Endpoint parameters can include tokens with expiration which
    // may need to be refreshed. This supplier will be called each time
    // the credentials are refreshed.
    private Supplier<Map<String, String>> endpointParamsSupplier = null;
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

    public Builder withEndpointParametersSupplier(
        Supplier<Map<String, String>> endpointParamsSupplier) {
      this.endpointParamsSupplier = endpointParamsSupplier;
      return this;
    }

    public Builder withTokenUrl(String tokenUrl) {
      this.tokenUrl = tokenUrl;
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
      Objects.requireNonNull(this.tokenUrl, "tokenUrl must be specified");
      return new ClientCredentials(
          hc, clientId, clientSecret, tokenUrl, endpointParamsSupplier, scopes, position);
    }
  }

  private HttpClient hc;
  private String clientId;
  private String clientSecret;
  private String tokenUrl;
  private List<String> scopes;
  private AuthParameterPosition position;
  private Supplier<Map<String, String>> endpointParamsSupplier;

  private ClientCredentials(
      HttpClient hc,
      String clientId,
      String clientSecret,
      String tokenUrl,
      Supplier<Map<String, String>> endpointParamsSupplier,
      List<String> scopes,
      AuthParameterPosition position) {
    this.hc = hc;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.tokenUrl = tokenUrl;
    this.endpointParamsSupplier = endpointParamsSupplier;
    this.scopes = scopes;
    this.position = position;
  }

  @Override
  public Token getToken() {
    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "client_credentials");
    if (scopes != null) {
      params.put("scope", String.join(" ", scopes));
    }
    if (endpointParamsSupplier != null) {
      params.putAll(endpointParamsSupplier.get());
    }
    return TokenEndpointClient.retrieveToken(
        hc, clientId, clientSecret, tokenUrl, params, new HashMap<>(), position);
  }
}
