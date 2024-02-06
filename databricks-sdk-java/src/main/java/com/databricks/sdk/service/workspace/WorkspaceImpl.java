// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Workspace */
@Generated
class WorkspaceImpl implements WorkspaceService {
  private final ApiClient apiClient;

  public WorkspaceImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/workspace/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ExportResponse export(ExportRequest request) {
    String path = "/api/2.0/workspace/export";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ExportResponse.class, headers);
  }

  @Override
  public GetWorkspaceObjectPermissionLevelsResponse getPermissionLevels(
      GetWorkspaceObjectPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s/permissionLevels",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetWorkspaceObjectPermissionLevelsResponse.class, headers);
  }

  @Override
  public WorkspaceObjectPermissions getPermissions(GetWorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, WorkspaceObjectPermissions.class, headers);
  }

  @Override
  public ObjectInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/workspace/get-status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ObjectInfo.class, headers);
  }

  @Override
  public void importContent(Import request) {
    String path = "/api/2.0/workspace/import";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ListResponse list(ListWorkspaceRequest request) {
    String path = "/api/2.0/workspace/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListResponse.class, headers);
  }

  @Override
  public void mkdirs(Mkdirs request) {
    String path = "/api/2.0/workspace/mkdirs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public WorkspaceObjectPermissions setPermissions(WorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, WorkspaceObjectPermissions.class, headers);
  }

  @Override
  public WorkspaceObjectPermissions updatePermissions(WorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, WorkspaceObjectPermissions.class, headers);
  }
}
