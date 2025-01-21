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
    return apiClient.execute("POST", path, request, Dashboard.class, headers);
  }

  @Override
  public void delete(DeleteDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Dashboard.class, headers);
  }

  @Override
  public ListResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListResponse.class, headers);
  }

  @Override
  public void restore(RestoreDashboardRequest request) {
    String path =
        String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("POST", path, null, RestoreResponse.class, headers);
  }

  @Override
  public Dashboard update(DashboardEditContent request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Dashboard.class, headers);
  }
}
