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
   * The call must be made in the same workspace as where the monitor was created.
   *
   * <p>The caller must have either of the following sets of permissions: 1. **MANAGE** and
   * **USE_CATALOG** on the table's parent catalog. 2. **USE_CATALOG** on the table's parent
   * catalog, and **MANAGE** and **USE_SCHEMA** on the table's parent schema. 3. **USE_CATALOG** on
   * the table's parent catalog, **USE_SCHEMA** on the table's parent schema, and **MANAGE** on the
   * table.
   */
  public CancelRefreshResponse cancelRefresh(CancelRefreshRequest request) {
    return impl.cancelRefresh(request);
  }

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
  public Monitor createMonitor(CreateMonitorRequest request) {
    return impl.createMonitor(request);
  }

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
  public Refresh createRefresh(CreateRefreshRequest request) {
    return impl.createRefresh(request);
  }

  public void deleteMonitor(String objectType, String objectId) {
    deleteMonitor(new DeleteMonitorRequest().setObjectType(objectType).setObjectId(objectId));
  }

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
