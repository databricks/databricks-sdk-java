// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



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
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public ExecuteStatementResponse executeStatement(ExecuteStatementRequest request) {
    String path = "/api/2.0/sql/statements/";
    return apiClient.POST(path, request, ExecuteStatementResponse.class);
  }
  
  @Override
  public GetStatementResponse getStatement(GetStatementRequest request) {
    String path = String.format("/api/2.0/sql/statements/%s", request.getStatementId());
    return apiClient.GET(path, request, GetStatementResponse.class);
  }
  
  @Override
  public ResultData getStatementResultChunkN(GetStatementResultChunkNRequest request) {
    String path = String.format("/api/2.0/sql/statements/%s/result/chunks/%s", request.getStatementId(), request.getChunkIndex());
    return apiClient.GET(path, request, ResultData.class);
  }
  
}