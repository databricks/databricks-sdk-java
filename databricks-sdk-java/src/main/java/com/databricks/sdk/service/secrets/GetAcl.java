// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get secret ACL details
 */
public class GetAcl {
    /**
     * The principal to fetch ACL information for.
     */
    @QueryParam("principal")
    private String principal;
    
    /**
     * The name of the scope to fetch ACL information from.
     */
    @QueryParam("scope")
    private String scope;
    
    public GetAcl setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public GetAcl setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return scope;
    }
    
}
