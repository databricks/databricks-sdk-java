// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete an assignment
 */
@Generated("databricks-sdk-generator")
public class UnassignRequest {
    /**
     * Query for the ID of the Metastore to delete.
     */
    @QueryParam("metastore_id")
    private String metastoreId;
    
    /**
     * A workspace ID.
     */
    
    private Long workspaceId;
    
    public UnassignRequest setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public UnassignRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
