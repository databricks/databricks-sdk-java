// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PermissionsRequest {
    /**
     
     */
    @JsonProperty("access_control_list")
    private java.util.List<AccessControlRequest> accessControlList;
    
    /**
     
     */
    
    private String requestObjectId;
    
    /**
     * <needs content>
     */
    
    private String requestObjectType;
    
    public PermissionsRequest setAccessControlList(java.util.List<AccessControlRequest> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public java.util.List<AccessControlRequest> getAccessControlList() {
        return accessControlList;
    }
    
    public PermissionsRequest setRequestObjectId(String requestObjectId) {
        this.requestObjectId = requestObjectId;
        return this;
    }

    public String getRequestObjectId() {
        return requestObjectId;
    }
    
    public PermissionsRequest setRequestObjectType(String requestObjectType) {
        this.requestObjectType = requestObjectType;
        return this;
    }

    public String getRequestObjectType() {
        return requestObjectType;
    }
    
}
