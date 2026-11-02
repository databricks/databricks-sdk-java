// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.UUID;

/** Package-local implementation of ComputeMigrations */
@Generated
class ComputeMigrationsImpl implements ComputeMigrationsService {
  private final ApiClient apiClient;

  public ComputeMigrationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Migration approveMigrationExecution(ApproveMigrationExecutionRequest request) {
    String path =
        String.format(
            "/api/compute-migrations/v1/migrations/%s/approveExecution", request.getMigrationId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration approveMigrationTranslation(ApproveMigrationTranslationRequest request) {
    String path =
        String.format(
            "/api/compute-migrations/v1/migrations/%s/approveTranslation",
            request.getMigrationId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration cancelMigration(CancelMigrationRequest request) {
    String path =
        String.format("/api/compute-migrations/v1/migrations/%s/cancel", request.getMigrationId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration create(CreateMigrationRequest request) {
    String path = "/api/compute-migrations/v1/migrations";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getMigration()));

      if (request.getRequestId() == null || request.getRequestId().isEmpty()) {
        request.setRequestId(UUID.randomUUID().toString());
      }
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration delete(DeleteMigrationRequest request) {
    String path =
        String.format("/api/compute-migrations/v1/migrations/%s", request.getMigrationId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration get(GetMigrationRequest request) {
    String path =
        String.format("/api/compute-migrations/v1/migrations/%s", request.getMigrationId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListMigrationsResponse list(ListMigrationsRequest request) {
    String path = "/api/compute-migrations/v1/migrations";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListMigrationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration rejectMigrationExecution(RejectMigrationExecutionRequest request) {
    String path =
        String.format(
            "/api/compute-migrations/v1/migrations/%s/rejectExecution", request.getMigrationId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Migration rejectMigrationTranslation(RejectMigrationTranslationRequest request) {
    String path =
        String.format(
            "/api/compute-migrations/v1/migrations/%s/rejectTranslation", request.getMigrationId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Migration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
