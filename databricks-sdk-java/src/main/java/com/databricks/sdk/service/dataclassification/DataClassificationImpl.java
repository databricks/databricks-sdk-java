// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DataClassification */
@Generated
class DataClassificationImpl implements DataClassificationService {
  private final ApiClient apiClient;

  public DataClassificationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CatalogConfig createCatalogConfig(CreateCatalogConfigRequest request) {
    String path = String.format("/api/data-classification/v1/%s/config", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getCatalogConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CatalogConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteCatalogConfig(DeleteCatalogConfigRequest request) {
    String path = String.format("/api/data-classification/v1/%s", request.getName());
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
  public CatalogConfig getCatalogConfig(GetCatalogConfigRequest request) {
    String path = String.format("/api/data-classification/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CatalogConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CatalogConfig updateCatalogConfig(UpdateCatalogConfigRequest request) {
    String path = String.format("/api/data-classification/v1/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getCatalogConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CatalogConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
