// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListFunctionsResponse {
    /**
     * An array of function information objects.
     */
    @JsonProperty("schemas")
    private java.util.List<FunctionInfo> schemas;
    
    public ListFunctionsResponse setSchemas(java.util.List<FunctionInfo> schemas) {
        this.schemas = schemas;
        return this;
    }

    public java.util.List<FunctionInfo> getSchemas() {
        return schemas;
    }
    
}
