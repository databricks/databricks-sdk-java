// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List artifacts */
@Generated
public class ListArtifactsRequest {
  /**
   * The token indicating the page of artifact results to fetch. `page_token` is not supported when
   * listing artifacts in UC Volumes. A maximum of 1000 artifacts will be retrieved for UC Volumes.
   * Please call `/api/2.0/fs/directories{directory_path}` for listing artifacts in UC Volumes,
   * which supports pagination. See [List directory contents | Files
   * API](/api/workspace/files/listdirectorycontents).
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Filter artifacts matching this path (a relative path from the root artifact directory). */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  /** ID of the run whose artifacts to list. Must be provided. */
  @JsonIgnore
  @QueryParam("run_id")
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run whose artifacts to list. This field will be
   * removed in a future MLflow version.
   */
  @JsonIgnore
  @QueryParam("run_uuid")
  private String runUuid;

  public ListArtifactsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListArtifactsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ListArtifactsRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ListArtifactsRequest setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListArtifactsRequest that = (ListArtifactsRequest) o;
    return Objects.equals(pageToken, that.pageToken)
        && Objects.equals(path, that.path)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, path, runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(ListArtifactsRequest.class)
        .add("pageToken", pageToken)
        .add("path", path)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
