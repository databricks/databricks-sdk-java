// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import java.util.List;
import java.util.Map;

/**
 * The Workspace Permission Assignment API allows you to manage workspace
 * permissions for principals in your account.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface WorkspaceAssignmentService {
	/**
     * Delete permissions assignment.
     * 
     * Deletes the workspace permissions assignment in a given account and
     * workspace for the specified principal.
     */
    void delete(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);
    
	/**
     * List workspace permissions.
     * 
     * Get an array of workspace permissions for the specified account and
     * workspace.
     */
    WorkspacePermissions get(GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);
    
	/**
     * Get permission assignments.
     * 
     * Get the permission assignments for the specified Databricks Account and
     * Databricks Workspace.
     */
    PermissionAssignments list(ListWorkspaceAssignmentRequest listWorkspaceAssignmentRequest);
    
	/**
     * Create or update permissions assignment.
     * 
     * Creates or updates the workspace permissions assignment in a given
     * account and workspace for the specified principal.
     */
    void update(UpdateWorkspaceAssignments updateWorkspaceAssignments);
    
}