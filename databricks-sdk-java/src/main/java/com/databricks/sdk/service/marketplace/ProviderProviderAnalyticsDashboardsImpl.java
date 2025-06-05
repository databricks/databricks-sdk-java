// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ProviderProviderAnalyticsDashboards */
@Generated
class ProviderProviderAnalyticsDashboardsImpl
    implements ProviderProviderAnalyticsDashboardsService {
  private final ApiClient apiClient;

  public ProviderProviderAnalyticsDashboardsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ProviderAnalyticsDashboard create() {
    String path = "/api/2.0/marketplace-provider/analytics_dashboard";
    try {
      Request req = new Request("POST", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ProviderAnalyticsDashboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListProviderAnalyticsDashboardResponse get() {
    String path = "/api/2.0/marketplace-provider/analytics_dashboard";
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListProviderAnalyticsDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion() {
    String path = "/api/2.0/marketplace-provider/analytics_dashboard/latest";
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetLatestVersionProviderAnalyticsDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest request) {
    String path =
        String.format("/api/2.0/marketplace-provider/analytics_dashboard/%s", request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateProviderAnalyticsDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
