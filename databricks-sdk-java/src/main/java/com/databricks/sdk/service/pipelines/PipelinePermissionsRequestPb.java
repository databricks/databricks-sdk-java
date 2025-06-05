// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PipelinePermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<PipelineAccessControlRequest> accessControlList;

  @JsonIgnore private String pipelineId;

  public PipelinePermissionsRequestPb setAccessControlList(
      Collection<PipelineAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PipelineAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public PipelinePermissionsRequestPb setPipelineId(String pipelineId) {
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
    PipelinePermissionsRequestPb that = (PipelinePermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelinePermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
