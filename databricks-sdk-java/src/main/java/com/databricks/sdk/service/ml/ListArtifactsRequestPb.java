// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List artifacts */
@Generated
class ListArtifactsRequestPb {
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("path")
  private String path;

  @JsonIgnore
  @QueryParam("run_id")
  private String runId;

  @JsonIgnore
  @QueryParam("run_uuid")
  private String runUuid;

  public ListArtifactsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListArtifactsRequestPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ListArtifactsRequestPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ListArtifactsRequestPb setRunUuid(String runUuid) {
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
    ListArtifactsRequestPb that = (ListArtifactsRequestPb) o;
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
    return new ToStringer(ListArtifactsRequestPb.class)
        .add("pageToken", pageToken)
        .add("path", path)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
