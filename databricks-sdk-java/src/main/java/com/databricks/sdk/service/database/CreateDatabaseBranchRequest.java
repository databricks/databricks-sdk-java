// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseBranchRequest {
  /** */
  @JsonProperty("database_branch")
  private DatabaseBranch databaseBranch;

  /** */
  @JsonIgnore private String projectId;

  public CreateDatabaseBranchRequest setDatabaseBranch(DatabaseBranch databaseBranch) {
    this.databaseBranch = databaseBranch;
    return this;
  }

  public DatabaseBranch getDatabaseBranch() {
    return databaseBranch;
  }

  public CreateDatabaseBranchRequest setProjectId(String projectId) {
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
    CreateDatabaseBranchRequest that = (CreateDatabaseBranchRequest) o;
    return Objects.equals(databaseBranch, that.databaseBranch)
        && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseBranch, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseBranchRequest.class)
        .add("databaseBranch", databaseBranch)
        .add("projectId", projectId)
        .toString();
  }
}
