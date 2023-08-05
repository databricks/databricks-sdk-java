// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of WorkspaceAssignment */
@Generated
class WorkspaceAssignmentImpl implements WorkspaceAssignmentService {
  private final ApiClient apiClient;

  public WorkspaceAssignmentImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void delete(DeleteWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments/principals/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public WorkspacePermissions get(GetWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments/permissions",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, WorkspacePermissions.class, "application/json");
  }

  @Override
  public PermissionAssignments list(ListWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, PermissionAssignments.class, "application/json");
  }

  @Override
  public void update(UpdateWorkspaceAssignments request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments/principals/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    apiClient.PUT(path, request, Void.class);
  }
}
