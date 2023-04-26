// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AlertsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AlertsAPI.class);

  private final AlertsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AlertsAPI(ApiClient apiClient) {
    impl = new AlertsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sql.AlertsService} object
   */
  public AlertsAPI(AlertsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param options a {@link com.databricks.sdk.service.sql.AlertOptions} object
   * @param queryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert create(String name, AlertOptions options, String queryId) {
    return create(new CreateAlert().setName(name).setOptions(options).setQueryId(queryId));
  }

  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   *
   * @param request a {@link com.databricks.sdk.service.sql.CreateAlert} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert create(CreateAlert request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param alertId a {@link java.lang.String} object
   */
  public void delete(String alertId) {
    delete(new DeleteAlertRequest().setAlertId(alertId));
  }

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note:**
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * @param request a {@link com.databricks.sdk.service.sql.DeleteAlertRequest} object
   */
  public void delete(DeleteAlertRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param alertId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert get(String alertId) {
    return get(new GetAlertRequest().setAlertId(alertId));
  }

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   *
   * @param request a {@link com.databricks.sdk.service.sql.GetAlertRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  public Alert get(GetAlertRequest request) {
    return impl.get(request);
  }

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Alert> list() {
    return impl.list();
  }

  /**
   * <p>update.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param options a {@link com.databricks.sdk.service.sql.AlertOptions} object
   * @param queryId a {@link java.lang.String} object
   * @param alertId a {@link java.lang.String} object
   */
  public void update(String name, AlertOptions options, String queryId, String alertId) {
    update(
        new EditAlert().setName(name).setOptions(options).setQueryId(queryId).setAlertId(alertId));
  }

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   *
   * @param request a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  public void update(EditAlert request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.AlertsService} object
   */
  public AlertsService impl() {
    return impl;
  }
}
