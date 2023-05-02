// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, Workspace.class);
  }

  @Override
  public void delete(DeleteWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Workspace get(GetWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    return apiClient.GET(path, request, Workspace.class);
  }

  @Override
  public Collection<Workspace> list() {
    String path = String.format("/api/2.0/accounts/%s/workspaces", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }

  @Override
  public void update(UpdateWorkspaceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    apiClient.PATCH(path, request, Void.class);
  }
}
