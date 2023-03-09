// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteSecret {
    /**
     * Name of the secret to delete.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * The name of the scope that contains the secret to delete.
     */
    @JsonProperty("scope")
    private String scope;
    
    public DeleteSecret setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public DeleteSecret setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return scope;
    }
    
}
