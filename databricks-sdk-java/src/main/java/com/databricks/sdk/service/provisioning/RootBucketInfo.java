// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RootBucketInfo {
  /** Name of the S3 bucket */
  @JsonProperty("bucket_name")
  private String bucketName;

  public RootBucketInfo setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  public String getBucketName() {
    return bucketName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RootBucketInfo that = (RootBucketInfo) o;
    return Objects.equals(bucketName, that.bucketName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName);
  }

  @Override
  public String toString() {
    return new ToStringer(RootBucketInfo.class).add("bucketName", bucketName).toString();
  }
}
