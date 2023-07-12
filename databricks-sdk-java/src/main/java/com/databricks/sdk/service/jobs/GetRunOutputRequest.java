// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get the output for a single run
 */
@Generated
public class GetRunOutputRequest {
  /**
   * The canonical identifier for the run. This field is required.
   */
  @QueryParam("run_id")
  private Long runId;
  
  public GetRunOutputRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunOutputRequest that = (GetRunOutputRequest) o;
    return Objects.equals(runId, that.runId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunOutputRequest.class)
      .add("runId", runId).toString();
  }
}
