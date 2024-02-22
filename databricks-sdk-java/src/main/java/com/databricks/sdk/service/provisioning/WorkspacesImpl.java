// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Workspaces */
@Generated
class WorkspacesImpl implements WorkspacesService {
  private final ApiClient apiClient;

  public WorkspacesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Workspace create(CreateWorkspaceRequest request) {
    String path = String.format("/api/2.0/accounts/%s/workspaces", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Workspace.class, headers);
  }

  @Override
  public DeleteResponse delete(DeleteWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public Workspace get(GetWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Workspace.class, headers);
  }

  @Override
  public Collection<Workspace> list() {
    String path = String.format("/api/2.0/accounts/%s/workspaces", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getCollection(path, null, Workspace.class, headers);
  }

  @Override
  public UpdateResponse update(UpdateWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, UpdateResponse.class, headers);
  }
}
