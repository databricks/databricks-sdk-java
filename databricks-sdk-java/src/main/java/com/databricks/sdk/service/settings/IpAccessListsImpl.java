// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of IpAccessLists */
class IpAccessListsImpl implements IpAccessListsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for IpAccessListsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public IpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path = "/api/2.0/ip-access-lists";
    return apiClient.POST(path, request, CreateIpAccessListResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public FetchIpAccessListResponse get(GetIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    return apiClient.GET(path, request, FetchIpAccessListResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetIpAccessListResponse list() {
    String path = "/api/2.0/ip-access-lists";
    return apiClient.GET(path, GetIpAccessListResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void replace(ReplaceIpAccessList request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    apiClient.PUT(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(UpdateIpAccessList request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    apiClient.PATCH(path, request, Void.class);
  }
}
