// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CancelCommand {
    /**
     
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    /**
     
     */
    @JsonProperty("commandId")
    private String commandId;
    
    /**
     
     */
    @JsonProperty("contextId")
    private String contextId;
    
    public CancelCommand setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public CancelCommand setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    public String getCommandId() {
        return commandId;
    }
    
    public CancelCommand setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public String getContextId() {
        return contextId;
    }
    
}
