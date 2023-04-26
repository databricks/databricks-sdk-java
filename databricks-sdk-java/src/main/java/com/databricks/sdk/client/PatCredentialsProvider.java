package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>PatCredentialsProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PatCredentialsProvider implements CredentialsProvider {
  /** Constant <code>PAT="pat"</code> */
  public static final String PAT = "pat";

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return PAT;
  }

  /** {@inheritDoc} */
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
