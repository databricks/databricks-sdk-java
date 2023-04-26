package com.databricks.sdk.client;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>BasicCredentialsProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BasicCredentialsProvider implements CredentialsProvider {
  /** Constant <code>BASIC="basic"</code> */
  public static final String BASIC = "basic";

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return BASIC;
  }

  /** {@inheritDoc} */
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
