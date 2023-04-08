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
public class GrantsAPI {
    private final GrantsService impl;

    /** Regular-use constructor */
    public GrantsAPI(ApiClient apiClient) {
        impl = new GrantsImpl(apiClient);
    }

    /** Constructor for mocks */
    public GrantsAPI(GrantsService mock) {
        impl = mock;
    }
	
	/**
     * Get permissions.
     * 
     * Gets the permissions for a securable.
     */
    public PermissionsList get(GetGrantRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get effective permissions.
     * 
     * Gets the effective permissions for a securable.
     */
    public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
        return impl.getEffective(request);
    }
    
	/**
     * Update permissions.
     * 
     * Updates the permissions for a securable.
     */
    public PermissionsList update(UpdatePermissions request) {
        return impl.update(request);
    }
    
    public GrantsService impl() {
        return impl;
    }
}