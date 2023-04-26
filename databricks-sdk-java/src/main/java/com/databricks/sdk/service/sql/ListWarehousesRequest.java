// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List warehouses
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListWarehousesRequest {
  /**
   * Service Principal which will be used to fetch the list of warehouses. If not specified, the
   * user from the session header is used.
   */
  @QueryParam("run_as_user_id")
  private Long runAsUserId;

  /**
   * <p>Setter for the field <code>runAsUserId</code>.</p>
   *
   * @param runAsUserId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ListWarehousesRequest} object
   */
  public ListWarehousesRequest setRunAsUserId(Long runAsUserId) {
    this.runAsUserId = runAsUserId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runAsUserId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunAsUserId() {
    return runAsUserId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesRequest that = (ListWarehousesRequest) o;
    return Objects.equals(runAsUserId, that.runAsUserId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(runAsUserId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListWarehousesRequest.class).add("runAsUserId", runAsUserId).toString();
  }
}
