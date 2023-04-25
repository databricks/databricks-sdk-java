// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a pipeline */
public class DeletePipelineRequest {
  /** */
  private String pipelineId;

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
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePipelineRequest.class).add("pipelineId", pipelineId).toString();
  }
}
