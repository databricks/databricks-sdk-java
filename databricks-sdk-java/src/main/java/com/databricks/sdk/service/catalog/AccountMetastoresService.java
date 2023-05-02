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
  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore.
   */
  MetastoreInfo create(CreateMetastore createMetastore);

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Databricks Unity Catalog metastore for an account, both specified by ID.
   */
  void delete(DeleteAccountMetastoreRequest deleteAccountMetastoreRequest);

  /**
   * Get a metastore.
   *
   * <p>Gets a Databricks Unity Catalog metastore from an account, both specified by ID.
   */
  MetastoreInfo get(GetAccountMetastoreRequest getAccountMetastoreRequest);

  /**
   * Get all metastores associated with an account.
   *
   * <p>Gets all Unity Catalog metastores associated with an account specified by ID.
   */
  ListMetastoresResponse list();

  /**
   * Update a metastore.
   *
   * <p>Updates an existing Unity Catalog metastore.
   */
  MetastoreInfo update(UpdateMetastore updateMetastore);
}
