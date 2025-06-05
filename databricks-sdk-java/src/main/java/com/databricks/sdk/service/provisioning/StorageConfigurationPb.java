// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class StorageConfigurationPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  public StorageConfigurationPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public StorageConfigurationPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public StorageConfigurationPb setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public StorageConfigurationPb setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public StorageConfigurationPb setStorageConfigurationName(String storageConfigurationName) {
    this.storageConfigurationName = storageConfigurationName;
    return this;
  }

  public String getStorageConfigurationName() {
    return storageConfigurationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageConfigurationPb that = (StorageConfigurationPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, creationTime, rootBucketInfo, storageConfigurationId, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageConfigurationPb.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
