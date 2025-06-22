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

  Schedule createSchedule(CreateScheduleRequest createScheduleRequest);

  Subscription createSubscription(CreateSubscriptionRequest createSubscriptionRequest);

  void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

  void deleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest);

  /** Get a draft dashboard. */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /** Get the current published dashboard. */
  PublishedDashboard getPublished(GetPublishedDashboardRequest getPublishedDashboardRequest);

  Schedule getSchedule(GetScheduleRequest getScheduleRequest);

  Subscription getSubscription(GetSubscriptionRequest getSubscriptionRequest);

  ListDashboardsResponse list(ListDashboardsRequest listDashboardsRequest);

  ListSchedulesResponse listSchedules(ListSchedulesRequest listSchedulesRequest);

  ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest);

  /** Migrates a classic SQL dashboard to Lakeview. */
  Dashboard migrate(MigrateDashboardRequest migrateDashboardRequest);

  /** Publish the current draft dashboard. */
  PublishedDashboard publish(PublishRequest publishRequest);

  /** Trash a dashboard. */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /** Unpublish the dashboard. */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /** Update a draft dashboard. */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);

  Schedule updateSchedule(UpdateScheduleRequest updateScheduleRequest);
}
