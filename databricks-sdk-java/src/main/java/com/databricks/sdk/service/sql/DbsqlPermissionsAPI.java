// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The SQL Permissions API is similar to the endpoints of the
 * :method:permissions/set. However, this exposes only one endpoint, which gets
 * the Access Control List for a given object. You cannot modify any permissions
 * using this API.
 * 
 * There are three levels of permission:
 * 
 * - `CAN_VIEW`: Allows read-only access
 * 
 * - `CAN_RUN`: Allows read access and run access (superset of `CAN_VIEW`)
 * 
 * - `CAN_MANAGE`: Allows all actions: read, run, edit, delete, modify
 * permissions (superset of `CAN_RUN`)
 */
public class DbsqlPermissionsAPI implements DbsqlPermissionsService {
    private final ApiClient apiClient;

    public DbsqlPermissionsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get object ACL.
     * 
     * Gets a JSON representation of the access control list (ACL) for a
     * specified object.
     */
    @Override
    public GetResponse get(GetDbsqlPermissionRequest request) {
        String path = String.format("/api/2.0/preview/sql/permissions/%s/%s", request.getObjectType(), request.getObjectId());
        return apiClient.GET(path, request, GetResponse.class);
    }
    
	/**
     * Set object ACL.
     * 
     * Sets the access control list (ACL) for a specified object. This operation
     * will complete rewrite the ACL.
     */
    @Override
    public SetResponse set(SetRequest request) {
        String path = String.format("/api/2.0/preview/sql/permissions/%s/%s", request.getObjectType(), request.getObjectId());
        return apiClient.POST(path, request, SetResponse.class);
    }
    
	/**
     * Transfer object ownership.
     * 
     * Transfers ownership of a dashboard, query, or alert to an active user.
     * Requires an admin API key.
     */
    @Override
    public Success transferOwnership(TransferOwnershipRequest request) {
        String path = String.format("/api/2.0/preview/sql/permissions/%s/%s/transfer", request.getObjectType(), request.getObjectId());
        return apiClient.POST(path, request, Success.class);
    }
    
}