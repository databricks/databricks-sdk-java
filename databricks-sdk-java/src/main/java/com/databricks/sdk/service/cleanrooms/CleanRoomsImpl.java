// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

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
  public CleanRoom create(CreateCleanRoomRequest request) {
    String path = "/api/2.0/clean-rooms";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getCleanRoom(), CleanRoom.class, headers);
  }

  @Override
  public CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      CreateCleanRoomOutputCatalogRequest request) {
    String path =
        String.format("/api/2.0/clean-rooms/%s/output-catalogs", request.getCleanRoomName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(
        path, request.getOutputCatalog(), CreateCleanRoomOutputCatalogResponse.class, headers);
  }

  @Override
  public void delete(DeleteCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public CleanRoom get(GetCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CleanRoom.class, headers);
  }

  @Override
  public ListCleanRoomsResponse list(ListCleanRoomsRequest request) {
    String path = "/api/2.0/clean-rooms";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListCleanRoomsResponse.class, headers);
  }

  @Override
  public CleanRoom update(UpdateCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CleanRoom.class, headers);
  }
}
