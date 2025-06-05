// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateStorageConfigurationRequestPb {
  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  public CreateStorageConfigurationRequestPb setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public CreateStorageConfigurationRequestPb setStorageConfigurationName(
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
    CreateStorageConfigurationRequestPb that = (CreateStorageConfigurationRequestPb) o;
    return Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootBucketInfo, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStorageConfigurationRequestPb.class)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
