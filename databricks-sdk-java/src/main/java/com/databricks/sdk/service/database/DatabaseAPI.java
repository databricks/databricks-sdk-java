// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
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

  public DatabaseInstance waitGetDatabaseInstanceDatabaseAvailable(String name)
      throws TimeoutException {
    return waitGetDatabaseInstanceDatabaseAvailable(name, Duration.ofMinutes(20), null);
  }

  public DatabaseInstance waitGetDatabaseInstanceDatabaseAvailable(
      String name, Duration timeout, Consumer<DatabaseInstance> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<DatabaseInstanceState> targetStates =
        Arrays.asList(DatabaseInstanceState.AVAILABLE);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      DatabaseInstance poll = getDatabaseInstance(new GetDatabaseInstanceRequest().setName(name));
      DatabaseInstanceState status = poll.getState();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      String prefix = String.format("name=%s", name);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /** Create a Database Catalog. */
  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    return impl.createDatabaseCatalog(request);
  }

  /** Create a Database Instance. */
  public Wait<DatabaseInstance, DatabaseInstance> createDatabaseInstance(
      CreateDatabaseInstanceRequest request) {
    DatabaseInstance response = impl.createDatabaseInstance(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetDatabaseInstanceDatabaseAvailable(response.getName(), timeout, callback),
        response);
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

  /** Failover the primary node of a Database Instance to a secondary. */
  public DatabaseInstance failoverDatabaseInstance(FailoverDatabaseInstanceRequest request) {
    return impl.failoverDatabaseInstance(request);
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

  public Iterable<DatabaseCatalog> listDatabaseCatalogs(String instanceName) {
    return listDatabaseCatalogs(new ListDatabaseCatalogsRequest().setInstanceName(instanceName));
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public Iterable<DatabaseCatalog> listDatabaseCatalogs(ListDatabaseCatalogsRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseCatalogs,
        ListDatabaseCatalogsResponse::getDatabaseCatalogs,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<DatabaseInstanceRole> listDatabaseInstanceRoles(String instanceName) {
    return listDatabaseInstanceRoles(
        new ListDatabaseInstanceRolesRequest().setInstanceName(instanceName));
  }

  /**
   * START OF PG ROLE APIs Section These APIs are marked a PUBLIC with stage < PUBLIC_PREVIEW. With
   * more recent Lakebase V2 plans, we don't plan to ever advance these to PUBLIC_PREVIEW. These
   * APIs will remain effectively undocumented/UI-only and we'll aim for a new public roles API as
   * part of V2 PuPr.
   */
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

  public Iterable<SyncedDatabaseTable> listSyncedDatabaseTables(String instanceName) {
    return listSyncedDatabaseTables(
        new ListSyncedDatabaseTablesRequest().setInstanceName(instanceName));
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public Iterable<SyncedDatabaseTable> listSyncedDatabaseTables(
      ListSyncedDatabaseTablesRequest request) {
    return new Paginator<>(
        request,
        impl::listSyncedDatabaseTables,
        ListSyncedDatabaseTablesResponse::getSyncedTables,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public DatabaseCatalog updateDatabaseCatalog(UpdateDatabaseCatalogRequest request) {
    return impl.updateDatabaseCatalog(request);
  }

  /** Update a Database Instance. */
  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    return impl.updateDatabaseInstance(request);
  }

  /** Update a role for a Database Instance. */
  public DatabaseInstanceRole updateDatabaseInstanceRole(
      UpdateDatabaseInstanceRoleRequest request) {
    return impl.updateDatabaseInstanceRole(request);
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public SyncedDatabaseTable updateSyncedDatabaseTable(UpdateSyncedDatabaseTableRequest request) {
    return impl.updateSyncedDatabaseTable(request);
  }

  public DatabaseService impl() {
    return impl;
  }
}
