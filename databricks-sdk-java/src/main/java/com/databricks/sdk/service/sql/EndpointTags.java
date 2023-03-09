// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class EndpointTags {
    /**
     
     */
    @JsonProperty("custom_tags")
    private java.util.List<EndpointTagPair> customTags;
    
    public EndpointTags setCustomTags(java.util.List<EndpointTagPair> customTags) {
        this.customTags = customTags;
        return this;
    }

    public java.util.List<EndpointTagPair> getCustomTags() {
        return customTags;
    }
    
}
