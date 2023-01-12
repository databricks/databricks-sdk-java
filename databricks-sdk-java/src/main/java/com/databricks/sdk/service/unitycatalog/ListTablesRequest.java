// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List tables
 */
@Generated("databricks-sdk-generator")
public class ListTablesRequest {
    /**
     * Required. Name of parent catalog for tables of interest.
     */
    @QueryParam("catalog_name")
    private String catalogName;
    
    /**
     * Required (for now -- may be optional for wildcard search in future).
     * Parent schema of tables.
     */
    @QueryParam("schema_name")
    private String schemaName;
    
    public ListTablesRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }
    
    public ListTablesRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    public String getSchemaName() {
        return schemaName;
    }
    
}
