// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateBranchRequest {
  /** The Branch to create. */
  @JsonProperty("branch")
  private Branch branch;

  /**
   * The ID to use for the Branch. This becomes the final component of the branch's resource name.
   * The ID is required and must be 1-63 characters long, start with a lowercase letter, and contain
   * only lowercase letters, numbers, and hyphens. For example, `development` becomes
   * `projects/my-app/branches/development`.
   */
  @JsonIgnore
  @QueryParam("branch_id")
  private String branchId;

  /** The Project where this Branch will be created. Format: projects/{project_id} */
  @JsonIgnore private String parent;

  public CreateBranchRequest setBranch(Branch branch) {
    this.branch = branch;
    return this;
  }

  public Branch getBranch() {
    return branch;
  }

  public CreateBranchRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public CreateBranchRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBranchRequest that = (CreateBranchRequest) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(branchId, that.branchId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, branchId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBranchRequest.class)
        .add("branch", branch)
        .add("branchId", branchId)
        .add("parent", parent)
        .toString();
  }
}
