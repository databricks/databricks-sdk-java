// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Deprecated: Please use the Data Quality Monitors API instead (REST:
 * /api/data-quality/v1/monitors), which manages both Data Profiling and Anomaly Detection.
 *
 * <p>A monitor computes and monitors data or model quality metrics for a table over time. It
 * generates metrics tables and a dashboard that you can use to monitor table health and set alerts.
 * Most write operations require the user to be the owner of the table (or its parent schema or
 * parent catalog). Viewing the dashboard, computed metrics, or monitor configuration only requires
 * the user to have <b>SELECT</b> privileges on the table (along with <b>USE_SCHEMA</b> and
 * <b>USE_CATALOG</b>).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QualityMonitorsService {
  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Cancels an
   * already-initiated refresh job.
   */
  void cancelRefresh(CancelRefreshRequest cancelRefreshRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Creates a
   * new monitor for the specified table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog, have <b>USE_SCHEMA</b> on the table's parent
   *       schema, and have <b>SELECT</b> access on the table
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog, be an owner of the table's parent
   *       schema, and have <b>SELECT</b> access on the table.
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li>be an owner of the table.
   * </ul>
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   */
  MonitorInfo create(CreateMonitor createMonitor);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Deletes a
   * monitor for the specified table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li>be an owner of the table.
   * </ul>
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   */
  DeleteMonitorResponse delete(DeleteQualityMonitorRequest deleteQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Gets a
   * monitor for the specified table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema.
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li><b>SELECT</b> privilege on the table.
   * </ul>
   *
   * <p>The returned information includes configuration values, as well as information on assets
   * created by the monitor. Some information (e.g., dashboard) may be filtered out if the caller is
   * in a different workspace than where the monitor was created.
   */
  MonitorInfo get(GetQualityMonitorRequest getQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Gets info
   * about a specific monitor refresh using the given refresh ID.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li><b>SELECT</b> privilege on the table.
   * </ul>
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  MonitorRefreshInfo getRefresh(GetRefreshRequest getRefreshRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Gets an
   * array containing the history of the most recent refreshes (up to 25) for this table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li><b>SELECT</b> privilege on the table.
   * </ul>
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  MonitorRefreshListResponse listRefreshes(ListRefreshesRequest listRefreshesRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Regenerates
   * the monitoring dashboard for the specified table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li>be an owner of the table
   * </ul>
   *
   * <p>The call must be made from the workspace where the monitor was created. The dashboard will
   * be regenerated in the assets directory that was specified when the monitor was created.
   */
  RegenerateDashboardResponse regenerateDashboard(
      RegenerateDashboardRequest regenerateDashboardRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Queues a
   * metric refresh on the monitor for the specified table. The refresh will execute in the
   * background.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li>be an owner of the table
   * </ul>
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  MonitorRefreshInfo runRefresh(RunRefreshRequest runRefreshRequest);

  /**
   * Deprecated: Use Data Quality Monitors API instead (/api/data-quality/v1/monitors). Updates a
   * monitor for the specified table.
   *
   * <p>The caller must either:
   *
   * <ol>
   *   <li>be an owner of the table's parent catalog
   *   <li>have <b>USE_CATALOG</b> on the table's parent catalog and be an owner of the table's
   *       parent schema
   *   <li>have the following permissions:
   * </ol>
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the table's parent catalog
   *   <li><b>USE_SCHEMA</b> on the table's parent schema
   *   <li>be an owner of the table.
   * </ul>
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created, and
   * the caller must be the original creator of the monitor.
   *
   * <p>Certain configuration fields, such as output asset identifiers, cannot be updated.
   */
  MonitorInfo update(UpdateMonitor updateMonitor);
}
