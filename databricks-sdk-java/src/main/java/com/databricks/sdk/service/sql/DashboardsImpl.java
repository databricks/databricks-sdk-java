// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of Dashboards */
@Generated
class DashboardsImpl implements DashboardsService {
  private final ApiClient apiClient;

  public DashboardsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Dashboard create(CreateDashboardRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    return apiClient.POST(path, request, Dashboard.class);
  }

  @Override
  public void delete(DeleteDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    return apiClient.GET(path, request, Dashboard.class);
  }

  @Override
  public ListResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    return apiClient.GET(path, request, ListResponse.class);
  }

  @Override
  public void restore(RestoreDashboardRequest request) {
    String path =
        String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
    apiClient.POST(path, request, Void.class);
  }
}
