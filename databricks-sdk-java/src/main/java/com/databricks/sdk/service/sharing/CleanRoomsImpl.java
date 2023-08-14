// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CleanRooms */
@Generated
class CleanRoomsImpl implements CleanRoomsService {
  private final ApiClient apiClient;

  public CleanRoomsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CleanRoomInfo create(CreateCleanRoom request) {
    String path = "/api/2.1/unity-catalog/clean-rooms";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, CleanRoomInfo.class, headers);
  }

  @Override
  public void delete(DeleteCleanRoomRequest request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public CleanRoomInfo get(GetCleanRoomRequest request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, CleanRoomInfo.class, headers);
  }

  @Override
  public ListCleanRoomsResponse list() {
    String path = "/api/2.1/unity-catalog/clean-rooms";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, ListCleanRoomsResponse.class, headers);
  }

  @Override
  public CleanRoomInfo update(UpdateCleanRoom request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PATCH(path, request, CleanRoomInfo.class, headers);
  }
}
