package com.databricks.sdk.client;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import com.databricks.sdk.client.oauth.OpenIDConnectEndpoints;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.http.HttpMessage;

/**
 * <p>DatabricksConfig class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DatabricksConfig {

  /** Constant <code>DEFAULT_CONFIG_FILE="~/.databrickscfg"</code> */
  public static final String DEFAULT_CONFIG_FILE = "~/.databrickscfg";

  private CredentialsProvider credentialsProvider = new DefaultCredentialsProvider();

  @ConfigAttribute(value = "host", env = "DATABRICKS_HOST")
  private String host;

  @ConfigAttribute(value = "account_id", env = "DATABRICKS_ACCOUNT_ID")
  private String accountId;

  @ConfigAttribute(value = "token", env = "DATABRICKS_TOKEN", auth = "pat", sensitive = true)
  private String token;

  @ConfigAttribute(value = "client_id", env = "DATABRICKS_CLIENT_ID", auth = "oath")
  private String clientId;

  @ConfigAttribute(value = "client_secret", env = "DATABRICKS_CLIENT_SECRET", auth = "oath")
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

  /** Azure Resource Manager ID for Azure Databricks workspace, which is exhanged for a Host */
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

  @ConfigAttribute(value = "bricks_cli_path", env = "BRICKS_CLI_PATH")
  private String bricksCliPath;

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

  /**
   * <p>Getter for the field <code>allEnv</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getAllEnv() {
    return allEnv;
  }

  /**
   * <p>resolve.</p>
   *
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public synchronized DatabricksConfig resolve() {
    resolve(() -> System.getenv());
    return this;
  }

  /**
   * <p>resolve.</p>
   *
   * @param getAllEnv a {@link java.util.function.Supplier} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public synchronized DatabricksConfig resolve(Supplier<Map<String, String>> getAllEnv) {
    allEnv = getAllEnv.get();
    return resolve(allEnv::get);
  }

  /**
   * <p>resolve.</p>
   *
   * @param getEnv a {@link java.util.function.Function} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public synchronized DatabricksConfig resolve(Function<String, String> getEnv) {
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

  /**
   * <p>authenticate.</p>
   *
   * @return a {@link java.util.Map} object
   * @throws com.databricks.sdk.client.DatabricksException if any.
   */
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

  /**
   * <p>Getter for the field <code>credentialsProvider</code>.</p>
   *
   * @return a {@link com.databricks.sdk.client.CredentialsProvider} object
   */
  public CredentialsProvider getCredentialsProvider() {
    return this.credentialsProvider;
  }

  /**
   * <p>Setter for the field <code>credentialsProvider</code>.</p>
   *
   * @param credentialsProvider a {@link com.databricks.sdk.client.CredentialsProvider} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setCredentialsProvider(CredentialsProvider credentialsProvider) {
    this.credentialsProvider = credentialsProvider;
    return this;
  }

  /**
   * <p>Getter for the field <code>host</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getHost() {
    return host;
  }

  /**
   * <p>Setter for the field <code>host</code>.</p>
   *
   * @param host a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setHost(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>bricksCliPath</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBricksCliPath() {
    return this.bricksCliPath;
  }

  /**
   * <p>Setter for the field <code>bricksCliPath</code>.</p>
   *
   * @param bricksCliPath a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setBricksCliPath(String bricksCliPath) {
    this.bricksCliPath = bricksCliPath;
    return this;
  }

  /**
   * <p>Getter for the field <code>token</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getToken() {
    return token;
  }

  /**
   * <p>Setter for the field <code>token</code>.</p>
   *
   * @param token a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setToken(String token) {
    this.token = token;
    return this;
  }

  /**
   * <p>Getter for the field <code>username</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUsername() {
    return username;
  }

  /**
   * <p>Setter for the field <code>username</code>.</p>
   *
   * @param username a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setUsername(String username) {
    this.username = username;
    return this;
  }

  /**
   * <p>Getter for the field <code>password</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPassword() {
    return password;
  }

  /**
   * <p>Setter for the field <code>password</code>.</p>
   *
   * @param password a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setPassword(String password) {
    this.password = password;
    return this;
  }

  /**
   * <p>Getter for the field <code>clientId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * <p>Setter for the field <code>clientId</code>.</p>
   *
   * @param clientId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clientSecret</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * <p>Setter for the field <code>clientSecret</code>.</p>
   *
   * @param clientSecret a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>Getter for the field <code>profile</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProfile() {
    return profile;
  }

  /**
   * <p>Setter for the field <code>profile</code>.</p>
   *
   * @param profile a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setProfile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * <p>Getter for the field <code>configFile</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getConfigFile() {
    return configFile;
  }

  /**
   * <p>Setter for the field <code>configFile</code>.</p>
   *
   * @param configFile a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setConfigFile(String configFile) {
    this.configFile = configFile;
    return this;
  }

  /**
   * <p>Getter for the field <code>googleServiceAccount</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  /**
   * <p>Setter for the field <code>googleServiceAccount</code>.</p>
   *
   * @param googleServiceAccount a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  /**
   * <p>Getter for the field <code>googleCredentials</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGoogleCredentials() {
    return googleCredentials;
  }

  /**
   * <p>Setter for the field <code>googleCredentials</code>.</p>
   *
   * @param googleCredentials a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setGoogleCredentials(String googleCredentials) {
    this.googleCredentials = googleCredentials;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureWorkspaceResourceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAzureWorkspaceResourceId() {
    return azureWorkspaceResourceId;
  }

  /**
   * <p>Setter for the field <code>azureWorkspaceResourceId</code>.</p>
   *
   * @param azureWorkspaceResourceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureWorkspaceResourceId(String azureWorkspaceResourceId) {
    this.azureWorkspaceResourceId = azureWorkspaceResourceId;
    return this;
  }

  /**
   * <p>isAzureUseMSI.</p>
   *
   * @return a boolean
   */
  public boolean isAzureUseMSI() {
    return azureUseMSI;
  }

  /**
   * <p>Setter for the field <code>azureUseMSI</code>.</p>
   *
   * @param azureUseMSI a boolean
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureUseMSI(boolean azureUseMSI) {
    this.azureUseMSI = azureUseMSI;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureClientSecret</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAzureClientSecret() {
    return azureClientSecret;
  }

  /**
   * <p>Setter for the field <code>azureClientSecret</code>.</p>
   *
   * @param azureClientSecret a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureClientSecret(String azureClientSecret) {
    this.azureClientSecret = azureClientSecret;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureClientId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAzureClientId() {
    return azureClientId;
  }

  /**
   * <p>Setter for the field <code>azureClientId</code>.</p>
   *
   * @param azureClientId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureTenantId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAzureTenantId() {
    return azureTenantId;
  }

  /**
   * <p>Setter for the field <code>azureTenantId</code>.</p>
   *
   * @param azureTenantId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureEnvironment</code>.</p>
   *
   * @return a {@link com.databricks.sdk.client.AzureEnvironment} object
   */
  public AzureEnvironment getAzureEnvironment() {
    String env = "PUBLIC";
    if (azureEnvironment != null) {
      env = azureEnvironment;
    }
    return AzureEnvironment.getEnvironment(env);
  }

  /**
   * <p>Setter for the field <code>azureEnvironment</code>.</p>
   *
   * @param azureEnvironment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAzureEnvironment(String azureEnvironment) {
    this.azureEnvironment = azureEnvironment;
    return this;
  }

  /**
   * <p>getEffectiveAzureLoginAppId.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEffectiveAzureLoginAppId() {
    if (azureLoginAppId != null) {
      return azureLoginAppId;
    }

    return AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
  }

  /**
   * <p>Getter for the field <code>authType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAuthType() {
    return authType;
  }

  /**
   * <p>Setter for the field <code>authType</code>.</p>
   *
   * @param authType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setAuthType(String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * <p>isSkipVerify.</p>
   *
   * @return a boolean
   */
  public boolean isSkipVerify() {
    return skipVerify;
  }

  /**
   * <p>Setter for the field <code>skipVerify</code>.</p>
   *
   * @param skipVerify a boolean
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setSkipVerify(boolean skipVerify) {
    this.skipVerify = skipVerify;
    return this;
  }

  /**
   * <p>Getter for the field <code>httpTimeoutSeconds</code>.</p>
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHttpTimeoutSeconds() {
    return httpTimeoutSeconds;
  }

  /**
   * <p>Setter for the field <code>httpTimeoutSeconds</code>.</p>
   *
   * @param httpTimeoutSeconds a int
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setHttpTimeoutSeconds(int httpTimeoutSeconds) {
    this.httpTimeoutSeconds = httpTimeoutSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>debugTruncateBytes</code>.</p>
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDebugTruncateBytes() {
    return debugTruncateBytes;
  }

  /**
   * <p>Setter for the field <code>debugTruncateBytes</code>.</p>
   *
   * @param debugTruncateBytes a int
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setDebugTruncateBytes(int debugTruncateBytes) {
    this.debugTruncateBytes = debugTruncateBytes;
    return this;
  }

  /**
   * <p>isDebugHeaders.</p>
   *
   * @return a boolean
   */
  public boolean isDebugHeaders() {
    return debugHeaders != null && debugHeaders;
  }

  /**
   * <p>Setter for the field <code>debugHeaders</code>.</p>
   *
   * @param debugHeaders a boolean
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setDebugHeaders(boolean debugHeaders) {
    this.debugHeaders = debugHeaders;
    return this;
  }

  /**
   * <p>Getter for the field <code>rateLimit</code>.</p>
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getRateLimit() {
    return rateLimit;
  }

  /**
   * <p>Setter for the field <code>rateLimit</code>.</p>
   *
   * @param rateLimit a int
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setRateLimit(int rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  /**
   * <p>Getter for the field <code>httpClient</code>.</p>
   *
   * @return a {@link com.databricks.sdk.client.http.HttpClient} object
   */
  public HttpClient getHttpClient() {
    return httpClient;
  }

  /**
   * <p>Setter for the field <code>httpClient</code>.</p>
   *
   * @param httpClient a {@link com.databricks.sdk.client.http.HttpClient} object
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig setHttpClient(HttpClient httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  /**
   * <p>isAzure.</p>
   *
   * @return a boolean
   */
  public boolean isAzure() {
    if (azureWorkspaceResourceId != null) {
      return true;
    }
    if (host == null) {
      return false;
    }
    return host.contains(".azuredatabricks.");
  }

  /**
   * <p>authenticate.</p>
   *
   * @param request a {@link org.apache.http.HttpMessage} object
   */
  public synchronized void authenticate(HttpMessage request) {
    Map<String, String> headers = authenticate();
    for (Map.Entry<String, String> e : headers.entrySet()) {
      request.setHeader(e.getKey(), e.getValue());
    }
  }

  /**
   * <p>isGcp.</p>
   *
   * @return a boolean
   */
  public boolean isGcp() {
    if (host == null) {
      return false;
    }
    return host.contains(".gcp.databricks.com");
  }

  /**
   * <p>isAws.</p>
   *
   * @return a boolean
   */
  public boolean isAws() {
    if (host == null) {
      return false;
    }
    return (!isAzure() && !isGcp());
  }

  /**
   * <p>isAccountClient.</p>
   *
   * @return a boolean
   */
  public boolean isAccountClient() {
    if (host == null) {
      return false;
    }
    if (host.contains("https://accounts.")) {
      return true;
    }
    return false;
  }

  /**
   * <p>getOidcEndpoints.</p>
   *
   * @return a {@link com.databricks.sdk.client.oauth.OpenIDConnectEndpoints} object
   * @throws java.io.IOException if any.
   */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return ConfigLoader.debugString(this);
  }
}
