package com.databricks.sdk.client;

import org.apache.http.HttpHeaders;

import java.util.Collections;

public class DummyCredentialsProvider implements CredentialsProvider {
  @Override
  public String authType() {
    return "test";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    return () -> Collections.singletonMap(HttpHeaders.AUTHORIZATION, "Basic test");
  }
}
