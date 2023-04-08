// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class MLflowMetricsAPI {
    private final MLflowMetricsService impl;

    /** Regular-use constructor */
    public MLflowMetricsAPI(ApiClient apiClient) {
        impl = new MLflowMetricsImpl(apiClient);
    }

    /** Constructor for mocks */
    public MLflowMetricsAPI(MLflowMetricsService mock) {
        impl = mock;
    }
	
	/**
     * Get history of a given metric within a run.
     * 
     * Gets a list of all values for the specified metric for a given run.
     */
    public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
        return impl.getHistory(request);
    }
    
    public MLflowMetricsService impl() {
        return impl;
    }
}