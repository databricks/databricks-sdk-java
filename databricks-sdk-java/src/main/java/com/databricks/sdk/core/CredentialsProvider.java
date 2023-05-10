package com.databricks.sdk.core;

public interface CredentialsProvider {
  String authType();

  HeaderFactory configure(DatabricksConfig config);
}
