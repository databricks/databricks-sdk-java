// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * A metastore is the top-level container of objects in Unity Catalog. It stores
 * data assets (tables and views) and the permissions that govern access to
 * them. Databricks account admins can create metastores and assign them to
 * Databricks workspaces to control which workloads use each metastore. For a
 * workspace to use Unity Catalog, it must have a Unity Catalog metastore
 * attached.
 * 
 * Each metastore is configured with a root storage location in a cloud storage
 * account. This storage location is used for metadata and managed tables data.
 * 
 * NOTE: This metastore is distinct from the metastore included in Databricks
 * workspaces created before Unity Catalog was released. If your workspace
 * includes a legacy Hive metastore, the data in that metastore is available in
 * Unity Catalog in a catalog named hive_metastore.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface MetastoresService {
	/**
     * Create an assignment.
     * 
     * Creates a new Metastore assignment. If an assignment for the same
     * __workspace_id__ exists, it will be overwritten by the new
     * __metastore_id__ and __default_catalog_name__. The caller must be an
     * account admin.
     */
    void assign(CreateMetastoreAssignment createMetastoreAssignment);
    
	/**
     * Create a Metastore.
     * 
     * Creates a new Metastore based on a provided name and storage root path.
     */
    MetastoreInfo create(CreateMetastore createMetastore);
    
	/**
     * Delete a Metastore.
     * 
     * Deletes a Metastore. The caller must be a Metastore admin.
     */
    void delete(DeleteMetastoreRequest deleteMetastoreRequest);
    
	/**
     * Get a Metastore.
     * 
     * Gets a Metastore that matches the supplied ID. The caller must be a
     * Metastore admin to retrieve this info.
     */
    MetastoreInfo get(GetMetastoreRequest getMetastoreRequest);
    
	/**
     * List Metastores.
     * 
     * Gets an array of the available Metastores (as MetastoreInfo objects). The
     * caller must be an admin to retrieve this info.
     */
    ListMetastoresResponse list();
    
	/**
     * Get a summary.
     * 
     * Gets information about a Metastore. This summary includes the storage
     * credential, the cloud vendor, the cloud region, and the global Metastore
     * ID.
     */
    GetMetastoreSummaryResponse summary();
    
	/**
     * Delete an assignment.
     * 
     * Deletes a Metastore assignment. The caller must be an account
     * administrator.
     */
    void unassign(UnassignRequest unassignRequest);
    
	/**
     * Update a Metastore.
     * 
     * Updates information for a specific Metastore. The caller must be a
     * Metastore admin.
     */
    MetastoreInfo update(UpdateMetastore updateMetastore);
    
	/**
     * Update an assignment.
     * 
     * Updates a Metastore assignment. This operation can be used to update
     * __metastore_id__ or __default_catalog_name__ for a specified Workspace,
     * if the Workspace is already assigned a Metastore. The caller must be an
     * account admin to update __metastore_id__; otherwise, the caller can be a
     * Workspace admin.
     */
    void updateAssignment(UpdateMetastoreAssignment updateMetastoreAssignment);
    
}