// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountGroups */
@Generated
class AccountGroupsImpl implements AccountGroupsService {
  private final ApiClient apiClient;

  public AccountGroupsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Group create(Group request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Group.class, headers);
  }

  @Override
  public void delete(DeleteAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public Group get(GetAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Group.class, headers);
  }

  @Override
  public ListGroupsResponse list(ListAccountGroupsRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListGroupsResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, PatchResponse.class, headers);
  }

  @Override
  public void update(Group request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PUT", path, request, UpdateResponse.class, headers);
  }
}
