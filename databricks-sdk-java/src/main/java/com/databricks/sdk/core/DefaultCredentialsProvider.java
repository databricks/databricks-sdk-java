package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.AzureGithubOidcCredentialsProvider;
import com.databricks.sdk.core.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.core.oauth.DatabricksOAuthTokenSource;
import com.databricks.sdk.core.oauth.ExternalBrowserCredentialsProvider;
import com.databricks.sdk.core.oauth.GithubIDTokenSource;
import com.databricks.sdk.core.oauth.IDTokenSource;
import com.databricks.sdk.core.oauth.OAuthM2MServicePrincipalCredentialsProvider;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.oauth.TokenSourceCredentialsProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCredentialsProvider.class);

  private List<CredentialsProvider> providers = new ArrayList<>();

  private String authType = "default";

  public DefaultCredentialsProvider() {}

  @Override
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

  private void addDefaultCredentialsProviders(DatabricksConfig config) {
    providers.add(new PatCredentialsProvider());
    providers.add(new BasicCredentialsProvider());
    providers.add(new OAuthM2MServicePrincipalCredentialsProvider());

    addOIDCTokenCredentialsProviders(config);

    providers.add(new AzureGithubOidcCredentialsProvider());
    providers.add(new AzureServicePrincipalCredentialsProvider());
    providers.add(new AzureCliCredentialsProvider());
    providers.add(new ExternalBrowserCredentialsProvider());
    providers.add(new DatabricksCliCredentialsProvider());
    providers.add(new NotebookNativeCredentialsProvider());
    providers.add(new GoogleCredentialsCredentialsProvider());
    providers.add(new GoogleIdCredentialsProvider());
  }

  private void addOIDCTokenCredentialsProviders(DatabricksConfig config) {
    OpenIDConnectEndpoints endpoints = null;
    try {
      endpoints = config.getOidcEndpoints();
    } catch (Exception e) {
      LOG.error("Error getting OIDC endpoints", e);
    }

    Map<String, IDTokenSource> namedIdTokenSources = new HashMap<>();
    namedIdTokenSources.put(
        "github-oidc",
        new GithubIDTokenSource(
            config.getActionsIdTokenRequestUrl(),
            config.getActionsIdTokenRequestToken(),
            config.getHttpClient()));
    // Add new providers to the map as needed

    for (Map.Entry<String, IDTokenSource> entry : namedIdTokenSources.entrySet()) {
      String name = entry.getKey();
      IDTokenSource idTokenSource = entry.getValue();

      DatabricksOAuthTokenSource oauthTokenSource =
          new DatabricksOAuthTokenSource.Builder(
                  config.getClientId(),
                  config.getHost(),
                  endpoints,
                  idTokenSource,
                  config.getHttpClient())
              .audience(config.getAudience())
              .accountId(config.isAccountClient() ? config.getAccountId() : null)
              .build();

      providers.add(new TokenSourceCredentialsProvider(oauthTokenSource, name));
    }
  }
}
