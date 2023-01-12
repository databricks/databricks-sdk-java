// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetResponse {
    /**
     
     */
    @JsonProperty("access_control_list")
    private java.util.List<AccessControl> accessControlList;
    
    /**
     * A singular noun object type.
     */
    @JsonProperty("object_id")
    private ObjectType objectId;
    
    /**
     * An object's type and UUID, separated by a forward slash (/) character.
     */
    @JsonProperty("object_type")
    private String objectType;
    
    public GetResponse setAccessControlList(java.util.List<AccessControl> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public java.util.List<AccessControl> getAccessControlList() {
        return accessControlList;
    }
    
    public GetResponse setObjectId(ObjectType objectId) {
        this.objectId = objectId;
        return this;
    }

    public ObjectType getObjectId() {
        return objectId;
    }
    
    public GetResponse setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    public String getObjectType() {
        return objectType;
    }
    
}
