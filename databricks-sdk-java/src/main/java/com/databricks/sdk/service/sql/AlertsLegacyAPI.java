// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
 * version. [Learn more]
 *
 * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
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

  public LegacyAlert create(String name, AlertOptions options, String queryId) {
    return create(new CreateAlert().setName(name).setOptions(options).setQueryId(queryId));
  }

  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/create instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public LegacyAlert create(CreateAlert request) {
    return impl.create(request);
  }

  public void delete(String alertId) {
    delete(new DeleteAlertsLegacyRequest().setAlertId(alertId));
  }

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note**:
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/delete instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public void delete(DeleteAlertsLegacyRequest request) {
    impl.delete(request);
  }

  public LegacyAlert get(String alertId) {
    return get(new GetAlertsLegacyRequest().setAlertId(alertId));
  }

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/get instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public LegacyAlert get(GetAlertsLegacyRequest request) {
    return impl.get(request);
  }

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/list instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public Iterable<LegacyAlert> list() {
    return impl.list();
  }

  public void update(String alertId, String name, AlertOptions options, String queryId) {
    update(
        new EditAlert().setAlertId(alertId).setName(name).setOptions(options).setQueryId(queryId));
  }

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/update instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public void update(EditAlert request) {
    impl.update(request);
  }

  public AlertsLegacyService impl() {
    return impl;
  }
}
