// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A catalog is the first layer of Unity Catalog’s three-level namespace. It’s used to organize your
 * data assets. Users can see all catalogs on which they have been assigned the USE_CATALOG data
 * permission.
 *
 * <p>In Unity Catalog, admins and data stewards manage users and their access to data centrally
 * across all of the workspaces in a Databricks account. Users in different workspaces can share
 * access to the same data, depending on privileges granted centrally in Unity Catalog.
 */
@Generated
public class CatalogsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CatalogsAPI.class);

  private final CatalogsService impl;

  /** Regular-use constructor */
  public CatalogsAPI(ApiClient apiClient) {
    impl = new CatalogsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CatalogsAPI(CatalogsService mock) {
    impl = mock;
  }

  public CatalogInfo create(String name) {
    return create(new CreateCatalog().setName(name));
  }

  /**
   * Create a catalog.
   *
   * <p>Creates a new catalog instance in the parent metastore if the caller is a metastore admin or
   * has the **CREATE_CATALOG** privilege.
   */
  public CatalogInfo create(CreateCatalog request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteCatalogRequest().setName(name));
  }

  /**
   * Delete a catalog.
   *
   * <p>Deletes the catalog that matches the supplied name. The caller must be a metastore admin or
   * the owner of the catalog.
   */
  public void delete(DeleteCatalogRequest request) {
    impl.delete(request);
  }

  public CatalogInfo get(String name) {
    return get(new GetCatalogRequest().setName(name));
  }

  /**
   * Get a catalog.
   *
   * <p>Gets the specified catalog in a metastore. The caller must be a metastore admin, the owner
   * of the catalog, or a user that has the **USE_CATALOG** privilege set for their account.
   */
  public CatalogInfo get(GetCatalogRequest request) {
    return impl.get(request);
  }

  /**
   * List catalogs.
   *
   * <p>Gets an array of catalogs in the metastore. If the caller is the metastore admin, all
   * catalogs will be retrieved. Otherwise, only catalogs owned by the caller (or for which the
   * caller has the **USE_CATALOG** privilege) will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  public Iterable<CatalogInfo> list() {
    return impl.list().getCatalogs();
  }

  public CatalogInfo update(String name) {
    return update(new UpdateCatalog().setName(name));
  }

  /**
   * Update a catalog.
   *
   * <p>Updates the catalog that matches the supplied name. The caller must be either the owner of
   * the catalog, or a metastore admin (when changing the owner field of the catalog).
   */
  public CatalogInfo update(UpdateCatalog request) {
    return impl.update(request);
  }

  public CatalogsService impl() {
    return impl;
  }
}
