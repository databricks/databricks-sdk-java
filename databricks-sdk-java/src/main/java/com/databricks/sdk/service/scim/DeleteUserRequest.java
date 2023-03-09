// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a user
 */
public class DeleteUserRequest {
    /**
     * Unique ID for a user in the Databricks Account.
     */
    
    private String id;
    
    public DeleteUserRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
