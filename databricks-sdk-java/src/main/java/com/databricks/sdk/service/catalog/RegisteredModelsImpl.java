// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RegisteredModelInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
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
  public void deleteAlias(DeleteAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
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
  public RegisteredModelInfo get(GetRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RegisteredModelInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListRegisteredModelsResponse list(ListRegisteredModelsRequest request) {
    String path = "/api/2.1/unity-catalog/models";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListRegisteredModelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RegisteredModelAlias setAlias(SetRegisteredModelAliasRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/models/%s/aliases/%s",
            request.getFullName(), request.getAlias());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RegisteredModelAlias.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RegisteredModelInfo update(UpdateRegisteredModelRequest request) {
    String path = String.format("/api/2.1/unity-catalog/models/%s", request.getFullName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RegisteredModelInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
