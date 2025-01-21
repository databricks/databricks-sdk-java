// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountIpAccessLists */
@Generated
class AccountIpAccessListsImpl implements AccountIpAccessListsService {
  private final ApiClient apiClient;

  public AccountIpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path =
        String.format("/api/2.0/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateIpAccessListResponse.class, headers);
  }

  @Override
  public void delete(DeleteAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public GetIpAccessListResponse get(GetAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetIpAccessListResponse.class, headers);
  }

  @Override
  public GetIpAccessListsResponse list() {
    String path =
        String.format("/api/2.0/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, GetIpAccessListsResponse.class, headers);
  }

  @Override
  public void replace(ReplaceIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PUT", path, request, ReplaceResponse.class, headers);
  }

  @Override
  public void update(UpdateIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, UpdateResponse.class, headers);
  }
}
