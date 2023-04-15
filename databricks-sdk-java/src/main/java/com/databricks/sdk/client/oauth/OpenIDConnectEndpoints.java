package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;

public class OpenIDConnectEndpoints {
  @JsonProperty("token_endpoint")
  private URI tokenEndpoint;

  @JsonProperty("authorization_endpoint")
  private URI authorizationEndpoint;

  public OpenIDConnectEndpoints(String tokenEndpoint, String authorizationEndpoint) {
    this.tokenEndpoint = URI.create(tokenEndpoint);
    this.authorizationEndpoint = URI.create(authorizationEndpoint);
  }

  public URI getTokenEndpoint() {
    return tokenEndpoint;
  }

  public URI getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }
}
