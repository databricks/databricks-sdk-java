// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
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
