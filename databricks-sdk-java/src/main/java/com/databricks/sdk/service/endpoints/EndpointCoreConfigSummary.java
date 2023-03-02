// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EndpointCoreConfigSummary {
    /**
     * The list of served models under the serving endpoint config.
     */
    @JsonProperty("served_models")
    private java.util.List<ServedModelSpec> servedModels;
    
    public EndpointCoreConfigSummary setServedModels(java.util.List<ServedModelSpec> servedModels) {
        this.servedModels = servedModels;
        return this;
    }

    public java.util.List<ServedModelSpec> getServedModels() {
        return servedModels;
    }
    
}
