// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WorkspaceBinding {
  /** */
  @JsonProperty("binding_type")
  private WorkspaceBindingBindingType bindingType;

  /** */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceBinding setBindingType(WorkspaceBindingBindingType bindingType) {
    this.bindingType = bindingType;
    return this;
  }

  public WorkspaceBindingBindingType getBindingType() {
    return bindingType;
  }

  public WorkspaceBinding setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceBinding that = (WorkspaceBinding) o;
    return Objects.equals(bindingType, that.bindingType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceBinding.class)
        .add("bindingType", bindingType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
