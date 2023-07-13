// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, CleanRoomInfo.class);
  }

  @Override
  public void delete(DeleteCleanRoomRequest request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public CleanRoomInfo get(GetCleanRoomRequest request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    return apiClient.GET(path, request, CleanRoomInfo.class);
  }

  @Override
  public ListCleanRoomsResponse list() {
    String path = "/api/2.1/unity-catalog/clean-rooms";
    return apiClient.GET(path, ListCleanRoomsResponse.class);
  }

  @Override
  public CleanRoomInfo update(UpdateCleanRoom request) {
    String path = String.format("/api/2.1/unity-catalog/clean-rooms/%s", request.getNameArg());
    return apiClient.PATCH(path, request, CleanRoomInfo.class);
  }
}
