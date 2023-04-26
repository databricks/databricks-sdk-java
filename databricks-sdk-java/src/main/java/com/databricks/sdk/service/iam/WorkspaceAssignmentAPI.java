// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WorkspaceAssignmentAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceAssignmentAPI.class);

  private final WorkspaceAssignmentService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WorkspaceAssignmentAPI(ApiClient apiClient) {
    impl = new WorkspaceAssignmentImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.WorkspaceAssignmentService} object
   */
  public WorkspaceAssignmentAPI(WorkspaceAssignmentService mock) {
    impl = mock;
  }

  /**
   * <p>delete.</p>
   *
   * @param workspaceId a long
   * @param principalId a long
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.iam.DeleteWorkspaceAssignmentRequest} object
   */
  public void delete(DeleteWorkspaceAssignmentRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param workspaceId a long
   * @return a {@link com.databricks.sdk.service.iam.WorkspacePermissions} object
   */
  public WorkspacePermissions get(long workspaceId) {
    return get(new GetWorkspaceAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * List workspace permissions.
   *
   * <p>Get an array of workspace permissions for the specified account and workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetWorkspaceAssignmentRequest} object
   * @return a {@link com.databricks.sdk.service.iam.WorkspacePermissions} object
   */
  public WorkspacePermissions get(GetWorkspaceAssignmentRequest request) {
    return impl.get(request);
  }

  /**
   * <p>list.</p>
   *
   * @param workspaceId a long
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PermissionAssignment> list(long workspaceId) {
    return list(new ListWorkspaceAssignmentRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Get permission assignments.
   *
   * <p>Get the permission assignments for the specified Databricks Account and Databricks
   * Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ListWorkspaceAssignmentRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PermissionAssignment> list(ListWorkspaceAssignmentRequest request) {
    return impl.list(request).getPermissionAssignments();
  }

  /**
   * <p>update.</p>
   *
   * @param permissions a {@link java.util.Collection} object
   * @param workspaceId a long
   * @param principalId a long
   */
  public void update(
      Collection<WorkspacePermission> permissions, long workspaceId, long principalId) {
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
   *
   * @param request a {@link com.databricks.sdk.service.iam.UpdateWorkspaceAssignments} object
   */
  public void update(UpdateWorkspaceAssignments request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.WorkspaceAssignmentService} object
   */
  public WorkspaceAssignmentService impl() {
    return impl;
  }
}
