// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of DashboardWidgets */
@Generated
class DashboardWidgetsImpl implements DashboardWidgetsService {
  private final ApiClient apiClient;

  public DashboardWidgetsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Widget create(CreateWidget request) {
    String path = "/api/2.0/preview/sql/widgets";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Widget.class, headers);
  }

  @Override
  public void delete(DeleteDashboardWidgetRequest request) {
    String path = String.format("/api/2.0/preview/sql/widgets/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public Widget update(CreateWidget request) {
    String path = String.format("/api/2.0/preview/sql/widgets/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Widget.class, headers);
  }
}
