// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseBranchRequest {
  /** */
  @JsonIgnore private String branchId;

  /** */
  @JsonProperty("database_branch")
  private DatabaseBranch databaseBranch;

  /** */
  @JsonIgnore private String projectId;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseBranchRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public UpdateDatabaseBranchRequest setDatabaseBranch(DatabaseBranch databaseBranch) {
    this.databaseBranch = databaseBranch;
    return this;
  }

  public DatabaseBranch getDatabaseBranch() {
    return databaseBranch;
  }

  public UpdateDatabaseBranchRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public UpdateDatabaseBranchRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseBranchRequest that = (UpdateDatabaseBranchRequest) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(databaseBranch, that.databaseBranch)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, databaseBranch, projectId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseBranchRequest.class)
        .add("branchId", branchId)
        .add("databaseBranch", databaseBranch)
        .add("projectId", projectId)
        .add("updateMask", updateMask)
        .toString();
  }
}
