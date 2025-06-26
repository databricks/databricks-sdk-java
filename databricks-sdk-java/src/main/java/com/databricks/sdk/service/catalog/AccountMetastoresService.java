// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that can
 * be associated with workspaces
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountMetastoresService {
  /** Creates a Unity Catalog metastore. */
  AccountsMetastoreInfo create(AccountsCreateMetastore accountsCreateMetastore);

  /** Deletes a Unity Catalog metastore for an account, both specified by ID. */
  void delete(DeleteAccountMetastoreRequest deleteAccountMetastoreRequest);

  /** Gets a Unity Catalog metastore from an account, both specified by ID. */
  AccountsMetastoreInfo get(GetAccountMetastoreRequest getAccountMetastoreRequest);

  /** Gets all Unity Catalog metastores associated with an account specified by ID. */
  ListMetastoresResponse list();

  /** Updates an existing Unity Catalog metastore. */
  AccountsMetastoreInfo update(AccountsUpdateMetastore accountsUpdateMetastore);
}
