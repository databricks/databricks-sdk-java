package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

public class AzureCliCredentialsProvider implements CredentialsProvider{
    public static final String AZURECLI = "azure-cli";

    @Override
    public String authType() {
        return AZURECLI;
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", String.format("Bearer %s", ""));
        return () -> headers;
    }

}

