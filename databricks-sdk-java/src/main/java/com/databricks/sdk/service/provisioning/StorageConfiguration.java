// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class StorageConfiguration {
  /** The Databricks account ID associated with this storage configuration. */
  @JsonProperty("account_id")
  private String accountId;

  /** Time in epoch milliseconds when the storage configuration was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /**
   * Optional IAM role that is used to access the workspace catalog which is created during
   * workspace creation for UC by Default. If a storage configuration with this field populated is
   * used to create a workspace, then a workspace catalog is created together with the workspace.
   * The workspace catalog shares the root bucket with internal workspace storage (including DBFS
   * root) but uses a dedicated bucket path prefix.
   */
  @JsonProperty("role_arn")
  private String roleArn;

  /** The root bucket information for the storage configuration. */
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

  public StorageConfiguration setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageConfiguration that = (StorageConfiguration) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(roleArn, that.roleArn)
        && Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        creationTime,
        roleArn,
        rootBucketInfo,
        storageConfigurationId,
        storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageConfiguration.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("roleArn", roleArn)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
