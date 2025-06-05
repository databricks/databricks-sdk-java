// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get workspace object permissions */
@Generated
class GetWorkspaceObjectPermissionsRequestPb {
  @JsonIgnore private String workspaceObjectId;

  @JsonIgnore private String workspaceObjectType;

  public GetWorkspaceObjectPermissionsRequestPb setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public GetWorkspaceObjectPermissionsRequestPb setWorkspaceObjectType(String workspaceObjectType) {
    this.workspaceObjectType = workspaceObjectType;
    return this;
  }

  public String getWorkspaceObjectType() {
    return workspaceObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceObjectPermissionsRequestPb that = (GetWorkspaceObjectPermissionsRequestPb) o;
    return Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceObjectPermissionsRequestPb.class)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }
}
