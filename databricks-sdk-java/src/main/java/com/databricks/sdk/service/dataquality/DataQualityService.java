// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;

/**
 * Manage the data quality of Unity Catalog objects (currently support {@code schema} and {@code
 * table})
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DataQualityService {
  /**
   * Cancels a data quality monitor refresh. Currently only supported for the {@code table} {@code
   * object_type}. The call must be made in the same workspace as where the monitor was created.
   *
   * <p>The caller must have either of the following sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>MANAGE</b> on the table.
   * </ol>
   */
  CancelRefreshResponse cancelRefresh(CancelRefreshRequest cancelRefreshRequest);

  /**
   * Create a data quality monitor on a Unity Catalog object. The caller must provide either {@code
   * anomaly_detection_config} for a schema monitor or {@code data_profiling_config} for a table
   * monitor.
   *
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on
   *       the table's parent schema, and <b>SELECT</b> on the table
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>MANAGE</b> and <b>USE_SCHEMA</b> on
   *       the table's parent schema, and <b>SELECT</b> on the table.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>MANAGE</b> and <b>SELECT</b> on the table.
   * </ol>
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>MANAGE</b> and
   *       <b>USE_SCHEMA</b> on the schema.
   * </ol>
   */
  Monitor createMonitor(CreateMonitorRequest createMonitorRequest);

  /**
   * Creates a refresh. Currently only supported for the {@code table} {@code object_type}. The call
   * must be made in the same workspace as where the monitor was created.
   *
   * <p>The caller must have either of the following sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>MANAGE</b> on the table.
   * </ol>
   */
  Refresh createRefresh(CreateRefreshRequest createRefreshRequest);

  /**
   * Delete a data quality monitor on Unity Catalog object.
   *
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions: <b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   * <b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b> on
   * the table's parent schema. <b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b>
   * on the table's parent schema, and <b>MANAGE</b> on the table.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>MANAGE</b> and
   *       <b>USE_SCHEMA</b> on the schema.
   * </ol>
   */
  void deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

  /** (Unimplemented) Delete a refresh */
  void deleteRefresh(DeleteRefreshRequest deleteRefreshRequest);

  /**
   * Read a data quality monitor on a Unity Catalog object.
   *
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>SELECT</b> on the table.
   * </ol>
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>USE_SCHEMA</b> on the schema.
   * </ol>
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
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>SELECT</b> on the table.
   * </ol>
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>USE_SCHEMA</b> on the schema.
   * </ol>
   */
  Refresh getRefresh(GetRefreshRequest getRefreshRequest);

  /** (Unimplemented) List data quality monitors. */
  ListMonitorResponse listMonitor(ListMonitorRequest listMonitorRequest);

  /**
   * List data quality monitor refreshes. The call must be made in the same workspace as where the
   * monitor was created.
   *
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>SELECT</b> on the table.
   * </ol>
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>USE_SCHEMA</b> on the schema.
   * </ol>
   */
  ListRefreshResponse listRefresh(ListRefreshRequest listRefreshRequest);

  /**
   * Update a data quality monitor on Unity Catalog object.
   *
   * <p>For the {@code table} {@code object_type}, the caller must have either of the following sets
   * of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the table's parent catalog.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, and <b>MANAGE</b> and <b>USE_SCHEMA</b>
   *       on the table's parent schema.
   *   <li><b>USE_CATALOG</b> on the table's parent catalog, <b>USE_SCHEMA</b> on the table's parent
   *       schema, and <b>MANAGE</b> on the table.
   * </ol>
   *
   * <p>For the {@code schema} {@code object_type}, the caller must have either of the following
   * sets of permissions:
   *
   * <ol>
   *   <li><b>MANAGE</b> and <b>USE_CATALOG</b> on the schema's parent catalog.
   *   <li><b>USE_CATALOG</b> on the schema's parent catalog, and <b>MANAGE</b> and
   *       <b>USE_SCHEMA</b> on the schema.
   * </ol>
   */
  Monitor updateMonitor(UpdateMonitorRequest updateMonitorRequest);

  /** (Unimplemented) Update a refresh */
  Refresh updateRefresh(UpdateRefreshRequest updateRefreshRequest);
}
