// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of GenieMigrate */
@Generated
class GenieMigrateImpl implements GenieMigrateService {
  private final ApiClient apiClient;

  public GenieMigrateImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AddProjectFilesResponse addFiles(AddProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files:add", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, AddProjectFilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void cancelOperation(CancelOperationRequest request) {
    String path = String.format("/api/2.0/migrations/%s/cancel", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation convertProjectFiles(ConvertProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files:convert", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Project create(CreateProjectRequest request) {
    String path = "/api/2.0/migrations/projects";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getProject()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Project.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteProjectRequest request) {
    String path = String.format("/api/2.0/migrations/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Project get(GetProjectRequest request) {
    String path = String.format("/api/2.0/migrations/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Project.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ProjectFile getFile(GetProjectFileRequest request) {
    String path = String.format("/api/2.0/migrations/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ProjectFile.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation getOperation(GetOperationRequest request) {
    String path = String.format("/api/2.0/migrations/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListProjectsResponse list(ListProjectsRequest request) {
    String path = "/api/2.0/migrations/projects";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListProjectsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListProjectFilesResponse listFiles(ListProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListProjectFilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RemoveProjectFilesResponse removeFiles(RemoveProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files:remove", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RemoveProjectFilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ReviewProjectFilesResponse reviewProjectFiles(ReviewProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files:review", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ReviewProjectFilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UnreviewProjectFilesResponse unreviewProjectFiles(UnreviewProjectFilesRequest request) {
    String path = String.format("/api/2.0/migrations/%s/files:unreview", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, UnreviewProjectFilesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Project update(UpdateProjectRequest request) {
    String path = String.format("/api/2.0/migrations/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getProject()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Project.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
