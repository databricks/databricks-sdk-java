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
   * Create dashboard.
   *
   * <p>Create a draft dashboard.
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
   * Get dashboard.
   *
   * <p>Get a draft dashboard.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Get published dashboard.
   *
   * <p>Get the current published dashboard.
   */
  PublishedDashboard getPublished(GetPublishedDashboardRequest getPublishedDashboardRequest);

  /** Get dashboard schedule. */
  Schedule getSchedule(GetScheduleRequest getScheduleRequest);

  /** Get schedule subscription. */
  Subscription getSubscription(GetSubscriptionRequest getSubscriptionRequest);

  /** List dashboards. */
  ListDashboardsResponse list(ListDashboardsRequest listDashboardsRequest);

  /** List dashboard schedules. */
  ListSchedulesResponse listSchedules(ListSchedulesRequest listSchedulesRequest);

  /** List schedule subscriptions. */
  ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest);

  /**
   * Migrate dashboard.
   *
   * <p>Migrates a classic SQL dashboard to Lakeview.
   */
  Dashboard migrate(MigrateDashboardRequest migrateDashboardRequest);

  /**
   * Publish dashboard.
   *
   * <p>Publish the current draft dashboard.
   */
  PublishedDashboard publish(PublishRequest publishRequest);

  /**
   * Trash dashboard.
   *
   * <p>Trash a dashboard.
   */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /**
   * Unpublish dashboard.
   *
   * <p>Unpublish the dashboard.
   */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /**
   * Update dashboard.
   *
   * <p>Update a draft dashboard.
   */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);

  /** Update dashboard schedule. */
  Schedule updateSchedule(UpdateScheduleRequest updateScheduleRequest);
}
