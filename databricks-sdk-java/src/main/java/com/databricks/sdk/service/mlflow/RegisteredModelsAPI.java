// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


@Generated("databricks-sdk-generator")
public class RegisteredModelsAPI implements RegisteredModelsService {
    private final ApiClient apiClient;

    public RegisteredModelsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a model.
     * 
     * Creates a new registered model with the name specified in the request
     * body.
     * 
     * Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given
     * name exists.
     */
    @Override
    public CreateRegisteredModelResponse create(CreateRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/create";
        return apiClient.POST(path, request, CreateRegisteredModelResponse.class);
    }
    
	/**
     * Delete a model.
     * 
     * Deletes a registered model.
     */
    @Override
    public void delete(DeleteRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Delete a model tag.
     * 
     * Deletes the tag for a registered model.
     */
    @Override
    public void deleteTag(DeleteRegisteredModelTagRequest request) {
        String path = "/api/2.0/mlflow/registered-models/delete-tag";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a model.
     * 
     * Gets the registered model that matches the specified ID.
     */
    @Override
    public GetRegisteredModelResponse get(GetRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/get";
        return apiClient.GET(path, request, GetRegisteredModelResponse.class);
    }
    
	/**
     * Get the latest version.
     * 
     * Gets the latest version of a registered model.
     */
    @Override
    public GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/get-latest-versions";
        return apiClient.POST(path, request, GetLatestVersionsResponse.class);
    }
    
	/**
     * List models.
     * 
     * Lists all available registered models, up to the limit specified in
     * __max_results__.
     */
    @Override
    public ListRegisteredModelsResponse list(ListRegisteredModelsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/list";
        return apiClient.GET(path, request, ListRegisteredModelsResponse.class);
    }
    
	/**
     * Rename a model.
     * 
     * Renames a registered model.
     */
    @Override
    public RenameRegisteredModelResponse rename(RenameRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/rename";
        return apiClient.POST(path, request, RenameRegisteredModelResponse.class);
    }
    
	/**
     * Search models.
     * 
     * Search for registered models based on the specified __filter__.
     */
    @Override
    public SearchRegisteredModelsResponse search(SearchRegisteredModelsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/search";
        return apiClient.GET(path, request, SearchRegisteredModelsResponse.class);
    }
    
	/**
     * Set a tag.
     * 
     * Sets a tag on a registered model.
     */
    @Override
    public void setTag(SetRegisteredModelTagRequest request) {
        String path = "/api/2.0/mlflow/registered-models/set-tag";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Update model.
     * 
     * Updates a registered model.
     */
    @Override
    public void update(UpdateRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/update";
        apiClient.PATCH(path, request, Void.class);
    }
    
}