package com.databricks.sdk.client;

import com.databricks.sdk.support.DeveloperApi;

@DeveloperApi
public interface CredentialsProvider {
  String authType();

  HeaderFactory configure(DatabricksConfig config);
}
