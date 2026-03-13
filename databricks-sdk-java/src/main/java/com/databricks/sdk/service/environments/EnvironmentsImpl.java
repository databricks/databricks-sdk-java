// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.environments;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.UUID;

/** Package-local implementation of Environments */
@Generated
class EnvironmentsImpl implements EnvironmentsService {
  private final ApiClient apiClient;

  public EnvironmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Operation createWorkspaceBaseEnvironment(CreateWorkspaceBaseEnvironmentRequest request) {
    String path = "/api/environments/v1/workspace-base-environments";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceBaseEnvironment()));

      if (request.getRequestId() == null || request.getRequestId().isEmpty()) {
        request.setRequestId(UUID.randomUUID().toString());
      }
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteWorkspaceBaseEnvironment(DeleteWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
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
  public DefaultWorkspaceBaseEnvironment getDefaultWorkspaceBaseEnvironment(
      GetDefaultWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DefaultWorkspaceBaseEnvironment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation getOperation(GetOperationRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceBaseEnvironment getWorkspaceBaseEnvironment(
      GetWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceBaseEnvironment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceBaseEnvironmentsResponse listWorkspaceBaseEnvironments(
      ListWorkspaceBaseEnvironmentsRequest request) {
    String path = "/api/environments/v1/workspace-base-environments";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListWorkspaceBaseEnvironmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation refreshWorkspaceBaseEnvironment(RefreshWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s/refresh", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultWorkspaceBaseEnvironment updateDefaultWorkspaceBaseEnvironment(
      UpdateDefaultWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
    try {
      Request req =
          new Request(
              "PATCH", path, apiClient.serialize(request.getDefaultWorkspaceBaseEnvironment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DefaultWorkspaceBaseEnvironment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation updateWorkspaceBaseEnvironment(UpdateWorkspaceBaseEnvironmentRequest request) {
    String path = String.format("/api/environments/v1/%s", request.getName());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceBaseEnvironment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
