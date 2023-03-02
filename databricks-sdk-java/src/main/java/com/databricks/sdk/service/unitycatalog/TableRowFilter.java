// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TableRowFilter {
    /**
     * The list of table columns to be passed as input to the row filter
     * function. The column types should match the types of the filter function
     * arguments.
     */
    @JsonProperty("input_column_names")
    private java.util.List<String> inputColumnNames;
    
    /**
     * The full name of the row filter SQL UDF.
     */
    @JsonProperty("name")
    private String name;
    
    public TableRowFilter setInputColumnNames(java.util.List<String> inputColumnNames) {
        this.inputColumnNames = inputColumnNames;
        return this;
    }

    public java.util.List<String> getInputColumnNames() {
        return inputColumnNames;
    }
    
    public TableRowFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
