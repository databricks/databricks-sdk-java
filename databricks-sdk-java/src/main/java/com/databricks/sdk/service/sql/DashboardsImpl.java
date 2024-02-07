// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Dashboards */
@Generated
class DashboardsImpl implements DashboardsService {
  private final ApiClient apiClient;

  public DashboardsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Dashboard create(DashboardPostContent request) {
    String path = "/api/2.0/preview/sql/dashboards";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Dashboard.class, headers);
  }

  @Override
  public void delete(DeleteDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Dashboard.class, headers);
  }

  @Override
  public ListResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListResponse.class, headers);
  }

  @Override
  public void restore(RestoreDashboardRequest request) {
    String path =
        String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.POST(path, null, Void.class, headers);
  }

  @Override
  public Dashboard update(DashboardEditContent request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Dashboard.class, headers);
  }
}
