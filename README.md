# Databricks SDK for Java

**Stability**: [Experimental](https://docs.databricks.com/release-notes/release-types.html)

The Databricks SDK for Java includes functionality to accelerate development with Java for the Databricks Lakehouse. It covers all public [Databricks REST API](https://docs.databricks.com/dev-tools/api/index.html) operations. The SDK's internal HTTP client is robust and handles failures on different levels by performing intelligent retries.

## Contents

- [Getting started](#getting-started)
- [Authentication](#authentication)
- [Code examples](#code-examples)
- [Long-running operations](#long-running-operations)
- [Paginated responses](#paginated-responses)
- [Single-sign-on with OAuth](#single-sign-on-sso-with-oauth)
- [Logging](#logging)
- [Integration with `dbutils`](#interaction-with-dbutils)
- [Interface stability](#interface-stability)
- [Disclaimer](#disclaimer)

## Getting started

You can install Databricks SDK for Java by adding the following to your `pom.xml`:

```pom.xml
<dependency>
  <groupId>com.databricks</groupId>
  <artifactId>databricks-sdk-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

Using the SDK is as simple as instantiating `DatabricksWorkspace` and `DatabricksAccount` classes:

```java
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.DatabricksAccount;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

public class App {
  public static void main(String[] args) {
    DatabricksWorkspace workspace = new DatabricksWorkspace();
    for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
      System.out.println(c.getClusterName());
    }
    
    DatabricksAccount account = new DatabricksAccount();
    for (Workspace w : account.workspaces().list()) {
       System.out.println(w.getWorkspaceName());
    }
  }
}
```

Databricks SDK for Java is compatible with Java 8 and higher. CI testing runs on Java versions 8, 11, 17, and 20.

## Authentication

If you use Databricks [configuration profiles](https://docs.databricks.com/dev-tools/auth.html#configuration-profiles) or Databricks-specific [environment variables](https://docs.databricks.com/dev-tools/auth.html#environment-variables) for [Databricks authentication](https://docs.databricks.com/dev-tools/auth.html), the only code required to start working with a Databricks workspace is the following code snippet, which instructs the Databricks SDK for Java to use its [default authentication flow](#default-authentication-flow):

```java
import com.databricks.sdk.DatabricksWorkspace;
...
DatabricksWorkspace workspace = new DatabricksWorkspace();
workspace. # press <TAB> for autocompletion
```

### In this section

- [Default authentication flow](#default-authentication-flow)
- [Databricks native authentication](#databricks-native-authentication)
- [Azure native authentication](#azure-native-authentication)
- [Overriding .databrickscfg](#overriding-databrickscfg)
- [Additional authentication configuration options](#additional-authentication-configuration-options)

### Default authentication flow

If you run the [Databricks Terraform Provider](https://registry.terraform.io/providers/databrickslabs/databricks/latest), the [Databricks SDK for Go](https://github.com/databricks/databricks-sdk-go), the [Databricks CLI](https://docs.databricks.com/dev-tools/cli/index.html), or applications that target the Databricks SDKs for other languages, most likely they will all interoperate nicely together. By default, the Databricks SDK for Java tries the following [authentication](https://docs.databricks.com/dev-tools/auth.html) methods, in the following order, until it succeeds:

1. [Databricks native authentication](#databricks-native-authentication)
2. [Azure native authentication](#azure-native-authentication)
3. If the SDK is unsuccessful at this point, it returns an authentication error and stops running.

You can instruct the Databricks SDK for Java to use a specific authentication method by instantiating the `DatabricksConfig` class and setting the `auth_type` as described in the following sections.

For each authentication method, the SDK searches for compatible authentication credentials in the following locations, in the following order. Once the SDK finds a compatible set of credentials that it can use, it stops searching:

1. Credentials that are hard-coded into configuration arguments.

   :warning: **Caution**: Databricks does not recommend hard-coding credentials into arguments, as they can be exposed in plain text in version control systems. Use environment variables or configuration profiles instead.

2. Credentials in Databricks-specific [environment variables](https://docs.databricks.com/dev-tools/auth.html#environment-variables).
3. For Databricks native authentication, credentials in the `.databrickscfg` file's `DEFAULT` [configuration profile](https://docs.databricks.com/dev-tools/auth.html#configuration-profiles) from its default file location (`~` for Linux or macOS, and `%USERPROFILE%` for Windows).
4. For Azure native authentication, the SDK searches for credentials through the Azure CLI as needed.
5. For Bricks CLI authentication, the SDK reuses OAuth credentials obtained by running `bricks auth login`.

Depending on the Databricks authentication method, the SDK uses the following information. Presented are the `DatabricksWorkspace` and `DatabricksAccount` arguments (which have corresponding `.databrickscfg` file fields), their descriptions, and any corresponding environment variables.

### Databricks native authentication

By default, the Databricks SDK for Java initially tries [Databricks token authentication](https://docs.databricks.com/dev-tools/api/latest/authentication.html) (`auth_type='pat'` argument). If the SDK is unsuccessful, it then tries Databricks basic (username/password) authentication (`auth_type="basic"` argument).

- For Databricks token authentication, you must provide `host` and `token`; or their environment variable or `.databrickscfg` file field equivalents.
- For Databricks basic authentication, you must provide `host`, `username`, and `password` _(for AWS workspace-level operations)_; or `host`, `account_id`, `username`, and `password` _(for AWS, Azure, or GCP account-level operations)_; or their environment variable or `.databrickscfg` file field equivalents.

| Argument     | Description | Environment variable |
|--------------|-------------|-------------------|
| `host`       | _(String)_ The Databricks host URL for either the Databricks workspace endpoint or the Databricks accounts endpoint. | `DATABRICKS_HOST` |     
| `account_id` | _(String)_ The Databricks account ID for the Databricks accounts endpoint. Only has effect when `Host` is either `https://accounts.cloud.databricks.com/` _(AWS)_, `https://accounts.azuredatabricks.net/` _(Azure)_, or `https://accounts.gcp.databricks.com/` _(GCP)_. | `DATABRICKS_ACCOUNT_ID` |
| `token`      | _(String)_ The Databricks personal access token (PAT) _(AWS, Azure, and GCP)_ or Azure Active Directory (Azure AD) token _(Azure)_. | `DATABRICKS_TOKEN` |
| `username`   | _(String)_ The Databricks username part of basic authentication. Only possible when `Host` is `*.cloud.databricks.com` _(AWS)_. | `DATABRICKS_USERNAME` |
| `password`   | _(String)_ The Databricks password part of basic authentication. Only possible when `Host` is `*.cloud.databricks.com` _(AWS)_. | `DATABRICKS_PASSWORD` |

For example, to use Databricks token authentication:

```java
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
...
DatabricksConfig config = new DatabricksConfig()
    .setAuthType("pat")
    .setHost("https://my-databricks-instance.com")
    .setToken("my-token");
DatabricksWorkspace workspace = new DatabricksWorkspace(config);
```

### Azure native authentication

By default, the Databricks SDK for Java first tries Azure client secret authentication (`auth_type='azure-client-secret'` argument). If the SDK is unsuccessful, it then tries Azure CLI authentication (`auth_type='azure-cli'` argument). See [Manage service principals](https://learn.microsoft.com/azure/databricks/administration-guide/users-groups/service-principals).

The Databricks SDK for Java picks up an Azure CLI token, if you've previously authenticated as an Azure user by running `az login` on your machine. See [Get Azure AD tokens for users by using the Azure CLI](https://learn.microsoft.com/azure/databricks/dev-tools/api/latest/aad/user-aad-token).

To authenticate as an Azure Active Directory (Azure AD) service principal, you must provide one of the following. See also [Add a service principal to your Azure Databricks account](https://learn.microsoft.com/azure/databricks/administration-guide/users-groups/service-principals#add-sp-account):

- `azure_resource_id`, `azure_client_secret`, `azure_client_id`, and `azure_tenant_id`; or their environment variable or `.databrickscfg` file field equivalents.
- `azure_resource_id` and `azure_use_msi`; or their environment variable or `.databrickscfg` file field equivalents.

| Argument              | Description | Environment variable |
|-----------------------|-------------|----------------------|
| `azure_resource_id`   | _(String)_ The Azure Resource Manager ID for the Azure Databricks workspace, which is exchanged for a Databricks host URL. | `DATABRICKS_AZURE_RESOURCE_ID` |
| `azure_use_msi`       | _(Boolean)_ `true` to use Azure Managed Service Identity passwordless authentication flow for service principals. _This feature is not yet implemented in the Databricks SDK for Python._ | `ARM_USE_MSI` |
| `azure_client_secret` | _(String)_ The Azure AD service principal's client secret. | `ARM_CLIENT_SECRET` |
| `azure_client_id`     | _(String)_ The Azure AD service principal's application ID. | `ARM_CLIENT_ID` |
| `azure_tenant_id`     | _(String)_ The Azure AD service principal's tenant ID. | `ARM_TENANT_ID` |
| `azure_environment`   | _(String)_ The Azure environment type (such as Public, UsGov, China, and Germany) for a specific set of API endpoints. Defaults to `PUBLIC`. | `ARM_ENVIRONMENT` |

For example, to use Azure client secret authentication:

```java
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
...
DatabricksConfig config = new DatabricksConfig()
   .setAuthType("azure-client-secret")
   .setHost("https://my-databricks-instance.com")
   .setAzureTenantId("tenant-id")
   .setAzureClientId("client-id")
   .setAzureClientSecret("client-secret");
DatabricksWorkspace workspace = new DatabricksWorkspace(config);
```

### Overriding `.databrickscfg`

For [Databricks native authentication](#databricks-native-authentication), you can override the default behavior for using `.databrickscfg` as follows:

| Argument      | Description | Environment variable |
|---------------|-------------|----------------------|
| `profile`     | _(String)_ A connection profile specified within `.databrickscfg` to use instead of `DEFAULT`. | `DATABRICKS_CONFIG_PROFILE` |
| `config_file` | _(String)_ A non-default location of the Databricks CLI credentials file. | `DATABRICKS_CONFIG_FILE` |

For example, to use a profile named `MYPROFILE` instead of `DEFAULT`:

```java
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
...
DatabricksConfig config = new DatabricksConfig()
   .setProfile("profile");
DatabricksWorkspace workspace = new DatabricksWorkspace(config);
```

### Additional authentication configuration options

For all authentication methods, you can override the default behavior in client arguments as follows:

| DatabricksConfig Attribute | Description | Environment variable   |
|----------------------------|-------------|------------------------|
| `auth_type`                | _(String)_ When multiple auth attributes are available in the environment, use the auth type specified by this argument. This argument also holds the currently selected auth. | `DATABRICKS_AUTH_TYPE` |
| `http_timeout_seconds`     | _(Integer)_ Number of seconds for HTTP timeout. Default is _60_. | _(None)_               |
| `debug_truncate_bytes`     | _(Integer)_ Truncate JSON fields in debug logs above this limit. Default is 96. | `DATABRICKS_DEBUG_TRUNCATE_BYTES` |
| `debug_headers`            | _(Boolean)_ `true` to debug HTTP headers of requests made by the application. Default is `false`, as headers contain sensitive data, such as access tokens. | `DATABRICKS_DEBUG_HEADERS` |
| `rate_limit`               | _(Integer)_ Maximum number of requests per second made to Databricks REST API. | `DATABRICKS_RATE_LIMIT` |

For example, to turn on debug HTTP headers:

```java
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
...
DatabricksConfig config = new DatabricksConfig()
   .setDebugHeaders(true);
DatabricksWorkspace workspace = new DatabricksWorkspace(config);
```

## Code examples

To find code examples that demonstrate how to call the Databricks SDK for Java, see the top-level [examples](/examples) folder within this repository.

## Long-running operations

When you invoke a long-running operation, the SDK provides a high-level API to _trigger_ these operations and _wait_ for the related entities
to reach the correct state or return the error message in case of failure. All long-running operations return generic `Wait` instance with a `get()`
method to get a result of long-running operation, once it's finished. Databricks SDK for Java picks the most reasonable default timeouts for
every method, but sometimes you may find yourself in a situation, where you'd want to provide a custom `Duration` as the value of `timeout`
argument to the `get()` method.

There are a number of long-running operations in Databricks APIs, including:
* Clusters
* Command execution
* Jobs
* Libraries
* Delta Live Tables pipelines
* SQL warehouses

For example, in the Clusters API, once you create a cluster, you receive a cluster ID, and the cluster is in the `PENDING` state Meanwhile Databricks takes care of provisioning virtual machines from the cloud provider in the background. The cluster is only usable in the `RUNNING` state and so you have to wait for that state to be reached.

Another example is the API for running a job or repairing the run: right after the run starts, the run is in the `PENDING` state. The job is only considered to be finished when it is in either the `TERMINATED` or `SKIPPED` state. Also you would likely need the error message if the long-running operation times out failed with an error code. Other times you may want to configure a custom timeout other than the default of 20 minutes.

In the following example, `workspace.clusters().create()` returns `ClusterInfo` only once the cluster is in the `RUNNING` state, otherwise it will timeout in 10 minutes:

```java
CreateCluster request = new CreateCluster()
   .setClusterName("test-cluster")
   .setSparkVersion("13.0.x-scala2.11")
   .setNodeTypeId("i3.xlarge")
   .setAutoterminationMinutes(10L)
   .setNumWorkers(1L);
ClusterInfo cluster = workspace.clusters().create(request).get(Duration.ofMinutes(10));
```

## Paginated responses

On the platform side the Databricks APIs have different wait to deal with pagination:
* Some APIs follow the offset-plus-limit pagination
* Some start their offsets from 0 and some from 1
* Some use the cursor-based iteration
* Others just return all results in a single response

The Databricks SDK for Java hides this complexity under the `Paginator` abstraction. Users can iterate over the results of a paginated API, and the SDK will lazily load the next page of results as needed.

## Single-Sign-On (SSO) with OAuth

### Authorization Code flow with PKCE

For a regular web app running on a server, it's recommended to use the Authorization Code Flow to obtain an Access Token and a Refresh Token. This method is considered safe because the Access Token is transmitted directly to the server hosting the app, without passing through the user's web browser and risking exposure.

To enhance the security of the Authorization Code Flow, the PKCE (Proof Key for Code Exchange) mechanism can be employed. With PKCE, the calling application generates a secret called the Code Verifier, which is verified by the authorization server. The app also creates a transform value of the Code Verifier, called the Code Challenge, and sends it over HTTPS to obtain an Authorization Code. By intercepting the Authorization Code, a malicious attacker cannot exchange it for a token without possessing the Code Verifier.

The [presented sample](/examples/spring-boot-oauth-u2m-demo/src/main/java/com/databricks/sdk/App.java) is a Spring Boot application that uses the Databricks SDK for Java to demonstrate how to implement the OAuth Authorization Code flow with PKCE security. It can be used to build an app where each user uses their identity to access Databricks resources. The script can be executed with or without client and secret credentials for a custom OAuth app.

Databricks SDK for Java exposes the `OAuthClient.initiateConsent()` helper to acquire user redirect URL and initiate PKCE state verification. Application developers are expected to persist `RefreshableCredentials` in the webapp session using Java serialization. The underlying `HttpClient`, used for refreshing the access token, is not serializable, so this must be rehydrated by the application on every request.

### SSO for local scripts on development machines

For applications, that do run on developer workstations, Databricks SDK for Java provides `auth_type='external-browser'` utility, that opens up a browser for a user to go through SSO flow. See [the CLI app example project](examples/cli-oauth-u2m-demo/src/main/java/com/databricks/sdk/App.java) for a demo of using this authentication method. Azure support is still in the early experimental stage.

### Creating custom OAuth applications

In order to use OAuth with Databricks SDK for Python, you should use `DatabricksAccount.customAppIntegration().create()` API. Usage of this can be seen in the [Spring Boot example project](/examples/spring-boot-oauth-u2m-demo/src/main/java/com/databricks/sdk/App.java).

## Logging

The Databricks SDK for Java seamlessly integrates with the standard [SLF4J logging framework](https://www.slf4j.org/). This allows developers to easily enable and customize logging for their Databricks Java projects. To enable debug logging in your Databricks java project, you can add the following to your log4j.properties file:

```
log4j.logger.com.databricks.sdk=DEBUG
```

This will enable logging at the debug level and above. Developers can adjust the logging level as needed to control the verbosity of the logging output. The SDK will log all requests and responses to standard error output, using the format `> ` for requests and `< ` for responses. In some cases, requests or responses may be truncated due to size considerations. If this occurs, the log message will include the text `... (XXX additional elements)` to indicate that the request or response has been truncated. To increase the truncation limits, developers can set the `debug_truncate_bytes` configuration property or the `DATABRICKS_DEBUG_TRUNCATE_BYTES` environment variable. To protect sensitive data, such as authentication tokens, passwords, or any HTTP headers, the SDK will automatically replace these values with `**REDACTED**` in the log output. Developers can disable this redaction by setting the `debug_headers` configuration property to `True`.

```text
2023-03-22 21:19:21,702 [databricks.sdk][DEBUG] GET /api/2.0/clusters/list
< 200 OK
< {
<   "clusters": [
<     {
<       "autotermination_minutes": 60,
<       "cluster_id": "1109-115255-s1w13zjj",
<       "cluster_name": "DEFAULT Test Cluster",
<       ... truncated for brevity
<     },
<     "... (47 additional elements)"
<   ]
< }
```

Overall, the logging capabilities provided by the Databricks SDK for Java can be a powerful tool for monitoring and troubleshooting your Databricks Java projects. Developers can use the various logging methods and configuration options provided by the SDK to customize the logging output to their specific needs.

## Interface stability

During the [Experimental](https://docs.databricks.com/release-notes/release-types.html) period, Databricks is actively working on stabilizing the Databricks SDK for Java's interfaces. API clients for all services are generated from specification files that are synchronized from the main platform. You are highly encouraged to pin the exact dependency version and read the [changelog](https://github.com/databricks/databricks-sdk-py/blob/main/CHANGELOG.md) where Databricks documents the changes. Databricks may have minor [documented](https://github.com/databricks/databricks-sdk-py/blob/main/CHANGELOG.md) backward-incompatible changes, such as renaming the methods or some type names to bring more consistency.

## Disclaimer
- The product is in preview and not intended to be used in production;
- The product may change or may never be released;
- While we will not charge separately for this product right now, we may charge for it in the future. You will still incur charges for DBUs.
- There's no formal support or SLAs for the preview - so please reach out to your account or other contact with any questions or feedback; and
- We may terminate the preview or your access at any time.

