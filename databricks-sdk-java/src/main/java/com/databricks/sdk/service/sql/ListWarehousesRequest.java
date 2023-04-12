// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List warehouses */
public class ListWarehousesRequest {
  /**
   * Service Principal which will be used to fetch the list of warehouses. If not specified, the
   * user from the session header is used.
   */
  @QueryParam("run_as_user_id")
  private Long runAsUserId;

  public ListWarehousesRequest setRunAsUserId(Long runAsUserId) {
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
    ListWarehousesRequest that = (ListWarehousesRequest) o;
    return Objects.equals(runAsUserId, that.runAsUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runAsUserId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesRequest.class).add("runAsUserId", runAsUserId).toString();
  }
}
