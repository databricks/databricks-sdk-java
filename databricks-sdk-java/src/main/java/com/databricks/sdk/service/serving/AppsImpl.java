// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Apps */
@Generated
class AppsImpl implements AppsService {
  private final ApiClient apiClient;

  public AppsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeploymentStatus create(DeployAppRequest request) {
    String path = "/api/2.0/preview/apps/deployments";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeploymentStatus.class, headers);
  }

  @Override
  public DeleteAppResponse deleteApp(DeleteAppRequest request) {
    String path = String.format("/api/2.0/preview/apps/instances/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, DeleteAppResponse.class, headers);
  }

  @Override
  public GetAppResponse getApp(GetAppRequest request) {
    String path = String.format("/api/2.0/preview/apps/instances/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetAppResponse.class, headers);
  }

  @Override
  public DeploymentStatus getAppDeploymentStatus(GetAppDeploymentStatusRequest request) {
    String path = String.format("/api/2.0/preview/apps/deployments/%s", request.getDeploymentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, DeploymentStatus.class, headers);
  }

  @Override
  public ListAppsResponse getApps() {
    String path = "/api/2.0/preview/apps/instances";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListAppsResponse.class, headers);
  }

  @Override
  public ListAppEventsResponse getEvents(GetEventsRequest request) {
    String path = String.format("/api/2.0/preview/apps/%s/events", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAppEventsResponse.class, headers);
  }
}
