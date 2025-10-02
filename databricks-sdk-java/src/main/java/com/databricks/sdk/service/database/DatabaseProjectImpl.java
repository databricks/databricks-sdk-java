// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DatabaseProject */
@Generated
class DatabaseProjectImpl implements DatabaseProjectService {
  private final ApiClient apiClient;

  public DatabaseProjectImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DatabaseBranch createDatabaseBranch(CreateDatabaseBranchRequest request) {
    String path = String.format("/api/2.0/database/projects/%s/branches", request.getProjectId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDatabaseBranch()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseBranch.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseEndpoint createDatabaseEndpoint(CreateDatabaseEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints",
            request.getProjectId(), request.getBranchId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDatabaseEndpoint()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseProject createDatabaseProject(CreateDatabaseProjectRequest request) {
    String path = "/api/2.0/database/projects";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDatabaseProject()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseProject.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatabaseBranch(DeleteDatabaseBranchRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s",
            request.getProjectId(), request.getBranchId());
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
  public void deleteDatabaseEndpoint(DeleteDatabaseEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints/%s",
            request.getProjectId(), request.getBranchId(), request.getEndpointId());
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
  public void deleteDatabaseProject(DeleteDatabaseProjectRequest request) {
    String path = String.format("/api/2.0/database/projects/%s", request.getProjectId());
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
  public DatabaseBranch getDatabaseBranch(GetDatabaseBranchRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s",
            request.getProjectId(), request.getBranchId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseBranch.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseEndpoint getDatabaseEndpoint(GetDatabaseEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints/%s",
            request.getProjectId(), request.getBranchId(), request.getEndpointId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseProject getDatabaseProject(GetDatabaseProjectRequest request) {
    String path = String.format("/api/2.0/database/projects/%s", request.getProjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseProject.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseBranchesResponse listDatabaseBranches(ListDatabaseBranchesRequest request) {
    String path = String.format("/api/2.0/database/projects/%s/branches", request.getProjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseBranchesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseEndpointsResponse listDatabaseEndpoints(ListDatabaseEndpointsRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints",
            request.getProjectId(), request.getBranchId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseEndpointsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseProjectsResponse listDatabaseProjects(ListDatabaseProjectsRequest request) {
    String path = "/api/2.0/database/projects";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseProjectsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseEndpoint restartDatabaseEndpoint(RestartDatabaseEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints/%s/restart",
            request.getProjectId(), request.getBranchId(), request.getEndpointId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseBranch updateDatabaseBranch(UpdateDatabaseBranchRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s",
            request.getProjectId(), request.getBranchId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatabaseBranch()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseBranch.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseEndpoint updateDatabaseEndpoint(UpdateDatabaseEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/database/projects/%s/branches/%s/endpoints/%s",
            request.getProjectId(), request.getBranchId(), request.getEndpointId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatabaseEndpoint()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseProject updateDatabaseProject(UpdateDatabaseProjectRequest request) {
    String path = String.format("/api/2.0/database/projects/%s", request.getProjectId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatabaseProject()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseProject.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
