package com.databricks.sdk.client;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class BasicCredentialsProvider implements CredentialsProvider {
  public static final String BASIC = "basic";

  @Override
  public String authType() {
    return BASIC;
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String username = config.getUsername();
    String password = config.getPassword();
    String host = config.getHost();
    if (username == null || password == null || host == null) {
      return null;
    }
    byte[] bytes = String.format("%s:%s", config.getUsername(), config.getPassword()).getBytes();
    String base64 = Base64.getEncoder().encodeToString(bytes);
    Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", String.format("Basic %s", base64));
    return () -> headers;
  }
}
