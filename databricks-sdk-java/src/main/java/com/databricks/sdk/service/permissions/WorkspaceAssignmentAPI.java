// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.permissions;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 */
public class WorkspaceAssignmentAPI {
  private final WorkspaceAssignmentService impl;

  /** Regular-use constructor */
  public WorkspaceAssignmentAPI(ApiClient apiClient) {
    impl = new WorkspaceAssignmentImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceAssignmentAPI(WorkspaceAssignmentService mock) {
    impl = mock;
  }

  public void delete(long workspaceId, long principalId) {
    delete(
        new DeleteWorkspaceAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Delete permissions assignment.
   *
   * <p>Deletes the workspace permissions assignment in a given account and workspace for the
   * specified principal.
   */
  public void delete(DeleteWorkspaceAssignmentRequest request) {
    impl.delete(request);
  }

  public WorkspacePermissions get(long workspaceId) {
    return get(new GetWorkspaceAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * List workspace permissions.
   *
   * <p>Get an array of workspace permissions for the specified account and workspace.
   */
  public WorkspacePermissions get(GetWorkspaceAssignmentRequest request) {
    return impl.get(request);
  }

  public PermissionAssignments list(long workspaceId) {
    return list(new ListWorkspaceAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Get permission assignments.
   *
   * <p>Get the permission assignments for the specified Databricks Account and Databricks
   * Workspace.
   */
  public PermissionAssignments list(ListWorkspaceAssignmentRequest request) {
    return impl.list(request);
  }

  public void update(List<WorkspacePermission> permissions, long workspaceId, long principalId) {
    update(
        new UpdateWorkspaceAssignments()
            .setPermissions(permissions)
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Create or update permissions assignment.
   *
   * <p>Creates or updates the workspace permissions assignment in a given account and workspace for
   * the specified principal.
   */
  public void update(UpdateWorkspaceAssignments request) {
    impl.update(request);
  }

  public WorkspaceAssignmentService impl() {
    return impl;
  }
}
