// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlDashboardOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlDashboardOutput {
  /** The canonical identifier of the SQL warehouse. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /** Widgets executed in the run. Only SQL query based widgets are listed. */
  @JsonProperty("widgets")
  private SqlDashboardWidgetOutput widgets;

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardOutput} object
   */
  public SqlDashboardOutput setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /**
   * <p>Setter for the field <code>widgets</code>.</p>
   *
   * @param widgets a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardOutput} object
   */
  public SqlDashboardOutput setWidgets(SqlDashboardWidgetOutput widgets) {
    this.widgets = widgets;
    return this;
  }

  /**
   * <p>Getter for the field <code>widgets</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput getWidgets() {
    return widgets;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardOutput that = (SqlDashboardOutput) o;
    return Objects.equals(warehouseId, that.warehouseId) && Objects.equals(widgets, that.widgets);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, widgets);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlDashboardOutput.class)
        .add("warehouseId", warehouseId)
        .add("widgets", widgets)
        .toString();
  }
}
