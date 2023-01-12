// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TableSummary {
    /**
     * The full name of the table.
     */
    @JsonProperty("full_name")
    private String fullName;
    
    /**
     
     */
    @JsonProperty("table_type")
    private TableType tableType;
    
    public TableSummary setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public TableSummary setTableType(TableType tableType) {
        this.tableType = tableType;
        return this;
    }

    public TableType getTableType() {
        return tableType;
    }
    
}
