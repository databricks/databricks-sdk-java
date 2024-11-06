// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Lakeview */
@Generated
class LakeviewImpl implements LakeviewService {
  private final ApiClient apiClient;

  public LakeviewImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Dashboard create(CreateDashboardRequest request) {
    String path = "/api/2.0/lakeview/dashboards";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getDashboard(), Dashboard.class, headers);
  }

  @Override
  public Schedule createSchedule(CreateScheduleRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/schedules", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getSchedule(), Schedule.class, headers);
  }

  @Override
  public Subscription createSubscription(CreateSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions",
            request.getDashboardId(), request.getScheduleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getSubscription(), Subscription.class, headers);
  }

  @Override
  public void deleteSchedule(DeleteScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteScheduleResponse.class, headers);
  }

  @Override
  public void deleteSubscription(DeleteSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions/%s",
            request.getDashboardId(), request.getScheduleId(), request.getSubscriptionId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteSubscriptionResponse.class, headers);
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Dashboard.class, headers);
  }

  @Override
  public PublishedDashboard getPublished(GetPublishedDashboardRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, PublishedDashboard.class, headers);
  }

  @Override
  public Schedule getSchedule(GetScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Schedule.class, headers);
  }

  @Override
  public Subscription getSubscription(GetSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions/%s",
            request.getDashboardId(), request.getScheduleId(), request.getSubscriptionId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Subscription.class, headers);
  }

  @Override
  public ListDashboardsResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/lakeview/dashboards";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListDashboardsResponse.class, headers);
  }

  @Override
  public ListSchedulesResponse listSchedules(ListSchedulesRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/schedules", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListSchedulesResponse.class, headers);
  }

  @Override
  public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions",
            request.getDashboardId(), request.getScheduleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListSubscriptionsResponse.class, headers);
  }

  @Override
  public Dashboard migrate(MigrateDashboardRequest request) {
    String path = "/api/2.0/lakeview/dashboards/migrate";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Dashboard.class, headers);
  }

  @Override
  public PublishedDashboard publish(PublishRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, PublishedDashboard.class, headers);
  }

  @Override
  public void trash(TrashDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, TrashDashboardResponse.class, headers);
  }

  @Override
  public void unpublish(UnpublishDashboardRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, UnpublishDashboardResponse.class, headers);
  }

  @Override
  public Dashboard update(UpdateDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request.getDashboard(), Dashboard.class, headers);
  }

  @Override
  public Schedule updateSchedule(UpdateScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request.getSchedule(), Schedule.class, headers);
  }
}
