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
   * The catalog must not already have a config. Creating the config starts a scan of the selected
   * schemas and schedules recurring scans.
   */
  CatalogConfig createCatalogConfig(CreateCatalogConfigRequest createCatalogConfigRequest);

  /**
   * Delete Data Classification configuration for a catalog.
   *
   * <p>Deleting the config disables Data Classification for the catalog and stops its scheduled
   * scans. Tags that auto-tagging already applied to columns are not removed. Deleting a config
   * that does not exist succeeds.
   */
  void deleteCatalogConfig(DeleteCatalogConfigRequest deleteCatalogConfigRequest);

  /** Get the Data Classification configuration for a catalog. */
  CatalogConfig getCatalogConfig(GetCatalogConfigRequest getCatalogConfigRequest);

  /**
   * Rescan the tables in a catalog's Data Classification scope that changed since their last scan.
   *
   * <p>The rescan uses the catalog's current classifiers and follows its config (schema selection)
   * and SKIP tags. Tables with no commits since their last scan are skipped. Views and tables
   * without a Delta commit history keep their regular rescan schedule. The call returns once the
   * rescan is scheduled; scanning runs in the background. If a scan of the catalog is running, the
   * call cancels it and starts a new run. - Data Classification must be enabled for the catalog. -
   * The call must come from the workspace where Data Classification was enabled.
   */
  RescanCatalogResponse rescanCatalog(RescanCatalogRequest rescanCatalogRequest);

  /**
   * Update the Data Classification configuration for a catalog.
   *
   * <p>The config must already exist for the catalog. Only the fields named in `update_mask`
   * change; the other fields keep their current values.
   */
  CatalogConfig updateCatalogConfig(UpdateCatalogConfigRequest updateCatalogConfigRequest);
}
