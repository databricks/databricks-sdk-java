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
 */
@Generated("databricks-sdk-generator")
public class MetastoresAPI implements MetastoresService {
    private final ApiClient apiClient;

    public MetastoresAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create an assignment.
     * 
     * Creates a new Metastore assignment. If an assignment for the same
     * __workspace_id__ exists, it will be overwritten by the new
     * __metastore_id__ and __default_catalog_name__. The caller must be an
     * account admin.
     */
    @Override
    public void assign(CreateMetastoreAssignment request) {
        String path = String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
        apiClient.PUT(path, request, Void.class);
    }
    
	/**
     * Create a Metastore.
     * 
     * Creates a new Metastore based on a provided name and storage root path.
     */
    @Override
    public MetastoreInfo create(CreateMetastore request) {
        String path = "/api/2.1/unity-catalog/metastores";
        return apiClient.POST(path, request, MetastoreInfo.class);
    }
    
	/**
     * Delete a Metastore.
     * 
     * Deletes a Metastore. The caller must be a Metastore admin.
     */
    @Override
    public void delete(DeleteMetastoreRequest request) {
        String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a Metastore.
     * 
     * Gets a Metastore that matches the supplied ID. The caller must be a
     * Metastore admin to retrieve this info.
     */
    @Override
    public MetastoreInfo get(GetMetastoreRequest request) {
        String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
        return apiClient.GET(path, request, MetastoreInfo.class);
    }
    
	/**
     * List Metastores.
     * 
     * Gets an array of the available Metastores (as MetastoreInfo objects). The
     * caller must be an admin to retrieve this info.
     */
    @Override
    public ListMetastoresResponse list() {
        String path = "/api/2.1/unity-catalog/metastores";
        return apiClient.GET(path, ListMetastoresResponse.class);
    }
    
	/**
     * Get a summary.
     * 
     * Gets information about a Metastore. This summary includes the storage
     * credential, the cloud vendor, the cloud region, and the global Metastore
     * ID.
     */
    @Override
    public GetMetastoreSummaryResponse summary() {
        String path = "/api/2.1/unity-catalog/metastore_summary";
        return apiClient.GET(path, GetMetastoreSummaryResponse.class);
    }
    
	/**
     * Delete an assignment.
     * 
     * Deletes a Metastore assignment. The caller must be an account
     * administrator.
     */
    @Override
    public void unassign(UnassignRequest request) {
        String path = String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Update a Metastore.
     * 
     * Updates information for a specific Metastore. The caller must be a
     * Metastore admin.
     */
    @Override
    public MetastoreInfo update(UpdateMetastore request) {
        String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
        return apiClient.PATCH(path, request, MetastoreInfo.class);
    }
    
	/**
     * Update an assignment.
     * 
     * Updates a Metastore assignment. This operation can be used to update
     * __metastore_id__ or __default_catalog_name__ for a specified Workspace,
     * if the Workspace is already assigned a Metastore. The caller must be an
     * account admin to update __metastore_id__; otherwise, the caller can be a
     * Workspace admin.
     */
    @Override
    public void updateAssignment(UpdateMetastoreAssignment request) {
        String path = String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}