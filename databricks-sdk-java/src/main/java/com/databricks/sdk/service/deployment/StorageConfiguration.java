// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StorageConfiguration {
  /** The Databricks account ID that hosts the credential. */
  @JsonProperty("account_id")
  private String accountId;

  /** Time in epoch milliseconds when the storage configuration was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Root S3 bucket information. */
  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  /** Databricks storage configuration ID. */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  public StorageConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public StorageConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public StorageConfiguration setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public StorageConfiguration setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public StorageConfiguration setStorageConfigurationName(String storageConfigurationName) {
    this.storageConfigurationName = storageConfigurationName;
    return this;
  }

  public String getStorageConfigurationName() {
    return storageConfigurationName;
  }
}
