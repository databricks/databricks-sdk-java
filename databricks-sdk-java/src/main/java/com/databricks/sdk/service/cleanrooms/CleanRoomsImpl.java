// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getCleanRoom()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CleanRoom.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      CreateCleanRoomOutputCatalogRequest request) {
    String path =
        String.format("/api/2.0/clean-rooms/%s/output-catalogs", request.getCleanRoomName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getOutputCatalog()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateCleanRoomOutputCatalogResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CleanRoom get(GetCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CleanRoom.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCleanRoomsResponse list(ListCleanRoomsRequest request) {
    String path = "/api/2.0/clean-rooms";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListCleanRoomsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CleanRoom update(UpdateCleanRoomRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CleanRoom.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
