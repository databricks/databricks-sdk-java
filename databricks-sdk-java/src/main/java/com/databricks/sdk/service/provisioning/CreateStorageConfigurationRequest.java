// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateStorageConfigurationRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateStorageConfigurationRequest {
  /** Root S3 bucket information. */
  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  /**
   * <p>Setter for the field <code>rootBucketInfo</code>.</p>
   *
   * @param rootBucketInfo a {@link com.databricks.sdk.service.provisioning.RootBucketInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateStorageConfigurationRequest} object
   */
  public CreateStorageConfigurationRequest setRootBucketInfo(RootBucketInfo rootBucketInfo) {
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
   * <p>Setter for the field <code>storageConfigurationName</code>.</p>
   *
   * @param storageConfigurationName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateStorageConfigurationRequest} object
   */
  public CreateStorageConfigurationRequest setStorageConfigurationName(
      String storageConfigurationName) {
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
    CreateStorageConfigurationRequest that = (CreateStorageConfigurationRequest) o;
    return Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(rootBucketInfo, storageConfigurationName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateStorageConfigurationRequest.class)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
