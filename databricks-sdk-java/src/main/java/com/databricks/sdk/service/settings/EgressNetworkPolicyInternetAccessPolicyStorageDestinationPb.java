// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Users can specify accessible storage destinations. */
@Generated
class EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb {
  @JsonProperty("allowed_paths")
  private Collection<String> allowedPaths;

  @JsonProperty("azure_container")
  private String azureContainer;

  @JsonProperty("azure_dns_zone")
  private String azureDnsZone;

  @JsonProperty("azure_storage_account")
  private String azureStorageAccount;

  @JsonProperty("azure_storage_service")
  private String azureStorageService;

  @JsonProperty("bucket_name")
  private String bucketName;

  @JsonProperty("region")
  private String region;

  @JsonProperty("type")
  private EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType typeValue;

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setAllowedPaths(
      Collection<String> allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

  public Collection<String> getAllowedPaths() {
    return allowedPaths;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setAzureContainer(
      String azureContainer) {
    this.azureContainer = azureContainer;
    return this;
  }

  public String getAzureContainer() {
    return azureContainer;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setAzureDnsZone(
      String azureDnsZone) {
    this.azureDnsZone = azureDnsZone;
    return this;
  }

  public String getAzureDnsZone() {
    return azureDnsZone;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setAzureStorageAccount(
      String azureStorageAccount) {
    this.azureStorageAccount = azureStorageAccount;
    return this;
  }

  public String getAzureStorageAccount() {
    return azureStorageAccount;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setAzureStorageService(
      String azureStorageService) {
    this.azureStorageService = azureStorageService;
    return this;
  }

  public String getAzureStorageService() {
    return azureStorageService;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setBucketName(
      String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb setType(
      EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyStorageDestinationStorageDestinationType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb that =
        (EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb) o;
    return Objects.equals(allowedPaths, that.allowedPaths)
        && Objects.equals(azureContainer, that.azureContainer)
        && Objects.equals(azureDnsZone, that.azureDnsZone)
        && Objects.equals(azureStorageAccount, that.azureStorageAccount)
        && Objects.equals(azureStorageService, that.azureStorageService)
        && Objects.equals(bucketName, that.bucketName)
        && Objects.equals(region, that.region)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedPaths,
        azureContainer,
        azureDnsZone,
        azureStorageAccount,
        azureStorageService,
        bucketName,
        region,
        typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicyStorageDestinationPb.class)
        .add("allowedPaths", allowedPaths)
        .add("azureContainer", azureContainer)
        .add("azureDnsZone", azureDnsZone)
        .add("azureStorageAccount", azureStorageAccount)
        .add("azureStorageService", azureStorageService)
        .add("bucketName", bucketName)
        .add("region", region)
        .add("typeValue", typeValue)
        .toString();
  }
}
