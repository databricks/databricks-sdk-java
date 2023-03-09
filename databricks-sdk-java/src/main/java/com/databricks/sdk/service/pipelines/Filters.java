// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Filters {
    /**
     * Paths to exclude.
     */
    @JsonProperty("exclude")
    private java.util.List<String> exclude;
    
    /**
     * Paths to include.
     */
    @JsonProperty("include")
    private java.util.List<String> include;
    
    public Filters setExclude(java.util.List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public java.util.List<String> getExclude() {
        return exclude;
    }
    
    public Filters setInclude(java.util.List<String> include) {
        this.include = include;
        return this;
    }

    public java.util.List<String> getInclude() {
        return include;
    }
    
}
