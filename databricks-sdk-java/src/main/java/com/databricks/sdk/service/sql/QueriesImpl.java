// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Queries */
@Generated
class QueriesImpl implements QueriesService {
  private final ApiClient apiClient;

  public QueriesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Query create(CreateQueryRequest request) {
    String path = "/api/2.0/sql/queries";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Query.class, headers);
  }

  @Override
  public void delete(TrashQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, Empty.class, headers);
  }

  @Override
  public Query get(GetQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Query.class, headers);
  }

  @Override
  public ListQueryObjectsResponse list(ListQueriesRequest request) {
    String path = "/api/2.0/sql/queries";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListQueryObjectsResponse.class, headers);
  }

  @Override
  public ListVisualizationsForQueryResponse listVisualizations(
      ListVisualizationsForQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s/visualizations", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, ListVisualizationsForQueryResponse.class, headers);
  }

  @Override
  public Query update(UpdateQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, Query.class, headers);
  }
}
