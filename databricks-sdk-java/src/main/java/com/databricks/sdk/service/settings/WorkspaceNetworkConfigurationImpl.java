// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of WorkspaceNetworkConfiguration */
@Generated
class WorkspaceNetworkConfigurationImpl implements WorkspaceNetworkConfigurationService {
  private final ApiClient apiClient;

  public WorkspaceNetworkConfigurationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public WorkspaceNetworkOption getWorkspaceNetworkOptionRpc(
      GetWorkspaceNetworkOptionRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/network",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceNetworkOption.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceNetworkOption updateWorkspaceNetworkOptionRpc(
      UpdateWorkspaceNetworkOptionRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/workspaces/%s/network",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req =
          new Request("PUT", path, apiClient.serialize(request.getWorkspaceNetworkOption()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceNetworkOption.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
