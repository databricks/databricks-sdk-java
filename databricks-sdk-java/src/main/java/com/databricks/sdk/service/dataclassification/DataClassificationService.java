// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;

/**
 * Manage data classification for Unity Catalog catalogs. Data classification automatically
 * identifies and tags sensitive data (PII) in Unity Catalog tables. Each catalog can have at most
 * one configuration resource that controls scanning behavior and auto-tagging rules.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DataClassificationService {
  /**
   * Create Data Classification configuration for a catalog.
   *
   * <p>Creates a new config resource, which enables Data Classification for the specified catalog.
   * - The config must not already exist for the catalog.
   */
  CatalogConfig createCatalogConfig(CreateCatalogConfigRequest createCatalogConfigRequest);

  /** Delete Data Classification configuration for a catalog. */
  void deleteCatalogConfig(DeleteCatalogConfigRequest deleteCatalogConfigRequest);

  /** Get the Data Classification configuration for a catalog. */
  CatalogConfig getCatalogConfig(GetCatalogConfigRequest getCatalogConfigRequest);

  /**
   * Update the Data Classification configuration for a catalog. - The config must already exist for
   * the catalog. - Updates fields specified in the update_mask. Use update_mask field to perform
   * partial updates of the configuration.
   */
  CatalogConfig updateCatalogConfig(UpdateCatalogConfigRequest updateCatalogConfigRequest);
}
