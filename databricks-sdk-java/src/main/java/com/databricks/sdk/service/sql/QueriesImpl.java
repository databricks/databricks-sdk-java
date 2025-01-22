// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Query.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(TrashQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Empty.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Query get(GetQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Query.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListQueryObjectsResponse list(ListQueriesRequest request) {
    String path = "/api/2.0/sql/queries";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListQueryObjectsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListVisualizationsForQueryResponse listVisualizations(
      ListVisualizationsForQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s/visualizations", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListVisualizationsForQueryResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Query update(UpdateQueryRequest request) {
    String path = String.format("/api/2.0/sql/queries/%s", request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Query.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
