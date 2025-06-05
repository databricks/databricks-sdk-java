// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineTaskPb {
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  public PipelineTaskPb setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public PipelineTaskPb setPipelineId(String pipelineId) {
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
    PipelineTaskPb that = (PipelineTaskPb) o;
    return Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTaskPb.class)
        .add("fullRefresh", fullRefresh)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
