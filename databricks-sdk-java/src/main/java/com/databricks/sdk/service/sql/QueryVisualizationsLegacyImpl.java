// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, LegacyVisualization.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteQueryVisualizationsLegacyRequest request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LegacyVisualization update(LegacyVisualization request) {
    String path = String.format("/api/2.0/preview/sql/visualizations/%s", request.getId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, LegacyVisualization.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
