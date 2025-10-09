// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;

/**
 * Manage the data quality of Unity Catalog objects (currently support `schema` and `table`)
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DataQualityService {
  /**
   * Cancels a data quality monitor refresh. Currently only supported for the `table` `object_type`.
   */
  CancelRefreshResponse cancelRefresh(CancelRefreshRequest cancelRefreshRequest);

  /**
   * Create a data quality monitor on a Unity Catalog object. The caller must provide either
   * `anomaly_detection_config` for a schema monitor or `data_profiling_config` for a table monitor.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog, have **USE_SCHEMA** on the table's parent schema, and have **SELECT** access on the
   * table 2. have **USE_CATALOG** on the table's parent catalog, be an owner of the table's parent
   * schema, and have **SELECT** access on the table. 3. have the following permissions: -
   * **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the table's parent schema -
   * be an owner of the table.
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   */
  Monitor createMonitor(CreateMonitorRequest createMonitorRequest);

  /**
   * Creates a refresh. Currently only supported for the `table` `object_type`.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   */
  Refresh createRefresh(CreateRefreshRequest createRefreshRequest);

  /**
   * Delete a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - be an owner of the table.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   */
  void deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

  /** (Unimplemented) Delete a refresh */
  void deleteRefresh(DeleteRefreshRequest deleteRefreshRequest);

  /**
   * Read a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema. 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - **SELECT** privilege on the table.
   *
   * <p>The returned information includes configuration values, as well as information on assets
   * created by the monitor. Some information (e.g., dashboard) may be filtered out if the caller is
   * in a different workspace than where the monitor was created.
   */
  Monitor getMonitor(GetMonitorRequest getMonitorRequest);

  /**
   * Get data quality monitor refresh.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - **SELECT** privilege on the table.
   */
  Refresh getRefresh(GetRefreshRequest getRefreshRequest);

  /** (Unimplemented) List data quality monitors. */
  ListMonitorResponse listMonitor(ListMonitorRequest listMonitorRequest);

  /**
   * List data quality monitor refreshes.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - **SELECT** privilege on the table.
   */
  ListRefreshResponse listRefresh(ListRefreshRequest listRefreshRequest);

  /**
   * Update a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, The caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - be an owner of the table.
   */
  Monitor updateMonitor(UpdateMonitorRequest updateMonitorRequest);

  /** (Unimplemented) Update a refresh */
  Refresh updateRefresh(UpdateRefreshRequest updateRefreshRequest);
}
