// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Storage */
class StorageImpl implements StorageService {
    private final ApiClient apiClient;

    public StorageImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public StorageConfiguration create(CreateStorageConfigurationRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations");
        return apiClient.POST(path, request, StorageConfiguration.class);
    }
    
    @Override
    public void delete(DeleteStorageRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations/%s", request.getStorageConfigurationId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public StorageConfiguration get(GetStorageRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations/%s", request.getStorageConfigurationId());
        return apiClient.GET(path, request, StorageConfiguration.class);
    }
    
    @Override
    public List<StorageConfiguration> list() {
        String path = String.format("/api/2.0/accounts//storage-configurations");
        return apiClient.GET(path, List.class);
    }
    
}