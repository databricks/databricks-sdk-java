package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

/**
 * The set of endpoints within a single Azure authentication boundary.
 *
 * <p>Tokens fetched from Azure AAD can be scoped to a specific resource. The identifiers for these
 * resources vary depending on the cloud environment: public, germany, govcloud, or china. Depending
 * on the operation, tokens scoped to a specific endpoint are needed.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AzureEnvironment {
  private String name;
  private String serviceManagementEndpoint;
  private String resourceManagerEndpoint;
  private String activeDirectoryEndpoint;

  /**
   * <p>Constructor for AzureEnvironment.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param serviceManagementEndpoint a {@link java.lang.String} object
   * @param resourceManagerEndpoint a {@link java.lang.String} object
   * @param activeDirectoryEndpoint a {@link java.lang.String} object
   */
  public AzureEnvironment(
      String name,
      String serviceManagementEndpoint,
      String resourceManagerEndpoint,
      String activeDirectoryEndpoint) {
    this.name = name;
    this.serviceManagementEndpoint = serviceManagementEndpoint;
    this.resourceManagerEndpoint = resourceManagerEndpoint;
    this.activeDirectoryEndpoint = activeDirectoryEndpoint;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Getter for the field <code>serviceManagementEndpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServiceManagementEndpoint() {
    return serviceManagementEndpoint;
  }

  /**
   * <p>Getter for the field <code>resourceManagerEndpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getResourceManagerEndpoint() {
    return resourceManagerEndpoint;
  }

  /**
   * <p>Getter for the field <code>activeDirectoryEndpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getActiveDirectoryEndpoint() {
    return activeDirectoryEndpoint;
  }

  /** The application ID of the production Databricks first-party application. */
  public static final String ARM_DATABRICKS_RESOURCE_ID = "2ff814a6-3304-4ab8-85cb-cd0e6f879c1d";

  private static final Map<String, AzureEnvironment> ENVIRONMENTS;

  static {
    ENVIRONMENTS = new HashMap<>();
    ENVIRONMENTS.put(
        "PUBLIC",
        new AzureEnvironment(
            "AzurePublicCloud",
            "https://management.core.windows.net/",
            "https://management.azure.com/",
            "https://login.microsoftonline.com/"));
    ENVIRONMENTS.put(
        "GERMAN",
        new AzureEnvironment(
            "AzureGermanCloud",
            "https://management.core.cloudapi.de/",
            "https://management.microsoftazure.de/",
            "https://login.microsoftonline.de/"));
    ENVIRONMENTS.put(
        "USGOVERNMENT",
        new AzureEnvironment(
            "AzureUSGovernmentCloud",
            "https://management.core.usgovcloudapi.net/",
            "https://management.usgovcloudapi.net/",
            "https://login.microsoftonline.us/"));
    ENVIRONMENTS.put(
        "CHINA",
        new AzureEnvironment(
            "AzureChinaCloud",
            "https://management.core.chinacloudapi.cn/",
            "https://management.chinacloudapi.cn/",
            "https://login.chinacloudapi.cn/"));
  }

  /**
   * <p>getEnvironment.</p>
   *
   * @param env a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.AzureEnvironment} object
   */
  public static AzureEnvironment getEnvironment(String env) {
    if (!ENVIRONMENTS.containsKey(env)) {
      throw new IllegalArgumentException("Cannot find Azure " + env + " Environment");
    }

    return ENVIRONMENTS.get(env);
  }
}
