// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Transfer object ownership
 */
@Generated("databricks-sdk-generator")
public class TransferOwnershipRequest {
    /**
     * Email address for the new owner, who must exist in the workspace.
     */
    @JsonProperty("new_owner")
    private String newOwner;
    
    /**
     * The ID of the object on which to change ownership.
     */
    
    private TransferOwnershipObjectId objectId;
    
    /**
     * The type of object on which to change ownership.
     */
    
    private OwnableObjectType objectType;
    
    public TransferOwnershipRequest setNewOwner(String newOwner) {
        this.newOwner = newOwner;
        return this;
    }

    public String getNewOwner() {
        return newOwner;
    }
    
    public TransferOwnershipRequest setObjectId(TransferOwnershipObjectId objectId) {
        this.objectId = objectId;
        return this;
    }

    public TransferOwnershipObjectId getObjectId() {
        return objectId;
    }
    
    public TransferOwnershipRequest setObjectType(OwnableObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public OwnableObjectType getObjectType() {
        return objectType;
    }
    
}
