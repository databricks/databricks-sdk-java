// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Users */
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
    return apiClient.GET(path, request, User.class);
  }

  @Override
  public ListUsersResponse list(ListUsersRequest request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    return apiClient.GET(path, request, ListUsersResponse.class);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public void update(User request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
