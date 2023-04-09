// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.util.Collection;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface AlertsService {
  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   */
  Alert create(CreateAlert createAlert);

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note:**
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   */
  void delete(DeleteAlertRequest deleteAlertRequest);

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   */
  Alert get(GetAlertRequest getAlertRequest);

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   */
  Collection<Alert> list();

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   */
  void update(EditAlert editAlert);
}
