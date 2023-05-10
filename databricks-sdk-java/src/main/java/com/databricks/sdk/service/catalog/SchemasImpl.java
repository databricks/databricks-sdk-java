// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, SchemaInfo.class);
  }

  @Override
  public void delete(DeleteSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public SchemaInfo get(GetSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    return apiClient.GET(path, request, SchemaInfo.class);
  }

  @Override
  public ListSchemasResponse list(ListSchemasRequest request) {
    String path = "/api/2.1/unity-catalog/schemas";
    return apiClient.GET(path, request, ListSchemasResponse.class);
  }

  @Override
  public SchemaInfo update(UpdateSchema request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    return apiClient.PATCH(path, request, SchemaInfo.class);
  }
}
