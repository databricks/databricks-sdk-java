// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExportResponse export(ExportRequest request) {
    String path = "/api/2.0/workspace/export";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ExportResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetWorkspaceObjectPermissionLevelsResponse getPermissionLevels(
      GetWorkspaceObjectPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s/permissionLevels",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetWorkspaceObjectPermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceObjectPermissions getPermissions(GetWorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceObjectPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ObjectInfo getStatus(GetStatusRequest request) {
    String path = "/api/2.0/workspace/get-status";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ObjectInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void importContent(Import request) {
    String path = "/api/2.0/workspace/import";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, ImportResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListResponse list(ListWorkspaceRequest request) {
    String path = "/api/2.0/workspace/list";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void mkdirs(Mkdirs request) {
    String path = "/api/2.0/workspace/mkdirs";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, MkdirsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceObjectPermissions setPermissions(WorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceObjectPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceObjectPermissions updatePermissions(WorkspaceObjectPermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getWorkspaceObjectType(), request.getWorkspaceObjectId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceObjectPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
