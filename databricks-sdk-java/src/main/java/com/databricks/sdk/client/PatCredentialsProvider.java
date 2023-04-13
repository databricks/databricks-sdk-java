package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

public class PatCredentialsProvider implements CredentialsProvider {
  public static final String PAT = "pat";

  @Override
  public String authType() {
    return PAT;
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    // tanmaytodo -- might actually need innerconfig because config shouldn't have anything set
    // (according to python sdk) in some tests.
    // This is causing all validation failures.
    String token = config.getToken();
    String host = config.getHost();
    if (token == null || host == null) {
      return null;
    }
    Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", String.format("Bearer %s", token));
    return () -> headers;
  }
}
