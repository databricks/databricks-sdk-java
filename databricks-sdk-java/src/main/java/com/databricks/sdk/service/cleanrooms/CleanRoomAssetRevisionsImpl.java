// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CleanRoomAssetRevisions */
@Generated
class CleanRoomAssetRevisionsImpl implements CleanRoomAssetRevisionsService {
  private final ApiClient apiClient;

  public CleanRoomAssetRevisionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CleanRoomAsset get(GetCleanRoomAssetRevisionRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s/revisions/%s",
            request.getCleanRoomName(),
            request.getAssetType(),
            request.getName(),
            request.getEtag());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CleanRoomAsset.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCleanRoomAssetRevisionsResponse list(ListCleanRoomAssetRevisionsRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/assets/%s/%s/revisions",
            request.getCleanRoomName(), request.getAssetType(), request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListCleanRoomAssetRevisionsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
