// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DestroyContext {
    /**
     
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    /**
     
     */
    @JsonProperty("contextId")
    private String contextId;
    
    public DestroyContext setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public DestroyContext setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public String getContextId() {
        return contextId;
    }
    
}
