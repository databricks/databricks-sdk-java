package com.databricks.sdk.core;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.http.HttpMessage;

public class DatabricksConfig {

  public static final String DEFAULT_CONFIG_FILE = "~/.databrickscfg";

  private CredentialsProvider credentialsProvider = new DefaultCredentialsProvider();

  @ConfigAttribute(value = "host", env = "DATABRICKS_HOST")
  private String host;

  @ConfigAttribute(value = "account_id", env = "DATABRICKS_ACCOUNT_ID")
  private String accountId;

  @ConfigAttribute(value = "token", env = "DATABRICKS_TOKEN", auth = "pat", sensitive = true)
  private String token;

  @ConfigAttribute(value = "client_id", env = "DATABRICKS_CLIENT_ID", auth = "oauth")
  private String clientId;

  @ConfigAttribute(
      value = "client_secret",
      env = "DATABRICKS_CLIENT_SECRET",
      auth = "oauth",
      sensitive = true)
  private String clientSecret;

  @ConfigAttribute(value = "username", env = "DATABRICKS_USERNAME", auth = "basic")
  private String username;

  @ConfigAttribute(
      value = "password",
      env = "DATABRICKS_PASSWORD",
      auth = "basic",
      sensitive = true)
  private String password;

  /** Connection profile specified within ~/.databrickscfg. */
  @ConfigAttribute(value = "profile", env = "DATABRICKS_CONFIG_PROFILE")
  private String profile;

  /**
   * Location of the Databricks CLI credentials file, that is created by `databricks configure
   * --token` command. By default, it is located in ~/.databrickscfg.
   */
  @ConfigAttribute(value = "config_file", env = "DATABRICKS_CONFIG_FILE")
  private String configFile;

  @ConfigAttribute(value = "cluster_id", env = "DATABRICKS_CLUSTER_ID")
  private String clusterId;

  @ConfigAttribute(
      value = "google_service_account",
      env = "DATABRICKS_GOOGLE_SERVICE_ACCOUNT",
      auth = "google")
  private String googleServiceAccount;

  @ConfigAttribute(
      value = "google_credentials",
      env = "GOOGLE_CREDENTIALS",
      auth = "google",
      sensitive = true)
  private String googleCredentials;

  /** Azure Resource Manager ID for Azure Databricks workspace, which is exchanged for a Host */
  @ConfigAttribute(
      value = "azure_workspace_resource_id",
      env = "DATABRICKS_AZURE_RESOURCE_ID",
      auth = "azure")
  private String azureWorkspaceResourceId;

  @ConfigAttribute(value = "azure_use_msi", env = "ARM_USE_MSI", auth = "azure")
  private Boolean azureUseMSI;

  @ConfigAttribute(
      value = "azure_client_secret",
      env = "ARM_CLIENT_SECRET",
      auth = "azure",
      sensitive = true)
  private String azureClientSecret;

  @ConfigAttribute(value = "azure_client_id", env = "ARM_CLIENT_ID", auth = "azure")
  private String azureClientId;

  @ConfigAttribute(value = "azure_tenant_id", env = "ARM_TENANT_ID", auth = "azure")
  private String azureTenantId;

  @ConfigAttribute(value = "azure_environment", env = "ARM_ENVIRONMENT")
  private String azureEnvironment;

  @ConfigAttribute(
      value = "azure_login_app_id",
      env = "DATABRICKS_AZURE_LOGIN_APP_ID",
      auth = "azure")
  private String azureLoginAppId;

  @ConfigAttribute(value = "databricks_cli_path", env = "DATABRICKS_CLI_PATH")
  private String databricksCliPath;

  /**
   * When multiple auth attributes are available in the environment, use the auth type specified by
   * this argument. This argument also holds currently selected auth.
   */
  @ConfigAttribute(value = "auth_type", env = "DATABRICKS_AUTH_TYPE")
  private String authType;

  /**
   * Skip SSL certificate verification for HTTP calls. Use at your own risk or for unit testing
   * purposes.
   */
  @ConfigAttribute("skip_verify")
  private Boolean skipVerify;

