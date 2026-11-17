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
  /** Create a draft dashboard. */
  Dashboard create(CreateDashboardRequest createDashboardRequest);

  /**
   * Creates a schedule for a dashboard. The dashboard must be published before a schedule can be
   * created for it.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Schedule createSchedule(CreateScheduleRequest createScheduleRequest);

  /**
   * Create schedule subscription. Subscribes a workspace user or a notification destination to the
   * schedule, so that it receives a snapshot of the dashboard each time the schedule runs.
   * Subscribing yourself requires CAN VIEW permission on the dashboard; subscribing another user or
   * a notification destination requires CAN EDIT. On dashboards published without embedded
   * credentials, you can only subscribe yourself. If the subscriber is already subscribed to the
   * schedule, the existing subscription is returned.
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
   * Deletes a schedule together with all of its subscriptions.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

  /**
   * Delete schedule subscription. The subscriber receives no further snapshots from the schedule.
   * Deleting your own subscription requires CAN VIEW permission on the dashboard; deleting another
   * user's or a notification destination's subscription requires CAN EDIT.
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

  /** Get a draft dashboard. */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Get the current published dashboard. The request fails with NOT_FOUND if the dashboard has
   * never been published or has been unpublished.
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
   * List the dashboards that the caller can view. Each entry carries summary metadata only; use Get
   * dashboard to retrieve a dashboard's full definition.
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

  /** Publish the current draft dashboard. */
  PublishedDashboard publish(PublishRequest publishRequest);

  /**
   * Revert a dashboard's definition in draft mode to the last published version. The draft's
   * datasets, pages and widgets are replaced with those of the current published version, and the
   * updated draft is returned. The dashboard must have been published at least once; the published
   * version itself is not changed.
   */
  RevertDashboardResponse revert(RevertDashboardRequest revertDashboardRequest);

  /** Trash a dashboard. */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /**
   * Unpublish the dashboard. This deletes the published version, so viewers can no longer open it,
   * and pauses the dashboard's schedules. The draft is not changed; publish it again to make the
   * dashboard available to viewers.
   */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /** Update a draft dashboard. */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);

  /**
   * Updates a schedule. The request body replaces the stored schedule, so fields omitted from the
   * body are reset to their defaults.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  Schedule updateSchedule(UpdateScheduleRequest updateScheduleRequest);
}
