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
public class PermissionsAPI {
    private final PermissionsService impl;

    /** Regular-use constructor */
    public PermissionsAPI(ApiClient apiClient) {
        impl = new PermissionsImpl(apiClient);
    }

    /** Constructor for mocks */
    public PermissionsAPI(PermissionsService mock) {
        impl = mock;
    }
	
	/**
     * Get object permissions.
     * 
     * Gets the permission of an object. Objects can inherit permissions from
     * their parent objects or root objects.
     */
    public ObjectPermissions get(Get request) {
        return impl.get(request);
    }
    
	/**
     * Get permission levels.
     * 
     * Gets the permission levels that a user can have on an object.
     */
    public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevels request) {
        return impl.getPermissionLevels(request);
    }
    
	/**
     * Set permissions.
     * 
     * Sets permissions on object. Objects can inherit permissions from their
     * parent objects and root objects.
     */
    public void set(PermissionsRequest request) {
        impl.set(request);
    }
    
	/**
     * Update permission.
     * 
     * Updates the permissions on an object.
     */
    public void update(PermissionsRequest request) {
        impl.update(request);
    }
    
    public PermissionsService impl() {
        return impl;
    }
}