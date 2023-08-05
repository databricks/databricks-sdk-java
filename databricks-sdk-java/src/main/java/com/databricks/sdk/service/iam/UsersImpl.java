// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of Users */
@Generated
class UsersImpl implements UsersService {
  private final ApiClient apiClient;

  public UsersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public User create(User request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    return apiClient.POST(path, request, User.class);
  }

  @Override
  public void delete(DeleteUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public User get(GetUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    return apiClient.GET(path, request, User.class, "application/json");
  }

  @Override
  public GetPasswordPermissionLevelsResponse getPasswordPermissionLevels() {
    String path = "/api/2.0/permissions/authorization/passwords/permissionLevels";
    return apiClient.GET(path, GetPasswordPermissionLevelsResponse.class, "application/json");
  }

  @Override
  public PasswordPermissions getPasswordPermissions() {
    String path = "/api/2.0/permissions/authorization/passwords";
    return apiClient.GET(path, PasswordPermissions.class, "application/json");
  }

  @Override
  public ListUsersResponse list(ListUsersRequest request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    return apiClient.GET(path, request, ListUsersResponse.class, "application/json");
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public PasswordPermissions setPasswordPermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    return apiClient.PUT(path, request, PasswordPermissions.class);
  }

  @Override
  public void update(User request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }

  @Override
  public PasswordPermissions updatePasswordPermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    return apiClient.PATCH(path, request, PasswordPermissions.class);
  }
}
