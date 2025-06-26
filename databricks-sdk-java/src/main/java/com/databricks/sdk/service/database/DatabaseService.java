// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;

/**
 * Database Instances provide access to a database via REST API or direct SQL.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DatabaseService {
  /** Create a Database Catalog. */
  DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest createDatabaseCatalogRequest);

  /** Create a Database Instance. */
  DatabaseInstance createDatabaseInstance(
      CreateDatabaseInstanceRequest createDatabaseInstanceRequest);

  /** Create a role for a Database Instance. */
  DatabaseInstanceRole createDatabaseInstanceRole(
      CreateDatabaseInstanceRoleRequest createDatabaseInstanceRoleRequest);

  /**
   * Create a Database Table. Useful for registering pre-existing PG tables in UC. See
   * CreateSyncedDatabaseTable for creating synced tables in PG from a source table in UC.
   */
  DatabaseTable createDatabaseTable(CreateDatabaseTableRequest createDatabaseTableRequest);

  /** Create a Synced Database Table. */
  SyncedDatabaseTable createSyncedDatabaseTable(
      CreateSyncedDatabaseTableRequest createSyncedDatabaseTableRequest);

  /** Delete a Database Catalog. */
  void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest deleteDatabaseCatalogRequest);

  /** Delete a Database Instance. */
  void deleteDatabaseInstance(DeleteDatabaseInstanceRequest deleteDatabaseInstanceRequest);

  /** Deletes a role for a Database Instance. */
  void deleteDatabaseInstanceRole(
      DeleteDatabaseInstanceRoleRequest deleteDatabaseInstanceRoleRequest);

  /** Delete a Database Table. */
  void deleteDatabaseTable(DeleteDatabaseTableRequest deleteDatabaseTableRequest);

  /** Delete a Synced Database Table. */
  void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest deleteSyncedDatabaseTableRequest);

  /** Find a Database Instance by uid. */
  DatabaseInstance findDatabaseInstanceByUid(
      FindDatabaseInstanceByUidRequest findDatabaseInstanceByUidRequest);

  /** Generates a credential that can be used to access database instances. */
  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  /** Get a Database Catalog. */
  DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest getDatabaseCatalogRequest);

  /** Get a Database Instance. */
  DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest getDatabaseInstanceRequest);

  /** Gets a role for a Database Instance. */
  DatabaseInstanceRole getDatabaseInstanceRole(
      GetDatabaseInstanceRoleRequest getDatabaseInstanceRoleRequest);

  /** Get a Database Table. */
  DatabaseTable getDatabaseTable(GetDatabaseTableRequest getDatabaseTableRequest);

  /** Get a Synced Database Table. */
  SyncedDatabaseTable getSyncedDatabaseTable(
      GetSyncedDatabaseTableRequest getSyncedDatabaseTableRequest);

  /** START OF PG ROLE APIs Section */
  ListDatabaseInstanceRolesResponse listDatabaseInstanceRoles(
      ListDatabaseInstanceRolesRequest listDatabaseInstanceRolesRequest);

  /** List Database Instances. */
  ListDatabaseInstancesResponse listDatabaseInstances(
      ListDatabaseInstancesRequest listDatabaseInstancesRequest);

  /** Update a Database Instance. */
  DatabaseInstance updateDatabaseInstance(
      UpdateDatabaseInstanceRequest updateDatabaseInstanceRequest);
}
