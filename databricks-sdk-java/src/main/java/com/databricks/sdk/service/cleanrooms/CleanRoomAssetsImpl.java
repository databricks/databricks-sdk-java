// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getAsset()));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CleanRoomAsset.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteCleanRoomAssetResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CleanRoomAsset get(GetCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CleanRoomAsset.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCleanRoomAssetsResponse list(ListCleanRoomAssetsRequest request) {
    String path = String.format("/api/2.0/clean-rooms/%s/assets", request.getCleanRoomName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListCleanRoomAssetsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CleanRoomAsset update(UpdateCleanRoomAssetRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s",
            request.getCleanRoomName(), request.getAssetType(), request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getAsset()));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CleanRoomAsset.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
