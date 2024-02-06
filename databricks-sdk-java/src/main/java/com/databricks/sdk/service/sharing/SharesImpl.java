// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ShareInfo.class, headers);
  }

  @Override
  public void delete(DeleteShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public ShareInfo get(GetShareRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ShareInfo.class, headers);
  }

  @Override
  public ListSharesResponse list() {
    String path = "/api/2.1/unity-catalog/shares";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListSharesResponse.class, headers);
  }

  @Override
  public com.databricks.sdk.service.catalog.PermissionsList sharePermissions(
      SharePermissionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(
        path, null, com.databricks.sdk.service.catalog.PermissionsList.class, headers);
  }

  @Override
  public ShareInfo update(UpdateShare request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ShareInfo.class, headers);
  }

  @Override
  public void updatePermissions(UpdateSharePermissions request) {
    String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }
}
