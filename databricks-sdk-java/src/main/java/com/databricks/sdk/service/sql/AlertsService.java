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
   */
  Alert create(CreateAlert createAlert);

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note:**
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   */
  DeleteResponse delete(DeleteAlertRequest deleteAlertRequest);

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
  UpdateResponse update(EditAlert editAlert);
}
