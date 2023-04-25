// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a pipeline update */
public class GetUpdateRequest {
  /** The ID of the pipeline. */
  private String pipelineId;

  /** The ID of the update. */
  private String updateId;

  public GetUpdateRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetUpdateRequest setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateRequest that = (GetUpdateRequest) o;
    return Objects.equals(pipelineId, that.pipelineId) && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId, updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUpdateRequest.class)
        .add("pipelineId", pipelineId)
        .add("updateId", updateId)
        .toString();
  }
}
