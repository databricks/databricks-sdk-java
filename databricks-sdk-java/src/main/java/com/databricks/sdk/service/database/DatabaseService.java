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
   * Create a Database Table. This registers a table that already exists in a Postgres database of a
   * database instance as a table in Unity Catalog. The Postgres database, schema and table must
   * already exist; the request does not create them. Repeating the request for the same table
   * succeeds, and a request for a name that is already registered from a different database or
   * instance fails. To create a Postgres table from a Unity Catalog source table instead, use
   * [Create a Synced Database Table].
   *
   * <p>[Create a Synced Database Table]:
   * https://docs.databricks.com/api/workspace/database/createsynceddatabasetable
   */
  DatabaseTable createDatabaseTable(CreateDatabaseTableRequest createDatabaseTableRequest);

  /**
   * Create a Synced Database Table.
   *
   * <p>The table and its data synchronization pipeline are provisioned asynchronously. The response
   * reflects the initial state; use Get a Synced Database Table to follow the data synchronization
   * status until the table is online.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a synced
   * table].
   *
   * <p>[Create a synced table]: https://docs.databricks.com/api/postgres/v1/create-synced-table
   */
  SyncedDatabaseTable createSyncedDatabaseTable(
      CreateSyncedDatabaseTableRequest createSyncedDatabaseTableRequest);

  /**
   * Delete a Database Catalog. This removes the catalog from Unity Catalog, while the Postgres
   * database and its tables remain in the instance.
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

  /**
   * Delete a Database Table. This removes the table from Unity Catalog only; the Postgres table and
   * its data are kept. Tables in a database catalog cannot be deleted with this method, and synced
   * tables must be deleted with [Delete a Synced Database Table].
   *
   * <p>[Delete a Synced Database Table]:
   * https://docs.databricks.com/api/workspace/database/deletesynceddatabasetable
   */
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

  /** Find a Database Instance by its uid rather than by name. */
  DatabaseInstance findDatabaseInstanceByUid(
      FindDatabaseInstanceByUidRequest findDatabaseInstanceByUidRequest);

  /**
   * Generates a short-lived OAuth token for connecting to database instances. Connect with the
   * caller's Databricks identity as the Postgres user and the returned token as the password. For
   * details about OAuth token authentication, see [About authentication].
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Generate a database
   * credential].
   *
   * <p>[About authentication]: https://docs.databricks.com/aws/en/oltp/projects/authentication
   * [Generate a database credential]:
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

  /**
   * Get a Database Table. The request fails if the name refers to a synced table or to a table that
   * is not a database table; for synced tables, use [Get a Synced Database Table].
   *
   * <p>[Get a Synced Database Table]:
   * https://docs.databricks.com/api/workspace/database/getsynceddatabasetable
   */
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
