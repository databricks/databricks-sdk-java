// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateWarehouseResponse {
    /**
     * Id for the SQL warehouse. This value is unique across all SQL warehouses.
     */
    @JsonProperty("id")
    private String id;
    
    public CreateWarehouseResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
