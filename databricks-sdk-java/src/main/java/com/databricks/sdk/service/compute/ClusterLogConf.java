// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public ClusterLogConf setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public ClusterLogConf setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLogConf that = (ClusterLogConf) o;
    return Objects.equals(dbfs, that.dbfs) && Objects.equals(s3, that.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbfs, s3);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterLogConf.class).add("dbfs", dbfs).add("s3", s3).toString();
  }
}
