// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of PrivateAccess */
class PrivateAccessImpl implements PrivateAccessService {
    private final ApiClient apiClient;

    public PrivateAccessImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public PrivateAccessSettings create(UpsertPrivateAccessSettingsRequest request) {
        String path = String.format("/api/2.0/accounts//private-access-settings");
        return apiClient.POST(path, request, PrivateAccessSettings.class);
    }
    
    @Override
    public void delete(DeletePrivateAccesRequest request) {
        String path = String.format("/api/2.0/accounts//private-access-settings/%s", request.getPrivateAccessSettingsId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public PrivateAccessSettings get(GetPrivateAccesRequest request) {
        String path = String.format("/api/2.0/accounts//private-access-settings/%s", request.getPrivateAccessSettingsId());
        return apiClient.GET(path, request, PrivateAccessSettings.class);
    }
    
    @Override
    public List<PrivateAccessSettings> list() {
        String path = String.format("/api/2.0/accounts//private-access-settings");
        return apiClient.GET(path, List.class);
    }
    
    @Override
    public void replace(UpsertPrivateAccessSettingsRequest request) {
        String path = String.format("/api/2.0/accounts//private-access-settings/%s", request.getPrivateAccessSettingsId());
        apiClient.PUT(path, request, Void.class);
    }
    
}