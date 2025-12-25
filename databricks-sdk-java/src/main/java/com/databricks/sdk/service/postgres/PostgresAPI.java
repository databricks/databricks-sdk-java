// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.postgres;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Postgres API provides access to a Postgres database via REST API or direct SQL. */
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

  /** Create a Branch. */
  public CreateBranchOperation createBranch(CreateBranchRequest request) {
    Operation operation = impl.createBranch(request);
    return new CreateBranchOperation(impl, operation);
  }

  /** Create an Endpoint. */
  public CreateEndpointOperation createEndpoint(CreateEndpointRequest request) {
    Operation operation = impl.createEndpoint(request);
    return new CreateEndpointOperation(impl, operation);
  }

  /** Create a Project. */
  public CreateProjectOperation createProject(CreateProjectRequest request) {
    Operation operation = impl.createProject(request);
    return new CreateProjectOperation(impl, operation);
  }

  /** Create a role for a branch. */
  public CreateRoleOperation createRole(CreateRoleRequest request) {
    Operation operation = impl.createRole(request);
    return new CreateRoleOperation(impl, operation);
  }

  public void deleteBranch(String name) {
    deleteBranch(new DeleteBranchRequest().setName(name));
  }

  /** Delete a Branch. */
  public void deleteBranch(DeleteBranchRequest request) {
    impl.deleteBranch(request);
  }

  public void deleteEndpoint(String name) {
    deleteEndpoint(new DeleteEndpointRequest().setName(name));
  }

  /** Delete an Endpoint. */
  public void deleteEndpoint(DeleteEndpointRequest request) {
    impl.deleteEndpoint(request);
  }

  public void deleteProject(String name) {
    deleteProject(new DeleteProjectRequest().setName(name));
  }

  /** Delete a Project. */
  public void deleteProject(DeleteProjectRequest request) {
    impl.deleteProject(request);
  }

  public DeleteRoleOperation deleteRole(String name) {
    return deleteRole(new DeleteRoleRequest().setName(name));
  }

  /** Delete a role in a branch. */
  public DeleteRoleOperation deleteRole(DeleteRoleRequest request) {
    Operation operation = impl.deleteRole(request);
    return new DeleteRoleOperation(impl, operation);
  }

  public Branch getBranch(String name) {
    return getBranch(new GetBranchRequest().setName(name));
  }

  /** Get a Branch. */
  public Branch getBranch(GetBranchRequest request) {
    return impl.getBranch(request);
  }

  public Endpoint getEndpoint(String name) {
    return getEndpoint(new GetEndpointRequest().setName(name));
  }

  /** Get an Endpoint. */
  public Endpoint getEndpoint(GetEndpointRequest request) {
    return impl.getEndpoint(request);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  /** Get an Operation. */
  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  public Project getProject(String name) {
    return getProject(new GetProjectRequest().setName(name));
  }

  /** Get a Project. */
  public Project getProject(GetProjectRequest request) {
    return impl.getProject(request);
  }

  public Role getRole(String name) {
    return getRole(new GetRoleRequest().setName(name));
  }

  /** Get a Role. */
  public Role getRole(GetRoleRequest request) {
    return impl.getRole(request);
  }

  public Iterable<Branch> listBranches(String parent) {
    return listBranches(new ListBranchesRequest().setParent(parent));
  }

  /** List Branches. */
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

  /** List Endpoints. */
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

  /** List Projects. */
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

  /** List Roles. */
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

  /** Update a Branch. */
  public UpdateBranchOperation updateBranch(UpdateBranchRequest request) {
    Operation operation = impl.updateBranch(request);
    return new UpdateBranchOperation(impl, operation);
  }

  /** Update an Endpoint. */
  public UpdateEndpointOperation updateEndpoint(UpdateEndpointRequest request) {
    Operation operation = impl.updateEndpoint(request);
    return new UpdateEndpointOperation(impl, operation);
  }

  /** Update a Project. */
  public UpdateProjectOperation updateProject(UpdateProjectRequest request) {
    Operation operation = impl.updateProject(request);
    return new UpdateProjectOperation(impl, operation);
  }

  public PostgresService impl() {
    return impl;
  }
}
