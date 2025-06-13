// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Users can specify accessible storage destinations. */
@Generated
public class EgressNetworkPolicyNetworkAccessPolicyStorageDestination {
  /** The Azure storage account name. */
  @JsonProperty("azure_storage_account")
  private String azureStorageAccount;

  /** The Azure storage service type (blob, dfs, etc.). */
  @JsonProperty("azure_storage_service")
  private String azureStorageService;

  /** */
  @JsonProperty("bucket_name")
  private String bucketName;

  /** The region of the S3 bucket. */
  @JsonProperty("region")
  private String region;

  /** The type of storage destination. */
  @JsonProperty("storage_destination_type")
  private EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
      storageDestinationType;

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setAzureStorageAccount(
      String azureStorageAccount) {
    this.azureStorageAccount = azureStorageAccount;
    return this;
  }

  public String getAzureStorageAccount() {
    return azureStorageAccount;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setAzureStorageService(
      String azureStorageService) {
    this.azureStorageService = azureStorageService;
    return this;
  }

  public String getAzureStorageService() {
    return azureStorageService;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestination setStorageDestinationType(
      EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
          storageDestinationType) {
    this.storageDestinationType = storageDestinationType;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyStorageDestinationStorageDestinationType
      getStorageDestinationType() {
    return storageDestinationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicyStorageDestination that =
        (EgressNetworkPolicyNetworkAccessPolicyStorageDestination) o;
    return Objects.equals(azureStorageAccount, that.azureStorageAccount)
        && Objects.equals(azureStorageService, that.azureStorageService)
        && Objects.equals(bucketName, that.bucketName)
        && Objects.equals(region, that.region)
        && Objects.equals(storageDestinationType, that.storageDestinationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureStorageAccount, azureStorageService, bucketName, region, storageDestinationType);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicyStorageDestination.class)
        .add("azureStorageAccount", azureStorageAccount)
        .add("azureStorageService", azureStorageService)
        .add("bucketName", bucketName)
        .add("region", region)
        .add("storageDestinationType", storageDestinationType)
        .toString();
  }
}
