// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
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
  public MonitorInfo create(CreateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, MonitorInfo.class, headers);
  }

  @Override
  public void delete(DeleteLakehouseMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public MonitorInfo get(GetLakehouseMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, MonitorInfo.class, headers);
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
