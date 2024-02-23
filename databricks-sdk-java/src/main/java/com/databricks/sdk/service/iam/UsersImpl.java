// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, User.class, headers);
  }

  @Override
  public void delete(DeleteUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public User get(GetUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, User.class, headers);
  }

  @Override
  public GetPasswordPermissionLevelsResponse getPermissionLevels() {
    String path = "/api/2.0/permissions/authorization/passwords/permissionLevels";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetPasswordPermissionLevelsResponse.class, headers);
  }

  @Override
  public PasswordPermissions getPermissions() {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, PasswordPermissions.class, headers);
  }

  @Override
  public ListUsersResponse list(ListUsersRequest request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListUsersResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, PatchResponse.class, headers);
  }

  @Override
  public PasswordPermissions setPermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, PasswordPermissions.class, headers);
  }

  @Override
  public void update(User request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, UpdateResponse.class, headers);
  }

  @Override
  public PasswordPermissions updatePermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, PasswordPermissions.class, headers);
  }
}
