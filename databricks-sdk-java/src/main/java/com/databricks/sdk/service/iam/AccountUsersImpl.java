// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, User.class, headers);
  }

  @Override
  public void delete(DeleteAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public User get(GetAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, User.class, headers);
  }

  @Override
  public ListUsersResponse list(ListAccountUsersRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Users", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListUsersResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, PatchResponse.class, headers);
  }

  @Override
  public void update(User request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, UpdateResponse.class, headers);
  }
}
