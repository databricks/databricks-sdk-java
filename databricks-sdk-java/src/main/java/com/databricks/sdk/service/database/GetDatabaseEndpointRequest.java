// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetDatabaseEndpointRequest {
  /** */
  @JsonIgnore private String branchId;

  /** */
  @JsonIgnore private String endpointId;

  /** */
  @JsonIgnore private String projectId;

  public GetDatabaseEndpointRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public GetDatabaseEndpointRequest setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public GetDatabaseEndpointRequest setProjectId(String projectId) {
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
    GetDatabaseEndpointRequest that = (GetDatabaseEndpointRequest) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, endpointId, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseEndpointRequest.class)
        .add("branchId", branchId)
        .add("endpointId", endpointId)
        .add("projectId", projectId)
        .toString();
  }
}
