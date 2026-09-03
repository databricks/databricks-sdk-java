// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * These APIs provide specific management operations for Lakeview dashboards. Generic resource
 * management can be done with Workspace API (import, export, get-status, list, delete).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LakeviewService {
  /**
   * Create a draft dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  Dashboard create(CreateDashboardRequest createDashboardRequest);

  /** Create dashboard schedule. */
  Schedule createSchedule(CreateScheduleRequest createScheduleRequest);

  /** Create schedule subscription. */
  Subscription createSubscription(CreateSubscriptionRequest createSubscriptionRequest);

  /** Delete dashboard schedule. */
  void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

  /** Delete schedule subscription. */
  void deleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest);

  /**
   * Get a draft dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Get the current published dashboard.
   *
   * <p>The caller must be a workspace user with one of the following entitlements: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   */
  PublishedDashboard getPublished(GetPublishedDashboardRequest getPublishedDashboardRequest);

  /** Get dashboard schedule. */
  Schedule getSchedule(GetScheduleRequest getScheduleRequest);

  /** Get schedule subscription. */
  Subscription getSubscription(GetSubscriptionRequest getSubscriptionRequest);

  /**
   * List dashboards.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  ListDashboardsResponse list(ListDashboardsRequest listDashboardsRequest);

  /** List dashboard schedules. */
  ListSchedulesResponse listSchedules(ListSchedulesRequest listSchedulesRequest);

  /** List schedule subscriptions. */
  ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest);

  /**
   * Deprecated: Legacy dashboard migration is no longer supported. Use Lakeview (AI/BI) dashboards
   * instead.
   */
  Dashboard migrate(MigrateDashboardRequest migrateDashboardRequest);

  /**
   * Publish the current draft dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  PublishedDashboard publish(PublishRequest publishRequest);

  /**
   * Revert a dashboard's definition in draft mode to the last published version.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  RevertDashboardResponse revert(RevertDashboardRequest revertDashboardRequest);

  /**
   * Trash a dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /**
   * Unpublish the dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /**
   * Update a draft dashboard.
   *
   * <p>Requires the Databricks SQL access entitlement.
   */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);

  /** Update dashboard schedule. */
  Schedule updateSchedule(UpdateScheduleRequest updateScheduleRequest);
}
