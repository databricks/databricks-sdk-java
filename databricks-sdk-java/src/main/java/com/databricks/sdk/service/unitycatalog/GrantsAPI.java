// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access
 * to data in a metastore. Access can be granted by either a metastore admin,
 * the owner of an object, or the owner of the catalog or schema that contains
 * the object. Securable objects in Unity Catalog are hierarchical and
 * privileges are inherited downward.
 * 
 * Securable objects in Unity Catalog are hierarchical and privileges are
 * inherited downward. This means that granting a privilege on the catalog
 * automatically grants the privilege to all current and future objects within
 * the catalog. Similarly, privileges granted on a schema are inherited by all
 * current and future objects within that schema.
 */
public class GrantsAPI implements GrantsService {
    private final ApiClient apiClient;

    public GrantsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get permissions.
     * 
     * Gets the permissions for a securable.
     */
    @Override
    public PermissionsList get(GetGrantRequest request) {
        String path = String.format("/api/2.1/unity-catalog/permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.GET(path, request, PermissionsList.class);
    }
    
	/**
     * Get effective permissions.
     * 
     * Gets the effective permissions for a securable.
     */
    @Override
    public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
        String path = String.format("/api/2.1/unity-catalog/effective-permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.GET(path, request, EffectivePermissionsList.class);
    }
    
	/**
     * Update permissions.
     * 
     * Updates the permissions for a securable.
     */
    @Override
    public PermissionsList update(UpdatePermissions request) {
        String path = String.format("/api/2.1/unity-catalog/permissions/%s/%s", request.getSecurableType(), request.getFullName());
        return apiClient.PATCH(path, request, PermissionsList.class);
    }
    
}