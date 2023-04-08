// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class MLflowArtifactsAPI {
    private final MLflowArtifactsService impl;

    /** Regular-use constructor */
    public MLflowArtifactsAPI(ApiClient apiClient) {
        impl = new MLflowArtifactsImpl(apiClient);
    }

    /** Constructor for mocks */
    public MLflowArtifactsAPI(MLflowArtifactsService mock) {
        impl = mock;
    }
	
	/**
     * Get all artifacts.
     * 
     * List artifacts for a run. Takes an optional `artifact_path` prefix. If it
     * is specified, the response contains only artifacts with the specified
     * prefix.",
     */
    public ListArtifactsResponse list(ListArtifactsRequest request) {
        return impl.list(request);
    }
    
    public MLflowArtifactsService impl() {
        return impl;
    }
}