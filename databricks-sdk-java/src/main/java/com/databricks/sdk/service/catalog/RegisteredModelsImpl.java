// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of RegisteredModels */
@Generated
class RegisteredModelsImpl implements RegisteredModelsService {
  private final ApiClient apiClient;

  public RegisteredModelsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RegisteredModelInfo create(CreateRegisteredModelRequest request) {
    String path = "/api/2.1/unity-catalog/models";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RegisteredModelInfo.class, headers);
  }

  @Override
  public void delete(DeleteRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void deleteAlias(DeleteAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public RegisteredModelInfo get(GetRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, RegisteredModelInfo.class, headers);
  }

  @Override
  public ListRegisteredModelsResponse list(ListRegisteredModelsRequest request) {
    String path = "/api/2.1/unity-catalog/models";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListRegisteredModelsResponse.class, headers);
  }

  @Override
  public RegisteredModelAlias setAlias(SetRegisteredModelAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, RegisteredModelAlias.class, headers);
  }

  @Override
  public RegisteredModelInfo update(UpdateRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, RegisteredModelInfo.class, headers);
  }
}
