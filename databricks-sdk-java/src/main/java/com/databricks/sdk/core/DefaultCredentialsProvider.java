package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.AzureGithubOidcCredentialsProvider;
import com.databricks.sdk.core.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.core.oauth.ExternalBrowserCredentialsProvider;
import com.databricks.sdk.core.oauth.OAuthM2MServicePrincipalCredentialsProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCredentialsProvider.class);

  private static final List<Class<?>> providerClasses =
      Arrays.asList(
          PatCredentialsProvider.class,
          BasicCredentialsProvider.class,
          OAuthM2MServicePrincipalCredentialsProvider.class,
          AzureGithubOidcCredentialsProvider.class,
          AzureServicePrincipalCredentialsProvider.class,
          AzureCliCredentialsProvider.class,
          ExternalBrowserCredentialsProvider.class,
          DatabricksCliCredentialsProvider.class,
          NotebookNativeCredentialsProvider.class,
          GoogleCredentialsCredentialsProvider.class,
          GoogleIdCredentialsProvider.class);

  private final List<CredentialsProvider> providers;

  private String authType = "default";

  public String authType() {
    return authType;
  }

  public DefaultCredentialsProvider() {
    providers = new ArrayList<>();
    for (Class<?> clazz : providerClasses) {
      try {
        providers.add((CredentialsProvider) clazz.newInstance());
      } catch (NoClassDefFoundError | InstantiationException | IllegalAccessException e) {
        LOG.warn(
            "Failed to instantiate credentials provider: "
                + clazz.getName()
                + ", skipping. Cause: "
                + e.getClass().getCanonicalName()
                + ": "
                + e.getMessage());
      }
    }
  }

  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    for (CredentialsProvider provider : providers) {
      if (config.getAuthType() != null
          && !config.getAuthType().isEmpty()
          && !provider.authType().equals(config.getAuthType())) {
        LOG.debug(
            "Ignoring {} auth, because {} is preferred", provider.authType(), config.getAuthType());
        continue;
      }
      try {
        LOG.debug("Trying {} auth", provider.authType());
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
    String authFlowUrl =
        "https://docs.databricks.com/en/dev-tools/auth.html#databricks-client-unified-authentication";
    throw new DatabricksException(
        "cannot configure default credentials, please check "
            + authFlowUrl
            + " to configure credentials for your preferred authentication method");
  }
}
