// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of StatementExecution */
@Generated
class StatementExecutionImpl implements StatementExecutionService {
  private final ApiClient apiClient;

  public StatementExecutionImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancelExecution(CancelExecutionRequest request) {
    String path = String.format("/api/2.0/sql/statements/%s/cancel", request.getStatementId());
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("POST", path, null, CancelExecutionResponse.class, headers);
  }

  @Override
  public StatementResponse executeStatement(ExecuteStatementRequest request) {
    String path = "/api/2.0/sql/statements/";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, StatementResponse.class, headers);
  }

  @Override
  public StatementResponse getStatement(GetStatementRequest request) {
    String path = String.format("/api/2.0/sql/statements/%s", request.getStatementId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, StatementResponse.class, headers);
  }

  @Override
  public ResultData getStatementResultChunkN(GetStatementResultChunkNRequest request) {
    String path =
        String.format(
            "/api/2.0/sql/statements/%s/result/chunks/%s",
            request.getStatementId(), request.getChunkIndex());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ResultData.class, headers);
  }
}
