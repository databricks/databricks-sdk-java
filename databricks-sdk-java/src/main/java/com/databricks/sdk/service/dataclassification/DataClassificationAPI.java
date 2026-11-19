// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * Manage data classification for Unity Catalog catalogs. Data classification automatically
 * identifies and tags sensitive data (PII) in Unity Catalog tables. Each catalog can have at most
 * one configuration resource that controls scanning behavior and auto-tagging rules.
 */
@Generated
public class DataClassificationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DataClassificationAPI.class);

  private final DataClassificationService impl;

  /** Regular-use constructor */
  public DataClassificationAPI(ApiClient apiClient) {
    impl = new DataClassificationImpl(apiClient);
  }

  /** Constructor for mocks */
  public DataClassificationAPI(DataClassificationService mock) {
    impl = mock;
  }

  /**
   * Create Data Classification configuration for a catalog.
   *
   * <p>Creates a new config resource, which enables Data Classification for the specified catalog.
   * The catalog must not already have a config. Creating the config starts a scan of the selected
   * schemas and schedules recurring scans.
   */
  public CatalogConfig createCatalogConfig(CreateCatalogConfigRequest request) {
    return impl.createCatalogConfig(request);
  }

  public void deleteCatalogConfig(String name) {
    deleteCatalogConfig(new DeleteCatalogConfigRequest().setName(name));
  }

  /**
   * Delete Data Classification configuration for a catalog.
   *
   * <p>Deleting the config disables Data Classification for the catalog and stops its scheduled
   * scans. Tags that auto-tagging already applied to columns are not removed. Deleting a config
   * that does not exist succeeds.
   */
  public void deleteCatalogConfig(DeleteCatalogConfigRequest request) {
    impl.deleteCatalogConfig(request);
  }

  public CatalogConfig getCatalogConfig(String name) {
    return getCatalogConfig(new GetCatalogConfigRequest().setName(name));
  }

  /** Get the Data Classification configuration for a catalog. */
  public CatalogConfig getCatalogConfig(GetCatalogConfigRequest request) {
    return impl.getCatalogConfig(request);
  }

  /**
   * Update the Data Classification configuration for a catalog.
   *
   * <p>The config must already exist for the catalog. Only the fields named in `update_mask`
   * change; the other fields keep their current values.
   */
  public CatalogConfig updateCatalogConfig(UpdateCatalogConfigRequest request) {
    return impl.updateCatalogConfig(request);
  }

  public DataClassificationService impl() {
    return impl;
  }
}
