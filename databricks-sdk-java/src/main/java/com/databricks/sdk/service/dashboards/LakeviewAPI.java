// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public Dashboard create(Dashboard dashboard) {
    return create(new CreateDashboardRequest().setDashboard(dashboard));
  }

  /**
   * Create dashboard.
   *
   * <p>Create a draft dashboard.
   */
  public Dashboard create(CreateDashboardRequest request) {
    return impl.create(request);
  }

  public Schedule createSchedule(String dashboardId, Schedule schedule) {
    return createSchedule(
        new CreateScheduleRequest().setDashboardId(dashboardId).setSchedule(schedule));
  }

  /** Create dashboard schedule. */
  public Schedule createSchedule(CreateScheduleRequest request) {
    return impl.createSchedule(request);
  }

  public Subscription createSubscription(
      String dashboardId, String scheduleId, Subscription subscription) {
    return createSubscription(
        new CreateSubscriptionRequest()
            .setDashboardId(dashboardId)
            .setScheduleId(scheduleId)
            .setSubscription(subscription));
  }

  /** Create schedule subscription. */
  public Subscription createSubscription(CreateSubscriptionRequest request) {
    return impl.createSubscription(request);
  }

  public void deleteSchedule(String dashboardId, String scheduleId) {
    deleteSchedule(
        new DeleteScheduleRequest().setDashboardId(dashboardId).setScheduleId(scheduleId));
  }

  /** Delete dashboard schedule. */
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

  /** Delete schedule subscription. */
  public void deleteSubscription(DeleteSubscriptionRequest request) {
    impl.deleteSubscription(request);
  }

  public Dashboard get(String dashboardId) {
    return get(new GetDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Get dashboard.
   *
   * <p>Get a draft dashboard.
   */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  public PublishedDashboard getPublished(String dashboardId) {
    return getPublished(new GetPublishedDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Get published dashboard.
   *
   * <p>Get the current published dashboard.
   */
  public PublishedDashboard getPublished(GetPublishedDashboardRequest request) {
    return impl.getPublished(request);
  }

  public Schedule getSchedule(String dashboardId, String scheduleId) {
    return getSchedule(
        new GetScheduleRequest().setDashboardId(dashboardId).setScheduleId(scheduleId));
  }

  /** Get dashboard schedule. */
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

  /** Get schedule subscription. */
  public Subscription getSubscription(GetSubscriptionRequest request) {
    return impl.getSubscription(request);
  }

  /** List dashboards. */
  public Iterable<Dashboard> list(ListDashboardsRequest request) {
    return new Paginator<>(
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

  /** List dashboard schedules. */
  public Iterable<Schedule> listSchedules(ListSchedulesRequest request) {
    return new Paginator<>(
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

  /** List schedule subscriptions. */
  public Iterable<Subscription> listSubscriptions(ListSubscriptionsRequest request) {
    return new Paginator<>(
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

  public Dashboard migrate(String sourceDashboardId) {
    return migrate(new MigrateDashboardRequest().setSourceDashboardId(sourceDashboardId));
  }

  /**
   * Migrate dashboard.
   *
   * <p>Migrates a classic SQL dashboard to Lakeview.
   */
  public Dashboard migrate(MigrateDashboardRequest request) {
    return impl.migrate(request);
  }

  public PublishedDashboard publish(String dashboardId) {
    return publish(new PublishRequest().setDashboardId(dashboardId));
  }

  /**
   * Publish dashboard.
   *
   * <p>Publish the current draft dashboard.
   */
  public PublishedDashboard publish(PublishRequest request) {
    return impl.publish(request);
  }

  public void trash(String dashboardId) {
    trash(new TrashDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Trash dashboard.
   *
   * <p>Trash a dashboard.
   */
  public void trash(TrashDashboardRequest request) {
    impl.trash(request);
  }

  public void unpublish(String dashboardId) {
    unpublish(new UnpublishDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Unpublish dashboard.
   *
   * <p>Unpublish the dashboard.
   */
  public void unpublish(UnpublishDashboardRequest request) {
    impl.unpublish(request);
  }

  public Dashboard update(String dashboardId, Dashboard dashboard) {
    return update(new UpdateDashboardRequest().setDashboardId(dashboardId).setDashboard(dashboard));
  }

  /**
   * Update dashboard.
   *
   * <p>Update a draft dashboard.
   */
  public Dashboard update(UpdateDashboardRequest request) {
    return impl.update(request);
  }

  public Schedule updateSchedule(String dashboardId, String scheduleId, Schedule schedule) {
    return updateSchedule(
        new UpdateScheduleRequest()
            .setDashboardId(dashboardId)
            .setScheduleId(scheduleId)
            .setSchedule(schedule));
  }

  /** Update dashboard schedule. */
  public Schedule updateSchedule(UpdateScheduleRequest request) {
    return impl.updateSchedule(request);
  }

  public LakeviewService impl() {
    return impl;
  }
}
