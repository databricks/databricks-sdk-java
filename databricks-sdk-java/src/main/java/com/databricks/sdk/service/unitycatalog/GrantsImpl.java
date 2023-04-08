// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Grants */
class GrantsImpl implements GrantsService {
    private final ApiClient apiClient;

    public GrantsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public PermissionsList get(GetGrantRequest request) {
        String path = String.format("/api/2.1/unity-catalog/permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.GET(path, request, PermissionsList.class);
    }
    
    @Override
    public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
        String path = String.format("/api/2.1/unity-catalog/effective-permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.GET(path, request, EffectivePermissionsList.class);
    }
    
    @Override
    public PermissionsList update(UpdatePermissions request) {
        String path = String.format("/api/2.1/unity-catalog/permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.PATCH(path, request, PermissionsList.class);
    }
    
}