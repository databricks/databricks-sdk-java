// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>StorageConfiguration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
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
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>rootBucketInfo</code>.</p>
   *
   * @param rootBucketInfo a {@link com.databricks.sdk.service.provisioning.RootBucketInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>rootBucketInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.RootBucketInfo} object
   */
  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  /**
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageConfigurationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  /**
   * <p>Setter for the field <code>storageConfigurationName</code>.</p>
   *
   * @param storageConfigurationName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration setStorageConfigurationName(String storageConfigurationName) {
    this.storageConfigurationName = storageConfigurationName;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageConfigurationName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageConfigurationName() {
    return storageConfigurationName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageConfiguration that = (StorageConfiguration) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, creationTime, rootBucketInfo, storageConfigurationId, storageConfigurationName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StorageConfiguration.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
