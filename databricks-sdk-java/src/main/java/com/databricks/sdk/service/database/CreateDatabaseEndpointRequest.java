// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseEndpointRequest {
  /** */
  @JsonIgnore private String branchId;

  /** */
  @JsonProperty("database_endpoint")
  private DatabaseEndpoint databaseEndpoint;

  /** */
  @JsonIgnore private String projectId;

  public CreateDatabaseEndpointRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public CreateDatabaseEndpointRequest setDatabaseEndpoint(DatabaseEndpoint databaseEndpoint) {
    this.databaseEndpoint = databaseEndpoint;
    return this;
  }

  public DatabaseEndpoint getDatabaseEndpoint() {
    return databaseEndpoint;
  }

  public CreateDatabaseEndpointRequest setProjectId(String projectId) {
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
    CreateDatabaseEndpointRequest that = (CreateDatabaseEndpointRequest) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(databaseEndpoint, that.databaseEndpoint)
        && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, databaseEndpoint, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseEndpointRequest.class)
        .add("branchId", branchId)
        .add("databaseEndpoint", databaseEndpoint)
        .add("projectId", projectId)
        .toString();
  }
}
