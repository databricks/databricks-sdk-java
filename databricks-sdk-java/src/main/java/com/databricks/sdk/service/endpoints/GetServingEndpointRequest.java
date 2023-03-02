// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a single serving endpoint
 */
@Generated("databricks-sdk-generator")
public class GetServingEndpointRequest {
    /**
     * The name of the serving endpoint. This field is required.
     */
    
    private String name;
    
    public GetServingEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
