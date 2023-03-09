// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Command {
    /**
     * Running cluster id
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    /**
     * Executable code
     */
    @JsonProperty("command")
    private String command;
    
    /**
     * Running context id
     */
    @JsonProperty("contextId")
    private String contextId;
    
    /**
     
     */
    @JsonProperty("language")
    private Language language;
    
    public Command setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public Command setCommand(String command) {
        this.command = command;
        return this;
    }

    public String getCommand() {
        return command;
    }
    
    public Command setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public String getContextId() {
        return contextId;
    }
    
    public Command setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public Language getLanguage() {
        return language;
    }
    
}
