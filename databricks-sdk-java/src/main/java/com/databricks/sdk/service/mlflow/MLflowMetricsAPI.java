// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class MLflowMetricsAPI implements MLflowMetricsService {
    private final ApiClient apiClient;

    public MLflowMetricsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get history of a given metric within a run.
     * 
     * Gets a list of all values for the specified metric for a given run.
     */
    @Override
    public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
        String path = "/api/2.0/mlflow/metrics/get-history";
        return apiClient.GET(path, request, GetMetricHistoryResponse.class);
    }
    
}