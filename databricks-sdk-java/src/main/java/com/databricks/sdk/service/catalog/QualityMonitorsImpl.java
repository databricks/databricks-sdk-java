// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      apiClient.execute(req, CancelRefreshResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorInfo create(CreateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, MonitorInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteQualityMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorInfo get(GetQualityMonitorRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, MonitorInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorRefreshInfo getRefresh(GetRefreshRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/tables/%s/monitor/refreshes/%s",
            request.getTableName(), request.getRefreshId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, MonitorRefreshInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorRefreshListResponse listRefreshes(ListRefreshesRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getTableName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, MonitorRefreshListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RegenerateDashboardResponse regenerateDashboard(RegenerateDashboardRequest request) {
    String path =
        String.format(
            "/api/2.1/quality-monitoring/tables/%s/monitor/dashboard", request.getTableName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, RegenerateDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorRefreshInfo runRefresh(RunRefreshRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/tables/%s/monitor/refreshes", request.getTableName());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, MonitorRefreshInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MonitorInfo update(UpdateMonitor request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/monitor", request.getTableName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, MonitorInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
