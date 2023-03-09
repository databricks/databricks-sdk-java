// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get object permissions
 */
public class Get {
    /**
     
     */
    
    private String requestObjectId;
    
    /**
     * <needs content>
     */
    
    private String requestObjectType;
    
    public Get setRequestObjectId(String requestObjectId) {
        this.requestObjectId = requestObjectId;
        return this;
    }

    public String getRequestObjectId() {
        return requestObjectId;
    }
    
    public Get setRequestObjectType(String requestObjectType) {
        this.requestObjectType = requestObjectType;
        return this;
    }

    public String getRequestObjectType() {
        return requestObjectType;
    }
    
}
