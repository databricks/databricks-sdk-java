// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PrimaryKeyConstraint {
    /**
     * Column names for this constraint.
     */
    @JsonProperty("child_columns")
    private java.util.List<String> childColumns;
    
    /**
     * The name of the constraint.
     */
    @JsonProperty("name")
    private String name;
    
    public PrimaryKeyConstraint setChildColumns(java.util.List<String> childColumns) {
        this.childColumns = childColumns;
        return this;
    }

    public java.util.List<String> getChildColumns() {
        return childColumns;
    }
    
    public PrimaryKeyConstraint setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
