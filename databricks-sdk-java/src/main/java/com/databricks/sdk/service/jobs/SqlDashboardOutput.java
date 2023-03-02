// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlDashboardOutput {
    /**
     * The canonical identifier of the SQL warehouse.
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    
    /**
     * Widgets executed in the run. Only SQL query based widgets are listed.
     */
    @JsonProperty("widgets")
    private SqlDashboardWidgetOutput widgets;
    
    public SqlDashboardOutput setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    
    public SqlDashboardOutput setWidgets(SqlDashboardWidgetOutput widgets) {
        this.widgets = widgets;
        return this;
    }

    public SqlDashboardWidgetOutput getWidgets() {
        return widgets;
    }
    
}
