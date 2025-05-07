package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCredentialsProvider.class);

  private List<CredentialsProvider> providers = new ArrayList<>();

  private String authType = "default";

  private static class NamedIDTokenSource {
    private final String name;
    private final IDTokenSource idTokenSource;

    public NamedIDTokenSource(String name, IDTokenSource idTokenSource) {
      this.name = name;
      this.idTokenSource = idTokenSource;
    }

    public String getName() {
      return name;
    }

    public IDTokenSource getIdTokenSource() {
      return idTokenSource;
    }
  }

  public DefaultCredentialsProvider() {}

  public String authType() {
    return authType;
  }

  @Override
  public synchronized HeaderFactory configure(DatabricksConfig config) {
    addDefaultCredentialsProviders(config);
    for (CredentialsProvider provider : providers) {
      if (config.getAuthType() != null
          && !config.getAuthType().isEmpty()
          && !provider.authType().equals(config.getAuthType())) {
        LOG.info(
            "Ignoring {} auth, because {} is preferred", provider.authType(), config.getAuthType());
        continue;
      }
      try {
        LOG.info("Trying {} auth", provider.authType());
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

  private void addOIDCCredentialsProviders(DatabricksConfig config) {
    OpenIDConnectEndpoints endpoints = null;
    try {
      endpoints = config.getOidcEndpoints();
    } catch (Exception e) {
      LOG.warn("Failed to get OpenID Connect endpoints", e);
    }

    List<NamedIDTokenSource> namedIdTokenSources = new ArrayList<>();
    namedIdTokenSources.add(
        new NamedIDTokenSource(
            "github-oidc",
            new GithubIDTokenSource(
                config.getActionsIdTokenRequestUrl(),
                config.getActionsIdTokenRequestToken(),
                config.getHttpClient())));
    // Add new IDTokenSources and ID providers here. Example:
    // namedIdTokenSources.add(new NamedIDTokenSource("custom-oidc", new CustomIDTokenSource(...)));

    for (NamedIDTokenSource namedIdTokenSource : namedIdTokenSources) {
      DatabricksOAuthTokenSource oauthTokenSource =
          new DatabricksOAuthTokenSource.Builder(
                  config.getClientId(),
                  config.getHost(),
                  endpoints,
                  namedIdTokenSource.getIdTokenSource(),
                  config.getHttpClient())
              .audience(config.getTokenAudience())
              .accountId(config.isAccountClient() ? config.getAccountId() : null)
              .build();

      providers.add(
          new TokenSourceCredentialsProvider(oauthTokenSource, namedIdTokenSource.getName()));
    }
  }

  private void addDefaultCredentialsProviders(DatabricksConfig config) {
    providers.add(new PatCredentialsProvider());
    providers.add(new BasicCredentialsProvider());
    providers.add(new OAuthM2MServicePrincipalCredentialsProvider());

    addOIDCCredentialsProviders(config);

    providers.add(new AzureGithubOidcCredentialsProvider());
    providers.add(new AzureServicePrincipalCredentialsProvider());
    providers.add(new AzureCliCredentialsProvider());
    providers.add(new ExternalBrowserCredentialsProvider());
    providers.add(new DatabricksCliCredentialsProvider());
    providers.add(new NotebookNativeCredentialsProvider());
    providers.add(new GoogleCredentialsCredentialsProvider());
    providers.add(new GoogleIdCredentialsProvider());
  }
}
