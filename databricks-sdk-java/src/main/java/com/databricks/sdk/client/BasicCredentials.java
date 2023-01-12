package com.databricks.sdk.client;

import org.apache.http.HttpMessage;

import java.util.Base64;

public class BasicCredentials implements Credentials {
    public static final String BASIC = "basic";

    private final String username;
    private final String password;

    public BasicCredentials(DatabricksConfig config) {
        this.username = config.getUsername();
        this.password = config.getPassword();
    }

    @Override
    public String name() {
        return BASIC;
    }

    @Override
    public boolean isConfigured() {
        return username != null && password != null;
    }

    @Override
    public void visit(HttpMessage request) {
        byte[] bytes = String.format("%s:%s", username, password).getBytes();
        String base64 = Base64.getEncoder().encodeToString(bytes);
        request.setHeader("Authorization", String.format("Basic %s", base64));
    }
}
