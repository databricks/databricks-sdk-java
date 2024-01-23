// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A monitor computes and monitors data or model quality metrics for a table over time. It generates
 * metrics tables and a dashboard that you can use to monitor table health and set alerts.
 *
 * <p>Most write operations require the user to be the owner of the table (or its parent schema or
 * parent catalog). Viewing the dashboard, computed metrics, or monitor configuration only requires
 * the user to have **SELECT** privileges on the table (along with **USE_SCHEMA** and
 * **USE_CATALOG**).
 */
@Generated
public class LakehouseMonitorsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakehouseMonitorsAPI.class);

  private final LakehouseMonitorsService impl;

  /** Regular-use constructor */
  public LakehouseMonitorsAPI(ApiClient apiClient) {
    impl = new LakehouseMonitorsImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakehouseMonitorsAPI(LakehouseMonitorsService mock) {
    impl = mock;
  }

  public MonitorInfo create(String fullName, String assetsDir, String outputSchemaName) {
    return create(
        new CreateMonitor()
            .setFullName(fullName)
            .setAssetsDir(assetsDir)
            .setOutputSchemaName(outputSchemaName));
  }

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
  public MonitorInfo create(CreateMonitor request) {
    return impl.create(request);
  }

  public void delete(String fullName) {
    delete(new DeleteLakehouseMonitorRequest().setFullName(fullName));
  }

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
  public void delete(DeleteLakehouseMonitorRequest request) {
    impl.delete(request);
  }

  public MonitorInfo get(String fullName) {
    return get(new GetLakehouseMonitorRequest().setFullName(fullName));
  }

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
  public MonitorInfo get(GetLakehouseMonitorRequest request) {
    return impl.get(request);
  }

  public MonitorInfo update(String fullName, String assetsDir, String outputSchemaName) {
    return update(
        new UpdateMonitor()
            .setFullName(fullName)
            .setAssetsDir(assetsDir)
            .setOutputSchemaName(outputSchemaName));
  }

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
  public MonitorInfo update(UpdateMonitor request) {
    return impl.update(request);
  }

  public LakehouseMonitorsService impl() {
    return impl;
  }
}
