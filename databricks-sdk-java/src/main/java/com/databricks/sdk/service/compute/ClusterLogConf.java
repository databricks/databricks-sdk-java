// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ClusterLogConf class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterLogConf {
  /**
   * destination needs to be provided. e.g. `{ "dbfs" : { "destination" : "dbfs:/home/cluster_log" }
   * }`
   */
  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  /**
   * destination and either region or endpoint should also be provided. e.g. `{ "s3": {
   * "destination" : "s3://cluster_log_bucket/prefix", "region" : "us-west-2" } }` Cluster iam role
   * is used to access s3, please make sure the cluster iam role in `instance_profile_arn` has
   * permission to write data to the s3 destination.
   */
  @JsonProperty("s3")
  private S3StorageInfo s3;

  /**
   * <p>Setter for the field <code>dbfs</code>.</p>
   *
   * @param dbfs a {@link com.databricks.sdk.service.compute.DbfsStorageInfo} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterLogConf} object
   */
  public ClusterLogConf setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  /**
   * <p>Getter for the field <code>dbfs</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.DbfsStorageInfo} object
   */
  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  /**
   * <p>Setter for the field <code>s3</code>.</p>
   *
   * @param s3 a {@link com.databricks.sdk.service.compute.S3StorageInfo} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterLogConf} object
   */
  public ClusterLogConf setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  /**
   * <p>Getter for the field <code>s3</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.S3StorageInfo} object
   */
  public S3StorageInfo getS3() {
    return s3;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLogConf that = (ClusterLogConf) o;
    return Objects.equals(dbfs, that.dbfs) && Objects.equals(s3, that.s3);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dbfs, s3);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterLogConf.class).add("dbfs", dbfs).add("s3", s3).toString();
  }
}
