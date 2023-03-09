// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ObjectPermissions {
    /**
     
     */
    @JsonProperty("access_control_list")
    private java.util.List<AccessControlResponse> accessControlList;
    
    /**
     
     */
    @JsonProperty("object_id")
    private String objectId;
    
    /**
     
     */
    @JsonProperty("object_type")
    private String objectType;
    
    public ObjectPermissions setAccessControlList(java.util.List<AccessControlResponse> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public java.util.List<AccessControlResponse> getAccessControlList() {
        return accessControlList;
    }
    
    public ObjectPermissions setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    public String getObjectId() {
        return objectId;
    }
    
    public ObjectPermissions setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    public String getObjectType() {
        return objectType;
    }
    
}
