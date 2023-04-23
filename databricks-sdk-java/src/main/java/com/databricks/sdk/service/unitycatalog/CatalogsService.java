// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

/**
 * A catalog is the first layer of Unity Catalog’s three-level namespace. It’s used to organize your
 * data assets. Users can see all catalogs on which they have been assigned the USE_CATALOG data
 * permission.
 *
 * <p>In Unity Catalog, admins and data stewards manage users and their access to data centrally
 * across all of the workspaces in a Databricks account. Users in different workspaces can share
 * access to the same data, depending on privileges granted centrally in Unity Catalog.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface CatalogsService {
  /**
   * Create a catalog.
   *
   * <p>Creates a new catalog instance in the parent metastore if the caller is a metastore admin or
   * has the **CREATE_CATALOG** privilege.
   */
  CatalogInfo create(CreateCatalog createCatalog);

  /**
   * Delete a catalog.
   *
   * <p>Deletes the catalog that matches the supplied name. The caller must be a metastore admin or
   * the owner of the catalog.
   */
  void delete(DeleteCatalogRequest deleteCatalogRequest);

  /**
   * Get a catalog.
   *
   * <p>Gets the specified catalog in a metastore. The caller must be a metastore admin, the owner
   * of the catalog, or a user that has the **USE_CATALOG** privilege set for their account.
   */
  CatalogInfo get(GetCatalogRequest getCatalogRequest);

  /**
   * List catalogs.
   *
   * <p>Gets an array of catalogs in the metastore. If the caller is the metastore admin, all
   * catalogs will be retrieved. Otherwise, only catalogs owned by the caller (or for which the
   * caller has the **USE_CATALOG** privilege) will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  ListCatalogsResponse list();

  /**
   * Update a catalog.
   *
   * <p>Updates the catalog that matches the supplied name. The caller must be either the owner of
   * the catalog, or a metastore admin (when changing the owner field of the catalog).
   */
  CatalogInfo update(UpdateCatalog updateCatalog);
}
