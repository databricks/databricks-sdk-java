// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Databricks Workspace Assignment REST API
 */
@Generated("databricks-sdk-generator")
public class WorkspaceAssignmentAPI implements WorkspaceAssignmentService {
    private final ApiClient apiClient;

    public WorkspaceAssignmentAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create permission assignments.
     * 
     * Create new permission assignments for the specified account and
     * workspace.
     */
    @Override
    public WorkspaceAssignmentsCreated create(CreateWorkspaceAssignments request) {
        String path = String.format("/api/2.0/preview/accounts//workspaces/%s/permissionassignments", request.getWorkspaceId());
        return apiClient.POST(path, request, WorkspaceAssignmentsCreated.class);
    }
    
	/**
     * Delete permissions assignment.
     * 
     * Deletes the workspace permissions assignment for a given account and
     * workspace using the specified service principal.
     */
    @Override
    public void delete(DeleteWorkspaceAssignmentRequest request) {
        String path = String.format("/api/2.0/preview/accounts//workspaces/%s/permissionassignments/principals/%s", request.getWorkspaceId(), request.getPrincipalId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * List workspace permissions.
     * 
     * Get an array of workspace permissions for the specified account and
     * workspace.
     */
    @Override
    public WorkspacePermissions get(GetWorkspaceAssignmentRequest request) {
        String path = String.format("/api/2.0/preview/accounts//workspaces/%s/permissionassignments/permissions", request.getWorkspaceId());
        return apiClient.GET(path, request, WorkspacePermissions.class);
    }
    
	/**
     * Get permission assignments.
     * 
     * Get the permission assignments for the specified Databricks Account and
     * Databricks Workspace.
     */
    @Override
    public PermissionAssignments list(ListWorkspaceAssignmentRequest request) {
        String path = String.format("/api/2.0/preview/accounts//workspaces/%s/permissionassignments", request.getWorkspaceId());
        return apiClient.GET(path, request, PermissionAssignments.class);
    }
    
	/**
     * Update permissions assignment.
     * 
     * Updates the workspace permissions assignment for a given account and
     * workspace using the specified service principal.
     */
    @Override
    public void update(UpdateWorkspaceAssignments request) {
        String path = String.format("/api/2.0/preview/accounts//workspaces/%s/permissionassignments/principals/%s", request.getWorkspaceId(), request.getPrincipalId());
        apiClient.PUT(path, request, Void.class);
    }
    
}