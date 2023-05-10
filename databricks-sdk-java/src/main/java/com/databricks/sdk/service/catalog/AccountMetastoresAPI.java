// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that can
 * be associated with workspaces
 */
@Generated
public class AccountMetastoresAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountMetastoresAPI.class);

  private final AccountMetastoresService impl;

  /** Regular-use constructor */
  public AccountMetastoresAPI(ApiClient apiClient) {
    impl = new AccountMetastoresImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountMetastoresAPI(AccountMetastoresService mock) {
    impl = mock;
  }

  public MetastoreInfo create(String name, String storageRoot) {
    return create(new CreateMetastore().setName(name).setStorageRoot(storageRoot));
  }

  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore.
   */
  public MetastoreInfo create(CreateMetastore request) {
    return impl.create(request);
  }

  public void delete(String metastoreId) {
    delete(new DeleteAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Databricks Unity Catalog metastore for an account, both specified by ID.
   */
  public void delete(DeleteAccountMetastoreRequest request) {
    impl.delete(request);
  }

  public MetastoreInfo get(String metastoreId) {
    return get(new GetAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get a metastore.
   *
   * <p>Gets a Databricks Unity Catalog metastore from an account, both specified by ID.
   */
  public MetastoreInfo get(GetAccountMetastoreRequest request) {
    return impl.get(request);
  }

  /**
   * Get all metastores associated with an account.
   *
   * <p>Gets all Unity Catalog metastores associated with an account specified by ID.
   */
  public ListMetastoresResponse list() {
    return impl.list();
  }

  public MetastoreInfo update(String metastoreId, String id) {
    return update(new UpdateMetastore().setMetastoreId(metastoreId).setId(id));
  }

  /**
   * Update a metastore.
   *
   * <p>Updates an existing Unity Catalog metastore.
   */
  public MetastoreInfo update(UpdateMetastore request) {
    return impl.update(request);
  }

  public AccountMetastoresService impl() {
    return impl;
  }
}
