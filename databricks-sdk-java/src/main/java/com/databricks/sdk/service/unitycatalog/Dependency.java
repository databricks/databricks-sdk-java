// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A dependency of a SQL object. Either the __table__ field or the __function__
 * field must be defined.
 */
@Generated("databricks-sdk-generator")
public class Dependency {
    /**
     * A function that is dependent on a SQL object.
     */
    @JsonProperty("function")
    private FunctionDependency function;
    
    /**
     * A table that is dependent on a SQL object.
     */
    @JsonProperty("table")
    private TableDependency table;
    
    public Dependency setFunction(FunctionDependency function) {
        this.function = function;
        return this;
    }

    public FunctionDependency getFunction() {
        return function;
    }
    
    public Dependency setTable(TableDependency table) {
        this.table = table;
        return this;
    }

    public TableDependency getTable() {
        return table;
    }
    
}
