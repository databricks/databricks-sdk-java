// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that can
 * be associated with workspaces
 */
public class AccountMetastoresAPI {
  private final AccountMetastoresService impl;

  /** Regular-use constructor */
  public AccountMetastoresAPI(ApiClient apiClient) {
    impl = new AccountMetastoresImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountMetastoresAPI(AccountMetastoresService mock) {
    impl = mock;
  }

  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore.
   */
  public MetastoreInfo create(CreateMetastore request) {
    return impl.create(request);
  }

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Databricks Unity Catalog metastore for an account, both specified by ID.
   */
  public void delete(DeleteAccountMetastoreRequest request) {
    impl.delete(request);
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
