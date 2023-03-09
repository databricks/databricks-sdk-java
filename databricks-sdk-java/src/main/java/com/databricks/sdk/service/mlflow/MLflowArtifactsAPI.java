// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class MLflowArtifactsAPI implements MLflowArtifactsService {
    private final ApiClient apiClient;

    public MLflowArtifactsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get all artifacts.
     * 
     * List artifacts for a run. Takes an optional `artifact_path` prefix. If it
     * is specified, the response contains only artifacts with the specified
     * prefix.",
     */
    @Override
    public ListArtifactsResponse list(ListArtifactsRequest request) {
        String path = "/api/2.0/mlflow/artifacts/list";
        return apiClient.GET(path, request, ListArtifactsResponse.class);
    }
    
}