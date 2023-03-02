// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class QueryEndpointResponse {
    /**
     * The predictions returned by the serving endpoint.
     */
    @JsonProperty("predictions")
    private java.util.List<Object /* MISSING TYPE */> predictions;
    
    public QueryEndpointResponse setPredictions(java.util.List<Object /* MISSING TYPE */> predictions) {
        this.predictions = predictions;
        return this;
    }

    public java.util.List<Object /* MISSING TYPE */> getPredictions() {
        return predictions;
    }
    
}
