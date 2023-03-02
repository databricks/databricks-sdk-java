// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore
 * contains catalogs that can be associated with workspaces
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface AccountMetastoresService {
	/**
     * Create metastore.
     * 
     * Creates a Unity Catalog metastore.
     */
    MetastoreInfo create(CreateMetastore createMetastore);
    
	/**
     * Delete a metastore.
     * 
     * Deletes a Databricks Unity Catalog metastore for an account, both
     * specified by ID.
     */
    void delete(DeleteAccountMetastoreRequest deleteAccountMetastoreRequest);
    
	/**
     * Get a metastore.
     * 
     * Gets a Databricks Unity Catalog metastore from an account, both specified
     * by ID.
     */
    MetastoreInfo get(GetAccountMetastoreRequest getAccountMetastoreRequest);
    
	/**
     * Get all metastores associated with an account.
     * 
     * Gets all Unity Catalog metastores associated with an account specified by
     * ID.
     */
    ListMetastoresResponse list();
    
	/**
     * Update a metastore.
     * 
     * Updates an existing Unity Catalog metastore.
     */
    MetastoreInfo update(UpdateMetastore updateMetastore);
    
}