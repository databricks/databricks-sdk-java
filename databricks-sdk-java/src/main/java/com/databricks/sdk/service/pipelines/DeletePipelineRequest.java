// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeletePipelineRequest {
  /**
   * If false, pipeline deletion will not cascade to its datasets (MVs, STs, Views). By default,
   * this parameter will be true and all tables will be deleted with the pipeline.
   */
  @JsonIgnore
  @QueryParam("cascade")
  private Boolean cascade;

  /**
   * If true, deletion will proceed even if resource cleanup fails. By default, deletion will fail
   * if resources cleanup is required but fails.
   */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** */
  @JsonIgnore private String pipelineId;

  public DeletePipelineRequest setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  public Boolean getCascade() {
    return cascade;
  }

  public DeletePipelineRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeletePipelineRequest setPipelineId(String pipelineId) {
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
    DeletePipelineRequest that = (DeletePipelineRequest) o;
    return Objects.equals(cascade, that.cascade)
        && Objects.equals(force, that.force)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascade, force, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePipelineRequest.class)
        .add("cascade", cascade)
        .add("force", force)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
