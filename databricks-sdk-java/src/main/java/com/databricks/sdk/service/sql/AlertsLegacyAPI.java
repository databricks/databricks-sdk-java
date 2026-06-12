// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the {@code sql_task} type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p><b>Warning</b>: This API is deprecated. Please see the latest version of the Databricks SQL
 * API. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
 */
@Generated
public class AlertsLegacyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AlertsLegacyAPI.class);

  private final AlertsLegacyService impl;

  /** Regular-use constructor */
  public AlertsLegacyAPI(ApiClient apiClient) {
    impl = new AlertsLegacyImpl(apiClient);
  }

  /** Constructor for mocks */
  public AlertsLegacyAPI(AlertsLegacyService mock) {
    impl = mock;
  }

  /**
   * Creates an alert. An alert is a Databricks SQL object that periodically runs a query, evaluates
   * a condition of its result, and notifies users or notification destinations if the condition was
   * met.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/create instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyAlert create(CreateAlert request) {
    return impl.create(request);
  }

  public void delete(String alertId) {
    delete(new DeleteAlertsLegacyRequest().setAlertId(alertId));
  }

  /**
   * Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. <b>Note</b>:
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/delete instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public void delete(DeleteAlertsLegacyRequest request) {
    impl.delete(request);
  }

  public LegacyAlert get(String alertId) {
    return get(new GetAlertsLegacyRequest().setAlertId(alertId));
  }

  /**
   * Gets an alert.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/get instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyAlert get(GetAlertsLegacyRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of alerts.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/list instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public Iterable<LegacyAlert> list() {
    return impl.list();
  }

  /**
   * Updates an alert.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/update instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public void update(EditAlert request) {
    impl.update(request);
  }

  public AlertsLegacyService impl() {
    return impl;
  }
}
