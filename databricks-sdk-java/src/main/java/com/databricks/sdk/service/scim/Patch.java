// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Patch {
    /**
     * Type of patch operation.
     */
    @JsonProperty("op")
    private PatchOp op;
    
    /**
     * Selection of patch operation
     */
    @JsonProperty("path")
    private String path;
    
    /**
     * Value to modify
     */
    @JsonProperty("value")
    private String value;
    
    public Patch setOp(PatchOp op) {
        this.op = op;
        return this;
    }

    public PatchOp getOp() {
        return op;
    }
    
    public Patch setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
    public Patch setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }
    
}
