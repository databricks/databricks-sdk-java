// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface WorkspaceAssignmentService {
  /**
   * Delete permissions assignment.
   *
   * <p>Deletes the workspace permissions assignment in a given account and workspace for the
   * specified principal.
   *
   * @param deleteWorkspaceAssignmentRequest a {@link com.databricks.sdk.service.iam.DeleteWorkspaceAssignmentRequest} object
   */
  void delete(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);

  /**
   * List workspace permissions.
   *
   * <p>Get an array of workspace permissions for the specified account and workspace.
   *
   * @param getWorkspaceAssignmentRequest a {@link com.databricks.sdk.service.iam.GetWorkspaceAssignmentRequest} object
   * @return a {@link com.databricks.sdk.service.iam.WorkspacePermissions} object
   */
  WorkspacePermissions get(GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);

  /**
   * Get permission assignments.
   *
   * <p>Get the permission assignments for the specified Databricks Account and Databricks
   * Workspace.
   *
   * @param listWorkspaceAssignmentRequest a {@link com.databricks.sdk.service.iam.ListWorkspaceAssignmentRequest} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionAssignments} object
   */
  PermissionAssignments list(ListWorkspaceAssignmentRequest listWorkspaceAssignmentRequest);

  /**
   * Create or update permissions assignment.
   *
   * <p>Creates or updates the workspace permissions assignment in a given account and workspace for
   * the specified principal.
   *
   * @param updateWorkspaceAssignments a {@link com.databricks.sdk.service.iam.UpdateWorkspaceAssignments} object
   */
  void update(UpdateWorkspaceAssignments updateWorkspaceAssignments);
}
