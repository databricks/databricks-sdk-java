package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private static List<CredentialsProvider> providers =
      Arrays.asList(new PatCredentialsProvider(), new BasicCredentialsProvider());

  private String authType = "default";

  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    for (CredentialsProvider provider : providers) {
      try {
        HeaderFactory headerFactory = provider.configure(config);
        if (headerFactory == null) {
          continue;
        }
        authType = provider.authType();
        return headerFactory;
      } catch (DatabricksException e) {
        throw new DatabricksException(
            String.format("%s auth: %s", this.authType, e.getMessage()));
      }
    }
    throw new DatabricksException("cannot configure default credentials");
  }

  public String authType() {
    return authType;
  }
}
