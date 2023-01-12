// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get command info
 */
@Generated("databricks-sdk-generator")
public class CommandStatusRequest {
    /**
     
     */
    @QueryParam("clusterId")
    private String clusterId;
    
    /**
     
     */
    @QueryParam("commandId")
    private String commandId;
    
    /**
     
     */
    @QueryParam("contextId")
    private String contextId;
    
    public CommandStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public CommandStatusRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    public String getCommandId() {
        return commandId;
    }
    
    public CommandStatusRequest setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public String getContextId() {
        return contextId;
    }
    
}
