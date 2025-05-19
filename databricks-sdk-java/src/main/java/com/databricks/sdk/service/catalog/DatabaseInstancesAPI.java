// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Database Instances provide access to a database via REST API or direct SQL. */
@Generated
public class DatabaseInstancesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DatabaseInstancesAPI.class);

  private final DatabaseInstancesService impl;

  /** Regular-use constructor */
  public DatabaseInstancesAPI(ApiClient apiClient) {
    impl = new DatabaseInstancesImpl(apiClient);
  }

  /** Constructor for mocks */
  public DatabaseInstancesAPI(DatabaseInstancesService mock) {
    impl = mock;
  }

  public DatabaseCatalog createDatabaseCatalog(DatabaseCatalog catalog) {
    return createDatabaseCatalog(new CreateDatabaseCatalogRequest().setCatalog(catalog));
  }

  /** Create a Database Catalog. */
  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    return impl.createDatabaseCatalog(request);
  }

  public DatabaseInstance createDatabaseInstance(DatabaseInstance databaseInstance) {
    return createDatabaseInstance(
        new CreateDatabaseInstanceRequest().setDatabaseInstance(databaseInstance));
  }

  /** Create a Database Instance. */
  public DatabaseInstance createDatabaseInstance(CreateDatabaseInstanceRequest request) {
    return impl.createDatabaseInstance(request);
  }

  public SyncedDatabaseTable createSyncedDatabaseTable(SyncedDatabaseTable syncedTable) {
    return createSyncedDatabaseTable(
        new CreateSyncedDatabaseTableRequest().setSyncedTable(syncedTable));
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

  public SyncedDatabaseTable getSyncedDatabaseTable(String name) {
    return getSyncedDatabaseTable(new GetSyncedDatabaseTableRequest().setName(name));
  }

  /** Get a Synced Database Table. */
  public SyncedDatabaseTable getSyncedDatabaseTable(GetSyncedDatabaseTableRequest request) {
    return impl.getSyncedDatabaseTable(request);
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

  public DatabaseInstance updateDatabaseInstance(
      String name, DatabaseInstance databaseInstance, String updateMask) {
    return updateDatabaseInstance(
        new UpdateDatabaseInstanceRequest()
            .setName(name)
            .setDatabaseInstance(databaseInstance)
            .setUpdateMask(updateMask));
  }

  /** Update a Database Instance. */
  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    return impl.updateDatabaseInstance(request);
  }

  public DatabaseInstancesService impl() {
    return impl;
  }
}
