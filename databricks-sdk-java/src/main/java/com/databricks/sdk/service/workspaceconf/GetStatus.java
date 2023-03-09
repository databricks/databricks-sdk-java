// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspaceconf;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Check configuration status
 */
public class GetStatus {
    /**
     
     */
    @QueryParam("keys")
    private String keys;
    
    public GetStatus setKeys(String keys) {
        this.keys = keys;
        return this;
    }

    public String getKeys() {
        return keys;
    }
    
}
