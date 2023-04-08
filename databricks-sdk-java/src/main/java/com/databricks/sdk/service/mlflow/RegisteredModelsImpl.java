// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of RegisteredModels */
class RegisteredModelsImpl implements RegisteredModelsService {
    private final ApiClient apiClient;

    public RegisteredModelsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public CreateRegisteredModelResponse create(CreateRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/create";
        return apiClient.POST(path, request, CreateRegisteredModelResponse.class);
    }
    
    @Override
    public void delete(DeleteRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public void deleteTag(DeleteRegisteredModelTagRequest request) {
        String path = "/api/2.0/mlflow/registered-models/delete-tag";
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public GetRegisteredModelResponse get(GetRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/get";
        return apiClient.GET(path, request, GetRegisteredModelResponse.class);
    }
    
    @Override
    public GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/get-latest-versions";
        return apiClient.POST(path, request, GetLatestVersionsResponse.class);
    }
    
    @Override
    public ListRegisteredModelsResponse list(ListRegisteredModelsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/list";
        return apiClient.GET(path, request, ListRegisteredModelsResponse.class);
    }
    
    @Override
    public RenameRegisteredModelResponse rename(RenameRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/rename";
        return apiClient.POST(path, request, RenameRegisteredModelResponse.class);
    }
    
    @Override
    public SearchRegisteredModelsResponse search(SearchRegisteredModelsRequest request) {
        String path = "/api/2.0/mlflow/registered-models/search";
        return apiClient.GET(path, request, SearchRegisteredModelsResponse.class);
    }
    
    @Override
    public void setTag(SetRegisteredModelTagRequest request) {
        String path = "/api/2.0/mlflow/registered-models/set-tag";
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public void update(UpdateRegisteredModelRequest request) {
        String path = "/api/2.0/mlflow/registered-models/update";
        apiClient.PATCH(path, request, Void.class);
    }
    
}