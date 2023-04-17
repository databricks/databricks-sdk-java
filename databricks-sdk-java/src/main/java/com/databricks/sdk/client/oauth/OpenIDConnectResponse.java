package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenIDConnectResponse {
  @JsonProperty("token_endpoint")
  private String tokenEndpoint;

  public String getTokenEndpoint() {
    return tokenEndpoint;
  }
}
