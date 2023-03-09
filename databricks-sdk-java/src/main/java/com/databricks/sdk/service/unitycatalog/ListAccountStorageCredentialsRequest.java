// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get all storage credentials assigned to a metastore
 */
public class ListAccountStorageCredentialsRequest {
    /**
     * Databricks Unity Catalog metastore ID
     */
    
    private String metastoreId;
    
    public ListAccountStorageCredentialsRequest setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
}
