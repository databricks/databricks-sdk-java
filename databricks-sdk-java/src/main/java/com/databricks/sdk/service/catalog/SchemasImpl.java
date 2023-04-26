// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Schemas */
class SchemasImpl implements SchemasService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for SchemasImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public SchemasImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public SchemaInfo create(CreateSchema request) {
    String path = "/api/2.1/unity-catalog/schemas";
    return apiClient.POST(path, request, SchemaInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public SchemaInfo get(GetSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    return apiClient.GET(path, request, SchemaInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListSchemasResponse list(ListSchemasRequest request) {
    String path = "/api/2.1/unity-catalog/schemas";
    return apiClient.GET(path, request, ListSchemasResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public SchemaInfo update(UpdateSchema request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    return apiClient.PATCH(path, request, SchemaInfo.class);
  }
}
