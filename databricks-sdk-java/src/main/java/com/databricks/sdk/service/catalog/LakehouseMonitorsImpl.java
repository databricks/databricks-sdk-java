// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of LakehouseMonitors */
@Generated
class LakehouseMonitorsImpl implements LakehouseMonitorsService {
  private final ApiClient apiClient;

  public LakehouseMonitorsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CancelRefreshResponse cancelRefresh(CancelRefreshRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/tables/%s/monitor/refreshes/%s/cancel",
            request.getFullName(), request.getRefreshId());
    Map<String, String> headers = new HashMap<>();
    return apiClient.POST(path, null, CancelRefreshResponse.class, headers);
  }

  @Override
  public MonitorInfo create(CreateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, MonitorInfo.class, headers);
  }

  @Override
  public DeleteResponse delete(DeleteLakehouseMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    return apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public MonitorInfo get(GetLakehouseMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, MonitorInfo.class, headers);
  }

  @Override
  public MonitorRefreshInfo getRefresh(GetRefreshRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/tables/%s/monitor/refreshes/%s",
            request.getFullName(), request.getRefreshId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, MonitorRefreshInfo.class, headers);
  }

  @Override
  public Collection<MonitorRefreshInfo> listRefreshes(ListRefreshesRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getCollection(path, null, MonitorRefreshInfo.class, headers);
  }

  @Override
  public MonitorRefreshInfo runRefresh(RunRefreshRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.POST(path, null, MonitorRefreshInfo.class, headers);
  }

  @Override
  public MonitorInfo update(UpdateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, MonitorInfo.class, headers);
  }
}
