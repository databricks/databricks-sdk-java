package com.databricks.sdk.client.oauth;

public class OidcEndpoints {
    private String authorizationEndpoint; // ../v1/authorize
    private String tokenEndpoint; // ../v1/token

    public OidcEndpoints(String authorizationEndpoint, String tokenEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.tokenEndpoint = tokenEndpoint;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }
}
