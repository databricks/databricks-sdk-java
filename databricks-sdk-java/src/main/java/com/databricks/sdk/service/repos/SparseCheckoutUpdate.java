// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SparseCheckoutUpdate {
    /**
     * List of patterns to include for sparse checkout.
     */
    @JsonProperty("patterns")
    private java.util.List<String> patterns;
    
    public SparseCheckoutUpdate setPatterns(java.util.List<String> patterns) {
        this.patterns = patterns;
        return this;
    }

    public java.util.List<String> getPatterns() {
        return patterns;
    }
    
}
