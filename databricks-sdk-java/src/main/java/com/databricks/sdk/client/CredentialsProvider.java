package com.databricks.sdk.client;

public interface CredentialsProvider {
  String authType();

  HeaderFactory configure(DatabricksConfig config);
}
