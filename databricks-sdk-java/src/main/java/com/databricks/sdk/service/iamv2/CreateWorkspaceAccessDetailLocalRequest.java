// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAccessDetailLocalRequest {
  /** Required. Workspace access detail to be created in <Databricks>. */
  @JsonProperty("workspace_access_detail")
  private WorkspaceAccessDetail workspaceAccessDetail;

  public CreateWorkspaceAccessDetailLocalRequest setWorkspaceAccessDetail(
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
    CreateWorkspaceAccessDetailLocalRequest that = (CreateWorkspaceAccessDetailLocalRequest) o;
    return Objects.equals(workspaceAccessDetail, that.workspaceAccessDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceAccessDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAccessDetailLocalRequest.class)
        .add("workspaceAccessDetail", workspaceAccessDetail)
        .toString();
  }
}
