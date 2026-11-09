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
  /**
   * The resource name of the workspace identity detail, in the format
   * `principals/{principal_id}/workspace-identity-detail`.
   */
  @JsonIgnore private String name;

  /** The fields to update. The only supported field is `workspace_identity_status`. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  /** The workspace identity detail to update. Its `name` identifies the principal. */
  @JsonProperty("workspace_identity_detail")
  private WorkspaceIdentityDetail workspaceIdentityDetail;

  public UpdateWorkspaceIdentityDetailRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
    return Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceIdentityDetail, that.workspaceIdentityDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, updateMask, workspaceIdentityDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceIdentityDetailRequest.class)
        .add("name", name)
        .add("updateMask", updateMask)
        .add("workspaceIdentityDetail", workspaceIdentityDetail)
        .toString();
  }
}
