// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class InitScriptInfoAndExecutionDetailsPb {
  @JsonProperty("abfss")
  private Adlsgen2Info abfss;

  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("execution_duration_seconds")
  private Long executionDurationSeconds;

  @JsonProperty("file")
  private LocalFileInfo file;

  @JsonProperty("gcs")
  private GcsStorageInfo gcs;

  @JsonProperty("s3")
  private S3StorageInfo s3;

  @JsonProperty("status")
  private InitScriptExecutionDetailsInitScriptExecutionStatus status;

  @JsonProperty("volumes")
  private VolumesStorageInfo volumes;

  @JsonProperty("workspace")
  private WorkspaceStorageInfo workspace;

  public InitScriptInfoAndExecutionDetailsPb setAbfss(Adlsgen2Info abfss) {
    this.abfss = abfss;
    return this;
  }

  public Adlsgen2Info getAbfss() {
    return abfss;
  }

  public InitScriptInfoAndExecutionDetailsPb setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public InitScriptInfoAndExecutionDetailsPb setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public InitScriptInfoAndExecutionDetailsPb setExecutionDurationSeconds(
      Long executionDurationSeconds) {
    this.executionDurationSeconds = executionDurationSeconds;
    return this;
  }

  public Long getExecutionDurationSeconds() {
    return executionDurationSeconds;
  }

  public InitScriptInfoAndExecutionDetailsPb setFile(LocalFileInfo file) {
    this.file = file;
    return this;
  }

  public LocalFileInfo getFile() {
    return file;
  }

  public InitScriptInfoAndExecutionDetailsPb setGcs(GcsStorageInfo gcs) {
    this.gcs = gcs;
    return this;
  }

  public GcsStorageInfo getGcs() {
    return gcs;
  }

  public InitScriptInfoAndExecutionDetailsPb setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public InitScriptInfoAndExecutionDetailsPb setStatus(
      InitScriptExecutionDetailsInitScriptExecutionStatus status) {
    this.status = status;
    return this;
  }

  public InitScriptExecutionDetailsInitScriptExecutionStatus getStatus() {
    return status;
  }

  public InitScriptInfoAndExecutionDetailsPb setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  public InitScriptInfoAndExecutionDetailsPb setWorkspace(WorkspaceStorageInfo workspace) {
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
    InitScriptInfoAndExecutionDetailsPb that = (InitScriptInfoAndExecutionDetailsPb) o;
    return Objects.equals(abfss, that.abfss)
        && Objects.equals(dbfs, that.dbfs)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(executionDurationSeconds, that.executionDurationSeconds)
        && Objects.equals(file, that.file)
        && Objects.equals(gcs, that.gcs)
        && Objects.equals(s3, that.s3)
        && Objects.equals(status, that.status)
        && Objects.equals(volumes, that.volumes)
        && Objects.equals(workspace, that.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        abfss,
        dbfs,
        errorMessage,
        executionDurationSeconds,
        file,
        gcs,
        s3,
        status,
        volumes,
        workspace);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptInfoAndExecutionDetailsPb.class)
        .add("abfss", abfss)
        .add("dbfs", dbfs)
        .add("errorMessage", errorMessage)
        .add("executionDurationSeconds", executionDurationSeconds)
        .add("file", file)
        .add("gcs", gcs)
        .add("s3", s3)
        .add("status", status)
        .add("volumes", volumes)
        .add("workspace", workspace)
        .toString();
  }
}
