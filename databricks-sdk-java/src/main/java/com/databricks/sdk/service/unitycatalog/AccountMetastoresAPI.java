// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore
 * contains catalogs that can be associated with workspaces
 */
@Generated("databricks-sdk-generator")
public class AccountMetastoresAPI implements AccountMetastoresService {
    private final ApiClient apiClient;

    public AccountMetastoresAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create metastore.
     * 
     * Creates a Unity Catalog metastore.
     */
    @Override
    public MetastoreInfo create(CreateMetastore request) {
        String path = String.format("/api/2.0/accounts//metastores");
        return apiClient.POST(path, request, MetastoreInfo.class);
    }
    
	/**
     * Delete a metastore.
     * 
     * Deletes a Databricks Unity Catalog metastore for an account, both
     * specified by ID.
     */
    @Override
    public void delete(DeleteAccountMetastoreRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a metastore.
     * 
     * Gets a Databricks Unity Catalog metastore from an account, both specified
     * by ID.
     */
    @Override
    public MetastoreInfo get(GetAccountMetastoreRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        return apiClient.GET(path, request, MetastoreInfo.class);
    }
    
	/**
     * Get all metastores associated with an account.
     * 
     * Gets all Unity Catalog metastores associated with an account specified by
     * ID.
     */
    @Override
    public ListMetastoresResponse list() {
        String path = String.format("/api/2.0/accounts//metastores");
        return apiClient.GET(path, ListMetastoresResponse.class);
    }
    
	/**
     * Update a metastore.
     * 
     * Updates an existing Unity Catalog metastore.
     */
    @Override
    public MetastoreInfo update(UpdateMetastore request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        return apiClient.PUT(path, request, MetastoreInfo.class);
    }
    
}