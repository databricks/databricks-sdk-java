package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.*;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The DefaultCredentialsProvider is the primary authentication handler for the Databricks SDK. It
 * implements a chain of responsibility pattern to manage multiple authentication methods, including
 * Personal Access Tokens (PAT), OAuth, Azure, Google, and OpenID Connect (OIDC). The provider
 * attempts each authentication method in sequence until a valid credential is obtained.
 */
public class DefaultCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultCredentialsProvider.class);

  /* List of credential providers that will be tried in sequence */
  private List<CredentialsProvider> providers = new ArrayList<>();

  /* The currently selected authentication type */
  private String authType = "default";

  /**
   * Internal class to associate an ID token source with a name for identification purposes. Used
   * primarily for OIDC (OpenID Connect) authentication flows.
   */
  private static class NamedIDTokenSource {
    private final String name;
    private final IDTokenSource idTokenSource;

    public NamedIDTokenSource(String name, IDTokenSource idTokenSource) {
      this.name = name;
      this.idTokenSource = idTokenSource;
    }
  }

  public DefaultCredentialsProvider() {}

  /**
   * Returns the current authentication type being used
   *
   * @return String representing the authentication type
   */
  public String authType() {
    return authType;
  }

  /**
   * Configures the credentials provider with the given Databricks configuration. This method tries
   * each available credential provider in sequence until one succeeds.
   *
   * @param config The Databricks configuration containing authentication details
   * @return HeaderFactory for making authenticated requests
   * @throws DatabricksException if no valid credentials can be configured
   */
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

  /**
   * Adds OpenID Connect (OIDC) based credential providers to the list of available providers.
   *
   * @param config The Databricks configuration containing OIDC settings
   */
  private void addOIDCCredentialsProviders(DatabricksConfig config) {
    // TODO: refactor the code so that the IdTokenSources are created within the
    // configure call of their corresponding CredentialsProvider. This will allow
    // us to simplify the code by validating IdTokenSources when they are created.
    OpenIDConnectEndpoints endpoints = null;
    try {
      endpoints = config.getOidcEndpoints();
    } catch (Exception e) {
      LOG.warn("Failed to get OpenID Connect endpoints", e);
    }

    List<NamedIDTokenSource> namedIdTokenSources = new ArrayList<>();
    namedIdTokenSources.add(
        new NamedIDTokenSource(
            "env-oidc",
            new EnvVarIDTokenSource(
                // Use configured environment variable name if set, otherwise default to
                // DATABRICKS_OIDC_TOKEN
                Strings.isNullOrEmpty(config.getOidcTokenEnv())
                    ? "DATABRICKS_OIDC_TOKEN"
                    : config.getOidcTokenEnv(),
                config.getEnv())));

    namedIdTokenSources.add(
        new NamedIDTokenSource("file-oidc", new FileIDTokenSource(config.getOidcTokenFilepath())));

    namedIdTokenSources.add(
        new NamedIDTokenSource(
            "github-oidc",
            new GithubIDTokenSource(
                config.getActionsIdTokenRequestUrl(),
                config.getActionsIdTokenRequestToken(),
                config.getHttpClient())));

    // Try to create Azure DevOps token source - if environment variables are missing,
    // skip this provider gracefully.
    try {
      namedIdTokenSources.add(
          new NamedIDTokenSource(
              "azure-devops-oidc",
              new AzureDevOpsIDTokenSource(config.getHttpClient())));
    } catch (DatabricksException e) {
      LOG.debug("Azure DevOps OIDC provider not available: {}", e.getMessage());
    }
    // Add new IDTokenSources and ID providers here. Example:
    // namedIdTokenSources.add(new NamedIDTokenSource("custom-oidc", new CustomIDTokenSource(...)));

    // Configure OAuth token sources for each ID token source
    for (NamedIDTokenSource namedIdTokenSource : namedIdTokenSources) {
      DatabricksOAuthTokenSource oauthTokenSource =
          new DatabricksOAuthTokenSource.Builder(
                  config.getClientId(),
                  config.getHost(),
                  endpoints,
                  namedIdTokenSource.idTokenSource,
                  config.getHttpClient())
              .audience(config.getTokenAudience())
              .accountId(config.isAccountClient() ? config.getAccountId() : null)
              .scopes(config.getScopes())
              .build();

      providers.add(new TokenSourceCredentialsProvider(oauthTokenSource, namedIdTokenSource.name));
    }
  }

  /**
   * Initializes all available credential providers in the preferred order. The order of providers
   * determines the authentication fallback sequence.
   *
   * @param config The Databricks configuration to use for provider initialization
   */
  private synchronized void addDefaultCredentialsProviders(DatabricksConfig config) {
    if (!providers.isEmpty()) {
      return;
    }

    providers.add(new PatCredentialsProvider());
    providers.add(new BasicCredentialsProvider());
    providers.add(new OAuthM2MServicePrincipalCredentialsProvider());

    // Add OIDC-based providers
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
