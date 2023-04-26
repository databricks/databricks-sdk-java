// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that can
 * be associated with workspaces
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AccountMetastoresAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountMetastoresAPI.class);

  private final AccountMetastoresService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountMetastoresAPI(ApiClient apiClient) {
    impl = new AccountMetastoresImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.AccountMetastoresService} object
   */
  public AccountMetastoresAPI(AccountMetastoresService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo create(String name, String storageRoot) {
    return create(new CreateMetastore().setName(name).setStorageRoot(storageRoot));
  }

  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo create(CreateMetastore request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   */
  public void delete(String metastoreId) {
    delete(new DeleteAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Databricks Unity Catalog metastore for an account, both specified by ID.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.DeleteAccountMetastoreRequest} object
   */
  public void delete(DeleteAccountMetastoreRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo get(String metastoreId) {
    return get(new GetAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get a metastore.
   *
   * <p>Gets a Databricks Unity Catalog metastore from an account, both specified by ID.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetAccountMetastoreRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo get(GetAccountMetastoreRequest request) {
    return impl.get(request);
  }

  /**
   * Get all metastores associated with an account.
   *
   * <p>Gets all Unity Catalog metastores associated with an account specified by ID.
   *
   * @return a {@link com.databricks.sdk.service.catalog.ListMetastoresResponse} object
   */
  public ListMetastoresResponse list() {
    return impl.list();
  }

  /**
   * <p>update.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo update(String metastoreId, String id) {
    return update(new UpdateMetastore().setMetastoreId(metastoreId).setId(id));
  }

  /**
   * Update a metastore.
   *
   * <p>Updates an existing Unity Catalog metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  public MetastoreInfo update(UpdateMetastore request) {
    return impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountMetastoresService} object
   */
  public AccountMetastoresService impl() {
    return impl;
  }
}
