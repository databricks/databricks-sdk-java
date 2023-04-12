package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenIDConnectResponse {
    @JsonProperty("token_endpoint")
    private String tokenEndpoint;

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }
}