  /** Number of seconds for HTTP timeout */
  @ConfigAttribute("http_timeout_seconds")
  private Integer httpTimeoutSeconds;

  /** Truncate JSON fields in JSON above this limit. Default is 96. */
  @ConfigAttribute(value = "debug_truncate_bytes", env = "DATABRICKS_DEBUG_TRUNCATE_BYTES")
  private Integer debugTruncateBytes;

  /** Debug HTTP headers of requests made by the provider. Default is false. */
  @ConfigAttribute(value = "debug_headers", env = "DATABRICKS_DEBUG_HEADERS")
  private Boolean debugHeaders;

  /** Maximum number of requests per second made to Databricks REST API. */
  @ConfigAttribute(value = "rate_limit", env = "DATABRICKS_RATE_LIMIT")
  private Integer rateLimit;

  private volatile boolean resolved;
  private HeaderFactory headerFactory;

  private HttpClient httpClient;

  private Map<String, String> allEnv;

  public Map<String, String> getAllEnv() {
    return allEnv;
  }

  public synchronized DatabricksConfig resolve() {
    return resolve(System::getenv);
  }

  synchronized DatabricksConfig resolve(Supplier<Map<String, String>> getAllEnv) {
    allEnv = getAllEnv.get();
    innerResolve();
    return this;
  }

  private synchronized DatabricksConfig innerResolve() {
    Objects.requireNonNull(allEnv);
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
    int timeout = 300;
    if (httpTimeoutSeconds != null) {
      timeout = httpTimeoutSeconds;
    }
    // eventually it'll get decoupled from config.
    httpClient = new CommonsHttpClient(timeout);
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

  public boolean isAzureUseMSI() {
    return azureUseMSI;
  }

  public DatabricksConfig setAzureUseMSI(boolean azureUseMSI) {
    this.azureUseMSI = azureUseMSI;
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

  public String getEffectiveAzureLoginAppId() {
    if (azureLoginAppId != null) {
      return azureLoginAppId;
    }

    return AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
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
    if (host == null) {
      return false;
    }
    return host.contains(".azuredatabricks.net")
        || host.contains("databricks.azure.cn")
        || host.contains(".databricks.azure.us");
  }

  public synchronized void authenticate(HttpMessage request) {
    Map<String, String> headers = authenticate();
    for (Map.Entry<String, String> e : headers.entrySet()) {
      request.setHeader(e.getKey(), e.getValue());
    }
  }

  public boolean isGcp() {
    if (host == null) {
      return false;
    }
    return host.contains(".gcp.databricks.com");
  }

  public boolean isAws() {
    if (host == null) {
      return false;
    }
    return (!isAzure() && !isGcp());
  }

  public boolean isAccountClient() {
    if (host == null) {
      return false;
    }
    return host.startsWith("https://accounts.") || host.startsWith("https://accounts-dod.");
  }

  public OpenIDConnectEndpoints getOidcEndpoints() throws IOException {
    if (getHost() == null) {
      return null;
    }
    if (isAzure()) {
      Response resp =
          getHttpClient().execute(new Request("GET", getHost() + "/oidc/oauth2/v2.0/authorize"));
      String realAuthUrl = resp.getFirstHeader("location");
      if (realAuthUrl == null) {
        return null;
      }
      return new OpenIDConnectEndpoints(
          realAuthUrl.replaceAll("/authorize", "/token"), realAuthUrl);
    }
    if (getAccountId() != null) {
      String prefix = getHost() + "/oidc/accounts/" + getAccountId();
      return new OpenIDConnectEndpoints(prefix + "/v1/token", prefix + "/v1/authorize");
    }

    String oidcEndpoint = getHost() + "/oidc/.well-known/oauth-authorization-server";
    Response resp = getHttpClient().execute(new Request("GET", oidcEndpoint));
    if (resp.getStatusCode() != 200) {
      return null;
    }
    return new ObjectMapper().readValue(resp.getBody(), OpenIDConnectEndpoints.class);
  }

  @Override
  public String toString() {
    return ConfigLoader.debugString(this);
  }
}
