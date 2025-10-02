// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Manage the data quality of Unity Catalog objects (currently support `schema` and `table`) */
@Generated
public class DataQualityAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DataQualityAPI.class);

  private final DataQualityService impl;

  /** Regular-use constructor */
  public DataQualityAPI(ApiClient apiClient) {
    impl = new DataQualityImpl(apiClient);
  }

  /** Constructor for mocks */
  public DataQualityAPI(DataQualityService mock) {
    impl = mock;
  }

  /**
   * Cancels a data quality monitor refresh. Currently only supported for the `table` `object_type`.
   */
  public CancelRefreshResponse cancelRefresh(CancelRefreshRequest request) {
    return impl.cancelRefresh(request);
  }

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
  public Monitor createMonitor(CreateMonitorRequest request) {
    return impl.createMonitor(request);
  }

  /**
   * Creates a refresh. Currently only supported for the `table` `object_type`.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   */
  public Refresh createRefresh(CreateRefreshRequest request) {
    return impl.createRefresh(request);
  }

  public void deleteMonitor(String objectType, String objectId) {
    deleteMonitor(new DeleteMonitorRequest().setObjectType(objectType).setObjectId(objectId));
  }

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
  public void deleteMonitor(DeleteMonitorRequest request) {
    impl.deleteMonitor(request);
  }

  public void deleteRefresh(String objectType, String objectId, long refreshId) {
    deleteRefresh(
        new DeleteRefreshRequest()
            .setObjectType(objectType)
            .setObjectId(objectId)
            .setRefreshId(refreshId));
  }

  /** (Unimplemented) Delete a refresh */
  public void deleteRefresh(DeleteRefreshRequest request) {
    impl.deleteRefresh(request);
  }

  public Monitor getMonitor(String objectType, String objectId) {
    return getMonitor(new GetMonitorRequest().setObjectType(objectType).setObjectId(objectId));
  }

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
  public Monitor getMonitor(GetMonitorRequest request) {
    return impl.getMonitor(request);
  }

  public Refresh getRefresh(String objectType, String objectId, long refreshId) {
    return getRefresh(
        new GetRefreshRequest()
            .setObjectType(objectType)
            .setObjectId(objectId)
            .setRefreshId(refreshId));
  }

  /**
   * Get data quality monitor refresh.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - **SELECT** privilege on the table.
   */
  public Refresh getRefresh(GetRefreshRequest request) {
    return impl.getRefresh(request);
  }

  /** (Unimplemented) List data quality monitors. */
  public Iterable<Monitor> listMonitor(ListMonitorRequest request) {
    return new Paginator<>(
        request,
        impl::listMonitor,
        ListMonitorResponse::getMonitors,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Refresh> listRefresh(String objectType, String objectId) {
    return listRefresh(new ListRefreshRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * List data quality monitor refreshes.
   *
   * <p>For the `table` `object_type`, the caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - **SELECT** privilege on the table.
   */
  public Iterable<Refresh> listRefresh(ListRefreshRequest request) {
    return new Paginator<>(
        request,
        impl::listRefresh,
        ListRefreshResponse::getRefreshes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Update a data quality monitor on Unity Catalog object.
   *
   * <p>For the `table` `object_type`, The caller must either: 1. be an owner of the table's parent
   * catalog 2. have **USE_CATALOG** on the table's parent catalog and be an owner of the table's
   * parent schema 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - be an owner of the table.
   */
  public Monitor updateMonitor(UpdateMonitorRequest request) {
    return impl.updateMonitor(request);
  }

  /** (Unimplemented) Update a refresh */
  public Refresh updateRefresh(UpdateRefreshRequest request) {
    return impl.updateRefresh(request);
  }

  public DataQualityService impl() {
    return impl;
  }
}
