// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CleanRoomAssets */
@Generated
class CleanRoomAssetsImpl implements CleanRoomAssetsService {
  private final ApiClient apiClient;

  public CleanRoomAssetsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CleanRoomAsset create(CreateCleanRoomAssetRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s/assets", request.getCleanRoomName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getAsset(), CleanRoomAsset.class, headers);
  }

  @Override
  public void delete(DeleteCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getAssetFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteCleanRoomAssetResponse.class, headers);
  }

  @Override
  public CleanRoomAsset get(GetCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getAssetFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CleanRoomAsset.class, headers);
  }

  @Override
  public ListCleanRoomAssetsResponse list(ListCleanRoomAssetsRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s/assets", request.getCleanRoomName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListCleanRoomAssetsResponse.class, headers);
  }

  @Override
  public CleanRoomAsset update(UpdateCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request.getAsset(), CleanRoomAsset.class, headers);
  }
}
