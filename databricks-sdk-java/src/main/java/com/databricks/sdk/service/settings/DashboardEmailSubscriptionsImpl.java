// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DashboardEmailSubscriptions */
@Generated
class DashboardEmailSubscriptionsImpl implements DashboardEmailSubscriptionsService {
  private final ApiClient apiClient;

  public DashboardEmailSubscriptionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDashboardEmailSubscriptionsResponse delete(
      DeleteDashboardEmailSubscriptionsRequest request) {
    String path = "/api/2.0/settings/types/dashboard_email_subscriptions/names/default";
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DeleteDashboardEmailSubscriptionsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DashboardEmailSubscriptions get(GetDashboardEmailSubscriptionsRequest request) {
    String path = "/api/2.0/settings/types/dashboard_email_subscriptions/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DashboardEmailSubscriptions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DashboardEmailSubscriptions update(UpdateDashboardEmailSubscriptionsRequest request) {
    String path = "/api/2.0/settings/types/dashboard_email_subscriptions/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DashboardEmailSubscriptions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
