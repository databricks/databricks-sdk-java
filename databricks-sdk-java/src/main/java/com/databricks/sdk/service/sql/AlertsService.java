// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
 *
 * <p>[Learn more]:
 * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AlertsService {
  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   *
   * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
   *
   * <p>[Learn more]:
   * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
   */
  Alert create(CreateAlert createAlert);

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note**:
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
   *
   * <p>[Learn more]:
   * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
   */
  void delete(DeleteAlertRequest deleteAlertRequest);

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
   *
   * <p>[Learn more]:
   * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
   */
  Alert get(GetAlertRequest getAlertRequest);

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   *
   * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
   *
   * <p>[Learn more]:
   * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
   */
  Collection<Alert> list();

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API will soon be available. [Learn more]
   *
   * <p>[Learn more]:
   * https://docs.databricks.com/en/whats-coming.html#updates-to-the-databricks-sql-api-for-managing-queries-alerts-and-data-sources
   */
  void update(EditAlert editAlert);
}
