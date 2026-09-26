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
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Dashboard create(CreateDashboardRequest createDashboardRequest);

  /**
   * Create dashboard schedule.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Schedule createSchedule(CreateScheduleRequest createScheduleRequest);

  /**
   * Create schedule subscription.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  Subscription createSubscription(CreateSubscriptionRequest createSubscriptionRequest);

  /**
   * Delete dashboard schedule.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

  /**
   * Delete schedule subscription.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  void deleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest);

  /**
   * Get a draft dashboard.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
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

  /**
   * Get dashboard schedule.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  Schedule getSchedule(GetScheduleRequest getScheduleRequest);

  /**
   * Get schedule subscription.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  Subscription getSubscription(GetSubscriptionRequest getSubscriptionRequest);

  /**
   * List dashboards.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  ListDashboardsResponse list(ListDashboardsRequest listDashboardsRequest);

  /**
   * List dashboard schedules.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  ListSchedulesResponse listSchedules(ListSchedulesRequest listSchedulesRequest);

  /**
   * List schedule subscriptions.
   *
   * <p>The caller must be a workspace user with one of the following [entitlements]: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[entitlements]: https://docs.databricks.com/security/auth/entitlements
   */
  ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest);

  /**
   * Deprecated: Legacy dashboard migration is no longer supported. Use Lakeview (AI/BI) dashboards
   * instead.
   */
  Dashboard migrate(MigrateDashboardRequest migrateDashboardRequest);

  /**
   * Publish the current draft dashboard.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  PublishedDashboard publish(PublishRequest publishRequest);

  /**
   * Revert a dashboard's definition in draft mode to the last published version.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  RevertDashboardResponse revert(RevertDashboardRequest revertDashboardRequest);

  /**
   * Trash a dashboard.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /**
   * Unpublish the dashboard.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /**
   * Update a draft dashboard.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);

  /**
   * Update dashboard schedule.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Schedule updateSchedule(UpdateScheduleRequest updateScheduleRequest);
}
