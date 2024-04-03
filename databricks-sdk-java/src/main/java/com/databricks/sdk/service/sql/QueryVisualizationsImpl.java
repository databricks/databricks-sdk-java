// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of QueryVisualizations */
@Generated
class QueryVisualizationsImpl implements QueryVisualizationsService {
  private final ApiClient apiClient;

  public QueryVisualizationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Visualization create(CreateQueryVisualizationRequest request) {
    String path = "/api/2.0/preview/sql/visualizations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Visualization.class, headers);
  }

  @Override
  public void delete(DeleteQueryVisualizationRequest request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public Visualization update(Visualization request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Visualization.class, headers);
  }
}
