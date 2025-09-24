// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetDatabaseBranchRequest {
  /** */
  @JsonIgnore private String branchId;

  /** */
  @JsonIgnore private String projectId;

  public GetDatabaseBranchRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public GetDatabaseBranchRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDatabaseBranchRequest that = (GetDatabaseBranchRequest) o;
    return Objects.equals(branchId, that.branchId) && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseBranchRequest.class)
        .add("branchId", branchId)
        .add("projectId", projectId)
        .toString();
  }
}
