// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * The Postgres API provides access to a Postgres database via REST API or direct SQL.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PostgresService {
  /** Create a Branch. */
  Operation createBranch(CreateBranchRequest createBranchRequest);

  /** Create an Endpoint. */
  Operation createEndpoint(CreateEndpointRequest createEndpointRequest);

  /** Create a Project. */
  Operation createProject(CreateProjectRequest createProjectRequest);

  /** Create a role for a branch. */
  Operation createRole(CreateRoleRequest createRoleRequest);

  /** Delete a Branch. */
  void deleteBranch(DeleteBranchRequest deleteBranchRequest);

  /** Delete an Endpoint. */
  void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Delete a Project. */
  void deleteProject(DeleteProjectRequest deleteProjectRequest);

  /** Delete a role in a branch. */
  Operation deleteRole(DeleteRoleRequest deleteRoleRequest);

  /** Get a Branch. */
  Branch getBranch(GetBranchRequest getBranchRequest);

  /** Get an Endpoint. */
  Endpoint getEndpoint(GetEndpointRequest getEndpointRequest);

  /** Get an Operation. */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Get a Project. */
  Project getProject(GetProjectRequest getProjectRequest);

  /** Get a Role. */
  Role getRole(GetRoleRequest getRoleRequest);

  /** List Branches. */
  ListBranchesResponse listBranches(ListBranchesRequest listBranchesRequest);

  /** List Endpoints. */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /** List Projects. */
  ListProjectsResponse listProjects(ListProjectsRequest listProjectsRequest);

  /** List Roles. */
  ListRolesResponse listRoles(ListRolesRequest listRolesRequest);

  /** Update a Branch. */
  Operation updateBranch(UpdateBranchRequest updateBranchRequest);

  /** Update an Endpoint. */
  Operation updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

  /** Update a Project. */
  Operation updateProject(UpdateProjectRequest updateProjectRequest);
}
