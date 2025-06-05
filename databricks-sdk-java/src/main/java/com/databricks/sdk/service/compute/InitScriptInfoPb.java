// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Config for an individual init script Next ID: 11 */
@Generated
class InitScriptInfoPb {
  @JsonProperty("abfss")
  private Adlsgen2Info abfss;

  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  @JsonProperty("file")
  private LocalFileInfo file;

  @JsonProperty("gcs")
  private GcsStorageInfo gcs;

  @JsonProperty("s3")
  private S3StorageInfo s3;

  @JsonProperty("volumes")
  private VolumesStorageInfo volumes;

  @JsonProperty("workspace")
  private WorkspaceStorageInfo workspace;

  public InitScriptInfoPb setAbfss(Adlsgen2Info abfss) {
    this.abfss = abfss;
    return this;
  }

  public Adlsgen2Info getAbfss() {
    return abfss;
  }

  public InitScriptInfoPb setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public InitScriptInfoPb setFile(LocalFileInfo file) {
    this.file = file;
    return this;
  }

  public LocalFileInfo getFile() {
    return file;
  }

  public InitScriptInfoPb setGcs(GcsStorageInfo gcs) {
    this.gcs = gcs;
    return this;
  }

  public GcsStorageInfo getGcs() {
    return gcs;
  }

  public InitScriptInfoPb setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public InitScriptInfoPb setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  public InitScriptInfoPb setWorkspace(WorkspaceStorageInfo workspace) {
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
    InitScriptInfoPb that = (InitScriptInfoPb) o;
    return Objects.equals(abfss, that.abfss)
        && Objects.equals(dbfs, that.dbfs)
        && Objects.equals(file, that.file)
        && Objects.equals(gcs, that.gcs)
        && Objects.equals(s3, that.s3)
        && Objects.equals(volumes, that.volumes)
        && Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abfss, dbfs, file, gcs, s3, volumes, workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptInfoPb.class)
        .add("abfss", abfss)
        .add("dbfs", dbfs)
        .add("file", file)
        .add("gcs", gcs)
        .add("s3", s3)
        .add("volumes", volumes)
        .add("workspace", workspace)
        .toString();
  }
}
