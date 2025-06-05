// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a pipeline update */
@Generated
class GetUpdateRequestPb {
  @JsonIgnore private String pipelineId;

  @JsonIgnore private String updateId;

  public GetUpdateRequestPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetUpdateRequestPb setUpdateId(String updateId) {
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
    GetUpdateRequestPb that = (GetUpdateRequestPb) o;
    return Objects.equals(pipelineId, that.pipelineId) && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineId, updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUpdateRequestPb.class)
        .add("pipelineId", pipelineId)
        .add("updateId", updateId)
        .toString();
  }
}
