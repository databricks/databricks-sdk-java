// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ArtifactAllowlistInfo.class, headers);
  }

  @Override
  public ArtifactAllowlistInfo update(SetArtifactAllowlist request) {
    String path =
        String.format("/api/2.1/unity-catalog/artifact-allowlists/%s", request.getArtifactType());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ArtifactAllowlistInfo.class, headers);
  }
}
