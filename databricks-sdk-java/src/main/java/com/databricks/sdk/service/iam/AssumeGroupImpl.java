// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AssumeGroup */
@Generated
class AssumeGroupImpl implements AssumeGroupService {
  private final ApiClient apiClient;

  public AssumeGroupImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RestrictedSharingGroup createRestrictedSharingGroup(
      CreateRestrictedSharingGroupRequest request) {
    String path = "/api/2.0/access-control/restricted-sharing-groups";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getRestrictedSharingGroup()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RestrictedSharingGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteRestrictedSharingGroup(DeleteRestrictedSharingGroupRequest request) {
    String path = String.format("/api/2.0/access-control/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RestrictedSharingGroup getRestrictedSharingGroup(
      GetRestrictedSharingGroupRequest request) {
    String path = String.format("/api/2.0/access-control/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RestrictedSharingGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListRestrictedSharingGroupsResponse listRestrictedSharingGroups(
      ListRestrictedSharingGroupsRequest request) {
    String path = "/api/2.0/access-control/restricted-sharing-groups";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListRestrictedSharingGroupsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
