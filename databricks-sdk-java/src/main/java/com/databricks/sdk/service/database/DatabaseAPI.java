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

  public DatabaseCatalog createDatabaseCatalog(DatabaseCatalog catalog) {
    return createDatabaseCatalog(new CreateDatabaseCatalogRequest().setCatalog(catalog));
  }

  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    return impl.createDatabaseCatalog(request);
  }

  public DatabaseInstance createDatabaseInstance(DatabaseInstance databaseInstance) {
    return createDatabaseInstance(
        new CreateDatabaseInstanceRequest().setDatabaseInstance(databaseInstance));
  }

  public DatabaseInstance createDatabaseInstance(CreateDatabaseInstanceRequest request) {
    return impl.createDatabaseInstance(request);
  }

  public DatabaseTable createDatabaseTable(DatabaseTable table) {
    return createDatabaseTable(new CreateDatabaseTableRequest().setTable(table));
  }

  public DatabaseTable createDatabaseTable(CreateDatabaseTableRequest request) {
    return impl.createDatabaseTable(request);
  }

  public SyncedDatabaseTable createSyncedDatabaseTable(SyncedDatabaseTable syncedTable) {
    return createSyncedDatabaseTable(
        new CreateSyncedDatabaseTableRequest().setSyncedTable(syncedTable));
  }

  public SyncedDatabaseTable createSyncedDatabaseTable(CreateSyncedDatabaseTableRequest request) {
    return impl.createSyncedDatabaseTable(request);
  }

  public void deleteDatabaseCatalog(String name) {
    deleteDatabaseCatalog(new DeleteDatabaseCatalogRequest().setName(name));
  }

  public void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest request) {
    impl.deleteDatabaseCatalog(request);
  }

  public void deleteDatabaseInstance(String name) {
    deleteDatabaseInstance(new DeleteDatabaseInstanceRequest().setName(name));
  }

  public void deleteDatabaseInstance(DeleteDatabaseInstanceRequest request) {
    impl.deleteDatabaseInstance(request);
  }

  public void deleteDatabaseTable(String name) {
    deleteDatabaseTable(new DeleteDatabaseTableRequest().setName(name));
  }

  public void deleteDatabaseTable(DeleteDatabaseTableRequest request) {
    impl.deleteDatabaseTable(request);
  }

  public void deleteSyncedDatabaseTable(String name) {
    deleteSyncedDatabaseTable(new DeleteSyncedDatabaseTableRequest().setName(name));
  }

  public void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest request) {
    impl.deleteSyncedDatabaseTable(request);
  }

  public DatabaseInstance findDatabaseInstanceByUid(FindDatabaseInstanceByUidRequest request) {
    return impl.findDatabaseInstanceByUid(request);
  }

  public DatabaseCredential generateDatabaseCredential(GenerateDatabaseCredentialRequest request) {
    return impl.generateDatabaseCredential(request);
  }

  public DatabaseCatalog getDatabaseCatalog(String name) {
    return getDatabaseCatalog(new GetDatabaseCatalogRequest().setName(name));
  }

  public DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest request) {
    return impl.getDatabaseCatalog(request);
  }

  public DatabaseInstance getDatabaseInstance(String name) {
    return getDatabaseInstance(new GetDatabaseInstanceRequest().setName(name));
  }

  public DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest request) {
    return impl.getDatabaseInstance(request);
  }

  public DatabaseTable getDatabaseTable(String name) {
    return getDatabaseTable(new GetDatabaseTableRequest().setName(name));
  }

  public DatabaseTable getDatabaseTable(GetDatabaseTableRequest request) {
    return impl.getDatabaseTable(request);
  }

  public SyncedDatabaseTable getSyncedDatabaseTable(String name) {
    return getSyncedDatabaseTable(new GetSyncedDatabaseTableRequest().setName(name));
  }

  public SyncedDatabaseTable getSyncedDatabaseTable(GetSyncedDatabaseTableRequest request) {
    return impl.getSyncedDatabaseTable(request);
  }

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

  public DatabaseInstance updateDatabaseInstance(
      String name, DatabaseInstance databaseInstance, String updateMask) {
    return updateDatabaseInstance(
        new UpdateDatabaseInstanceRequest()
            .setName(name)
            .setDatabaseInstance(databaseInstance)
            .setUpdateMask(updateMask));
  }

  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    return impl.updateDatabaseInstance(request);
  }

  public DatabaseService impl() {
    return impl;
  }
}
