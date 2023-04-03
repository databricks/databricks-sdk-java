package com.databricks.sdk.client;

import org.apache.http.HttpMessage;

public interface CredentialsProvider {
    String authType();

    HeaderFactory configure(DatabricksConfig config);
}
