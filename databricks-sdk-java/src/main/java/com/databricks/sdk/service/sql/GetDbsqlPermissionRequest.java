// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get object ACL
 */
public class GetDbsqlPermissionRequest {
    /**
     * Object ID. An ACL is returned for the object with this UUID.
     */
    
    private String objectId;
    
    /**
     * The type of object permissions to check.
     */
    
    private ObjectTypePlural objectType;
    
    public GetDbsqlPermissionRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    public String getObjectId() {
        return objectId;
    }
    
    public GetDbsqlPermissionRequest setObjectType(ObjectTypePlural objectType) {
        this.objectType = objectType;
        return this;
    }

    public ObjectTypePlural getObjectType() {
        return objectType;
    }
    
}
