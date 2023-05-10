package com.databricks.sdk.core;

import java.util.Collections;
import org.apache.http.HttpHeaders;

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
