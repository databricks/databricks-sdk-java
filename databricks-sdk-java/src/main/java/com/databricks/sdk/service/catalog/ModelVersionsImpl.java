// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ModelVersionInfo get(GetModelVersionRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/versions/%s",
            request.getFullName(), request.getVersion());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ModelVersionInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ModelVersionInfo getByAlias(GetByAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ModelVersionInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListModelVersionsResponse list(ListModelVersionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s/versions", request.getFullName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListModelVersionsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ModelVersionInfo update(UpdateModelVersionRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/versions/%s",
            request.getFullName(), request.getVersion());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ModelVersionInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
