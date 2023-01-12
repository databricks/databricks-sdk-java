// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * A catalog is the first layer of Unity Catalog’s three-level namespace.
 * It’s used to organize your data assets. Users can see all catalogs on which
 * they have been assigned the USE_CATALOG data permission.
 * 
 * In Unity Catalog, admins and data stewards manage users and their access to
 * data centrally across all of the workspaces in a Databricks account. Users in
 * different workspaces can share access to the same data, depending on
 * privileges granted centrally in Unity Catalog.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface CatalogsService {
	/**
     * Create a catalog.
     * 
     * Creates a new catalog instance in the parent Metastore if the caller is a
     * Metastore admin or has the CREATE_CATALOG privilege.
     */
    CatalogInfo create(CreateCatalog createCatalog);
    
	/**
     * Delete a catalog.
     * 
     * Deletes the catalog that matches the supplied name. The caller must be a
     * Metastore admin or the owner of the catalog.
     */
    void delete(DeleteCatalogRequest deleteCatalogRequest);
    
	/**
     * Get a catalog.
     * 
     * Gets an array of all catalogs in the current Metastore for which the user
     * is an admin or Catalog owner, or has the USE_CATALOG privilege set for
     * their account.
     */
    CatalogInfo get(GetCatalogRequest getCatalogRequest);
    
	/**
     * List catalogs.
     * 
     * Gets an array of catalogs in the Metastore. If the caller is the
     * Metastore admin, all catalogs will be retrieved. Otherwise, only catalogs
     * owned by the caller (or for which the caller has the USE_CATALOG
     * privilege) will be retrieved.
     */
    ListCatalogsResponse list();
    
	/**
     * Update a catalog.
     * 
     * Updates the catalog that matches the supplied name. The caller must be
     * either the owner of the catalog, or a Metastore admin (when changing the
     * owner field of the catalog).
     */
    CatalogInfo update(UpdateCatalog updateCatalog);
    
}