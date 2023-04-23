// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountIpAccessLists */
class AccountIpAccessListsImpl implements AccountIpAccessListsService {
  private final ApiClient apiClient;

  public AccountIpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    return apiClient.POST(path, request, CreateIpAccessListResponse.class);
  }

  @Override
  public void delete(DeleteAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public GetIpAccessListResponse get(GetAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    return apiClient.GET(path, request, GetIpAccessListResponse.class);
  }

  @Override
  public GetIpAccessListsResponse list() {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    return apiClient.GET(path, GetIpAccessListsResponse.class);
  }

  @Override
  public void replace(ReplaceIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    apiClient.PUT(path, request, Void.class);
  }

  @Override
  public void update(UpdateIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    apiClient.PATCH(path, request, Void.class);
  }
}
