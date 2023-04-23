// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface WorkspaceAssignmentService {
  /**
   * Delete permissions assignment.
   *
   * <p>Deletes the workspace permissions assignment in a given account and workspace for the
   * specified principal.
   */
  void delete(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);

  /**
   * List workspace permissions.
   *
   * <p>Get an array of workspace permissions for the specified account and workspace.
   */
  WorkspacePermissions get(GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);

  /**
   * Get permission assignments.
   *
   * <p>Get the permission assignments for the specified Databricks Account and Databricks
   * Workspace.
   */
  PermissionAssignments list(ListWorkspaceAssignmentRequest listWorkspaceAssignmentRequest);

  /**
   * Create or update permissions assignment.
   *
   * <p>Creates or updates the workspace permissions assignment in a given account and workspace for
   * the specified principal.
   */
  void update(UpdateWorkspaceAssignments updateWorkspaceAssignments);
}
