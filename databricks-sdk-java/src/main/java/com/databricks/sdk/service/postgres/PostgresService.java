// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * Use the Postgres API to create and manage Lakebase Autoscaling Postgres infrastructure, including
 * projects, branches, compute endpoints, and roles.
 *
 * <p>This API manages database infrastructure only. To query or modify data, use the Data API or
 * direct SQL connections.
 *
 * <p>**About resource IDs and names**
 *
 * <p>Lakebase APIs use hierarchical resource names in API paths to identify resources, such as
 * `projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}`.
 *
 * <p>When creating a resource, you may optionally provide the final ID component (for example,
 * `project_id`, `branch_id`, or `endpoint_id`). If you do not, the system generates an identifier
 * and uses it as the ID component.
 *
 * <p>The `name` field is output-only and represents the full resource path. Note: The term
 * *resource name* in this API refers to this full, hierarchical identifier (for example,
 * `projects/{project_id}`), not the `display_name` field. The `display_name` is a separate,
 * user-visible label shown in the UI.
 *
 * <p>The `uid` field is a system-generated, immutable identifier intended for internal reference
 * and should not be used to address or locate resources.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PostgresService {
  /** Creates a new database branch in the project. */
  Operation createBranch(CreateBranchRequest createBranchRequest);

  /** Creates a new compute endpoint in the branch. */
  Operation createEndpoint(CreateEndpointRequest createEndpointRequest);

  /**
   * Creates a new Lakebase Autoscaling Postgres database project, which contains branches and
   * compute endpoints.
   */
  Operation createProject(CreateProjectRequest createProjectRequest);

  /** Creates a new Postgres role in the branch. */
  Operation createRole(CreateRoleRequest createRoleRequest);

  /** Deletes the specified database branch. */
  Operation deleteBranch(DeleteBranchRequest deleteBranchRequest);

  /** Deletes the specified compute endpoint. */
  Operation deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Deletes the specified database project. */
  Operation deleteProject(DeleteProjectRequest deleteProjectRequest);

  /** Deletes the specified Postgres role. */
  Operation deleteRole(DeleteRoleRequest deleteRoleRequest);

  /** Generate OAuth credentials for a Postgres database. */
  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  /** Retrieves information about the specified database branch. */
  Branch getBranch(GetBranchRequest getBranchRequest);

  /**
   * Retrieves information about the specified compute endpoint, including its connection details
   * and operational state.
   */
  Endpoint getEndpoint(GetEndpointRequest getEndpointRequest);

  /** Retrieves the status of a long-running operation. */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Retrieves information about the specified database project. */
  Project getProject(GetProjectRequest getProjectRequest);

  /**
   * Retrieves information about the specified Postgres role, including its authentication method
   * and permissions.
   */
  Role getRole(GetRoleRequest getRoleRequest);

  /** Returns a paginated list of database branches in the project. */
  ListBranchesResponse listBranches(ListBranchesRequest listBranchesRequest);

  /** Returns a paginated list of compute endpoints in the branch. */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /**
   * Returns a paginated list of database projects in the workspace that the user has permission to
   * access.
   */
  ListProjectsResponse listProjects(ListProjectsRequest listProjectsRequest);

  /** Returns a paginated list of Postgres roles in the branch. */
  ListRolesResponse listRoles(ListRolesRequest listRolesRequest);

  /**
   * Updates the specified database branch. You can set this branch as the project's default branch,
   * or protect/unprotect it.
   */
  Operation updateBranch(UpdateBranchRequest updateBranchRequest);

  /**
   * Updates the specified compute endpoint. You can update autoscaling limits, suspend timeout, or
   * enable/disable the compute endpoint.
   */
  Operation updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

  /** Updates the specified database project. */
  Operation updateProject(UpdateProjectRequest updateProjectRequest);
}
