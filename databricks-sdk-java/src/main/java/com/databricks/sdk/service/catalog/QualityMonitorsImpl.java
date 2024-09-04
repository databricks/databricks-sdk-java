// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of QualityMonitors */
@Generated
class QualityMonitorsImpl implements QualityMonitorsService {
  private final ApiClient apiClient;

  public QualityMonitorsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancelRefresh(CancelRefreshRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/tables/%s/monitor/refreshes/%s/cancel",
            request.getTableName(), request.getRefreshId());
    Map<String, String> headers = new HashMap<>();
    apiClient.POST(path, null, CancelRefreshResponse.class, headers);
  }

  @Override
  public MonitorInfo create(CreateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, MonitorInfo.class, headers);
  }

  @Override
  public void delete(DeleteQualityMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public MonitorInfo get(GetQualityMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, MonitorInfo.class, headers);
  }

  @Override
  public MonitorRefreshInfo getRefresh(GetRefreshRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/tables/%s/monitor/refreshes/%s",
            request.getTableName(), request.getRefreshId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, MonitorRefreshInfo.class, headers);
  }

  @Override
  public MonitorRefreshListResponse listRefreshes(ListRefreshesRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, MonitorRefreshListResponse.class, headers);
  }

  @Override
  public RegenerateDashboardResponse regenerateDashboard(RegenerateDashboardRequest request) {
    String path =
        String.format(
            "/api/2.1/quality-monitoring/tables/%s/monitor/dashboard", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RegenerateDashboardResponse.class, headers);
  }

  @Override
  public MonitorRefreshInfo runRefresh(RunRefreshRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.POST(path, null, MonitorRefreshInfo.class, headers);
  }

  @Override
  public MonitorInfo update(UpdateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, MonitorInfo.class, headers);
  }
}
