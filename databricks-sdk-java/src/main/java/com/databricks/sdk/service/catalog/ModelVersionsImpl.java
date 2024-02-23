// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ModelVersions */
@Generated
class ModelVersionsImpl implements ModelVersionsService {
  private final ApiClient apiClient;

  public ModelVersionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void delete(DeleteModelVersionRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/versions/%s",
            request.getFullName(), request.getVersion());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public RegisteredModelInfo get(GetModelVersionRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/versions/%s",
            request.getFullName(), request.getVersion());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, RegisteredModelInfo.class, headers);
  }

  @Override
  public ModelVersionInfo getByAlias(GetByAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ModelVersionInfo.class, headers);
  }

  @Override
  public ListModelVersionsResponse list(ListModelVersionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s/versions", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListModelVersionsResponse.class, headers);
  }

  @Override
  public ModelVersionInfo update(UpdateModelVersionRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/versions/%s",
            request.getFullName(), request.getVersion());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ModelVersionInfo.class, headers);
  }
}
