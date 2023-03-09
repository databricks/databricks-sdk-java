// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a metastore
 */
public class DeleteMetastoreRequest {
    /**
     * Force deletion even if the metastore is not empty. Default is false.
     */
    @QueryParam("force")
    private Boolean force;
    
    /**
     * Unique ID of the metastore.
     */
    
    private String id;
    
    public DeleteMetastoreRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public DeleteMetastoreRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
