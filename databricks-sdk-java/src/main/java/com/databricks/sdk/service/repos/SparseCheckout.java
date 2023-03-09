// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SparseCheckout {
    /**
     * List of patterns to include for sparse checkout.
     */
    @JsonProperty("patterns")
    private java.util.List<String> patterns;
    
    public SparseCheckout setPatterns(java.util.List<String> patterns) {
        this.patterns = patterns;
        return this;
    }

    public java.util.List<String> getPatterns() {
        return patterns;
    }
    
}
