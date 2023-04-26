// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Users */
class UsersImpl implements UsersService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for UsersImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public UsersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public User create(User request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    return apiClient.POST(path, request, User.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public User get(GetUserRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    return apiClient.GET(path, request, User.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListUsersResponse list(ListUsersRequest request) {
    String path = "/api/2.0/preview/scim/v2/Users";
    return apiClient.GET(path, request, ListUsersResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(User request) {
    String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
