// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * New version of SQL Alerts
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AlertsV2Service {
  /**
   * Creates an alert that runs `query_text` on the given schedule and evaluates the result against
   * the configured condition.
   */
  AlertV2 createAlert(CreateAlertV2Request createAlertV2Request);

  /** Gets an alert. */
  AlertV2 getAlert(GetAlertV2Request getAlertV2Request);

  /** Gets a list of alerts accessible to the user, ordered by creation time. */
  ListAlertsV2Response listAlerts(ListAlertsV2Request listAlertsV2Request);

  /**
   * Moves an alert to the trash. Trashed alerts immediately disappear from list views, and can no
   * longer trigger. You can restore a trashed alert through the UI. A trashed alert is permanently
   * deleted after 30 days.
   */
  void trashAlert(TrashAlertV2Request trashAlertV2Request);

  /**
   * Updates an alert. Only the fields listed in `update_mask` are changed; all other fields keep
   * their current values.
   */
  AlertV2 updateAlert(UpdateAlertV2Request updateAlertV2Request);
}
