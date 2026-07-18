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
 * <p>Resources are identified by hierarchical resource names like
 * `projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}`. The `name` field on each
 * resource contains this full path and is output-only. Note that `name` refers to this resource
 * path, not the user-visible `display_name`.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PostgresService {
  /** Creates a new database branch in the project. */
  Operation createBranch(CreateBranchRequest createBranchRequest);

  /** Register a Postgres database in the Unity Catalog. */
  Operation createCatalog(CreateCatalogRequest createCatalogRequest);

  /**
   * Create a CDF configuration that materializes the change data feed for all tables in a Postgres
   * schema as open-format Delta tables in Unity Catalog. Once created, each table's change history
   * is continuously written to its corresponding Lakehouse table.
   */
  Operation createCdfConfig(CreateCdfConfigRequest createCdfConfigRequest);

  /** Enable Data API for a database. */
  Operation createDataApi(CreateDataApiRequest createDataApiRequest);

  /**
   * Create a Database.
   *
   * <p>Creates a database in the specified branch. A branch can have multiple databases.
   */
  Operation createDatabase(CreateDatabaseRequest createDatabaseRequest);

  /** Creates a new compute endpoint in the branch. */
  Operation createEndpoint(CreateEndpointRequest createEndpointRequest);

  /**
   * Creates a new Lakebase Autoscaling Postgres database project, which contains branches and
   * compute endpoints.
   */
  Operation createProject(CreateProjectRequest createProjectRequest);

  /** Creates a new Postgres role in the branch. */
  Operation createRole(CreateRoleRequest createRoleRequest);

  /** Create a Synced Table. */
  Operation createSyncedTable(CreateSyncedTableRequest createSyncedTableRequest);

  /** Deletes the specified database branch. */
  Operation deleteBranch(DeleteBranchRequest deleteBranchRequest);

  /** Delete a Database Catalog. */
  Operation deleteCatalog(DeleteCatalogRequest deleteCatalogRequest);

  /**
   * Delete a CDF configuration and stop materializing the change data feed. When force=true, also
   * drops the Delta tables in Unity Catalog. When force=false (default), the existing tables are
   * preserved at their last state.
   */
  Operation deleteCdfConfig(DeleteCdfConfigRequest deleteCdfConfigRequest);

  /** Disable Data API for a database. */
  Operation deleteDataApi(DeleteDataApiRequest deleteDataApiRequest);

  /** Delete a Database. */
  Operation deleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest);

  /** Deletes the specified compute endpoint. */
  Operation deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Deletes the specified database project. */
  Operation deleteProject(DeleteProjectRequest deleteProjectRequest);

  /** Deletes the specified Postgres role. */
  Operation deleteRole(DeleteRoleRequest deleteRoleRequest);

  /** Delete a Synced Table. */
  Operation deleteSyncedTable(DeleteSyncedTableRequest deleteSyncedTableRequest);

  /** Generate OAuth credentials for a Postgres database. */
  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  /** Retrieves information about the specified database branch. */
  Branch getBranch(GetBranchRequest getBranchRequest);

  /** Get a Database Catalog. */
  Catalog getCatalog(GetCatalogRequest getCatalogRequest);

  /**
   * Get a single Lakebase CDF configuration, including the source Postgres schema, target Unity
   * Catalog schema, and the identity under which writes are authorized.
   */
  CdfConfig getCdfConfig(GetCdfConfigRequest getCdfConfigRequest);

  /**
   * Get the CDF status of a single table within a Lakebase CDF configuration, including its current
   * state and the last committed position in the feed.
   */
  CdfStatus getCdfStatus(GetCdfStatusRequest getCdfStatusRequest);

  /** Get Data API configuration for a database. */
  DataApi getDataApi(GetDataApiRequest getDataApiRequest);

  /** Get a Database. */
  Database getDatabase(GetDatabaseRequest getDatabaseRequest);

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

  /** Get a Synced Table. */
  SyncedTable getSyncedTable(GetSyncedTableRequest getSyncedTableRequest);

  /** Returns a paginated list of database branches in the project. */
  ListBranchesResponse listBranches(ListBranchesRequest listBranchesRequest);

  /**
   * List all CDF configurations for a Lakebase database. Each configuration maps a Postgres schema
   * to a Unity Catalog schema where the change data feed is materialized.
   */
  ListCdfConfigsResponse listCdfConfigs(ListCdfConfigsRequest listCdfConfigsRequest);

  /**
   * List the per-table CDF statuses within a Lakebase CDF configuration. Each status shows whether
   * a table's change data feed is snapshotting, streaming, or skipped.
   */
  ListCdfStatusesResponse listCdfStatuses(ListCdfStatusesRequest listCdfStatusesRequest);

  /** List Databases. */
  ListDatabasesResponse listDatabases(ListDatabasesRequest listDatabasesRequest);

  /** Returns a paginated list of compute endpoints in the branch. */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /**
   * Returns a paginated list of database projects in the workspace that the user has permission to
   * access.
   */
  ListProjectsResponse listProjects(ListProjectsRequest listProjectsRequest);

  /** Returns a paginated list of Postgres roles in the branch. */
  ListRolesResponse listRoles(ListRolesRequest listRolesRequest);

  /** Undeletes the specified database branch. */
  Operation undeleteBranch(UndeleteBranchRequest undeleteBranchRequest);

  /** Undeletes a soft-deleted project. */
  Operation undeleteProject(UndeleteProjectRequest undeleteProjectRequest);

  /**
   * Updates the specified database branch. You can set this branch as the project's default branch,
   * or protect/unprotect it.
   */
  Operation updateBranch(UpdateBranchRequest updateBranchRequest);

  /** Update Data API configuration for a database. */
  Operation updateDataApi(UpdateDataApiRequest updateDataApiRequest);

  /** Update a Database. */
  Operation updateDatabase(UpdateDatabaseRequest updateDatabaseRequest);

  /**
   * Updates the specified compute endpoint. You can update autoscaling limits, suspend timeout, or
   * enable/disable the compute endpoint.
   */
  Operation updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

  /** Updates the specified database project. */
  Operation updateProject(UpdateProjectRequest updateProjectRequest);

  /** Update a role for a branch. */
  Operation updateRole(UpdateRoleRequest updateRoleRequest);
}
