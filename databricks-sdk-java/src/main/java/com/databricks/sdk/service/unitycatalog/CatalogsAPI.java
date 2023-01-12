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
 * A catalog is the first layer of Unity Catalog’s three-level namespace.
 * It’s used to organize your data assets. Users can see all catalogs on which
 * they have been assigned the USE_CATALOG data permission.
 * 
 * In Unity Catalog, admins and data stewards manage users and their access to
 * data centrally across all of the workspaces in a Databricks account. Users in
 * different workspaces can share access to the same data, depending on
 * privileges granted centrally in Unity Catalog.
 */
@Generated("databricks-sdk-generator")
public class CatalogsAPI implements CatalogsService {
    private final ApiClient apiClient;

    public CatalogsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a catalog.
     * 
     * Creates a new catalog instance in the parent Metastore if the caller is a
     * Metastore admin or has the CREATE_CATALOG privilege.
     */
    @Override
    public CatalogInfo create(CreateCatalog request) {
        String path = "/api/2.1/unity-catalog/catalogs";
        return apiClient.POST(path, request, CatalogInfo.class);
    }
    
	/**
     * Delete a catalog.
     * 
     * Deletes the catalog that matches the supplied name. The caller must be a
     * Metastore admin or the owner of the catalog.
     */
    @Override
    public void delete(DeleteCatalogRequest request) {
        String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a catalog.
     * 
     * Gets an array of all catalogs in the current Metastore for which the user
     * is an admin or Catalog owner, or has the USE_CATALOG privilege set for
     * their account.
     */
    @Override
    public CatalogInfo get(GetCatalogRequest request) {
        String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
        return apiClient.GET(path, request, CatalogInfo.class);
    }
    
	/**
     * List catalogs.
     * 
     * Gets an array of catalogs in the Metastore. If the caller is the
     * Metastore admin, all catalogs will be retrieved. Otherwise, only catalogs
     * owned by the caller (or for which the caller has the USE_CATALOG
     * privilege) will be retrieved.
     */
    @Override
    public ListCatalogsResponse list() {
        String path = "/api/2.1/unity-catalog/catalogs";
        return apiClient.GET(path, ListCatalogsResponse.class);
    }
    
	/**
     * Update a catalog.
     * 
     * Updates the catalog that matches the supplied name. The caller must be
     * either the owner of the catalog, or a Metastore admin (when changing the
     * owner field of the catalog).
     */
    @Override
    public CatalogInfo update(UpdateCatalog request) {
        String path = String.format("/api/2.1/unity-catalog/catalogs/%s", request.getName());
        return apiClient.PATCH(path, request, CatalogInfo.class);
    }
    
}