// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SqlDashboardOutput {
  /** The canonical identifier of the SQL warehouse. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /** Widgets executed in the run. Only SQL query based widgets are listed. */
  @JsonProperty("widgets")
  private Collection<SqlDashboardWidgetOutput> widgets;

  public SqlDashboardOutput setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  public SqlDashboardOutput setWidgets(Collection<SqlDashboardWidgetOutput> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Collection<SqlDashboardWidgetOutput> getWidgets() {
    return widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardOutput that = (SqlDashboardOutput) o;
    return Objects.equals(warehouseId, that.warehouseId) && Objects.equals(widgets, that.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, widgets);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlDashboardOutput.class)
        .add("warehouseId", warehouseId)
        .add("widgets", widgets)
        .toString();
  }
}
