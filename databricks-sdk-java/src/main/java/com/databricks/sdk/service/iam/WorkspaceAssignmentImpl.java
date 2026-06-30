// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspacePermissions get(GetWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments/permissions",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspacePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PermissionAssignments list(ListWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PermissionAssignments.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PermissionAssignment update(UpdateWorkspaceAssignments request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/permissionassignments/principals/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PermissionAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
