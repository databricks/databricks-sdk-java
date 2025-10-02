// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseEndpointRequest {
  /** */
  @JsonIgnore private String branchId;

  /** */
  @JsonProperty("database_endpoint")
  private DatabaseEndpoint databaseEndpoint;

  /** */
  @JsonIgnore private String endpointId;

  /** */
  @JsonIgnore private String projectId;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseEndpointRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public UpdateDatabaseEndpointRequest setDatabaseEndpoint(DatabaseEndpoint databaseEndpoint) {
    this.databaseEndpoint = databaseEndpoint;
    return this;
  }

  public DatabaseEndpoint getDatabaseEndpoint() {
    return databaseEndpoint;
  }

  public UpdateDatabaseEndpointRequest setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public UpdateDatabaseEndpointRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public UpdateDatabaseEndpointRequest setUpdateMask(String updateMask) {
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
    UpdateDatabaseEndpointRequest that = (UpdateDatabaseEndpointRequest) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(databaseEndpoint, that.databaseEndpoint)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, databaseEndpoint, endpointId, projectId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseEndpointRequest.class)
        .add("branchId", branchId)
        .add("databaseEndpoint", databaseEndpoint)
        .add("endpointId", endpointId)
        .add("projectId", projectId)
        .add("updateMask", updateMask)
        .toString();
  }
}
