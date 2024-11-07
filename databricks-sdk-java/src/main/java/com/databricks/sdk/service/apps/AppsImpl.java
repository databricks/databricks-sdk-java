// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

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
  public App create(CreateAppRequest request) {
    String path = "/api/2.0/apps";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getApp(), App.class, headers);
  }

  @Override
  public App delete(DeleteAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, App.class, headers);
  }

  @Override
  public AppDeployment deploy(CreateAppDeploymentRequest request) {
    String path = String.format("/api/2.0/apps/%s/deployments", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getAppDeployment(), AppDeployment.class, headers);
  }

  @Override
  public App get(GetAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, App.class, headers);
  }

  @Override
  public AppDeployment getDeployment(GetAppDeploymentRequest request) {
    String path =
        String.format(
            "/api/2.0/apps/%s/deployments/%s", request.getAppName(), request.getDeploymentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, AppDeployment.class, headers);
  }

  @Override
  public GetAppPermissionLevelsResponse getPermissionLevels(GetAppPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/apps/%s/permissionLevels", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetAppPermissionLevelsResponse.class, headers);
  }

  @Override
  public AppPermissions getPermissions(GetAppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, AppPermissions.class, headers);
  }

  @Override
  public ListAppsResponse list(ListAppsRequest request) {
    String path = "/api/2.0/apps";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAppsResponse.class, headers);
  }

  @Override
  public ListAppDeploymentsResponse listDeployments(ListAppDeploymentsRequest request) {
    String path = String.format("/api/2.0/apps/%s/deployments", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAppDeploymentsResponse.class, headers);
  }

  @Override
  public AppPermissions setPermissions(AppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, AppPermissions.class, headers);
  }

  @Override
  public App start(StartAppRequest request) {
    String path = String.format("/api/2.0/apps/%s/start", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, App.class, headers);
  }

  @Override
  public App stop(StopAppRequest request) {
    String path = String.format("/api/2.0/apps/%s/stop", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, App.class, headers);
  }

  @Override
  public App update(UpdateAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request.getApp(), App.class, headers);
  }

  @Override
  public AppPermissions updatePermissions(AppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, AppPermissions.class, headers);
  }
}
