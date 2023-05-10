package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.MalformedURLException;

/**
 * Data class modelling the set of OpenID Connect endpoints, as defined in <a
 * href="https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderConfigurationRequest">the
 * OIDC spec</a>.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenIDConnectEndpoints {
  private String tokenEndpoint;

  private String authorizationEndpoint;

  public OpenIDConnectEndpoints(
      @JsonProperty("token_endpoint") String tokenEndpoint,
      @JsonProperty("authorization_endpoint") String authorizationEndpoint)
      throws MalformedURLException {
    this.tokenEndpoint = tokenEndpoint;
    this.authorizationEndpoint = authorizationEndpoint;
  }

  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }
}
