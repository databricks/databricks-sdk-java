// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get permission levels
 */
@Generated("databricks-sdk-generator")
public class GetPermissionLevels {
    /**
     * <needs content>
     */
    
    private String requestObjectId;
    
    /**
     * <needs content>
     */
    
    private String requestObjectType;
    
    public GetPermissionLevels setRequestObjectId(String requestObjectId) {
        this.requestObjectId = requestObjectId;
        return this;
    }

    public String getRequestObjectId() {
        return requestObjectId;
    }
    
    public GetPermissionLevels setRequestObjectType(String requestObjectType) {
        this.requestObjectType = requestObjectType;
        return this;
    }

    public String getRequestObjectType() {
        return requestObjectType;
    }
    
}
