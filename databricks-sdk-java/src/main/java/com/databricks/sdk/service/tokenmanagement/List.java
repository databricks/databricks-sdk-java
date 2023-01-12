// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List all tokens
 */
@Generated("databricks-sdk-generator")
public class List {
    /**
     * User ID of the user that created the token.
     */
    @QueryParam("created_by_id")
    private String createdById;
    
    /**
     * Username of the user that created the token.
     */
    @QueryParam("created_by_username")
    private String createdByUsername;
    
    public List setCreatedById(String createdById) {
        this.createdById = createdById;
        return this;
    }

    public String getCreatedById() {
        return createdById;
    }
    
    public List setCreatedByUsername(String createdByUsername) {
        this.createdByUsername = createdByUsername;
        return this;
    }

    public String getCreatedByUsername() {
        return createdByUsername;
    }
    
}
