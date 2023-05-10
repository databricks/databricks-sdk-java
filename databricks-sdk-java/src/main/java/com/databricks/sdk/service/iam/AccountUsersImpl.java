// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of AccountUsers */
@Generated
class AccountUsersImpl implements AccountUsersService {
  private final ApiClient apiClient;

  public AccountUsersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public User create(User request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Users", apiClient.configuredAccountID());
    return apiClient.POST(path, request, User.class);
  }

  @Override
  public void delete(DeleteAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public User get(GetAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    return apiClient.GET(path, request, User.class);
  }

  @Override
  public ListUsersResponse list(ListAccountUsersRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Users", apiClient.configuredAccountID());
    return apiClient.GET(path, request, ListUsersResponse.class);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public void update(User request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
