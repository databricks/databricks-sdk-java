// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class WorkspaceObjectPermissions {
  /** */
  @JsonProperty("access_control_list")
  private Collection<WorkspaceObjectAccessControlResponse> accessControlList;

  /** */
  @JsonProperty("object_id")
  private String objectId;

  /** */
  @JsonProperty("object_type")
  private String objectType;

  public WorkspaceObjectPermissions setAccessControlList(
      Collection<WorkspaceObjectAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WorkspaceObjectAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public WorkspaceObjectPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public WorkspaceObjectPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermissions that = (WorkspaceObjectPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
