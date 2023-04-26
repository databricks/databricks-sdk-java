// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Root S3 bucket information.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RootBucketInfo {
  /** The name of the S3 bucket. */
  @JsonProperty("bucket_name")
  private String bucketName;

  /**
   * <p>Setter for the field <code>bucketName</code>.</p>
   *
   * @param bucketName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.RootBucketInfo} object
   */
  public RootBucketInfo setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * <p>Getter for the field <code>bucketName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBucketName() {
    return bucketName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RootBucketInfo that = (RootBucketInfo) o;
    return Objects.equals(bucketName, that.bucketName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(bucketName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RootBucketInfo.class).add("bucketName", bucketName).toString();
  }
}
