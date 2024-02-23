// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of IpAccessLists */
@Generated
class IpAccessListsImpl implements IpAccessListsService {
  private final ApiClient apiClient;

  public IpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path = "/api/2.0/ip-access-lists";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateIpAccessListResponse.class, headers);
  }

  @Override
  public void delete(DeleteIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public FetchIpAccessListResponse get(GetIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, FetchIpAccessListResponse.class, headers);
  }

  @Override
  public ListIpAccessListResponse list() {
    String path = "/api/2.0/ip-access-lists";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListIpAccessListResponse.class, headers);
  }

  @Override
  public void replace(ReplaceIpAccessList request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, ReplaceResponse.class, headers);
  }

  @Override
  public void update(UpdateIpAccessList request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, UpdateResponse.class, headers);
  }
}
