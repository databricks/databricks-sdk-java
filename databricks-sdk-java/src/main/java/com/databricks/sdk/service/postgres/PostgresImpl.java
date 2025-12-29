// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.postgres;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Postgres */
@Generated
class PostgresImpl implements PostgresService {
  private final ApiClient apiClient;

  public PostgresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Operation createBranch(CreateBranchRequest request) {
    String path = String.format("/api/2.0/postgres/%s/branches", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getBranch()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation createEndpoint(CreateEndpointRequest request) {
    String path = String.format("/api/2.0/postgres/%s/endpoints", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getEndpoint()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation createProject(CreateProjectRequest request) {
    String path = "/api/2.0/postgres/projects";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getProject()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation createRole(CreateRoleRequest request) {
    String path = String.format("/api/2.0/postgres/%s/roles", request.getParent());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getRole()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteBranch(DeleteBranchRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
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
  public void deleteEndpoint(DeleteEndpointRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
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
  public void deleteProject(DeleteProjectRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
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
  public Operation deleteRole(DeleteRoleRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Branch getBranch(GetBranchRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Branch.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Endpoint getEndpoint(GetEndpointRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Endpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation getOperation(GetOperationRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Project getProject(GetProjectRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Project.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Role getRole(GetRoleRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Role.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListBranchesResponse listBranches(ListBranchesRequest request) {
    String path = String.format("/api/2.0/postgres/%s/branches", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListBranchesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
    String path = String.format("/api/2.0/postgres/%s/endpoints", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListEndpointsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListProjectsResponse listProjects(ListProjectsRequest request) {
    String path = "/api/2.0/postgres/projects";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListProjectsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListRolesResponse listRoles(ListRolesRequest request) {
    String path = String.format("/api/2.0/postgres/%s/roles", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListRolesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation updateBranch(UpdateBranchRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getBranch()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation updateEndpoint(UpdateEndpointRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getEndpoint()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation updateProject(UpdateProjectRequest request) {
    String path = String.format("/api/2.0/postgres/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getProject()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
