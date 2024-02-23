// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * A monitor computes and monitors data or model quality metrics for a table over time. It generates
 * metrics tables and a dashboard that you can use to monitor table health and set alerts.
 *
 * <p>Most write operations require the user to be the owner of the table (or its parent schema or
 * parent catalog). Viewing the dashboard, computed metrics, or monitor configuration only requires
 * the user to have **SELECT** privileges on the table (along with **USE_SCHEMA** and
 * **USE_CATALOG**).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LakehouseMonitorsService {
  /**
   * Cancel refresh.
   *
   * <p>Cancel an active monitor refresh for the given refresh ID.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  void cancelRefresh(CancelRefreshRequest cancelRefreshRequest);

  /**
   * Create a table monitor.
   *
   * <p>Creates a new monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog, have **USE_SCHEMA** on
   * the table's parent schema, and have **SELECT** access on the table 2. have **USE_CATALOG** on
   * the table's parent catalog, be an owner of the table's parent schema, and have **SELECT**
   * access on the table. 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - be an owner of the table.
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   */
  MonitorInfo create(CreateMonitor createMonitor);

  /**
   * Delete a table monitor.
   *
   * <p>Deletes a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   */
  void delete(DeleteLakehouseMonitorRequest deleteLakehouseMonitorRequest);

  /**
   * Get a table monitor.
   *
   * <p>Gets a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema. 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>The returned information includes configuration values, as well as information on assets
   * created by the monitor. Some information (e.g., dashboard) may be filtered out if the caller is
   * in a different workspace than where the monitor was created.
   */
  MonitorInfo get(GetLakehouseMonitorRequest getLakehouseMonitorRequest);

  /**
   * Get refresh.
   *
   * <p>Gets info about a specific monitor refresh using the given refresh ID.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  MonitorRefreshInfo getRefresh(GetRefreshRequest getRefreshRequest);

  /**
   * List refreshes.
   *
   * <p>Gets an array containing the history of the most recent refreshes (up to 25) for this table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  Collection<MonitorRefreshInfo> listRefreshes(ListRefreshesRequest listRefreshesRequest);

  /**
   * Queue a metric refresh for a monitor.
   *
   * <p>Queues a metric refresh on the monitor for the specified table. The refresh will execute in
   * the background.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  MonitorRefreshInfo runRefresh(RunRefreshRequest runRefreshRequest);

  /**
   * Update a table monitor.
   *
   * <p>Updates a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created, and
   * the caller must be the original creator of the monitor.
   *
   * <p>Certain configuration fields, such as output asset identifiers, cannot be updated.
   */
  MonitorInfo update(UpdateMonitor updateMonitor);
}
