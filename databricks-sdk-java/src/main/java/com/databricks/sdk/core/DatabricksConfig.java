package com.databricks.sdk.core;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenCache;
import com.databricks.sdk.core.utils.Cloud;
import com.databricks.sdk.core.utils.Environment;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import org.apache.http.HttpMessage;

public class DatabricksConfig {
  private CredentialsProvider credentialsProvider = new DefaultCredentialsProvider();

  @ConfigAttribute(env = "DATABRICKS_HOST")
  private String host;

  @ConfigAttribute(env = "DATABRICKS_ACCOUNT_ID")
  private String accountId;

  @ConfigAttribute(env = "DATABRICKS_TOKEN", auth = "pat", sensitive = true)
  private String token;

  @ConfigAttribute(env = "DATABRICKS_CLIENT_ID", auth = "oauth")
  private String clientId;

  @ConfigAttribute(env = "DATABRICKS_CLIENT_SECRET", auth = "oauth", sensitive = true)
  private String clientSecret;

  @ConfigAttribute(env = "DATABRICKS_SCOPES", auth = "oauth")
  private List<String> scopes;

  @ConfigAttribute(env = "DATABRICKS_REDIRECT_URL", auth = "oauth")
  private String redirectUrl;

  /**
   * The passphrase used to encrypt the OAuth token cache.
   * This is optional and only used with token caching.
   */
  @ConfigAttribute(env = "DATABRICKS_OAUTH_TOKEN_CACHE_PASSPHRASE", auth = "oauth", sensitive = true)
  private String oAuthTokenCachePassphrase;

  /**
   * The OpenID Connect discovery URL used to retrieve OIDC configuration and endpoints.
   *
   * <p><b>Note:</b> This API is experimental and may change or be removed in future releases
   * without notice.
   */
  @ConfigAttribute(env = "DATABRICKS_DISCOVERY_URL")
  private String discoveryUrl;

  @ConfigAttribute(env = "DATABRICKS_USERNAME", auth = "basic")
  private String username;

  @ConfigAttribute(env = "DATABRICKS_PASSWORD", auth = "basic", sensitive = true)
  private String password;

  /** Connection profile specified within ~/.databrickscfg. */
  @ConfigAttribute(env = "DATABRICKS_CONFIG_PROFILE")
  private String profile;

  /**
   * Location of the Databricks CLI credentials file, that is created by `databricks configure
   * --token` command. By default, it is located in ~/.databrickscfg.
   */
  @ConfigAttribute(env = "DATABRICKS_CONFIG_FILE")
  private String configFile;

  @ConfigAttribute(env = "DATABRICKS_CLUSTER_ID")
  private String clusterId;

  @ConfigAttribute(env = "DATABRICKS_SERVERLESS_COMPUTE_ID")
  private String serverlessComputeId;

  @ConfigAttribute(env = "DATABRICKS_GOOGLE_SERVICE_ACCOUNT", auth = "google")
  private String googleServiceAccount;

  @ConfigAttribute(env = "GOOGLE_CREDENTIALS", auth = "google", sensitive = true)
  private String googleCredentials;

  /** Azure Resource Manager ID for Azure Databricks workspace, which is exchanged for a Host */
  @ConfigAttribute(env = "DATABRICKS_AZURE_RESOURCE_ID", auth = "azure")
  private String azureWorkspaceResourceId;

  @ConfigAttribute(env = "ARM_USE_MSI", auth = "azure")
  private Boolean azureUseMsi;

  @ConfigAttribute(env = "ARM_CLIENT_SECRET", auth = "azure", sensitive = true)
  private String azureClientSecret;

  @ConfigAttribute(env = "ARM_CLIENT_ID", auth = "azure")
  private String azureClientId;

  @ConfigAttribute(env = "ARM_TENANT_ID", auth = "azure")
  private String azureTenantId;

  @ConfigAttribute(env = "ARM_ENVIRONMENT")
  private String azureEnvironment;

