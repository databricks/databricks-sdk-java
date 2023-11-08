// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InitScriptInfo {
  /**
   * destination needs to be provided. e.g. `{ "dbfs" : { "destination" : "dbfs:/home/cluster_log" }
   * }`
   */
  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  /**
   * destination needs to be provided. e.g. `{ "file" : { "destination" : "file:/my/local/file.sh" }
   * }`
   */
  @JsonProperty("file")
  private LocalFileInfo file;

  /**
   * destination and either the region or endpoint need to be provided. e.g. `{ "s3": {
   * "destination" : "s3://cluster_log_bucket/prefix", "region" : "us-west-2" } }` Cluster iam role
   * is used to access s3, please make sure the cluster iam role in `instance_profile_arn` has
   * permission to write data to the s3 destination.
   */
  @JsonProperty("s3")
  private S3StorageInfo s3;

  /**
   * destination needs to be provided. e.g. `{ "volumes" : { "destination" : "/Volumes/my-init.sh" }
   * }`
   */
  @JsonProperty("volumes")
  private VolumesStorageInfo volumes;

  /**
   * destination needs to be provided. e.g. `{ "workspace" : { "destination" :
   * "/Users/user1@databricks.com/my-init.sh" } }`
   */
  @JsonProperty("workspace")
  private WorkspaceStorageInfo workspace;

  public InitScriptInfo setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public InitScriptInfo setFile(LocalFileInfo file) {
    this.file = file;
    return this;
  }

  public LocalFileInfo getFile() {
    return file;
  }

  public InitScriptInfo setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public InitScriptInfo setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  public InitScriptInfo setWorkspace(WorkspaceStorageInfo workspace) {
    this.workspace = workspace;
    return this;
  }

  public WorkspaceStorageInfo getWorkspace() {
    return workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptInfo that = (InitScriptInfo) o;
    return Objects.equals(dbfs, that.dbfs)
        && Objects.equals(file, that.file)
        && Objects.equals(s3, that.s3)
        && Objects.equals(volumes, that.volumes)
        && Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbfs, file, s3, volumes, workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptInfo.class)
        .add("dbfs", dbfs)
        .add("file", file)
        .add("s3", s3)
        .add("volumes", volumes)
        .add("workspace", workspace)
        .toString();
  }
}
