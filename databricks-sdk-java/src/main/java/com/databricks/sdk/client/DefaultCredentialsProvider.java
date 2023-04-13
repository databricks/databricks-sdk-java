package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.client.oauth.OAuthM2MServicePrincipalCredentialsProvider;
import java.util.Arrays;
import java.util.List;
import org.apache.http.conn.HttpClientConnectionManager;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private List<CredentialsProvider> providers;

  private String authType = "default";

  public DefaultCredentialsProvider(HttpClientConnectionManager connectionManager) {
    HttpClient hc = new HttpClient(connectionManager, 15, 3, 96, null, null);
    providers =
        Arrays.asList(
            new PatCredentialsProvider(),
            new BasicCredentialsProvider(),
            // TODO: move these back in the right order later.
            new AzureServicePrincipalCredentialsProvider(hc),
            new OAuthM2MServicePrincipalCredentialsProvider(hc)
        );
  }

  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    for (CredentialsProvider provider : providers) {
      if (config.getAuthType() != null
          && !config.getAuthType().isEmpty()
          && provider.authType().equals(config.getAuthType())) {
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
