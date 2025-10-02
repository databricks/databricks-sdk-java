// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateWorkspaceAccessDetailLocalRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** Required. WorkspaceAccessDetail to be updated in <Databricks> */
  @JsonProperty("workspace_access_detail")
  private WorkspaceAccessDetail workspaceAccessDetail;

  public UpdateWorkspaceAccessDetailLocalRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAccessDetailLocalRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceAccessDetailLocalRequest setWorkspaceAccessDetail(
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
    UpdateWorkspaceAccessDetailLocalRequest that = (UpdateWorkspaceAccessDetailLocalRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceAccessDetail, that.workspaceAccessDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, updateMask, workspaceAccessDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAccessDetailLocalRequest.class)
        .add("principalId", principalId)
        .add("updateMask", updateMask)
        .add("workspaceAccessDetail", workspaceAccessDetail)
        .toString();
  }
}
