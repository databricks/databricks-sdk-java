// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Repos */
@Generated
class ReposImpl implements ReposService {
  private final ApiClient apiClient;

  public ReposImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RepoInfo create(CreateRepo request) {
    String path = "/api/2.0/repos";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RepoInfo.class, headers);
  }

  @Override
  public void delete(DeleteRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public RepoInfo get(GetRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, RepoInfo.class, headers);
  }

  @Override
  public GetRepoPermissionLevelsResponse getPermissionLevels(
      GetRepoPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/repos/%s/permissionLevels", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetRepoPermissionLevelsResponse.class, headers);
  }

  @Override
  public RepoPermissions getPermissions(GetRepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, RepoPermissions.class, headers);
  }

  @Override
  public ListReposResponse list(ListReposRequest request) {
    String path = "/api/2.0/repos";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListReposResponse.class, headers);
  }

  @Override
  public RepoPermissions setPermissions(RepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, RepoPermissions.class, headers);
  }

  @Override
  public void update(UpdateRepo request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }

  @Override
  public RepoPermissions updatePermissions(RepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, RepoPermissions.class, headers);
  }
}
