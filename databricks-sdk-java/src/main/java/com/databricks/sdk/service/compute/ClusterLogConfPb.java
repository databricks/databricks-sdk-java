// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Cluster log delivery config */
@Generated
class ClusterLogConfPb {
  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  @JsonProperty("s3")
  private S3StorageInfo s3;

  @JsonProperty("volumes")
  private VolumesStorageInfo volumes;

  public ClusterLogConfPb setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public ClusterLogConfPb setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public ClusterLogConfPb setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterLogConfPb that = (ClusterLogConfPb) o;
    return Objects.equals(dbfs, that.dbfs)
        && Objects.equals(s3, that.s3)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbfs, s3, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterLogConfPb.class)
        .add("dbfs", dbfs)
        .add("s3", s3)
        .add("volumes", volumes)
        .toString();
  }
}
