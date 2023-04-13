// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PipelineTask {
  /** If true, a full refresh will be triggered on the delta live table. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /** The full name of the pipeline task to execute. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  public PipelineTask setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public PipelineTask setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTask that = (PipelineTask) o;
    return Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTask.class)
        .add("fullRefresh", fullRefresh)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
