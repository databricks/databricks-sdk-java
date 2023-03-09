// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TransferOwnershipObjectId {
    /**
     * Email address for the new owner, who must exist in the workspace.
     */
    @JsonProperty("new_owner")
    private String newOwner;
    
    public TransferOwnershipObjectId setNewOwner(String newOwner) {
        this.newOwner = newOwner;
        return this;
    }

    public String getNewOwner() {
        return newOwner;
    }
    
}
