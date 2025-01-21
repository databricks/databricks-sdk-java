// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of QueryVisualizationsLegacy */
@Generated
class QueryVisualizationsLegacyImpl implements QueryVisualizationsLegacyService {
  private final ApiClient apiClient;

  public QueryVisualizationsLegacyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public LegacyVisualization create(CreateQueryVisualizationsLegacyRequest request) {
    String path = "/api/2.0/preview/sql/visualizations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, LegacyVisualization.class, headers);
  }

  @Override
  public void delete(DeleteQueryVisualizationsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public LegacyVisualization update(LegacyVisualization request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, LegacyVisualization.class, headers);
  }
}
