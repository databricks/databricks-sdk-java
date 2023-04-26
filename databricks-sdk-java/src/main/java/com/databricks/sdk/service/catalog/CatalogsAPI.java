// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CatalogsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CatalogsAPI.class);

  private final CatalogsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CatalogsAPI(ApiClient apiClient) {
    impl = new CatalogsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.CatalogsService} object
   */
  public CatalogsAPI(CatalogsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo create(String name) {
    return create(new CreateCatalog().setName(name));
  }

  /**
   * Create a catalog.
   *
   * <p>Creates a new catalog instance in the parent metastore if the caller is a metastore admin or
   * has the **CREATE_CATALOG** privilege.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo create(CreateCatalog request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void delete(String name) {
    delete(new DeleteCatalogRequest().setName(name));
  }

  /**
   * Delete a catalog.
   *
   * <p>Deletes the catalog that matches the supplied name. The caller must be a metastore admin or
   * the owner of the catalog.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.DeleteCatalogRequest} object
   */
  public void delete(DeleteCatalogRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo get(String name) {
    return get(new GetCatalogRequest().setName(name));
  }

  /**
   * Get a catalog.
   *
   * <p>Gets the specified catalog in a metastore. The caller must be a metastore admin, the owner
   * of the catalog, or a user that has the **USE_CATALOG** privilege set for their account.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetCatalogRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
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
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<CatalogInfo> list() {
    return impl.list().getCatalogs();
  }

  /**
   * <p>update.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo update(String name) {
    return update(new UpdateCatalog().setName(name));
  }

  /**
   * Update a catalog.
   *
   * <p>Updates the catalog that matches the supplied name. The caller must be either the owner of
   * the catalog, or a metastore admin (when changing the owner field of the catalog).
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateCatalog} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo update(UpdateCatalog request) {
    return impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CatalogsService} object
   */
  public CatalogsService impl() {
    return impl;
  }
}
