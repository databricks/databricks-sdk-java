// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAccessDetailRequest {
  /** Required. The parent path for workspace access detail. */
  @JsonIgnore private String parent;

  /** Required. Workspace access detail to be created in <Databricks>. */
  @JsonProperty("workspace_access_detail")
  private WorkspaceAccessDetail workspaceAccessDetail;

  public CreateWorkspaceAccessDetailRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateWorkspaceAccessDetailRequest setWorkspaceAccessDetail(
      WorkspaceAccessDetail workspaceAccessDetail) {
    this.workspaceAccessDetail = workspaceAccessDetail;
    return this;
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetail() {
    return workspaceAccessDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWorkspaceAccessDetailRequest that = (CreateWorkspaceAccessDetailRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(workspaceAccessDetail, that.workspaceAccessDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, workspaceAccessDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAccessDetailRequest.class)
        .add("parent", parent)
        .add("workspaceAccessDetail", workspaceAccessDetail)
        .toString();
  }
}