  @ConfigAttribute(env = "ACTIONS_ID_TOKEN_REQUEST_URL")
  private String actionsIdTokenRequestUrl;

  @ConfigAttribute(env = "ACTIONS_ID_TOKEN_REQUEST_TOKEN")
  private String actionsIdTokenRequestToken;

  @ConfigAttribute(env = "DATABRICKS_CLI_PATH")
  private String databricksCliPath;

  /**
   * When multiple auth attributes are available in the environment, use the auth type specified by
   * this argument. This argument also holds currently selected auth.
   */
  @ConfigAttribute(env = "DATABRICKS_AUTH_TYPE")
  private String authType;

  /**
   * Skip SSL certificate verification for HTTP calls. Use at your own risk or for unit testing
   * purposes.
   */
  @ConfigAttribute() private Boolean skipVerify;

  /** Number of seconds for HTTP timeout */
  @ConfigAttribute() private Integer httpTimeoutSeconds;

  /** Truncate JSON fields in JSON above this limit. Default is 96. */
  @ConfigAttribute(env = "DATABRICKS_DEBUG_TRUNCATE_BYTES")
  private Integer debugTruncateBytes;

  /** Debug HTTP headers of requests made by the provider. Default is false. */
  @ConfigAttribute(env = "DATABRICKS_DEBUG_HEADERS")
  private Boolean debugHeaders;

  /** Maximum number of requests per second made to Databricks REST API. */
  @ConfigAttribute(env = "DATABRICKS_RATE_LIMIT")
  private Integer rateLimit;

  private volatile boolean resolved;
  private HeaderFactory headerFactory;

  private HttpClient httpClient;

  private Environment env;

  private DatabricksEnvironment databricksEnvironment;

  // Lazily initialized OAuth token cache
  private transient TokenCache tokenCache;

  public Environment getEnv() {
    return env;
  }

  public synchronized DatabricksConfig resolve() {
    String[] path = System.getenv("PATH").split(File.pathSeparator);
    Environment env = new Environment(System.getenv(), path, System.getProperty("os.name"));
    return resolve(env);
  }

  synchronized DatabricksConfig resolve(Environment env) {
    this.env = env;
    innerResolve();
    return this;
  }

  private synchronized DatabricksConfig innerResolve() {
    Objects.requireNonNull(env);
    try {
      ConfigLoader.resolve(this);
      ConfigLoader.validate(this);
      ConfigLoader.fixHostIfNeeded(this);
      initHttp();
      return this;
    } catch (DatabricksException e) {
      throw ConfigLoader.makeNicerError(e.getMessage(), e, this);
    }
  }

  private void initHttp() {
    if (httpClient != null) {
      return;
    }
    // eventually it'll get decoupled from config.
    httpClient = new CommonsHttpClient.Builder().withDatabricksConfig(this).build();
  }

  public synchronized Map<String, String> authenticate() throws DatabricksException {
    try {
      if (headerFactory == null) {
        // Calling authenticate without resolve
        ConfigLoader.fixHostIfNeeded(this);
        headerFactory = credentialsProvider.configure(this);
        setAuthType(credentialsProvider.authType());
      }
      return headerFactory.headers();
    } catch (DatabricksException e) {
      String msg = String.format("%s auth: %s", credentialsProvider.authType(), e.getMessage());
      DatabricksException wrapperException = new DatabricksException(msg, e);
      throw ConfigLoader.makeNicerError(wrapperException.getMessage(), wrapperException, this);
    }
  }

  public CredentialsProvider getCredentialsProvider() {
    return this.credentialsProvider;
  }

  public DatabricksConfig setCredentialsProvider(CredentialsProvider credentialsProvider) {
    this.credentialsProvider = credentialsProvider;
    return this;
  }

  public String getHost() {
    return host;
  }

  public DatabricksConfig setHost(String host) {
    this.host = host;
    return this;
  }

  public String getDiscoveryUrl() {
    return discoveryUrl;
  }

