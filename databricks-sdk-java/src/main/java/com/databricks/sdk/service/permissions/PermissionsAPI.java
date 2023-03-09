// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Permissions API are used to create read, write, edit, update and manage
 * access for various users on different objects and endpoints.
 */
public class PermissionsAPI implements PermissionsService {
    private final ApiClient apiClient;

    public PermissionsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get object permissions.
     * 
     * Gets the permission of an object. Objects can inherit permissions from
     * their parent objects or root objects.
     */
    @Override
    public ObjectPermissions get(Get request) {
        String path = String.format("/api/2.0/permissions/%s/%s", request.getRequestObjectType(), request.getRequestObjectId());
        return apiClient.GET(path, request, ObjectPermissions.class);
    }
    
	/**
     * Get permission levels.
     * 
     * Gets the permission levels that a user can have on an object.
     */
    @Override
    public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevels request) {
        String path = String.format("/api/2.0/permissions/%s/%s/permissionLevels", request.getRequestObjectType(), request.getRequestObjectId());
        return apiClient.GET(path, request, GetPermissionLevelsResponse.class);
    }
    
	/**
     * Set permissions.
     * 
     * Sets permissions on object. Objects can inherit permissions from their
     * parent objects and root objects.
     */
    @Override
    public void set(PermissionsRequest request) {
        String path = String.format("/api/2.0/permissions/%s/%s", request.getRequestObjectType(), request.getRequestObjectId());
        apiClient.PUT(path, request, Void.class);
    }
    
	/**
     * Update permission.
     * 
     * Updates the permissions on an object.
     */
    @Override
    public void update(PermissionsRequest request) {
        String path = String.format("/api/2.0/permissions/%s/%s", request.getRequestObjectType(), request.getRequestObjectId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}