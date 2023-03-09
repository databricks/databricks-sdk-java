// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a metastore
 */
public class DeleteAccountMetastoreRequest {
    /**
     * Databricks Unity Catalog metastore ID
     */
    
    private String metastoreId;
    
    public DeleteAccountMetastoreRequest setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
}
