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
  public void delete(DeleteAppRequest request) {
    String path = String.format("/api/2.0/preview/apps/instances/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void get(GetAppRequest request) {
    String path = String.format("/api/2.0/preview/apps/instances/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.GET(path, request, Void.class, headers);
  }
}
