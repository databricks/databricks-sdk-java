// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of SystemSchemas */
@Generated
class SystemSchemasImpl implements SystemSchemasService {
  private final ApiClient apiClient;

  public SystemSchemasImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void disable(DisableRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas/%s",
            request.getMetastoreId(), request.getSchemaName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void enable(EnableRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas/%s",
            request.getMetastoreId(), request.getSchemaName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSystemSchemasResponse list(ListSystemSchemasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/metastores/%s/systemschemas", request.getMetastoreId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListSystemSchemasResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
