// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 */
@Generated
public class WorkspaceAssignmentAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceAssignmentAPI.class);

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

  public Iterable<PermissionAssignment> list(long workspaceId) {
    return list(new ListWorkspaceAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Get permission assignments.
   *
   * <p>Get the permission assignments for the specified Databricks account and Databricks
   * workspace.
   */
  public Iterable<PermissionAssignment> list(ListWorkspaceAssignmentRequest request) {
    return impl.list(request).getPermissionAssignments();
  }

  public PermissionAssignment update(
      long workspaceId, long principalId, Collection<WorkspacePermission> permissions) {
    return update(
        new UpdateWorkspaceAssignments()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId)
            .setPermissions(permissions));
  }

  /**
   * Create or update permissions assignment.
   *
   * <p>Creates or updates the workspace permissions assignment in a given account and workspace for
   * the specified principal.
   */
  public PermissionAssignment update(UpdateWorkspaceAssignments request) {
    return impl.update(request);
  }

  public WorkspaceAssignmentService impl() {
    return impl;
  }
}
