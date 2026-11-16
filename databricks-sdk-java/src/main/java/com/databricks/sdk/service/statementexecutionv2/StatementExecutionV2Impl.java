// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of StatementExecutionV2 */
@Generated
class StatementExecutionV2Impl implements StatementExecutionV2Service {
  private final ApiClient apiClient;

  public StatementExecutionV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CancelStatementResponse cancelStatement(CancelStatementRequest request) {
    String path =
        String.format(
            "/api/2.0/sql/warehouses/%s/statements/%s/cancel",
            request.getWarehouseId(), request.getStatementId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CancelStatementResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StatementResponse executeStatement(ExecuteStatementRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/statements", request.getWarehouseId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, StatementResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResultData getResultData(GetResultDataRequest request) {
    String path =
        String.format(
            "/api/2.0/sql/warehouses/%s/statements/%s/result/chunks/%s",
            request.getWarehouseId(), request.getStatementId(), request.getChunkIndex());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ResultData.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StatementResponse getStatementResult(GetStatementResultRequest request) {
    String path =
        String.format(
            "/api/2.0/sql/warehouses/%s/statements/%s",
            request.getWarehouseId(), request.getStatementId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, StatementResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
