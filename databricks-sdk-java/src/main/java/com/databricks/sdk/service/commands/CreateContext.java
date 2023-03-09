// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateContext {
    /**
     * Running cluster id
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    /**
     
     */
    @JsonProperty("language")
    private Language language;
    
    public CreateContext setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public CreateContext setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public Language getLanguage() {
        return language;
    }
    
}
