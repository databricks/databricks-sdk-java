// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of MLflowRuns */
class MLflowRunsImpl implements MLflowRunsService {
    private final ApiClient apiClient;

    public MLflowRunsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public CreateRunResponse create(CreateRun request) {
        String path = "/api/2.0/mlflow/runs/create";
        return apiClient.POST(path, request, CreateRunResponse.class);
    }
    
    @Override
    public void delete(DeleteRun request) {
        String path = "/api/2.0/mlflow/runs/delete";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void deleteTag(DeleteTag request) {
        String path = "/api/2.0/mlflow/runs/delete-tag";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public GetRunResponse get(GetRunRequest request) {
        String path = "/api/2.0/mlflow/runs/get";
        return apiClient.GET(path, request, GetRunResponse.class);
    }
    
    @Override
    public void logBatch(LogBatch request) {
        String path = "/api/2.0/mlflow/runs/log-batch";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void logMetric(LogMetric request) {
        String path = "/api/2.0/mlflow/runs/log-metric";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void logModel(LogModel request) {
        String path = "/api/2.0/mlflow/runs/log-model";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void logParameter(LogParam request) {
        String path = "/api/2.0/mlflow/runs/log-parameter";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void restore(RestoreRun request) {
        String path = "/api/2.0/mlflow/runs/restore";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public SearchRunsResponse search(SearchRuns request) {
        String path = "/api/2.0/mlflow/runs/search";
        return apiClient.POST(path, request, SearchRunsResponse.class);
    }
    
    @Override
    public void setTag(SetTag request) {
        String path = "/api/2.0/mlflow/runs/set-tag";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public UpdateRunResponse update(UpdateRun request) {
        String path = "/api/2.0/mlflow/runs/update";
        return apiClient.POST(path, request, UpdateRunResponse.class);
    }
    
}