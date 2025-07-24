// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether schedules or workload tasks for refreshing AI/BI Dashboards in the workspace can
 * send subscription emails containing PDFs and/or images of the dashboard. By default, this setting
 * is enabled (set to `true`)
 */
@Generated
public class DashboardEmailSubscriptionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DashboardEmailSubscriptionsAPI.class);

  private final DashboardEmailSubscriptionsService impl;

  /** Regular-use constructor */
  public DashboardEmailSubscriptionsAPI(ApiClient apiClient) {
    impl = new DashboardEmailSubscriptionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DashboardEmailSubscriptionsAPI(DashboardEmailSubscriptionsService mock) {
    impl = mock;
  }

  /** Reverts the Dashboard Email Subscriptions setting to its default value. */
  public DeleteDashboardEmailSubscriptionsResponse delete(
      DeleteDashboardEmailSubscriptionsRequest request) {
    return impl.delete(request);
  }

  /** Gets the Dashboard Email Subscriptions setting. */
  public DashboardEmailSubscriptions get(GetDashboardEmailSubscriptionsRequest request) {
    return impl.get(request);
  }

  /** Updates the Dashboard Email Subscriptions setting. */
  public DashboardEmailSubscriptions update(UpdateDashboardEmailSubscriptionsRequest request) {
    return impl.update(request);
  }

  public DashboardEmailSubscriptionsService impl() {
    return impl;
  }
}
