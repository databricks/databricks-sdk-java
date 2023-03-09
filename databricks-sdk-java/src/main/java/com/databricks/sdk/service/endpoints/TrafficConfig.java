// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TrafficConfig {
    /**
     * The list of routes that define traffic to each served model.
     */
    @JsonProperty("routes")
    private java.util.List<Route> routes;
    
    public TrafficConfig setRoutes(java.util.List<Route> routes) {
        this.routes = routes;
        return this;
    }

    public java.util.List<Route> getRoutes() {
        return routes;
    }
    
}
