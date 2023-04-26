package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.client.oauth.ExternalBrowserCredentialsProvider;
import com.databricks.sdk.client.oauth.OAuthM2MServicePrincipalCredentialsProvider;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>DefaultCredentialsProvider class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DefaultCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCredentialsProvider.class);

  private List<CredentialsProvider> providers;

  private String authType = "default";

  /**
   * <p>authType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String authType() {
    return authType;
  }

  /**
   * <p>Constructor for DefaultCredentialsProvider.</p>
   */
  public DefaultCredentialsProvider() {
    providers =
        Arrays.asList(
            new PatCredentialsProvider(),
            new BasicCredentialsProvider(),
            new OAuthM2MServicePrincipalCredentialsProvider(),
            new AzureServicePrincipalCredentialsProvider(),
            new AzureCliCredentialsProvider(),
            new ExternalBrowserCredentialsProvider(),
            new BricksCliCredentialsProvider());
  }

  /** {@inheritDoc} */
  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    for (CredentialsProvider provider : providers) {
      if (config.getAuthType() != null
          && !config.getAuthType().isEmpty()
          && !provider.authType().equals(config.getAuthType())) {
        LOG.info(
            "Ignoring {} auth, because {} is preferred", provider.authType(), config.getAuthType());
        continue;
      }
      try {
        HeaderFactory headerFactory = provider.configure(config);
        if (headerFactory == null) {
          continue;
        }
        authType = provider.authType();
        return headerFactory;
      } catch (DatabricksException e) {
        throw new DatabricksException(
            String.format("%s: %s", provider.authType(), e.getMessage()), e);
      }
    }
    throw new DatabricksException("cannot configure default credentials");
  }
}
