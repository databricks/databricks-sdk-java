// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Schemas */
@Generated
class SchemasImpl implements SchemasService {
  private final ApiClient apiClient;

  public SchemasImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public SchemaInfo create(CreateSchema request) {
    String path = "/api/2.1/unity-catalog/schemas";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, SchemaInfo.class, headers);
  }

  @Override
  public void delete(DeleteSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public SchemaInfo get(GetSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, SchemaInfo.class, headers);
  }

  @Override
  public ListSchemasResponse list(ListSchemasRequest request) {
    String path = "/api/2.1/unity-catalog/schemas";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListSchemasResponse.class, headers);
  }

  @Override
  public SchemaInfo update(UpdateSchema request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, SchemaInfo.class, headers);
  }
}
