// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/** Package-local implementation of Workspaces */
class WorkspacesImpl implements WorkspacesService {
  private final ApiClient apiClient;

  public WorkspacesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Workspace create(CreateWorkspaceRequest request) {
    String path = String.format("/api/2.0/accounts//workspaces");
    return apiClient.POST(path, request, Workspace.class);
  }

  @Override
  public void delete(DeleteWorkspaceRequest request) {
    String path = String.format("/api/2.0/accounts//workspaces/%s", request.getWorkspaceId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Workspace get(GetWorkspaceRequest request) {
    String path = String.format("/api/2.0/accounts//workspaces/%s", request.getWorkspaceId());
    return apiClient.GET(path, request, Workspace.class);
  }

  @Override
  public List<Workspace> list() {
    String path = String.format("/api/2.0/accounts//workspaces");
    return apiClient.GET(path, List.class);
  }

  @Override
  public void update(UpdateWorkspaceRequest request) {
    String path = String.format("/api/2.0/accounts//workspaces/%s", request.getWorkspaceId());
    apiClient.PATCH(path, request, Void.class);
  }
}
