// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a run */
@Generated
class GetRunRequestPb {
  @JsonIgnore
  @QueryParam("run_id")
  private String runId;

  @JsonIgnore
  @QueryParam("run_uuid")
  private String runUuid;

  public GetRunRequestPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetRunRequestPb setRunUuid(String runUuid) {
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
    GetRunRequestPb that = (GetRunRequestPb) o;
    return Objects.equals(runId, that.runId) && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunRequestPb.class)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
