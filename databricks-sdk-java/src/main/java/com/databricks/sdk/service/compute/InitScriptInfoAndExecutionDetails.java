// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InitScriptInfoAndExecutionDetails {
  /**
   * destination needs to be provided, e.g.
   * `abfss://<container-name>@<storage-account-name>.dfs.core.windows.net/<directory-name>`
   */
  @JsonProperty("abfss")
  private Adlsgen2Info abfss;

  /**
   * destination needs to be provided. e.g. `{ "dbfs": { "destination" : "dbfs:/home/cluster_log" }
   * }`
   */
  @JsonProperty("dbfs")
  private DbfsStorageInfo dbfs;

  /**
   * Additional details regarding errors (such as a file not found message if the status is
   * FAILED_FETCH). This field should only be used to provide *additional* information to the status
   * field, not duplicate it.
   */
  @JsonProperty("error_message")
  private String errorMessage;

  /** The number duration of the script execution in seconds */
  @JsonProperty("execution_duration_seconds")
  private Long executionDurationSeconds;

  /**
   * destination needs to be provided, e.g. `{ "file": { "destination": "file:/my/local/file.sh" }
   * }`
   */
  @JsonProperty("file")
  private LocalFileInfo file;

  /**
   * destination needs to be provided, e.g. `{ "gcs": { "destination": "gs://my-bucket/file.sh" } }`
   */
  @JsonProperty("gcs")
  private GcsStorageInfo gcs;

  /**
   * destination and either the region or endpoint need to be provided. e.g. `{ \"s3\": {
   * \"destination\": \"s3://cluster_log_bucket/prefix\", \"region\": \"us-west-2\" } }` Cluster iam
   * role is used to access s3, please make sure the cluster iam role in `instance_profile_arn` has
   * permission to write data to the s3 destination.
   */
  @JsonProperty("s3")
  private S3StorageInfo s3;

  /** The current status of the script */
  @JsonProperty("status")
  private InitScriptExecutionDetailsInitScriptExecutionStatus status;

  /**
   * destination needs to be provided. e.g. `{ \"volumes\" : { \"destination\" :
   * \"/Volumes/my-init.sh\" } }`
   */
  @JsonProperty("volumes")
  private VolumesStorageInfo volumes;

  /**
   * destination needs to be provided, e.g. `{ "workspace": { "destination":
   * "/cluster-init-scripts/setup-datadog.sh" } }`
   */
  @JsonProperty("workspace")
  private WorkspaceStorageInfo workspace;

  public InitScriptInfoAndExecutionDetails setAbfss(Adlsgen2Info abfss) {
    this.abfss = abfss;
    return this;
  }

  public Adlsgen2Info getAbfss() {
    return abfss;
  }

  public InitScriptInfoAndExecutionDetails setDbfs(DbfsStorageInfo dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  public DbfsStorageInfo getDbfs() {
    return dbfs;
  }

  public InitScriptInfoAndExecutionDetails setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public InitScriptInfoAndExecutionDetails setExecutionDurationSeconds(
      Long executionDurationSeconds) {
    this.executionDurationSeconds = executionDurationSeconds;
    return this;
  }

  public Long getExecutionDurationSeconds() {
    return executionDurationSeconds;
  }

  public InitScriptInfoAndExecutionDetails setFile(LocalFileInfo file) {
    this.file = file;
    return this;
  }

  public LocalFileInfo getFile() {
    return file;
  }

  public InitScriptInfoAndExecutionDetails setGcs(GcsStorageInfo gcs) {
    this.gcs = gcs;
    return this;
  }

  public GcsStorageInfo getGcs() {
    return gcs;
  }

  public InitScriptInfoAndExecutionDetails setS3(S3StorageInfo s3) {
    this.s3 = s3;
    return this;
  }

  public S3StorageInfo getS3() {
    return s3;
  }

  public InitScriptInfoAndExecutionDetails setStatus(
      InitScriptExecutionDetailsInitScriptExecutionStatus status) {
    this.status = status;
    return this;
  }

  public InitScriptExecutionDetailsInitScriptExecutionStatus getStatus() {
    return status;
  }

  public InitScriptInfoAndExecutionDetails setVolumes(VolumesStorageInfo volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumesStorageInfo getVolumes() {
    return volumes;
  }

  public InitScriptInfoAndExecutionDetails setWorkspace(WorkspaceStorageInfo workspace) {
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
    InitScriptInfoAndExecutionDetails that = (InitScriptInfoAndExecutionDetails) o;
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
    return new ToStringer(InitScriptInfoAndExecutionDetails.class)
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
