package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.MalformedURLException;
import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenIDConnectEndpoints {
  private String tokenEndpoint;

  private String authorizationEndpoint;

  public OpenIDConnectEndpoints(
      @JsonProperty("token_endpoint") String tokenEndpoint,
      @JsonProperty("authorization_endpoint") String authorizationEndpoint) throws MalformedURLException {
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
