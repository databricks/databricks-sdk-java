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

  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore. Please add a header
   * X-Databricks-Account-Console-API-Version: 2.0 to access this API.
   */
  public MetastoreInfo create(AccountsCreateMetastore request) {
    return impl.create(request);
  }

  public void delete(String metastoreId) {
    delete(new DeleteAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Unity Catalog metastore for an account, both specified by ID. Please add a header
   * X-Databricks-Account-Console-API-Version: 2.0 to access this API.
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
   * <p>Gets a Unity Catalog metastore from an account, both specified by ID. Please add a header
   * X-Databricks-Account-Console-API-Version: 2.0 to access this API.
   */
  public MetastoreInfo get(GetAccountMetastoreRequest request) {
    return impl.get(request);
  }

  /**
   * Get all metastores associated with an account.
   *
   * <p>Gets all Unity Catalog metastores associated with an account specified by ID. Please add a
   * header X-Databricks-Account-Console-API-Version: 2.0 to access this API.
   */
  public ListMetastoresResponse list() {
    return impl.list();
  }

  public MetastoreInfo update(String metastoreId) {
    return update(new AccountsUpdateMetastore().setMetastoreId(metastoreId));
  }

  /**
   * Update a metastore.
   *
   * <p>Updates an existing Unity Catalog metastore. Please add a header
   * X-Databricks-Account-Console-API-Version: 2.0 to access this API.
   */
  public MetastoreInfo update(AccountsUpdateMetastore request) {
    return impl.update(request);
  }

  public AccountMetastoresService impl() {
    return impl;
  }
}
