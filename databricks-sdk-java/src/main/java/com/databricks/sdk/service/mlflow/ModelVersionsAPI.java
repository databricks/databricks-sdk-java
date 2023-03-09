// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class ModelVersionsAPI implements ModelVersionsService {
    private final ApiClient apiClient;

    public ModelVersionsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a model version.
     * 
     * Creates a model version.
     */
    @Override
    public CreateModelVersionResponse create(CreateModelVersionRequest request) {
        String path = "/api/2.0/mlflow/model-versions/create";
        return apiClient.POST(path, request, CreateModelVersionResponse.class);
    }
    
	/**
     * Delete a model version.
     * 
     * Deletes a model version.
     */
    @Override
    public void delete(DeleteModelVersionRequest request) {
        String path = "/api/2.0/mlflow/model-versions/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Delete a model version tag.
     * 
     * Deletes a model version tag.
     */
    @Override
    public void deleteTag(DeleteModelVersionTagRequest request) {
        String path = "/api/2.0/mlflow/model-versions/delete-tag";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a model version.
     * 
     * Get a model version.
     */
    @Override
    public GetModelVersionResponse get(GetModelVersionRequest request) {
        String path = "/api/2.0/mlflow/model-versions/get";
        return apiClient.GET(path, request, GetModelVersionResponse.class);
    }
    
	/**
     * Get a model version URI.
     * 
     * Gets a URI to download the model version.
     */
    @Override
    public GetModelVersionDownloadUriResponse getDownloadUri(GetModelVersionDownloadUriRequest request) {
        String path = "/api/2.0/mlflow/model-versions/get-download-uri";
        return apiClient.GET(path, request, GetModelVersionDownloadUriResponse.class);
    }
    
	/**
     * Searches model versions.
     * 
     * Searches for specific model versions based on the supplied __filter__.
     */
    @Override
    public SearchModelVersionsResponse search(SearchModelVersionsRequest request) {
        String path = "/api/2.0/mlflow/model-versions/search";
        return apiClient.GET(path, request, SearchModelVersionsResponse.class);
    }
    
	/**
     * Set a version tag.
     * 
     * Sets a model version tag.
     */
    @Override
    public void setTag(SetModelVersionTagRequest request) {
        String path = "/api/2.0/mlflow/model-versions/set-tag";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Transition a stage.
     * 
     * Transition to the next model stage.
     */
    @Override
    public TransitionModelVersionStageResponse transitionStage(TransitionModelVersionStage request) {
        String path = "/api/2.0/mlflow/model-versions/transition-stage";
        return apiClient.POST(path, request, TransitionModelVersionStageResponse.class);
    }
    
	/**
     * Update model version.
     * 
     * Updates the model version.
     */
    @Override
    public void update(UpdateModelVersionRequest request) {
        String path = "/api/2.0/mlflow/model-versions/update";
        apiClient.PATCH(path, request, Void.class);
    }
    
}