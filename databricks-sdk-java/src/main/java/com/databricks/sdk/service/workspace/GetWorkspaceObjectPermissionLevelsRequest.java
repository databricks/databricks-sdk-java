// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get workspace object permission levels */
@Generated
public class GetWorkspaceObjectPermissionLevelsRequest {
  /** The workspace object for which to get or manage permissions. */
  private String workspaceObjectId;

  /** The workspace object type for which to get or manage permissions. */
  private String workspaceObjectType;

  public GetWorkspaceObjectPermissionLevelsRequest setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public GetWorkspaceObjectPermissionLevelsRequest setWorkspaceObjectType(
      String workspaceObjectType) {
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
    GetWorkspaceObjectPermissionLevelsRequest that = (GetWorkspaceObjectPermissionLevelsRequest) o;
    return Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceObjectPermissionLevelsRequest.class)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }
}
