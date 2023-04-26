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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface AlertsService {
  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   *
   * @param createAlert a {@link com.databricks.sdk.service.sql.CreateAlert} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  Alert create(CreateAlert createAlert);

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note:**
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * @param deleteAlertRequest a {@link com.databricks.sdk.service.sql.DeleteAlertRequest} object
   */
  void delete(DeleteAlertRequest deleteAlertRequest);

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   *
   * @param getAlertRequest a {@link com.databricks.sdk.service.sql.GetAlertRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Alert} object
   */
  Alert get(GetAlertRequest getAlertRequest);

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<Alert> list();

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   *
   * @param editAlert a {@link com.databricks.sdk.service.sql.EditAlert} object
   */
  void update(EditAlert editAlert);
}
