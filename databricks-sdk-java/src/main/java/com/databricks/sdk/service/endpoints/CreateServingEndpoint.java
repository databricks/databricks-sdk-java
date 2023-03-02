// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateServingEndpoint {
    /**
     * The core config of the serving endpoint.
     */
    @JsonProperty("config")
    private EndpointCoreConfigInput config;
    
    /**
     * The name of the serving endpoint. This field is required and must be
     * unique across a Databricks Workspace. An endpoint name can consist of
     * alphanumeric characters, dashes, and underscores.
     */
    @JsonProperty("name")
    private String name;
    
    public CreateServingEndpoint setConfig(EndpointCoreConfigInput config) {
        this.config = config;
        return this;
    }

    public EndpointCoreConfigInput getConfig() {
        return config;
    }
    
    public CreateServingEndpoint setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
