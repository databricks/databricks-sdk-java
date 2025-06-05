// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List roles for a Database Instance */
@Generated
class ListDatabaseInstanceRolesRequestPb {
  @JsonIgnore private String instanceName;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListDatabaseInstanceRolesRequestPb setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public ListDatabaseInstanceRolesRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatabaseInstanceRolesRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDatabaseInstanceRolesRequestPb that = (ListDatabaseInstanceRolesRequestPb) o;
    return Objects.equals(instanceName, that.instanceName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstanceRolesRequestPb.class)
        .add("instanceName", instanceName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
