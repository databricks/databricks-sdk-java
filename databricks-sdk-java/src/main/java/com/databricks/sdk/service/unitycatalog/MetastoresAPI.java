// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

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
 * a catalog named hive_metastore.
 */
public class MetastoresAPI {
    private final MetastoresService impl;

    /** Regular-use constructor */
    public MetastoresAPI(ApiClient apiClient) {
        impl = new MetastoresImpl(apiClient);
    }

    /** Constructor for mocks */
    public MetastoresAPI(MetastoresService mock) {
        impl = mock;
    }
	
	/**
     * Create an assignment.
     * 
     * Creates a new metastore assignment. If an assignment for the same
     * __workspace_id__ exists, it will be overwritten by the new
     * __metastore_id__ and __default_catalog_name__. The caller must be an
     * account admin.
     */
    public void assign(CreateMetastoreAssignment request) {
        impl.assign(request);
    }
    
	/**
     * Create a metastore.
     * 
     * Creates a new metastore based on a provided name and storage root path.
     */
    public MetastoreInfo create(CreateMetastore request) {
        return impl.create(request);
    }
    
	/**
     * Get metastore assignment for workspace.
     * 
     * Gets the metastore assignment for the workspace being accessed.
     */
    public MetastoreAssignment current() {
        return impl.current();
    }
    
	/**
     * Delete a metastore.
     * 
     * Deletes a metastore. The caller must be a metastore admin.
     */
    public void delete(DeleteMetastoreRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get a metastore.
     * 
     * Gets a metastore that matches the supplied ID. The caller must be a
     * metastore admin to retrieve this info.
     */
    public MetastoreInfo get(GetMetastoreRequest request) {
        return impl.get(request);
    }
    
	/**
     * List metastores.
     * 
     * Gets an array of the available metastores (as __MetastoreInfo__ objects).
     * The caller must be an admin to retrieve this info. There is no guarantee
     * of a specific ordering of the elements in the array.
     */
    public ListMetastoresResponse list() {
        return impl.list();
    }
    
	/**
     * Get a metastore summary.
     * 
     * Gets information about a metastore. This summary includes the storage
     * credential, the cloud vendor, the cloud region, and the global metastore
     * ID.
     */
    public GetMetastoreSummaryResponse summary() {
        return impl.summary();
    }
    
	/**
     * Delete an assignment.
     * 
     * Deletes a metastore assignment. The caller must be an account
     * administrator.
     */
    public void unassign(UnassignRequest request) {
        impl.unassign(request);
    }
    
	/**
     * Update a metastore.
     * 
     * Updates information for a specific metastore. The caller must be a
     * metastore admin.
     */
    public MetastoreInfo update(UpdateMetastore request) {
        return impl.update(request);
    }
    
	/**
     * Update an assignment.
     * 
     * Updates a metastore assignment. This operation can be used to update
     * __metastore_id__ or __default_catalog_name__ for a specified Workspace,
     * if the Workspace is already assigned a metastore. The caller must be an
     * account admin to update __metastore_id__; otherwise, the caller can be a
     * Workspace admin.
     */
    public void updateAssignment(UpdateMetastoreAssignment request) {
        impl.updateAssignment(request);
    }
    
    public MetastoresService impl() {
        return impl;
    }
}