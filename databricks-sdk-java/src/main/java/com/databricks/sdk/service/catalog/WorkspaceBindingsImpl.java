// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of WorkspaceBindings */
@Generated
class WorkspaceBindingsImpl implements WorkspaceBindingsService {
  private final ApiClient apiClient;

  public WorkspaceBindingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetCatalogWorkspaceBindingsResponse get(GetWorkspaceBindingRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, GetCatalogWorkspaceBindingsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetWorkspaceBindingsResponse getBindings(GetBindingsRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/bindings/%s/%s",
            request.getSecurableType(), request.getSecurableName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, GetWorkspaceBindingsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateCatalogWorkspaceBindingsResponse update(UpdateWorkspaceBindings request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, UpdateCatalogWorkspaceBindingsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateWorkspaceBindingsResponse updateBindings(UpdateWorkspaceBindingsParameters request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/bindings/%s/%s",
            request.getSecurableType(), request.getSecurableName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, UpdateWorkspaceBindingsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
