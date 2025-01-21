// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("POST", path, null, ProviderAnalyticsDashboard.class, headers);
  }

  @Override
  public ListProviderAnalyticsDashboardResponse get() {
    String path = "/api/2.0/marketplace-provider/analytics_dashboard";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, null, ListProviderAnalyticsDashboardResponse.class, headers);
  }

  @Override
  public GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion() {
    String path = "/api/2.0/marketplace-provider/analytics_dashboard/latest";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, null, GetLatestVersionProviderAnalyticsDashboardResponse.class, headers);
  }

  @Override
  public UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest request) {
    String path =
        String.format("/api/2.0/marketplace-provider/analytics_dashboard/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute(
        "PUT", path, request, UpdateProviderAnalyticsDashboardResponse.class, headers);
  }
}
