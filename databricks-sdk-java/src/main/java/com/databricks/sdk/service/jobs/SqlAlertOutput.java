// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SqlAlertOutput {
    /**
     * The state of the SQL alert.
     * 
     * * UNKNOWN: alert yet to be evaluated * OK: alert evaluated and did not
     * fulfill trigger conditions * TRIGGERED: alert evaluated and fulfilled
     * trigger conditions
     */
    @JsonProperty("alert_state")
    private SqlAlertState alertState;
    
    /**
     * The link to find the output results.
     */
    @JsonProperty("output_link")
    private String outputLink;
    
    /**
     * The text of the SQL query. Can Run permission of the SQL query associated
     * with the SQL alert is required to view this field.
     */
    @JsonProperty("query_text")
    private String queryText;
    
    /**
     * Information about SQL statements executed in the run.
     */
    @JsonProperty("sql_statements")
    private java.util.List<SqlStatementOutput> sqlStatements;
    
    /**
     * The canonical identifier of the SQL warehouse.
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    
    public SqlAlertOutput setAlertState(SqlAlertState alertState) {
        this.alertState = alertState;
        return this;
    }

    public SqlAlertState getAlertState() {
        return alertState;
    }
    
    public SqlAlertOutput setOutputLink(String outputLink) {
        this.outputLink = outputLink;
        return this;
    }

    public String getOutputLink() {
        return outputLink;
    }
    
    public SqlAlertOutput setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    public String getQueryText() {
        return queryText;
    }
    
    public SqlAlertOutput setSqlStatements(java.util.List<SqlStatementOutput> sqlStatements) {
        this.sqlStatements = sqlStatements;
        return this;
    }

    public java.util.List<SqlStatementOutput> getSqlStatements() {
        return sqlStatements;
    }
    
    public SqlAlertOutput setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    
}
