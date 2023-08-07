// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, RepoInfo.class);
  }

  @Override
  public void delete(DeleteRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public RepoInfo get(GetRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    return apiClient.GET(path, request, RepoInfo.class);
  }

  @Override
  public GetRepoPermissionLevelsResponse getRepoPermissionLevels(
      GetRepoPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/repos/%s/permissionLevels", request.getRepoId());
    return apiClient.GET(path, request, GetRepoPermissionLevelsResponse.class);
  }

  @Override
  public RepoPermissions getRepoPermissions(GetRepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    return apiClient.GET(path, request, RepoPermissions.class);
  }

  @Override
  public ListReposResponse list(ListReposRequest request) {
    String path = "/api/2.0/repos";
    return apiClient.GET(path, request, ListReposResponse.class);
  }

  @Override
  public RepoPermissions setRepoPermissions(RepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    return apiClient.PUT(path, request, RepoPermissions.class);
  }

  @Override
  public void update(UpdateRepo request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public RepoPermissions updateRepoPermissions(RepoPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/repos/%s", request.getRepoId());
    return apiClient.PATCH(path, request, RepoPermissions.class);
  }
}
