// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

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
  /** Creates an alert. */
  Alert create(CreateAlertRequest createAlertRequest);

  /**
   * Moves an alert to the trash. Trashed alerts immediately disappear from searches and list views,
   * and can no longer trigger. You can restore a trashed alert through the UI. A trashed alert is
   * permanently deleted after 30 days.
   */
  void delete(TrashAlertRequest trashAlertRequest);

  /** Gets an alert. */
  Alert get(GetAlertRequest getAlertRequest);

  /**
   * Gets a list of alerts accessible to the user, ordered by creation time. **Warning:** Calling
   * this API concurrently 10 or more times could result in throttling, service degradation, or a
   * temporary ban.
   */
  ListAlertsResponse list(ListAlertsRequest listAlertsRequest);

  /** Updates an alert. */
  Alert update(UpdateAlertRequest updateAlertRequest);
}
