package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.ClientCredentials;
import com.databricks.sdk.client.oauth.RefreshableTokenSource;
import com.databricks.sdk.client.oauth.Token;

import java.io.FileNotFoundException;
import java.io.IOException;
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

        try {
            RefreshableTokenSource tokenSource = new BricksCliTokenSource(config);
            Token token = tokenSource.refresh();
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
            return () -> headers;
        } catch (FileNotFoundException e) {
            throw new DatabricksException("Most likely Bricks CLI is not installed.");
        } catch (IOException e) {
            String msg = e.getMessage();
            if(msg.contains("databricks OAuth is not")) {
                throw new DatabricksException(String.format("OAuth not configured or not available: %s", e.getMessage()));
            }
        }
    }
}
