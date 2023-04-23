// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateStorageConfigurationRequest {
  /** Root S3 bucket information. */
  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  public CreateStorageConfigurationRequest setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public CreateStorageConfigurationRequest setStorageConfigurationName(
      String storageConfigurationName) {
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
    CreateStorageConfigurationRequest that = (CreateStorageConfigurationRequest) o;
    return Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootBucketInfo, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStorageConfigurationRequest.class)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
