// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateWorkspaceIdentityDetailRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  /** Required. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  /** Required. Workspace identity detail to be updated in <Databricks>. */
  @JsonProperty("workspace_identity_detail")
  private WorkspaceIdentityDetail workspaceIdentityDetail;

  public UpdateWorkspaceIdentityDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceIdentityDetailRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceIdentityDetailRequest setWorkspaceIdentityDetail(
      WorkspaceIdentityDetail workspaceIdentityDetail) {
    this.workspaceIdentityDetail = workspaceIdentityDetail;
    return this;
  }

  public WorkspaceIdentityDetail getWorkspaceIdentityDetail() {
    return workspaceIdentityDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceIdentityDetailRequest that = (UpdateWorkspaceIdentityDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceIdentityDetail, that.workspaceIdentityDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, updateMask, workspaceIdentityDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceIdentityDetailRequest.class)
        .add("principalId", principalId)
        .add("updateMask", updateMask)
        .add("workspaceIdentityDetail", workspaceIdentityDetail)
        .toString();
  }
}
