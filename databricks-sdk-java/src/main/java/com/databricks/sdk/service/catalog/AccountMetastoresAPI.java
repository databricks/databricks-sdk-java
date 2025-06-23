// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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

  /** Creates a Unity Catalog metastore. */
  public AccountsMetastoreInfo create(AccountsCreateMetastore request) {
    return impl.create(request);
  }

  public void delete(String metastoreId) {
    delete(new DeleteAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /** Deletes a Unity Catalog metastore for an account, both specified by ID. */
  public void delete(DeleteAccountMetastoreRequest request) {
    impl.delete(request);
  }

  public AccountsMetastoreInfo get(String metastoreId) {
    return get(new GetAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /** Gets a Unity Catalog metastore from an account, both specified by ID. */
  public AccountsMetastoreInfo get(GetAccountMetastoreRequest request) {
    return impl.get(request);
  }

  /** Gets all Unity Catalog metastores associated with an account specified by ID. */
  public Iterable<MetastoreInfo> list() {
    return new Paginator<>(
        null, (Void v) -> impl.list(), ListMetastoresResponse::getMetastores, response -> null);
  }

  public AccountsMetastoreInfo update(String metastoreId) {
    return update(new AccountsUpdateMetastore().setMetastoreId(metastoreId));
  }

  /** Updates an existing Unity Catalog metastore. */
  public AccountsMetastoreInfo update(AccountsUpdateMetastore request) {
    return impl.update(request);
  }

  public AccountMetastoresService impl() {
    return impl;
  }
}
