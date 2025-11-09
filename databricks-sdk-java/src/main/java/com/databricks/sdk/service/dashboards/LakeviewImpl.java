// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDashboard()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Schedule createSchedule(CreateScheduleRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/schedules", request.getDashboardId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getSchedule()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Schedule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Subscription createSubscription(CreateSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions",
            request.getDashboardId(), request.getScheduleId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getSubscription()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Subscription.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteSchedule(DeleteScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteSubscription(DeleteSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions/%s",
            request.getDashboardId(), request.getScheduleId(), request.getSubscriptionId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PublishedDashboard getPublished(GetPublishedDashboardRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PublishedDashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Schedule getSchedule(GetScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Schedule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Subscription getSubscription(GetSubscriptionRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions/%s",
            request.getDashboardId(), request.getScheduleId(), request.getSubscriptionId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Subscription.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDashboardsResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/lakeview/dashboards";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDashboardsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSchedulesResponse listSchedules(ListSchedulesRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/schedules", request.getDashboardId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListSchedulesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s/subscriptions",
            request.getDashboardId(), request.getScheduleId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListSubscriptionsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Dashboard migrate(MigrateDashboardRequest request) {
    String path = "/api/2.0/lakeview/dashboards/migrate";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PublishedDashboard publish(PublishRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PublishedDashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void trash(TrashDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void unpublish(UnpublishDashboardRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Dashboard update(UpdateDashboardRequest request) {
    String path = String.format("/api/2.0/lakeview/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDashboard()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Schedule updateSchedule(UpdateScheduleRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/schedules/%s",
            request.getDashboardId(), request.getScheduleId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request.getSchedule()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Schedule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
