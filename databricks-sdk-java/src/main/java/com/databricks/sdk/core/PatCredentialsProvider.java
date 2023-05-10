package com.databricks.sdk.core;

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
