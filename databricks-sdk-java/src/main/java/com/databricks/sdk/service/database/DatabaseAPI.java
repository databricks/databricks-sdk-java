// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Database Instances provide access to a database via REST API or direct SQL. */
@Generated
public class DatabaseAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DatabaseAPI.class);

  private final DatabaseService impl;

  /** Regular-use constructor */
  public DatabaseAPI(ApiClient apiClient) {
    impl = new DatabaseImpl(apiClient);
  }

  /** Constructor for mocks */
  public DatabaseAPI(DatabaseService mock) {
    impl = mock;
  }

  /** Create a Database Catalog. */
  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    return impl.createDatabaseCatalog(request);
  }

  /** Create a Database Instance. */
  public DatabaseInstance createDatabaseInstance(CreateDatabaseInstanceRequest request) {
    return impl.createDatabaseInstance(request);
  }

  /** Create a role for a Database Instance. */
  public DatabaseInstanceRole createDatabaseInstanceRole(
      CreateDatabaseInstanceRoleRequest request) {
    return impl.createDatabaseInstanceRole(request);
  }

  /**
   * Create a Database Table. Useful for registering pre-existing PG tables in UC. See
   * CreateSyncedDatabaseTable for creating synced tables in PG from a source table in UC.
   */
  public DatabaseTable createDatabaseTable(CreateDatabaseTableRequest request) {
    return impl.createDatabaseTable(request);
  }

  /** Create a Synced Database Table. */
  public SyncedDatabaseTable createSyncedDatabaseTable(CreateSyncedDatabaseTableRequest request) {
    return impl.createSyncedDatabaseTable(request);
  }

  public void deleteDatabaseCatalog(String name) {
    deleteDatabaseCatalog(new DeleteDatabaseCatalogRequest().setName(name));
  }

  /** Delete a Database Catalog. */
  public void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest request) {
    impl.deleteDatabaseCatalog(request);
  }

  public void deleteDatabaseInstance(String name) {
    deleteDatabaseInstance(new DeleteDatabaseInstanceRequest().setName(name));
  }

  /** Delete a Database Instance. */
  public void deleteDatabaseInstance(DeleteDatabaseInstanceRequest request) {
    impl.deleteDatabaseInstance(request);
  }

  public void deleteDatabaseInstanceRole(String instanceName, String name) {
    deleteDatabaseInstanceRole(
        new DeleteDatabaseInstanceRoleRequest().setInstanceName(instanceName).setName(name));
  }

  /** Deletes a role for a Database Instance. */
  public void deleteDatabaseInstanceRole(DeleteDatabaseInstanceRoleRequest request) {
    impl.deleteDatabaseInstanceRole(request);
  }

  public void deleteDatabaseTable(String name) {
    deleteDatabaseTable(new DeleteDatabaseTableRequest().setName(name));
  }

  /** Delete a Database Table. */
  public void deleteDatabaseTable(DeleteDatabaseTableRequest request) {
    impl.deleteDatabaseTable(request);
  }

  public void deleteSyncedDatabaseTable(String name) {
    deleteSyncedDatabaseTable(new DeleteSyncedDatabaseTableRequest().setName(name));
  }

  /** Delete a Synced Database Table. */
  public void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest request) {
    impl.deleteSyncedDatabaseTable(request);
  }

  /** Find a Database Instance by uid. */
  public DatabaseInstance findDatabaseInstanceByUid(FindDatabaseInstanceByUidRequest request) {
    return impl.findDatabaseInstanceByUid(request);
  }

  /** Generates a credential that can be used to access database instances. */
  public DatabaseCredential generateDatabaseCredential(GenerateDatabaseCredentialRequest request) {
    return impl.generateDatabaseCredential(request);
  }

  public DatabaseCatalog getDatabaseCatalog(String name) {
    return getDatabaseCatalog(new GetDatabaseCatalogRequest().setName(name));
  }

  /** Get a Database Catalog. */
  public DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest request) {
    return impl.getDatabaseCatalog(request);
  }

  public DatabaseInstance getDatabaseInstance(String name) {
    return getDatabaseInstance(new GetDatabaseInstanceRequest().setName(name));
  }

  /** Get a Database Instance. */
  public DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest request) {
    return impl.getDatabaseInstance(request);
  }

  public DatabaseInstanceRole getDatabaseInstanceRole(String instanceName, String name) {
    return getDatabaseInstanceRole(
        new GetDatabaseInstanceRoleRequest().setInstanceName(instanceName).setName(name));
  }

  /** Gets a role for a Database Instance. */
  public DatabaseInstanceRole getDatabaseInstanceRole(GetDatabaseInstanceRoleRequest request) {
    return impl.getDatabaseInstanceRole(request);
  }

  public DatabaseTable getDatabaseTable(String name) {
    return getDatabaseTable(new GetDatabaseTableRequest().setName(name));
  }

  /** Get a Database Table. */
  public DatabaseTable getDatabaseTable(GetDatabaseTableRequest request) {
    return impl.getDatabaseTable(request);
  }

  public SyncedDatabaseTable getSyncedDatabaseTable(String name) {
    return getSyncedDatabaseTable(new GetSyncedDatabaseTableRequest().setName(name));
  }

  /** Get a Synced Database Table. */
  public SyncedDatabaseTable getSyncedDatabaseTable(GetSyncedDatabaseTableRequest request) {
    return impl.getSyncedDatabaseTable(request);
  }

  public Iterable<DatabaseInstanceRole> listDatabaseInstanceRoles(String instanceName) {
    return listDatabaseInstanceRoles(
        new ListDatabaseInstanceRolesRequest().setInstanceName(instanceName));
  }

  /** START OF PG ROLE APIs Section */
  public Iterable<DatabaseInstanceRole> listDatabaseInstanceRoles(
      ListDatabaseInstanceRolesRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseInstanceRoles,
        ListDatabaseInstanceRolesResponse::getDatabaseInstanceRoles,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List Database Instances. */
  public Iterable<DatabaseInstance> listDatabaseInstances(ListDatabaseInstancesRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseInstances,
        ListDatabaseInstancesResponse::getDatabaseInstances,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update a Database Instance. */
  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    return impl.updateDatabaseInstance(request);
  }

  public DatabaseService impl() {
    return impl;
  }
}
