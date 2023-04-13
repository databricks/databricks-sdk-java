package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.client.oauth.OAuthM2MServicePrincipalCredentialsProvider;
import java.util.Arrays;
import java.util.List;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private List<CredentialsProvider> providers;

  private String authType = "default";

  public DefaultCredentialsProvider() {
    providers =
        Arrays.asList(
            new PatCredentialsProvider(),
            new BasicCredentialsProvider(),
            new OAuthM2MServicePrincipalCredentialsProvider(),
            new AzureServicePrincipalCredentialsProvider());
  }

  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    for (CredentialsProvider provider : providers) {
      if (config.getAuthType() != null
          && !config.getAuthType().isEmpty()
          && !provider.authType().equals(config.getAuthType())) {
        // TODO: log this
        continue;
      }
      HeaderFactory headerFactory = provider.configure(config);
      if (headerFactory == null) {
        continue;
      }
      authType = provider.authType();
      return headerFactory;
    }
    throw new DatabricksException("cannot configure default credentials");
  }

  public String authType() {
    return authType;
  }
}
