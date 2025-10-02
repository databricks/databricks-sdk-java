// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DataQuality */
@Generated
class DataQualityImpl implements DataQualityService {
  private final ApiClient apiClient;

  public DataQualityImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CancelRefreshResponse cancelRefresh(CancelRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes/%s/cancel",
            request.getObjectType(), request.getObjectId(), request.getRefreshId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CancelRefreshResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Monitor createMonitor(CreateMonitorRequest request) {
    String path = "/api/data-quality/v1/monitors";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getMonitor()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Monitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Refresh createRefresh(CreateRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes",
            request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getRefresh()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Refresh.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteMonitor(DeleteMonitorRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteRefresh(DeleteRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes/%s",
            request.getObjectType(), request.getObjectId(), request.getRefreshId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Monitor getMonitor(GetMonitorRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Monitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Refresh getRefresh(GetRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes/%s",
            request.getObjectType(), request.getObjectId(), request.getRefreshId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Refresh.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListMonitorResponse listMonitor(ListMonitorRequest request) {
    String path = "/api/data-quality/v1/monitors";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListMonitorResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListRefreshResponse listRefresh(ListRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes",
            request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListRefreshResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Monitor updateMonitor(UpdateMonitorRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s", request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getMonitor()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Monitor.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Refresh updateRefresh(UpdateRefreshRequest request) {
    String path =
        String.format(
            "/api/data-quality/v1/monitors/%s/%s/refreshes/%s",
            request.getObjectType(), request.getObjectId(), request.getRefreshId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getRefresh()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Refresh.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
