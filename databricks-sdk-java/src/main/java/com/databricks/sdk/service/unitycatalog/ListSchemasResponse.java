// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListSchemasResponse {
    /**
     * An array of schema information objects.
     */
    @JsonProperty("schemas")
    private java.util.List<SchemaInfo> schemas;
    
    public ListSchemasResponse setSchemas(java.util.List<SchemaInfo> schemas) {
        this.schemas = schemas;
        return this;
    }

    public java.util.List<SchemaInfo> getSchemas() {
        return schemas;
    }
    
}
