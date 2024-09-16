// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class WorkspaceObjectPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<WorkspaceObjectAccessControlRequest> accessControlList;

  /** The workspace object for which to get or manage permissions. */
  @JsonIgnore private String workspaceObjectId;

  /** The workspace object type for which to get or manage permissions. */
  @JsonIgnore private String workspaceObjectType;

  public WorkspaceObjectPermissionsRequest setAccessControlList(
      Collection<WorkspaceObjectAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WorkspaceObjectAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public WorkspaceObjectPermissionsRequest setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public WorkspaceObjectPermissionsRequest setWorkspaceObjectType(String workspaceObjectType) {
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
    WorkspaceObjectPermissionsRequest that = (WorkspaceObjectPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }
}
