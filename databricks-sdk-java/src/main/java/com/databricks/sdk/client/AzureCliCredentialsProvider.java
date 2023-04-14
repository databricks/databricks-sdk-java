package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.ClientCredentials;
import com.databricks.sdk.client.oauth.Token;

import java.util.HashMap;
import java.util.Map;

public class AzureCliCredentialsProvider implements CredentialsProvider{
    public static final String AZURE_CLI = "azure-cli";

    @Override
    public String authType() {
        return AZURE_CLI;
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
        // conditions

        ClientCredentials tokenSource = new ClientCredentials.Builder().build();
        return () -> {
            Token token = tokenSource.refresh();
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
            return headers;
        };
    }

}

