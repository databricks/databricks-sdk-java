// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List warehouses */
@Generated
class ListWarehousesRequestPb {
  @JsonIgnore
  @QueryParam("run_as_user_id")
  private Long runAsUserId;

  public ListWarehousesRequestPb setRunAsUserId(Long runAsUserId) {
    this.runAsUserId = runAsUserId;
    return this;
  }

  public Long getRunAsUserId() {
    return runAsUserId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesRequestPb that = (ListWarehousesRequestPb) o;
    return Objects.equals(runAsUserId, that.runAsUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runAsUserId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesRequestPb.class).add("runAsUserId", runAsUserId).toString();
  }
}
