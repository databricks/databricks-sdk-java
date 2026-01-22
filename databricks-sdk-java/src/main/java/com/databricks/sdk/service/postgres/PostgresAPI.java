// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.postgres;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Use the Postgres API to create and manage Lakebase Autoscaling Postgres infrastructure, including
 * projects, branches, compute endpoints, and roles.
 *
 * <p>This API manages database infrastructure only. To query or modify data, use the Data API or
 * direct SQL connections.
 *
 * <p>**About resource IDs and names**
 *
 * <p>Resources are identified by hierarchical resource names like
 * `projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}`. The `name` field on each
 * resource contains this full path and is output-only. Note that `name` refers to this resource
 * path, not the user-visible `display_name`.
 */
@Generated
public class PostgresAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PostgresAPI.class);

  private final PostgresService impl;

  /** Regular-use constructor */
  public PostgresAPI(ApiClient apiClient) {
    impl = new PostgresImpl(apiClient);
  }

  /** Constructor for mocks */
  public PostgresAPI(PostgresService mock) {
    impl = mock;
  }

  /** Creates a new database branch in the project. */
  public CreateBranchOperation createBranch(CreateBranchRequest request) {
    Operation operation = impl.createBranch(request);
    return new CreateBranchOperation(impl, operation);
  }

  /** Creates a new compute endpoint in the branch. */
  public CreateEndpointOperation createEndpoint(CreateEndpointRequest request) {
    Operation operation = impl.createEndpoint(request);
    return new CreateEndpointOperation(impl, operation);
  }

  /**
   * Creates a new Lakebase Autoscaling Postgres database project, which contains branches and
   * compute endpoints.
   */
  public CreateProjectOperation createProject(CreateProjectRequest request) {
    Operation operation = impl.createProject(request);
    return new CreateProjectOperation(impl, operation);
  }

  /** Creates a new Postgres role in the branch. */
  public CreateRoleOperation createRole(CreateRoleRequest request) {
    Operation operation = impl.createRole(request);
    return new CreateRoleOperation(impl, operation);
  }

  public DeleteBranchOperation deleteBranch(String name) {
    return deleteBranch(new DeleteBranchRequest().setName(name));
  }

  /** Deletes the specified database branch. */
  public DeleteBranchOperation deleteBranch(DeleteBranchRequest request) {
    Operation operation = impl.deleteBranch(request);
    return new DeleteBranchOperation(impl, operation);
  }

  public DeleteEndpointOperation deleteEndpoint(String name) {
    return deleteEndpoint(new DeleteEndpointRequest().setName(name));
  }

  /** Deletes the specified compute endpoint. */
  public DeleteEndpointOperation deleteEndpoint(DeleteEndpointRequest request) {
    Operation operation = impl.deleteEndpoint(request);
    return new DeleteEndpointOperation(impl, operation);
  }

  public DeleteProjectOperation deleteProject(String name) {
    return deleteProject(new DeleteProjectRequest().setName(name));
  }

  /** Deletes the specified database project. */
  public DeleteProjectOperation deleteProject(DeleteProjectRequest request) {
    Operation operation = impl.deleteProject(request);
    return new DeleteProjectOperation(impl, operation);
  }

  public DeleteRoleOperation deleteRole(String name) {
    return deleteRole(new DeleteRoleRequest().setName(name));
  }

  /** Deletes the specified Postgres role. */
  public DeleteRoleOperation deleteRole(DeleteRoleRequest request) {
    Operation operation = impl.deleteRole(request);
    return new DeleteRoleOperation(impl, operation);
  }

  /** Generate OAuth credentials for a Postgres database. */
  public DatabaseCredential generateDatabaseCredential(GenerateDatabaseCredentialRequest request) {
    return impl.generateDatabaseCredential(request);
  }

  public Branch getBranch(String name) {
    return getBranch(new GetBranchRequest().setName(name));
  }

  /** Retrieves information about the specified database branch. */
  public Branch getBranch(GetBranchRequest request) {
    return impl.getBranch(request);
  }

  public Endpoint getEndpoint(String name) {
    return getEndpoint(new GetEndpointRequest().setName(name));
  }

  /**
   * Retrieves information about the specified compute endpoint, including its connection details
   * and operational state.
   */
  public Endpoint getEndpoint(GetEndpointRequest request) {
    return impl.getEndpoint(request);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  /** Retrieves the status of a long-running operation. */
  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  public Project getProject(String name) {
    return getProject(new GetProjectRequest().setName(name));
  }

  /** Retrieves information about the specified database project. */
  public Project getProject(GetProjectRequest request) {
    return impl.getProject(request);
  }

  public Role getRole(String name) {
    return getRole(new GetRoleRequest().setName(name));
  }

  /**
   * Retrieves information about the specified Postgres role, including its authentication method
   * and permissions.
   */
  public Role getRole(GetRoleRequest request) {
    return impl.getRole(request);
  }

  public Iterable<Branch> listBranches(String parent) {
    return listBranches(new ListBranchesRequest().setParent(parent));
  }

  /** Returns a paginated list of database branches in the project. */
  public Iterable<Branch> listBranches(ListBranchesRequest request) {
    return new Paginator<>(
        request,
        impl::listBranches,
        ListBranchesResponse::getBranches,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Endpoint> listEndpoints(String parent) {
    return listEndpoints(new ListEndpointsRequest().setParent(parent));
  }

  /** Returns a paginated list of compute endpoints in the branch. */
  public Iterable<Endpoint> listEndpoints(ListEndpointsRequest request) {
    return new Paginator<>(
        request,
        impl::listEndpoints,
        ListEndpointsResponse::getEndpoints,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Returns a paginated list of database projects in the workspace that the user has permission to
   * access.
   */
  public Iterable<Project> listProjects(ListProjectsRequest request) {
    return new Paginator<>(
        request,
        impl::listProjects,
        ListProjectsResponse::getProjects,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Role> listRoles(String parent) {
    return listRoles(new ListRolesRequest().setParent(parent));
  }

  /** Returns a paginated list of Postgres roles in the branch. */
  public Iterable<Role> listRoles(ListRolesRequest request) {
    return new Paginator<>(
        request,
        impl::listRoles,
        ListRolesResponse::getRoles,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates the specified database branch. You can set this branch as the project's default branch,
   * or protect/unprotect it.
   */
  public UpdateBranchOperation updateBranch(UpdateBranchRequest request) {
    Operation operation = impl.updateBranch(request);
    return new UpdateBranchOperation(impl, operation);
  }

  /**
   * Updates the specified compute endpoint. You can update autoscaling limits, suspend timeout, or
   * enable/disable the compute endpoint.
   */
  public UpdateEndpointOperation updateEndpoint(UpdateEndpointRequest request) {
    Operation operation = impl.updateEndpoint(request);
    return new UpdateEndpointOperation(impl, operation);
  }

  /** Updates the specified database project. */
  public UpdateProjectOperation updateProject(UpdateProjectRequest request) {
    Operation operation = impl.updateProject(request);
    return new UpdateProjectOperation(impl, operation);
  }

  public PostgresService impl() {
    return impl;
  }
}
