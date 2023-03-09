// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListTablesResponse {
    /**
     * An array of table information objects.
     */
    @JsonProperty("tables")
    private java.util.List<TableInfo> tables;
    
    public ListTablesResponse setTables(java.util.List<TableInfo> tables) {
        this.tables = tables;
        return this;
    }

    public java.util.List<TableInfo> getTables() {
        return tables;
    }
    
}
