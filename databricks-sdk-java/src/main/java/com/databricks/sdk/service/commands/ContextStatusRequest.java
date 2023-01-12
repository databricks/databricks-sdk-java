// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get status
 */
@Generated("databricks-sdk-generator")
public class ContextStatusRequest {
    /**
     
     */
    @QueryParam("clusterId")
    private String clusterId;
    
    /**
     
     */
    @QueryParam("contextId")
    private String contextId;
    
    public ContextStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ContextStatusRequest setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public String getContextId() {
        return contextId;
    }
    
}
