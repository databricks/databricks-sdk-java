// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateBillingUsageDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetBillingUsageDashboardResponse get(GetBillingUsageDashboardRequest request) {
    String path = String.format("/api/2.0/accounts/%s/dashboard", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetBillingUsageDashboardResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
