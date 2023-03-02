// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A function that is dependent on a SQL object.
 */
@Generated("databricks-sdk-generator")
public class FunctionDependency {
    /**
     * Full name of the dependent function, in the form of
     * __catalog_name__.__schema_name__.__function_name__.
     */
    @JsonProperty("function_full_name")
    private String functionFullName;
    
    public FunctionDependency setFunctionFullName(String functionFullName) {
        this.functionFullName = functionFullName;
        return this;
    }

    public String getFunctionFullName() {
        return functionFullName;
    }
    
}
