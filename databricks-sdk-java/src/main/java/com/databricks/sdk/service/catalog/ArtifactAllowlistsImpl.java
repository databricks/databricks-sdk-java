// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ArtifactAllowlists */
@Generated
class ArtifactAllowlistsImpl implements ArtifactAllowlistsService {
  private final ApiClient apiClient;

  public ArtifactAllowlistsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ArtifactAllowlistInfo get(GetArtifactAllowlistRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/artifact-allowlists/%s", request.getArtifactType());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ArtifactAllowlistInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ArtifactAllowlistInfo update(SetArtifactAllowlist request) {
    String path =
        String.format("/api/2.1/unity-catalog/artifact-allowlists/%s", request.getArtifactType());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ArtifactAllowlistInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
