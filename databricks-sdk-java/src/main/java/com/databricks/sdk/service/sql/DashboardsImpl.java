// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void restore(RestoreDashboardRequest request) {
    String path =
        String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, RestoreResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Dashboard update(DashboardEditContent request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Dashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
