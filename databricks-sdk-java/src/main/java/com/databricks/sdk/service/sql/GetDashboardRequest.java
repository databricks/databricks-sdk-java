// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Retrieve a definition
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetDashboardRequest {
  /** */
  private String dashboardId;

  /**
   * <p>Setter for the field <code>dashboardId</code>.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetDashboardRequest} object
   */
  public GetDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboardId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDashboardId() {
    return dashboardId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDashboardRequest that = (GetDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetDashboardRequest.class).add("dashboardId", dashboardId).toString();
  }
}
