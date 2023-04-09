// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a pipeline */
public class Delete {
  /** */
  private String pipelineId;

  public Delete setPipelineId(String pipelineId) {
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
    Delete that = (Delete) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(Delete.class).add("pipelineId", pipelineId).toString();
  }
}
