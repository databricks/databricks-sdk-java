// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteAcl {
    /**
     * The principal to remove an existing ACL from.
     */
    @JsonProperty("principal")
    private String principal;
    
    /**
     * The name of the scope to remove permissions from.
     */
    @JsonProperty("scope")
    private String scope;
    
    public DeleteAcl setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public DeleteAcl setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return scope;
    }
    
}
