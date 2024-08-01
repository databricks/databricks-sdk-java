// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of UsageDashboards */
@Generated
class UsageDashboardsImpl implements UsageDashboardsService {
  private final ApiClient apiClient;

  public UsageDashboardsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateBillingUsageDashboardResponse create(CreateBillingUsageDashboardRequest request) {
    String path = String.format("/api/2.0/accounts/%s/dashboard", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateBillingUsageDashboardResponse.class, headers);
  }

  @Override
  public GetBillingUsageDashboardResponse get(GetBillingUsageDashboardRequest request) {
    String path = String.format("/api/2.0/accounts/%s/dashboard", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetBillingUsageDashboardResponse.class, headers);
  }
}
