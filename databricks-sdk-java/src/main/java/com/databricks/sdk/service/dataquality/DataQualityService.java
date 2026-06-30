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
   * The call must be made in the same workspace as where the monitor was created.
   *
   * <p>The caller must have either of the following sets of permissions: 1. **MANAGE** and
   * **USE_CATALOG** on the table's parent catalog. 2. **USE_CATALOG** on the table's parent
   * catalog, and **MANAGE** and **USE_SCHEMA** on the table's parent schema. 3. **USE_CATALOG** on
   * the table's parent catalog, **USE_SCHEMA** on the table's parent schema, and **MANAGE** on the
   * table.
   */
  CancelRefreshResponse cancelRefresh(CancelRefreshRequest cancelRefreshRequest);

  /**
   * Create a data quality monitor on a Unity Catalog object. The caller must provide either
   * `anomaly_detection_config` for a schema monitor or `data_profiling_config` for a table monitor.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on
   * the table's parent schema, and **SELECT** on the table 2. **USE_CATALOG** on the table's parent
   * catalog, **MANAGE** and **USE_SCHEMA** on the table's parent schema, and **SELECT** on the
   * table. 3. **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's parent
   * schema, and **MANAGE** and **SELECT** on the table.
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **MANAGE** and **USE_SCHEMA** on the
   * schema.
   */
  Monitor createMonitor(CreateMonitorRequest createMonitorRequest);

  /**
   * Creates a refresh. Currently only supported for the `table` `object_type`. The call must be
   * made in the same workspace as where the monitor was created.
   *
   * <p>The caller must have either of the following sets of permissions: 1. **MANAGE** and
   * **USE_CATALOG** on the table's parent catalog. 2. **USE_CATALOG** on the table's parent
   * catalog, and **MANAGE** and **USE_SCHEMA** on the table's parent schema. 3. **USE_CATALOG** on
   * the table's parent catalog, **USE_SCHEMA** on the table's parent schema, and **MANAGE** on the
   * table.
   */
  Refresh createRefresh(CreateRefreshRequest createRefreshRequest);

  /**
   * Delete a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: **MANAGE** and **USE_CATALOG** on the table's parent catalog. **USE_CATALOG** on
   * the table's parent catalog, and **MANAGE** and **USE_SCHEMA** on the table's parent schema.
   * **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's parent schema, and
   * **MANAGE** on the table.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **MANAGE** and **USE_SCHEMA** on the
   * schema.
   */
  void deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

  /** (Unimplemented) Delete a refresh */
  void deleteRefresh(DeleteRefreshRequest deleteRefreshRequest);

  /**
   * Read a data quality monitor on a Unity Catalog object.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the table's parent catalog. 2.
   * **USE_CATALOG** on the table's parent catalog, and **MANAGE** and **USE_SCHEMA** on the table's
   * parent schema. 3. **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's
   * parent schema, and **SELECT** on the table.
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **USE_SCHEMA** on the schema.
   *
   * <p>The returned information includes configuration values on the entity and parent entity as
   * well as information on assets created by the monitor. Some information (e.g. dashboard) may be
   * filtered out if the caller is in a different workspace than where the monitor was created.
   */
  Monitor getMonitor(GetMonitorRequest getMonitorRequest);

  /**
   * Get data quality monitor refresh. The call must be made in the same workspace as where the
   * monitor was created.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the table's parent catalog. 2.
   * **USE_CATALOG** on the table's parent catalog, and **MANAGE** and **USE_SCHEMA** on the table's
   * parent schema. 3. **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's
   * parent schema, and **SELECT** on the table.
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **USE_SCHEMA** on the schema.
   */
  Refresh getRefresh(GetRefreshRequest getRefreshRequest);

  /** (Unimplemented) List data quality monitors. */
  ListMonitorResponse listMonitor(ListMonitorRequest listMonitorRequest);

  /**
   * List data quality monitor refreshes. The call must be made in the same workspace as where the
   * monitor was created.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the table's parent catalog. 2.
   * **USE_CATALOG** on the table's parent catalog, and **MANAGE** and **USE_SCHEMA** on the table's
   * parent schema. 3. **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's
   * parent schema, and **SELECT** on the table.
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **USE_SCHEMA** on the schema.
   */
  ListRefreshResponse listRefresh(ListRefreshRequest listRefreshRequest);

  /**
   * Update a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the table's parent catalog. 2.
   * **USE_CATALOG** on the table's parent catalog, and **MANAGE** and **USE_SCHEMA** on the table's
   * parent schema. 3. **USE_CATALOG** on the table's parent catalog, **USE_SCHEMA** on the table's
   * parent schema, and **MANAGE** on the table.
   *
   * <p>For the `schema` `object_type`, the caller must have either of the following sets of
   * permissions: 1. **MANAGE** and **USE_CATALOG** on the schema's parent catalog. 2.
   * **USE_CATALOG** on the schema's parent catalog, and **MANAGE** and **USE_SCHEMA** on the
   * schema.
   */
  Monitor updateMonitor(UpdateMonitorRequest updateMonitorRequest);

  /** (Unimplemented) Update a refresh */
  Refresh updateRefresh(UpdateRefreshRequest updateRefreshRequest);
}
