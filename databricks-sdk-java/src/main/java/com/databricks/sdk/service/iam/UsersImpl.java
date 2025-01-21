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
    return apiClient.execute("POST", path, request, User.class, headers);
  }

  @Override
  public void delete(DeleteUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public User get(GetUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, User.class, headers);
  }

  @Override
  public GetPasswordPermissionLevelsResponse getPermissionLevels() {
    String path = "/api/2.0/permissions/authorization/passwords/permissionLevels";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, GetPasswordPermissionLevelsResponse.class, headers);
  }

  @Override
  public PasswordPermissions getPermissions() {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, PasswordPermissions.class, headers);
  }

  @Override
  public ListUsersResponse list(ListUsersRequest request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListUsersResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, PatchResponse.class, headers);
  }

  @Override
  public PasswordPermissions setPermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, PasswordPermissions.class, headers);
  }

  @Override
  public void update(User request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PUT", path, request, UpdateResponse.class, headers);
  }

  @Override
  public PasswordPermissions updatePermissions(PasswordPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/passwords";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, PasswordPermissions.class, headers);
  }
}
