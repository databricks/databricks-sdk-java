package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.ClientCredentials;
import com.databricks.sdk.client.oauth.Token;

import java.util.HashMap;
import java.util.Map;

public class BricksCliCredentialsProvider implements CredentialsProvider {
    public static final String BRICKS_CLI = "bricks-cli";

    @Override
    public String authType() {
        return BRICKS_CLI;
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
        String host = config.getHost();
        if(host == null || !config.isAws()) {
            return null;
        }

        ClientCredentials tokenSource = new ClientCredentials.Builder().build();
        return () -> {
            Token token = tokenSource.refresh();
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
            return headers;
        };
    }
}
