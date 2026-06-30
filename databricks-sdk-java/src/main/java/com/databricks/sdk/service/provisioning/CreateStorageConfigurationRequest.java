// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateStorageConfigurationRequest {
  /**
   * Optional IAM role that is used to access the workspace catalog which is created during
   * workspace creation for UC by Default. If a storage configuration with this field populated is
   * used to create a workspace, then a workspace catalog is created together with the workspace.
   * The workspace catalog shares the root bucket with internal workspace storage (including DBFS
   * root) but uses a dedicated bucket path prefix.
   */
  @JsonProperty("role_arn")
  private String roleArn;

  /** Root S3 bucket information. */
  @JsonProperty("root_bucket_info")
  private RootBucketInfo rootBucketInfo;

  /** The human-readable name of the storage configuration. */
  @JsonProperty("storage_configuration_name")
  private String storageConfigurationName;

  public CreateStorageConfigurationRequest setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

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
    return Objects.equals(roleArn, that.roleArn)
        && Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn, rootBucketInfo, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStorageConfigurationRequest.class)
        .add("roleArn", roleArn)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }
}
