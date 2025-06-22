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

  DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest createDatabaseCatalogRequest);

  DatabaseInstance createDatabaseInstance(
      CreateDatabaseInstanceRequest createDatabaseInstanceRequest);

  DatabaseTable createDatabaseTable(CreateDatabaseTableRequest createDatabaseTableRequest);

  SyncedDatabaseTable createSyncedDatabaseTable(
      CreateSyncedDatabaseTableRequest createSyncedDatabaseTableRequest);

  void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest deleteDatabaseCatalogRequest);

  void deleteDatabaseInstance(DeleteDatabaseInstanceRequest deleteDatabaseInstanceRequest);

  void deleteDatabaseTable(DeleteDatabaseTableRequest deleteDatabaseTableRequest);

  void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest deleteSyncedDatabaseTableRequest);

  DatabaseInstance findDatabaseInstanceByUid(
      FindDatabaseInstanceByUidRequest findDatabaseInstanceByUidRequest);

  DatabaseCredential generateDatabaseCredential(
      GenerateDatabaseCredentialRequest generateDatabaseCredentialRequest);

  DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest getDatabaseCatalogRequest);

  DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest getDatabaseInstanceRequest);

  DatabaseTable getDatabaseTable(GetDatabaseTableRequest getDatabaseTableRequest);

  SyncedDatabaseTable getSyncedDatabaseTable(
      GetSyncedDatabaseTableRequest getSyncedDatabaseTableRequest);

  ListDatabaseInstancesResponse listDatabaseInstances(
      ListDatabaseInstancesRequest listDatabaseInstancesRequest);

  DatabaseInstance updateDatabaseInstance(
      UpdateDatabaseInstanceRequest updateDatabaseInstanceRequest);
}
