package com.databricks.sdk.client;

import org.apache.http.HttpMessage;

public class PatCredentials implements Credentials {
    public static final String PAT = "pat";

    private final String token;

    public PatCredentials(DatabricksConfig cfg) {
        this.token = cfg.getToken();
    }

    @Override
    public String name() {
        return PAT;
    }

    @Override
    public boolean isConfigured() {
        return token != null;
    }

    @Override
    public void visit(HttpMessage request) {
        request.setHeader("Authorization", String.format("Bearer %s", token));
    }
}
