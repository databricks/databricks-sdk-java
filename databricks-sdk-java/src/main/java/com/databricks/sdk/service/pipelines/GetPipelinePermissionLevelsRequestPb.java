// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get pipeline permission levels */
@Generated
class GetPipelinePermissionLevelsRequestPb {
  @JsonIgnore private String pipelineId;

  public GetPipelinePermissionLevelsRequestPb setPipelineId(String pipelineId) {
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
    GetPipelinePermissionLevelsRequestPb that = (GetPipelinePermissionLevelsRequestPb) o;
    return Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelinePermissionLevelsRequestPb.class)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
