// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * These APIs provide specific management operations for Lakeview dashboards. Generic resource
 * management can be done with Workspace API (import, export, get-status, list, delete).
 */
@Generated
public class LakeviewAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakeviewAPI.class);

  private final LakeviewService impl;

  /** Regular-use constructor */
  public LakeviewAPI(ApiClient apiClient) {
    impl = new LakeviewImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakeviewAPI(LakeviewService mock) {
    impl = mock;
  }

  /** Create a draft dashboard. */
  public Dashboard create(CreateDashboardRequest request) {
    return impl.create(request);
  }

  /**
   * Creates a schedule for a dashboard. The dashboard must be published before a schedule can be
   * created for it.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  public Schedule createSchedule(CreateScheduleRequest request) {
    return impl.createSchedule(request);
  }

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
  public Subscription createSubscription(CreateSubscriptionRequest request) {
    return impl.createSubscription(request);
  }

  public void deleteSchedule(String dashboardId, String scheduleId) {
    deleteSchedule(
        new DeleteScheduleRequest().setDashboardId(dashboardId).setScheduleId(scheduleId));
  }

  /**
   * Deletes a schedule together with all of its subscriptions.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  public void deleteSchedule(DeleteScheduleRequest request) {
    impl.deleteSchedule(request);
  }

  public void deleteSubscription(String dashboardId, String scheduleId, String subscriptionId) {
    deleteSubscription(
        new DeleteSubscriptionRequest()
            .setDashboardId(dashboardId)
            .setScheduleId(scheduleId)
            .setSubscriptionId(subscriptionId));
  }

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
  public void deleteSubscription(DeleteSubscriptionRequest request) {
    impl.deleteSubscription(request);
  }

  public Dashboard get(String dashboardId) {
    return get(new GetDashboardRequest().setDashboardId(dashboardId));
  }

  /** Get a draft dashboard. */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  public PublishedDashboard getPublished(String dashboardId) {
    return getPublished(new GetPublishedDashboardRequest().setDashboardId(dashboardId));
  }

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
  public PublishedDashboard getPublished(GetPublishedDashboardRequest request) {
    return impl.getPublished(request);
  }

  public Schedule getSchedule(String dashboardId, String scheduleId) {
    return getSchedule(
        new GetScheduleRequest().setDashboardId(dashboardId).setScheduleId(scheduleId));
  }

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
  public Schedule getSchedule(GetScheduleRequest request) {
    return impl.getSchedule(request);
  }

  public Subscription getSubscription(
      String dashboardId, String scheduleId, String subscriptionId) {
    return getSubscription(
        new GetSubscriptionRequest()
            .setDashboardId(dashboardId)
            .setScheduleId(scheduleId)
            .setSubscriptionId(subscriptionId));
  }

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
  public Subscription getSubscription(GetSubscriptionRequest request) {
    return impl.getSubscription(request);
  }

  /**
   * List the dashboards that the caller can view. Each entry carries summary metadata only; use Get
   * dashboard to retrieve a dashboard's full definition.
   */
  public Iterable<Dashboard> list(ListDashboardsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListDashboardsResponse::getDashboards,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Schedule> listSchedules(String dashboardId) {
    return listSchedules(new ListSchedulesRequest().setDashboardId(dashboardId));
  }

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
  public Iterable<Schedule> listSchedules(ListSchedulesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSchedules,
        ListSchedulesResponse::getSchedules,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Subscription> listSubscriptions(String dashboardId, String scheduleId) {
    return listSubscriptions(
        new ListSubscriptionsRequest().setDashboardId(dashboardId).setScheduleId(scheduleId));
  }

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
  public Iterable<Subscription> listSubscriptions(ListSubscriptionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSubscriptions,
        ListSubscriptionsResponse::getSubscriptions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Deprecated: Legacy dashboard migration is no longer supported. Use Lakeview (AI/BI) dashboards
   * instead.
   */
  public Dashboard migrate(MigrateDashboardRequest request) {
    return impl.migrate(request);
  }

  /** Publish the current draft dashboard. */
  public PublishedDashboard publish(PublishRequest request) {
    return impl.publish(request);
  }

  /**
   * Revert a dashboard's definition in draft mode to the last published version. The draft's
   * datasets, pages and widgets are replaced with those of the current published version, and the
   * updated draft is returned. The dashboard must have been published at least once; the published
   * version itself is not changed.
   */
  public RevertDashboardResponse revert(RevertDashboardRequest request) {
    return impl.revert(request);
  }

  public void trash(String dashboardId) {
    trash(new TrashDashboardRequest().setDashboardId(dashboardId));
  }

  /** Trash a dashboard. */
  public void trash(TrashDashboardRequest request) {
    impl.trash(request);
  }

  public void unpublish(String dashboardId) {
    unpublish(new UnpublishDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Unpublish the dashboard. This deletes the published version, so viewers can no longer open it,
   * and pauses the dashboard's schedules. The draft is not changed; publish it again to make the
   * dashboard available to viewers.
   */
  public void unpublish(UnpublishDashboardRequest request) {
    impl.unpublish(request);
  }

  /** Update a draft dashboard. */
  public Dashboard update(UpdateDashboardRequest request) {
    return impl.update(request);
  }

  /**
   * Updates a schedule. The request body replaces the stored schedule, so fields omitted from the
   * body are reset to their defaults.
   *
   * <p>Requires the [Databricks SQL access] entitlement. Grant Databricks SQL access in addition to
   * Workspace access.
   *
   * <p>[Databricks SQL access]: https://docs.databricks.com/security/auth/entitlements
   */
  public Schedule updateSchedule(UpdateScheduleRequest request) {
    return impl.updateSchedule(request);
  }

  public LakeviewService impl() {
    return impl;
  }
}
