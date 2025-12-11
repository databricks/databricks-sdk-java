package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Cloud;
import com.databricks.sdk.support.InternalApi;
import java.util.Arrays;
import java.util.List;

@InternalApi
public class DatabricksEnvironment {
  private Cloud cloud;
  private String dnsZone;
  private String azureApplicationId;
  private AzureEnvironment azureEnvironment;

  private DatabricksEnvironment(Cloud cloud, String dnsZone) {
    this(cloud, dnsZone, null, null);
  }

  private DatabricksEnvironment(
      Cloud cloud, String dnsZone, String azureApplicationId, AzureEnvironment azureEnvironment) {
    this.cloud = cloud;
    this.dnsZone = dnsZone;
    this.azureApplicationId = azureApplicationId;
    this.azureEnvironment = azureEnvironment;
  }

  public Cloud getCloud() {
    return cloud;
  }

  public String getDnsZone() {
    return dnsZone;
  }

  public String getAzureApplicationId() {
    return azureApplicationId;
  }

  public AzureEnvironment getAzureEnvironment() {
    return azureEnvironment;
  }

  public String getDeploymentUrl(String name) {
    return String.format("https://%s%s", name, dnsZone);
  }

  public static final DatabricksEnvironment DEFAULT_ENVIRONMENT =
      new DatabricksEnvironment(Cloud.AWS, ".cloud.databricks.com");

  public static final List<DatabricksEnvironment> ALL_ENVIRONMENTS =
      Arrays.asList(
          new DatabricksEnvironment(Cloud.AWS, ".dev.databricks.com"),
          new DatabricksEnvironment(Cloud.AWS, ".staging.cloud.databricks.com"),
          new DatabricksEnvironment(Cloud.AWS, ".cloud.databricks.us"),
          new DatabricksEnvironment(Cloud.AWS, ".cloud.databricks.mil"),
          DEFAULT_ENVIRONMENT,
          new DatabricksEnvironment(
              Cloud.AZURE,
              ".dev.azuredatabricks.net",
              "62a912ac-b58e-4c1d-89ea-b2dbfc7358fc",
              AzureEnvironment.getEnvironment("PUBLIC")),
          new DatabricksEnvironment(
              Cloud.AZURE,
              ".staging.azuredatabricks.net",
              "4a67d088-db5c-48f1-9ff2-0aace800ae68",
              AzureEnvironment.getEnvironment("PUBLIC")),
          new DatabricksEnvironment(
              Cloud.AZURE,
              ".azuredatabricks.net",
              "2ff814a6-3304-4ab8-85cb-cd0e6f879c1d",
              AzureEnvironment.getEnvironment("PUBLIC")),
          new DatabricksEnvironment(
              Cloud.AZURE,
              ".databricks.azure.us",
              "2ff814a6-3304-4ab8-85cb-cd0e6f879c1d",
              AzureEnvironment.getEnvironment("USGOVERNMENT")),
          new DatabricksEnvironment(
              Cloud.AZURE,
              ".databricks.azure.cn",
              "2ff814a6-3304-4ab8-85cb-cd0e6f879c1d",
              AzureEnvironment.getEnvironment("CHINA")),
          new DatabricksEnvironment(Cloud.GCP, ".dev.gcp.databricks.com"),
          new DatabricksEnvironment(Cloud.GCP, ".staging.gcp.databricks.com"),
          new DatabricksEnvironment(Cloud.GCP, ".gcp.databricks.com"));

  public static DatabricksEnvironment getEnvironmentFromHostname(String hostname) {
    if (hostname == null) {
      return DEFAULT_ENVIRONMENT;
    }
    for (DatabricksEnvironment env : ALL_ENVIRONMENTS) {
      if (hostname.endsWith(env.getDnsZone())) {
        return env;
      }
    }
    return DEFAULT_ENVIRONMENT;
  }
}
