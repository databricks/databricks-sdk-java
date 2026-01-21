// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateBranchRequest {
  /**
   * The Branch to update.
   *
   * <p>The branch's `name` field is used to identify the branch to update. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonProperty("branch")
  private Branch branch;

  /**
   * The resource name of the branch. This field is output-only and constructed by the system.
   * Format: `projects/{project_id}/branches/{branch_id}`
   */
  @JsonIgnore private String name;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateBranchRequest setBranch(Branch branch) {
    this.branch = branch;
    return this;
  }

  public Branch getBranch() {
    return branch;
  }

  public UpdateBranchRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateBranchRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateBranchRequest that = (UpdateBranchRequest) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBranchRequest.class)
        .add("branch", branch)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
