// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of Shares */
@Generated
class SharesImpl implements SharesService {
  private final ApiClient apiClient;

  public SharesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ShareInfo create(CreateShare request) {
    String path = "/api/2.1/unity-catalog/shares";
    return apiClient.POST(path, request, ShareInfo.class);
  }

  @Override
  public void delete(DeleteShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ShareInfo get(GetShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    return apiClient.GET(path, request, ShareInfo.class, "application/json");
  }

  @Override
  public ListSharesResponse list() {
    String path = "/api/2.1/unity-catalog/shares";
    return apiClient.GET(path, ListSharesResponse.class, "application/json");
  }

  @Override
  public com.databricks.sdk.service.catalog.PermissionsList sharePermissions(
      SharePermissionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    return apiClient.GET(
        path,
        request,
        com.databricks.sdk.service.catalog.PermissionsList.class,
        "application/json");
  }

  @Override
  public ShareInfo update(UpdateShare request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    return apiClient.PATCH(path, request, ShareInfo.class);
  }

  @Override
  public void updatePermissions(UpdateSharePermissions request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    apiClient.PATCH(path, request, Void.class);
  }
}
