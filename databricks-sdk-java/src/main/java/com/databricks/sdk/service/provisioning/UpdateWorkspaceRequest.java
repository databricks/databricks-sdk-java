// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateWorkspaceRequest {
  /** */
  @JsonProperty("customer_facing_workspace")
  private Workspace customerFacingWorkspace;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** A unique integer ID for the workspace */
  @JsonIgnore private Long workspaceId;

  public UpdateWorkspaceRequest setCustomerFacingWorkspace(Workspace customerFacingWorkspace) {
    this.customerFacingWorkspace = customerFacingWorkspace;
    return this;
  }

  public Workspace getCustomerFacingWorkspace() {
    return customerFacingWorkspace;
  }

  public UpdateWorkspaceRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceRequest setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceRequest that = (UpdateWorkspaceRequest) o;
    return Objects.equals(customerFacingWorkspace, that.customerFacingWorkspace)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFacingWorkspace, updateMask, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceRequest.class)
        .add("customerFacingWorkspace", customerFacingWorkspace)
        .add("updateMask", updateMask)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
