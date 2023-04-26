// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Shares */
class SharesImpl implements SharesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for SharesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public SharesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ShareInfo create(CreateShare request) {
    String path = "/api/2.1/unity-catalog/shares";
    return apiClient.POST(path, request, ShareInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ShareInfo get(GetShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    return apiClient.GET(path, request, ShareInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListSharesResponse list() {
    String path = "/api/2.1/unity-catalog/shares";
    return apiClient.GET(path, ListSharesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public Object /* MISSING TYPE */ sharePermissions(SharePermissionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    return apiClient.GET(path, request, Object /* MISSING TYPE */.class);
  }

  /** {@inheritDoc} */
  @Override
  public ShareInfo update(UpdateShare request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    return apiClient.PATCH(path, request, ShareInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void updatePermissions(UpdateSharePermissions request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    apiClient.PATCH(path, request, Void.class);
  }
}
