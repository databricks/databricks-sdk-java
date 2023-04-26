// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

/**
 * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that can
 * be associated with workspaces
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface AccountMetastoresService {
  /**
   * Create metastore.
   *
   * <p>Creates a Unity Catalog metastore.
   *
   * @param createMetastore a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo create(CreateMetastore createMetastore);

  /**
   * Delete a metastore.
   *
   * <p>Deletes a Databricks Unity Catalog metastore for an account, both specified by ID.
   *
   * @param deleteAccountMetastoreRequest a {@link com.databricks.sdk.service.catalog.DeleteAccountMetastoreRequest} object
   */
  void delete(DeleteAccountMetastoreRequest deleteAccountMetastoreRequest);

  /**
   * Get a metastore.
   *
   * <p>Gets a Databricks Unity Catalog metastore from an account, both specified by ID.
   *
   * @param getAccountMetastoreRequest a {@link com.databricks.sdk.service.catalog.GetAccountMetastoreRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo get(GetAccountMetastoreRequest getAccountMetastoreRequest);

  /**
   * Get all metastores associated with an account.
   *
   * <p>Gets all Unity Catalog metastores associated with an account specified by ID.
   *
   * @return a {@link com.databricks.sdk.service.catalog.ListMetastoresResponse} object
   */
  ListMetastoresResponse list();

  /**
   * Update a metastore.
   *
   * <p>Updates an existing Unity Catalog metastore.
   *
   * @param updateMetastore a {@link com.databricks.sdk.service.catalog.UpdateMetastore} object
   * @return a {@link com.databricks.sdk.service.catalog.MetastoreInfo} object
   */
  MetastoreInfo update(UpdateMetastore updateMetastore);
}
