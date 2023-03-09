// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TableConstraintList {
    /**
     * List of table constraints.
     */
    @JsonProperty("table_constraints")
    private java.util.List<TableConstraint> tableConstraints;
    
    public TableConstraintList setTableConstraints(java.util.List<TableConstraint> tableConstraints) {
        this.tableConstraints = tableConstraints;
        return this;
    }

    public java.util.List<TableConstraint> getTableConstraints() {
        return tableConstraints;
    }
    
}
