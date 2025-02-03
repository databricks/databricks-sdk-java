// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of QueryExecution */
@Generated
class QueryExecutionImpl implements QueryExecutionService {
  private final ApiClient apiClient;

  public QueryExecutionImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CancelQueryExecutionResponse cancelPublishedQueryExecution(
      CancelPublishedQueryExecutionRequest request) {
    String path = "/api/2.0/lakeview-query/query/published";
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CancelQueryExecutionResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void executePublishedDashboardQuery(ExecutePublishedDashboardQueryRequest request) {
    String path = "/api/2.0/lakeview-query/query/published";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, ExecuteQueryResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PollQueryStatusResponse pollPublishedQueryStatus(PollPublishedQueryStatusRequest request) {
    String path = "/api/2.0/lakeview-query/query/published";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PollQueryStatusResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
