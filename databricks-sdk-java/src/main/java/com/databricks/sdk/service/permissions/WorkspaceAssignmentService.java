// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Databricks Workspace Assignment REST API
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface WorkspaceAssignmentService {
	/**
     * Create permission assignments.
     * 
     * Create new permission assignments for the specified account and
     * workspace.
     */
    WorkspaceAssignmentsCreated create(CreateWorkspaceAssignments createWorkspaceAssignments);
    
	/**
     * Delete permissions assignment.
     * 
     * Deletes the workspace permissions assignment for a given account and
     * workspace using the specified service principal.
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
     * Update permissions assignment.
     * 
     * Updates the workspace permissions assignment for a given account and
     * workspace using the specified service principal.
     */
    void update(UpdateWorkspaceAssignments updateWorkspaceAssignments);
    
}