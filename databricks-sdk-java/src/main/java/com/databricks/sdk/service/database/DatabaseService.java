// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;

/**
 * Database Instances provide access to a database via REST API or direct SQL.
 *
 * <p>For new workloads, Databricks recommends the [Postgres API], which supports the latest
 * Lakebase features.
 *
 * <p>[Postgres API]: https://docs.databricks.com/api/postgres/v1/postgres
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DatabaseService {
  /**
   * Create a Database Catalog.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a catalog].
   *
   * <p>[Create a catalog]: https://docs.databricks.com/api/postgres/v1/create-catalog
   */
  DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest createDatabaseCatalogRequest);

  /**
   * Create a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a project].
   *
   * <p>[Create a project]: https://docs.databricks.com/api/postgres/v1/create-project
   */
  DatabaseInstance createDatabaseInstance(
      CreateDatabaseInstanceRequest createDatabaseInstanceRequest);

  /**
   * Create a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a role].
   *
   * <p>[Create a role]: https://docs.databricks.com/api/postgres/v1/create-role
   */
  DatabaseInstanceRole createDatabaseInstanceRole(
      CreateDatabaseInstanceRoleRequest createDatabaseInstanceRoleRequest);

  /**
   * Create a Database Table. Useful for registering pre-existing PG tables in UC. See
   * CreateSyncedDatabaseTable for creating synced tables in PG from a source table in UC.
   */
  DatabaseTable createDatabaseTable(CreateDatabaseTableRequest createDatabaseTableRequest);

  /**
   * Create a Synced Database Table.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a synced
   * table].
   *
   * <p>[Create a synced table]: https://docs.databricks.com/api/postgres/v1/create-synced-table
   */
  SyncedDatabaseTable createSyncedDatabaseTable(
      CreateSyncedDatabaseTableRequest createSyncedDatabaseTableRequest);

  /**
   * Delete a Database Catalog.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a catalog].
   *
   * <p>[Delete a catalog]: https://docs.databricks.com/api/postgres/v1/delete-catalog
   */
  void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest deleteDatabaseCatalogRequest);

  /**
   * Delete a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a project].
   *
   * <p>[Delete a project]: https://docs.databricks.com/api/postgres/v1/delete-project
   */
  void deleteDatabaseInstance(DeleteDatabaseInstanceRequest deleteDatabaseInstanceRequest);

  /**
   * Deletes a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a role].
   *
   * <p>[Delete a role]: https://docs.databricks.com/api/postgres/v1/delete-role
   */
  void deleteDatabaseInstanceRole(
      DeleteDatabaseInstanceRoleRequest deleteDatabaseInstanceRoleRequest);

  /** Delete a Database Table. */
  void deleteDatabaseTable(DeleteDatabaseTableRequest deleteDatabaseTableRequest);

  /**
   * Delete a Synced Database Table.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a synced
   * table].
   *
   * <p>[Delete a synced table]: https://docs.databricks.com/api/postgres/v1/delete-synced-table
   */
  void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest deleteSyncedDatabaseTableRequest);

  /** Find a Database Instance by uid. */
  DatabaseInstance findDatabaseInstanceByUid(
      FindDatabaseInstanceByUidRequest findDatabaseInstanceByUidRequest);

  /**
   * Generates a credential that can be used to access database instances.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Generate a database
   * credential].
   *
   * <p>[Generate a database credential]:
   * https://docs.databricks.com/api/postgres/v1/generate-database-credential
   */
  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  /**
   * Get a Database Catalog.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a catalog].
   *
   * <p>[Get a catalog]: https://docs.databricks.com/api/postgres/v1/get-catalog
   */
  DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest getDatabaseCatalogRequest);

  /**
   * Get a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a project].
   *
   * <p>[Get a project]: https://docs.databricks.com/api/postgres/v1/get-project
   */
  DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest getDatabaseInstanceRequest);

  /**
   * Gets a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a role].
   *
   * <p>[Get a role]: https://docs.databricks.com/api/postgres/v1/get-role
   */
  DatabaseInstanceRole getDatabaseInstanceRole(
      GetDatabaseInstanceRoleRequest getDatabaseInstanceRoleRequest);

  /** Get a Database Table. */
  DatabaseTable getDatabaseTable(GetDatabaseTableRequest getDatabaseTableRequest);

  /**
   * Get a Synced Database Table.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a synced table].
   *
   * <p>[Get a synced table]: https://docs.databricks.com/api/postgres/v1/get-synced-table
   */
  SyncedDatabaseTable getSyncedDatabaseTable(
      GetSyncedDatabaseTableRequest getSyncedDatabaseTableRequest);

  /** This API is currently unimplemented, but exposed for Terraform support. */
  ListDatabaseCatalogsResponse listDatabaseCatalogs(
      ListDatabaseCatalogsRequest listDatabaseCatalogsRequest);

  /**
   * List roles for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [List roles].
   *
   * <p>[List roles]: https://docs.databricks.com/api/postgres/v1/list-roles
   */
  ListDatabaseInstanceRolesResponse listDatabaseInstanceRoles(
      ListDatabaseInstanceRolesRequest listDatabaseInstanceRolesRequest);

  /**
   * List Database Instances.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [List projects].
   *
   * <p>[List projects]: https://docs.databricks.com/api/postgres/v1/list-projects
   */
  ListDatabaseInstancesResponse listDatabaseInstances(
      ListDatabaseInstancesRequest listDatabaseInstancesRequest);

  /** List synced database tables in a Database Instance. */
  ListSyncedDatabaseTablesResponse listSyncedDatabaseTables(
      ListSyncedDatabaseTablesRequest listSyncedDatabaseTablesRequest);

  /** This API is currently unimplemented, but exposed for Terraform support. */
  DatabaseCatalog updateDatabaseCatalog(UpdateDatabaseCatalogRequest updateDatabaseCatalogRequest);

  /**
   * Update a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalents: [Update a project]
   * and [Update an endpoint].
   *
   * <p>[Update a project]: https://docs.databricks.com/api/postgres/v1/update-project [Update an
   * endpoint]: https://docs.databricks.com/api/postgres/v1/update-endpoint
   */
  DatabaseInstance updateDatabaseInstance(
      UpdateDatabaseInstanceRequest updateDatabaseInstanceRequest);

  /** This API is currently unimplemented, but exposed for Terraform support. */
  SyncedDatabaseTable updateSyncedDatabaseTable(
      UpdateSyncedDatabaseTableRequest updateSyncedDatabaseTableRequest);
}
