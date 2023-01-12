// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a group
 */
@Generated("databricks-sdk-generator")
public class DeleteGroupRequest {
    /**
     * Unique ID for a group in the Databricks Account.
     */
    
    private String id;
    
    public DeleteGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
