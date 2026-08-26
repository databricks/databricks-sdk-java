package com.databricks.sdk.core;

import com.databricks.sdk.support.InternalApi;
import java.util.HashMap;
import java.util.Map;

@InternalApi
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

    if (GroupAssumption.isRequested(config)) {
      // Return null during automatic discovery so the chain can continue. If the user explicitly
      // requested this provider, throw an actionable error explaining why it cannot be used.
      if (authType().equals(config.getAuthType())) {
        throw GroupAssumption.unsupportedAuth(authType());
      }

      return null;
    }

    Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", String.format("Bearer %s", token));
    return () -> headers;
  }
}
