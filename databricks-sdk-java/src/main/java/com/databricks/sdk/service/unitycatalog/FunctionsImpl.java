// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Functions */
class FunctionsImpl implements FunctionsService {
    private final ApiClient apiClient;

    public FunctionsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public FunctionInfo create(CreateFunction request) {
        String path = "/api/2.1/unity-catalog/functions";
        return apiClient.POST(path, request, FunctionInfo.class);
    }
    
    @Override
    public void delete(DeleteFunctionRequest request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public FunctionInfo get(GetFunctionRequest request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        return apiClient.GET(path, request, FunctionInfo.class);
    }
    
    @Override
    public ListFunctionsResponse list(ListFunctionsRequest request) {
        String path = "/api/2.1/unity-catalog/functions";
        return apiClient.GET(path, request, ListFunctionsResponse.class);
    }
    
    @Override
    public FunctionInfo update(UpdateFunction request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        return apiClient.PATCH(path, request, FunctionInfo.class);
    }
    
}