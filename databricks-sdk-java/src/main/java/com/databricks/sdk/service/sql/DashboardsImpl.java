// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Dashboards */
class DashboardsImpl implements DashboardsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for DashboardsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public DashboardsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Dashboard create(CreateDashboardRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    return apiClient.POST(path, request, Dashboard.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Dashboard get(GetDashboardRequest request) {
    String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
    return apiClient.GET(path, request, Dashboard.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListResponse list(ListDashboardsRequest request) {
    String path = "/api/2.0/preview/sql/dashboards";
    return apiClient.GET(path, request, ListResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void restore(RestoreDashboardRequest request) {
    String path =
        String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
    apiClient.POST(path, request, Void.class);
  }
}
