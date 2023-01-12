// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlTask {
    /**
     * If alert, indicates that this job must refresh a SQL alert.
     */
    @JsonProperty("alert")
    private SqlTaskAlert alert;
    
    /**
     * If dashboard, indicates that this job must refresh a SQL dashboard.
     */
    @JsonProperty("dashboard")
    private SqlTaskDashboard dashboard;
    
    /**
     * Parameters to be used for each run of this job. The SQL alert task does
     * not support custom parameters.
     */
    @JsonProperty("parameters")
    private Map<String,String> parameters;
    
    /**
     * If query, indicates that this job must execute a SQL query.
     */
    @JsonProperty("query")
    private SqlTaskQuery query;
    
    /**
     * The canonical identifier of the SQL warehouse. Only serverless and pro
     * SQL warehouses are supported.
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    
    public SqlTask setAlert(SqlTaskAlert alert) {
        this.alert = alert;
        return this;
    }

    public SqlTaskAlert getAlert() {
        return alert;
    }
    
    public SqlTask setDashboard(SqlTaskDashboard dashboard) {
        this.dashboard = dashboard;
        return this;
    }

    public SqlTaskDashboard getDashboard() {
        return dashboard;
    }
    
    public SqlTask setParameters(Map<String,String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Map<String,String> getParameters() {
        return parameters;
    }
    
    public SqlTask setQuery(SqlTaskQuery query) {
        this.query = query;
        return this;
    }

    public SqlTaskQuery getQuery() {
        return query;
    }
    
    public SqlTask setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    
}