  public DatabricksConfig setDiscoveryUrl(String discoveryUrl) {
    this.discoveryUrl = discoveryUrl;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public DatabricksConfig setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getDatabricksCliPath() {
    return this.databricksCliPath;
  }

  public DatabricksConfig setDatabricksCliPath(String databricksCliPath) {
    this.databricksCliPath = databricksCliPath;
    return this;
  }

  public String getToken() {
    return token;
  }

  public DatabricksConfig setToken(String token) {
    this.token = token;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public DatabricksConfig setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public DatabricksConfig setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getServerlessComputeId() {
    return serverlessComputeId;
  }

  public DatabricksConfig setServerlessComputeId(String serverlessComputeId) {
    this.serverlessComputeId = serverlessComputeId;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public DatabricksConfig setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public DatabricksConfig setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public DatabricksConfig setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public String getOAuthRedirectUrl() {
    return redirectUrl;
  }

  public DatabricksConfig setOAuthRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  public List<String> getScopes() {
    return scopes;
  }

  public DatabricksConfig setScopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public String getProfile() {
    return profile;
  }

  public DatabricksConfig setProfile(String profile) {
    this.profile = profile;
    return this;
  }

  public String getConfigFile() {
    return configFile;
  }

  public DatabricksConfig setConfigFile(String configFile) {
    this.configFile = configFile;
    return this;
  }

  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  public DatabricksConfig setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  public String getGoogleCredentials() {
    return googleCredentials;
  }

  public DatabricksConfig setGoogleCredentials(String googleCredentials) {
    this.googleCredentials = googleCredentials;
    return this;
  }

  public String getAzureWorkspaceResourceId() {
    return azureWorkspaceResourceId;
  }

  public DatabricksConfig setAzureWorkspaceResourceId(String azureWorkspaceResourceId) {
    this.azureWorkspaceResourceId = azureWorkspaceResourceId;
    return this;
  }

  public boolean getAzureUseMsi() {
    return azureUseMsi;
  }

  public DatabricksConfig setAzureUseMsi(boolean azureUseMsi) {
    this.azureUseMsi = azureUseMsi;
    return this;
  }

  /** @deprecated Use {@link #getAzureUseMsi()} instead. */
  @Deprecated()
  public boolean getAzureUseMSI() {
    return azureUseMsi;
  }

  /** @deprecated Use {@link #setAzureUseMsi(boolean)} instead. */
  @Deprecated
  public DatabricksConfig setAzureUseMSI(boolean azureUseMsi) {
    this.azureUseMsi = azureUseMsi;
    return this;
  }

  public String getAzureClientSecret() {
    return azureClientSecret;
  }

  public DatabricksConfig setAzureClientSecret(String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
    return this;
  }

  public String getAzureClientId() {
    return azureClientId;
  }

  public DatabricksConfig setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  public String getAzureTenantId() {
    return azureTenantId;
  }

  public DatabricksConfig setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  public AzureEnvironment getAzureEnvironment() {
    String env = "PUBLIC";
    if (azureEnvironment != null) {
      env = azureEnvironment;
    }
    return AzureEnvironment.getEnvironment(env);
  }

  public DatabricksConfig setAzureEnvironment(String azureEnvironment) {
    this.azureEnvironment = azureEnvironment;
    return this;
  }

  public String getActionsIdTokenRequestUrl() {
    return actionsIdTokenRequestUrl;
  }

  public DatabricksConfig setActionsIdTokenRequestUrl(String url) {
    this.actionsIdTokenRequestUrl = url;
    return this;
  }

  public String getActionsIdTokenRequestToken() {
    return actionsIdTokenRequestToken;
  }

  public DatabricksConfig setActionsIdTokenRequestToken(String token) {
    this.actionsIdTokenRequestToken = token;
    return this;
  }

  public String getEffectiveAzureLoginAppId() {
    return getDatabricksEnvironment().getAzureApplicationId();
  }

  public String getAuthType() {
    return authType;
  }

  public DatabricksConfig setAuthType(String authType) {
    this.authType = authType;
    return this;
  }

  public boolean isSkipVerify() {
    return skipVerify;
  }

  public DatabricksConfig setSkipVerify(boolean skipVerify) {
    this.skipVerify = skipVerify;
    return this;
  }

  public Integer getHttpTimeoutSeconds() {
    return httpTimeoutSeconds;
  }

  public DatabricksConfig setHttpTimeoutSeconds(int httpTimeoutSeconds) {
    this.httpTimeoutSeconds = httpTimeoutSeconds;
    return this;
  }

  public Integer getDebugTruncateBytes() {
    return debugTruncateBytes;
  }

  public DatabricksConfig setDebugTruncateBytes(int debugTruncateBytes) {
    this.debugTruncateBytes = debugTruncateBytes;
    return this;
  }

  public boolean isDebugHeaders() {
    return debugHeaders != null && debugHeaders;
  }

  public DatabricksConfig setDebugHeaders(boolean debugHeaders) {
    this.debugHeaders = debugHeaders;
    return this;
  }

  public Integer getRateLimit() {
    return rateLimit;
  }

  public DatabricksConfig setRateLimit(int rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  public HttpClient getHttpClient() {
    return httpClient;
  }

  public DatabricksConfig setHttpClient(HttpClient httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  public boolean isAzure() {
    if (azureWorkspaceResourceId != null) {
      return true;
    }
    return this.getDatabricksEnvironment().getCloud() == Cloud.AZURE;
  }

  public synchronized void authenticate(HttpMessage request) {
    Map<String, String> headers = authenticate();
    for (Map.Entry<String, String> e : headers.entrySet()) {
      request.setHeader(e.getKey(), e.getValue());
    }
  }

  public boolean isGcp() {
    return this.getDatabricksEnvironment().getCloud() == Cloud.GCP;
  }

  public boolean isAws() {
    return this.getDatabricksEnvironment().getCloud() == Cloud.AWS;
  }

  public boolean isAccountClient() {
    if (host == null) {
      return false;
    }
    return host.startsWith("https://accounts.") || host.startsWith("https://accounts-dod.");
  }

  public OpenIDConnectEndpoints getOidcEndpoints() throws IOException {
    if (discoveryUrl == null) {
      return fetchDefaultOidcEndpoints();
    }
    return fetchOidcEndpointsFromDiscovery();
  }

  private OpenIDConnectEndpoints fetchOidcEndpointsFromDiscovery() {
    try {
      Request request = new Request("GET", discoveryUrl);
      Response resp = getHttpClient().execute(request);
      if (resp.getStatusCode() == 200) {
        return new ObjectMapper().readValue(resp.getBody(), OpenIDConnectEndpoints.class);
      }
    } catch (IOException e) {
      throw ConfigLoader.makeNicerError(e.getMessage(), e, this);
    }
    return null;
  }

  private OpenIDConnectEndpoints fetchDefaultOidcEndpoints() throws IOException {
    if (getHost() == null) {
      return null;
    }
    if (isAzure() && getAzureClientId() != null) {
      Request request = new Request("GET", getHost() + "/oidc/oauth2/v2.0/authorize");
      request.setRedirectionBehavior(false);
      Response resp = getHttpClient().execute(request);
      String realAuthUrl = resp.getFirstHeader("location");
      if (realAuthUrl == null) {
        return null;
      }
      return new OpenIDConnectEndpoints(
          realAuthUrl.replaceAll("/authorize", "/token"), realAuthUrl);
    }
    if (isAccountClient() && getAccountId() != null) {
      String prefix = getHost() + "/oidc/accounts/" + getAccountId();
      return new OpenIDConnectEndpoints(prefix + "/v1/token", prefix + "/v1/authorize");
    }

    ApiClient apiClient =
        new ApiClient.Builder()
            .withHttpClient(getHttpClient())
            .withGetHostFunc(v -> getHost())
            .build();
    try {
      return apiClient.execute(
          new Request("GET", "/oidc/.well-known/oauth-authorization-server"),
          OpenIDConnectEndpoints.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public String toString() {
    return ConfigLoader.debugString(this);
  }

  public DatabricksConfig setDatabricksEnvironment(DatabricksEnvironment databricksEnvironment) {
    this.databricksEnvironment = databricksEnvironment;
    return this;
  }

  public DatabricksEnvironment getDatabricksEnvironment() {
    ConfigLoader.fixHostIfNeeded(this);

    if (this.databricksEnvironment != null) {
      return this.databricksEnvironment;
    }

    if (this.host == null && this.azureWorkspaceResourceId != null) {
      String azureEnv = "PUBLIC";
      if (this.azureEnvironment != null) {
        azureEnv = this.azureEnvironment;
      }
      for (DatabricksEnvironment env : DatabricksEnvironment.ALL_ENVIRONMENTS) {
        if (env.getCloud() != Cloud.AZURE) {
          continue;
        }
        if (!env.getAzureEnvironment().getName().equals(azureEnv)) {
          continue;
        }
        if (env.getDnsZone().startsWith(".dev") || env.getDnsZone().startsWith(".staging")) {
          continue;
        }
        return env;
      }
    }

    return DatabricksEnvironment.getEnvironmentFromHostname(this.host);
  }

  private DatabricksConfig clone(Set<String> fieldsToSkip) {
    DatabricksConfig newConfig = new DatabricksConfig();
    for (Field f : DatabricksConfig.class.getDeclaredFields()) {
      if (fieldsToSkip.contains(f.getName())) {
        continue;
      }
      try {
        f.set(newConfig, f.get(this));
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      }
    }
    return newConfig;
  }

  public DatabricksConfig clone() {
    return clone(new HashSet<>());
  }

  public DatabricksConfig newWithWorkspaceHost(String host) {
    Set<String> fieldsToSkip =
        new HashSet<>(
            Arrays.asList(
                // The config for WorkspaceClient has a different host and Azure Workspace resource
                // ID, and also omits
                // the account ID.
                "host",
                "accountId",
                "azureWorkspaceResourceId",
                // For cloud-native OAuth, we need to reauthenticate as the audience has changed, so
                // don't cache the
                // header factory.
                "headerFactory"));
    return clone(fieldsToSkip).setHost(host);
  }

  public String getOAuthPassphrase() {
    return oAuthTokenCachePassphrase;
  }

  public DatabricksConfig setOAuthPassphrase(String oAuthPassphrase) {
    this.oAuthTokenCachePassphrase = oAuthPassphrase;
    return this;
  }

  /**
   * Gets the default OAuth redirect URL.
   * If one is not provided explicitly, uses http://localhost:8080/callback
   * 
   * @return The OAuth redirect URL to use
   */
  public String getEffectiveOAuthRedirectUrl() {
    return redirectUrl != null ? redirectUrl : "http://localhost:8080/callback";
  }
  
  /**
   * Gets the TokenCache instance for the current configuration.
   * Creates it if it doesn't exist yet.
   * 
   * @return A TokenCache instance for the current host, client ID, and scopes
   */
  public synchronized TokenCache getTokenCache() {
    if (tokenCache == null && getHost() != null && getClientId() != null) {
      tokenCache = new TokenCache(getHost(), getClientId(), getScopes(), getOAuthPassphrase());
    }
    return tokenCache;
  }
  
  /**
   * Loads a cached token if one exists for the current configuration.
   * 
   * @return The cached token, or null if no valid token is cached
   */
  public Token loadCachedToken() {
    TokenCache cache = getTokenCache();
    if (cache == null) {
      return null;
    }
    return cache.load();
  }
  
  /**
   * Saves a token to the cache for the current configuration.
   * 
   * @param token The token to cache
   * @throws IOException If there is an error saving the token
   */
  public void saveTokenToCache(Token token) throws IOException {
    TokenCache cache = getTokenCache();
    if (cache == null) {
      return;
    }
    cache.save(token);
  }
}
