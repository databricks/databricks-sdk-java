// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List providers
 */
public class ListProvidersRequest {
    /**
     * If not provided, all providers will be returned. If no providers exist
     * with this ID, no results will be returned.
     */
    @QueryParam("data_provider_global_metastore_id")
    private String dataProviderGlobalMetastoreId;
    
    public ListProvidersRequest setDataProviderGlobalMetastoreId(String dataProviderGlobalMetastoreId) {
        this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
        return this;
    }

    public String getDataProviderGlobalMetastoreId() {
        return dataProviderGlobalMetastoreId;
    }
    
}
