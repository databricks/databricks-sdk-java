// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether schedules or workload tasks for refreshing AI/BI Dashboards in the workspace can
 * send subscription emails containing PDFs and/or images of the dashboard. By default, this setting
 * is enabled (set to `true`)
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DashboardEmailSubscriptionsService {
  /** Reverts the Dashboard Email Subscriptions setting to its default value. */
  DeleteDashboardEmailSubscriptionsResponse delete(
      DeleteDashboardEmailSubscriptionsRequest deleteDashboardEmailSubscriptionsRequest);

  /** Gets the Dashboard Email Subscriptions setting. */
  DashboardEmailSubscriptions get(
      GetDashboardEmailSubscriptionsRequest getDashboardEmailSubscriptionsRequest);

  /** Updates the Dashboard Email Subscriptions setting. */
  DashboardEmailSubscriptions update(
      UpdateDashboardEmailSubscriptionsRequest updateDashboardEmailSubscriptionsRequest);
}
