// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateWorkspaceAccessDetailRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** Required. Workspace access detail to be updated in <Databricks> */
  @JsonProperty("workspace_access_detail")
  private WorkspaceAccessDetail workspaceAccessDetail;

  /** Required. The workspace ID for which the workspace access detail is being updated. */
  @JsonIgnore private Long workspaceId;

  public UpdateWorkspaceAccessDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAccessDetailRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceAccessDetailRequest setWorkspaceAccessDetail(
      WorkspaceAccessDetail workspaceAccessDetail) {
    this.workspaceAccessDetail = workspaceAccessDetail;
    return this;
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetail() {
    return workspaceAccessDetail;
  }

  public UpdateWorkspaceAccessDetailRequest setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceAccessDetailRequest that = (UpdateWorkspaceAccessDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceAccessDetail, that.workspaceAccessDetail)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, updateMask, workspaceAccessDetail, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAccessDetailRequest.class)
        .add("principalId", principalId)
        .add("updateMask", updateMask)
        .add("workspaceAccessDetail", workspaceAccessDetail)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
