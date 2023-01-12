// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get permissions
 */
@Generated("databricks-sdk-generator")
public class GetGrantRequest {
    /**
     * Required. Unique identifier (full name) of Securable (from URL).
     */
    
    private String fullName;
    
    /**
     * Optional. List permissions granted to this principal.
     */
    @QueryParam("principal")
    private String principal;
    
    /**
     * Required. Type of Securable (from URL).
     */
    
    private String securableType;
    
    public GetGrantRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public GetGrantRequest setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public GetGrantRequest setSecurableType(String securableType) {
        this.securableType = securableType;
        return this;
    }

    public String getSecurableType() {
        return securableType;
    }
    
}
