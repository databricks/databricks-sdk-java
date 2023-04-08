// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

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
public class AccountMetastoresAPI {
    private final AccountMetastoresService impl;

    /** Regular-use constructor */
    public AccountMetastoresAPI(ApiClient apiClient) {
        impl = new AccountMetastoresImpl(apiClient);
    }

    /** Constructor for mocks */
    public AccountMetastoresAPI(AccountMetastoresService mock) {
        impl = mock;
    }
	
	/**
     * Create metastore.
     * 
     * Creates a Unity Catalog metastore.
     */
    public MetastoreInfo create(CreateMetastore request) {
        return impl.create(request);
    }
    
	/**
     * Delete a metastore.
     * 
     * Deletes a Databricks Unity Catalog metastore for an account, both
     * specified by ID.
     */
    public void delete(DeleteAccountMetastoreRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get a metastore.
     * 
     * Gets a Databricks Unity Catalog metastore from an account, both specified
     * by ID.
     */
    public MetastoreInfo get(GetAccountMetastoreRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get all metastores associated with an account.
     * 
     * Gets all Unity Catalog metastores associated with an account specified by
     * ID.
     */
    public ListMetastoresResponse list() {
        return impl.list();
    }
    
	/**
     * Update a metastore.
     * 
     * Updates an existing Unity Catalog metastore.
     */
    public MetastoreInfo update(UpdateMetastore request) {
        return impl.update(request);
    }
    
    public AccountMetastoresService impl() {
        return impl;
    }
}