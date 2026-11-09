// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of SoftwareArtifacts */
@Generated
class SoftwareArtifactsImpl implements SoftwareArtifactsService {
  private final ApiClient apiClient;

  public SoftwareArtifactsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public SoftwareArtifact getSoftwareArtifact(GetSoftwareArtifactRequest request) {
    String path = String.format("/api/2.1/unity-catalog/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, SoftwareArtifact.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SoftwareArtifactVersion getSoftwareArtifactVersion(
      GetSoftwareArtifactVersionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, SoftwareArtifactVersion.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSoftwareArtifactVersionsResponse listSoftwareArtifactVersions(
      ListSoftwareArtifactVersionsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/%s/versions", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListSoftwareArtifactVersionsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSoftwareArtifactsResponse listSoftwareArtifacts(ListSoftwareArtifactsRequest request) {
    String path = "/api/2.1/unity-catalog/software-artifacts";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListSoftwareArtifactsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveSoftwareArtifactVersionResponse resolveSoftwareArtifactVersion(
      ResolveSoftwareArtifactVersionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/%s/versions:resolve", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ResolveSoftwareArtifactVersionResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SoftwareArtifact updateSoftwareArtifact(UpdateSoftwareArtifactRequest request) {
    String path = String.format("/api/2.1/unity-catalog/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getSoftwareArtifact()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, SoftwareArtifact.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
