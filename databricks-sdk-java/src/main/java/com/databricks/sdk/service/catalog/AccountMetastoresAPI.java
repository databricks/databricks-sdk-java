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
  public AccountsCreateMetastoreResponse create(AccountsCreateMetastore request) {
    return impl.create(request);
  }

  public AccountsDeleteMetastoreResponse delete(String metastoreId) {
    return delete(new DeleteAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /** Deletes a Unity Catalog metastore for an account, both specified by ID. */
  public AccountsDeleteMetastoreResponse delete(DeleteAccountMetastoreRequest request) {
    return impl.delete(request);
  }

  public AccountsGetMetastoreResponse get(String metastoreId) {
    return get(new GetAccountMetastoreRequest().setMetastoreId(metastoreId));
  }

  /** Gets a Unity Catalog metastore from an account, both specified by ID. */
  public AccountsGetMetastoreResponse get(GetAccountMetastoreRequest request) {
    return impl.get(request);
  }

  /** Gets all Unity Catalog metastores associated with an account specified by ID. */
  public Iterable<MetastoreInfo> list() {
    return new Paginator<>(
        null,
        (Void v) -> impl.list(),
        AccountsListMetastoresResponse::getMetastores,
        response -> null);
  }

  /** Updates an existing Unity Catalog metastore. */
  public AccountsUpdateMetastoreResponse update(AccountsUpdateMetastore request) {
    return impl.update(request);
  }

  public AccountMetastoresService impl() {
    return impl;
  }
}
