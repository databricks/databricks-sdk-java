// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, SchemaInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
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
  public SchemaInfo get(GetSchemaRequest request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, SchemaInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSchemasResponse list(ListSchemasRequest request) {
    String path = "/api/2.1/unity-catalog/schemas";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListSchemasResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SchemaInfo update(UpdateSchema request) {
    String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, SchemaInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
