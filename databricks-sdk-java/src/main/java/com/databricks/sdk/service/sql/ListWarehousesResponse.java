// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListWarehousesResponse {
    /**
     * A list of warehouses and their configurations.
     */
    @JsonProperty("warehouses")
    private java.util.List<EndpointInfo> warehouses;
    
    public ListWarehousesResponse setWarehouses(java.util.List<EndpointInfo> warehouses) {
        this.warehouses = warehouses;
        return this;
    }

    public java.util.List<EndpointInfo> getWarehouses() {
        return warehouses;
    }
    
}
