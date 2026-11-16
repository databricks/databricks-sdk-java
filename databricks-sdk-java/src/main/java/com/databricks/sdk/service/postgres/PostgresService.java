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
  /** Acknowledges non-blocking warnings on a specific assessment. */
  Operation acknowledgeAssessmentWarnings(
      AcknowledgeAssessmentWarningsRequest acknowledgeAssessmentWarningsRequest);

  /** Creates an immutable assessment run for the migration's current source configuration. */
  Operation assessMigration(AssessMigrationRequest assessMigrationRequest);

  /** Creates a new database branch in the project. */
  Operation createBranch(CreateBranchRequest createBranchRequest);

  /**
   * Registers a Postgres database from a Lakebase project branch as a catalog in Unity Catalog, so
   * that its schemas, tables and views are governed and discoverable through Unity Catalog. The
   * catalog is read-only; the data stays managed through Postgres. Returns a long-running
   * operation. Poll it until done is true; its response holds the new catalog. For an overview, see
   * https://docs.databricks.com/aws/en/oltp/projects/register-uc.
   */
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

  /**
   * Creates a compute endpoint in the branch. Each branch gets its read-write endpoint when the
   * branch is created, so use this method to add read-only endpoints (read replicas) or, with
   * `replace_existing`, to reconfigure the existing read-write endpoint.
   */
  Operation createEndpoint(CreateEndpointRequest createEndpointRequest);

  /** Creates a migration. */
  Operation createMigration(CreateMigrationRequest createMigrationRequest);

  /**
   * Creates a new Lakebase Autoscaling Postgres database project, which contains branches and
   * compute endpoints. The new project starts with a single branch, a read-write compute endpoint
   * on that branch, a Postgres database named `databricks_postgres`, and a Postgres role for the
   * calling identity.
   */
  Operation createProject(CreateProjectRequest createProjectRequest);

  /** Creates a new Postgres role in the branch. */
  Operation createRole(CreateRoleRequest createRoleRequest);

  /** Creates a snapshot, an immutable point-in-time copy of a branch's data, within the project. */
  Operation createSnapshot(CreateSnapshotRequest createSnapshotRequest);

  /** Create a Synced Table. */
  Operation createSyncedTable(CreateSyncedTableRequest createSyncedTableRequest);

  /** Deletes the specified database branch. */
  Operation deleteBranch(DeleteBranchRequest deleteBranchRequest);

  /**
   * Deletes the catalog from Unity Catalog. The Postgres database and its tables remain in the
   * branch, and the database can be registered again afterwards. Returns a long-running operation.
   * Poll it until done is true.
   */
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

  /**
   * Deletes the specified compute endpoint. Deletion is permanent. Only read-only endpoints can be
   * deleted this way, because a branch's read-write endpoint is deleted together with the branch.
   * To stop the compute costs of a read-write endpoint without deleting the branch, set
   * `spec.disabled` to true.
   */
  Operation deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

  /** Soft-deletes a migration. */
  Operation deleteMigration(DeleteMigrationRequest deleteMigrationRequest);

  /**
   * Deletes the specified database project. By default the project is soft-deleted and can be
   * restored with Undelete during its retention period; set `purge` to delete it permanently.
   */
  Operation deleteProject(DeleteProjectRequest deleteProjectRequest);

  /** Deletes the specified Postgres role. */
  Operation deleteRole(DeleteRoleRequest deleteRoleRequest);

  /** Deletes the specified snapshot. */
  Operation deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

  /** Delete a Synced Table. */
  Operation deleteSyncedTable(DeleteSyncedTableRequest deleteSyncedTableRequest);

  /** Generate OAuth credentials for a Postgres database. */
  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  /** Gets a migration assessment run. */
  Assessment getAssessment(GetAssessmentRequest getAssessmentRequest);

  /** Retrieves information about the specified database branch. */
  Branch getBranch(GetBranchRequest getBranchRequest);

  /**
   * Gets the catalog with the given name. The status reports the Postgres database, project and
   * branch that the catalog registers.
   */
  Catalog getCatalog(GetCatalogRequest getCatalogRequest);

  /**
   * Get a single Lakebase CDF configuration, including the source Postgres schema and target Unity
   * Catalog schema.
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

  /** Gets a migration. */
  Migration getMigration(GetMigrationRequest getMigrationRequest);

  /** Retrieves the status of a long-running operation. */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Retrieves information about the specified database project. */
  Project getProject(GetProjectRequest getProjectRequest);

  /**
   * Retrieves information about the specified Postgres role, including its authentication method
   * and permissions.
   */
  Role getRole(GetRoleRequest getRoleRequest);

  /** Retrieves information about the specified snapshot. */
  Snapshot getSnapshot(GetSnapshotRequest getSnapshotRequest);

  /**
   * Retrieves the snapshot schedule for a branch. A branch with no configured schedule returns an
   * empty schedule (not NOT_FOUND).
   */
  SnapshotSchedule getSnapshotSchedule(GetSnapshotScheduleRequest getSnapshotScheduleRequest);

  /** Get a Synced Table. */
  SyncedTable getSyncedTable(GetSyncedTableRequest getSyncedTableRequest);

  /** Lists assessment runs for a migration. */
  ListAssessmentsResponse listAssessments(ListAssessmentsRequest listAssessmentsRequest);

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

  /**
   * Lists the compute endpoints in the branch, including its read-write endpoint and any read-only
   * endpoints.
   */
  ListEndpointsResponse listEndpoints(ListEndpointsRequest listEndpointsRequest);

  /** Lists migrations in the workspace. */
  ListMigrationsResponse listMigrations(ListMigrationsRequest listMigrationsRequest);

  /**
   * Returns a paginated list of database projects in the workspace that the user has permission to
   * access.
   */
  ListProjectsResponse listProjects(ListProjectsRequest listProjectsRequest);

  /** Returns a paginated list of Postgres roles in the branch. */
  ListRolesResponse listRoles(ListRolesRequest listRolesRequest);

  /** Returns a paginated list of snapshots in the project. */
  ListSnapshotsResponse listSnapshots(ListSnapshotsRequest listSnapshotsRequest);

  /** Reveals the current password for a password-authenticated Postgres role. */
  RevealRolePasswordResponse revealRolePassword(
      RevealRolePasswordRequest revealRolePasswordRequest);

  /**
   * Starts the assessed migration named in the request, moving it from READY_TO_START into
   * execution. Its first phase, SCHEMA_LOAD, creates the target databases, roles, and schema on the
   * migration's target Lakebase branch without copying any table data, ahead of INITIAL_DATA_LOAD.
   */
  Operation startMigration(StartMigrationRequest startMigrationRequest);

  /** Undeletes the specified database branch. */
  Operation undeleteBranch(UndeleteBranchRequest undeleteBranchRequest);

  /** Restores a soft-deleted migration before it is permanently purged. */
  Operation undeleteMigration(UndeleteMigrationRequest undeleteMigrationRequest);

  /**
   * Restores a soft-deleted project together with its branches and their data, compute endpoints,
   * Postgres databases and roles, project settings, and permissions. A project can be restored
   * until its `purge_time`; after that it is permanently deleted and cannot be recovered.
   */
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
   * Updates the configuration of the specified compute endpoint. Only the `spec` fields named in
   * `update_mask` change, and `spec.endpoint_type` cannot be changed. The endpoint keeps its
   * hostnames across updates, so existing connection strings stay valid.
   */
  Operation updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

  /** Updates user-owned migration configuration. */
  Operation updateMigration(UpdateMigrationRequest updateMigrationRequest);

  /**
   * Updates the configuration of the specified database project. Only the fields named in
   * `update_mask` change.
   */
  Operation updateProject(UpdateProjectRequest updateProjectRequest);

  /**
   * Updates the mutable fields of a Postgres role for a branch.
   *
   * <p>The fields `spec.identity_type`, `spec.auth_method`, and `spec.postgres_role` are fixed when
   * the role is created. UpdateRole ignores values supplied for these fields in the request body
   * and retains their existing values. Explicitly naming one of these fields in `update_mask`
   * returns an INVALID_PARAMETER_VALUE error.
   */
  Operation updateRole(UpdateRoleRequest updateRoleRequest);

  /**
   * Sets the snapshot schedule for a branch. The `schedule` field is replaced wholesale; an empty
   * schedule disables automatic snapshots.
   */
  Operation updateSnapshotSchedule(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest);
}
