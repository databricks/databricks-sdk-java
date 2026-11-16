// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/**
 * Database Instances provide access to a database via REST API or direct SQL.
 *
 * <p>For new workloads, Databricks recommends the [Postgres API], which supports the latest
 * Lakebase features.
 *
 * <p>[Postgres API]: https://docs.databricks.com/api/postgres/v1/postgres
 */
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

  /**
   * Create a Database Catalog.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a catalog].
   *
   * <p>[Create a catalog]: https://docs.databricks.com/api/postgres/v1/create-catalog
   */
  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    return impl.createDatabaseCatalog(request);
  }

  /**
   * Create a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a project].
   *
   * <p>[Create a project]: https://docs.databricks.com/api/postgres/v1/create-project
   */
  public Wait<DatabaseInstance, DatabaseInstance> createDatabaseInstance(
      CreateDatabaseInstanceRequest request) {
    DatabaseInstance response = impl.createDatabaseInstance(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetDatabaseInstanceDatabaseAvailable(response.getName(), timeout, callback),
        response);
  }

  /**
   * Create a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Create a role].
   *
   * <p>[Create a role]: https://docs.databricks.com/api/postgres/v1/create-role
   */
  public DatabaseInstanceRole createDatabaseInstanceRole(
      CreateDatabaseInstanceRoleRequest request) {
    return impl.createDatabaseInstanceRole(request);
  }

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
  public DatabaseTable createDatabaseTable(CreateDatabaseTableRequest request) {
    return impl.createDatabaseTable(request);
  }

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
  public SyncedDatabaseTable createSyncedDatabaseTable(CreateSyncedDatabaseTableRequest request) {
    return impl.createSyncedDatabaseTable(request);
  }

  public void deleteDatabaseCatalog(String name) {
    deleteDatabaseCatalog(new DeleteDatabaseCatalogRequest().setName(name));
  }

  /**
   * Delete a Database Catalog. This removes the catalog from Unity Catalog, while the Postgres
   * database and its tables remain in the instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a catalog].
   *
   * <p>[Delete a catalog]: https://docs.databricks.com/api/postgres/v1/delete-catalog
   */
  public void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest request) {
    impl.deleteDatabaseCatalog(request);
  }

  public void deleteDatabaseInstance(String name) {
    deleteDatabaseInstance(new DeleteDatabaseInstanceRequest().setName(name));
  }

  /**
   * Delete a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a project].
   *
   * <p>[Delete a project]: https://docs.databricks.com/api/postgres/v1/delete-project
   */
  public void deleteDatabaseInstance(DeleteDatabaseInstanceRequest request) {
    impl.deleteDatabaseInstance(request);
  }

  public void deleteDatabaseInstanceRole(String instanceName, String name) {
    deleteDatabaseInstanceRole(
        new DeleteDatabaseInstanceRoleRequest().setInstanceName(instanceName).setName(name));
  }

  /**
   * Deletes a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a role].
   *
   * <p>[Delete a role]: https://docs.databricks.com/api/postgres/v1/delete-role
   */
  public void deleteDatabaseInstanceRole(DeleteDatabaseInstanceRoleRequest request) {
    impl.deleteDatabaseInstanceRole(request);
  }

  public void deleteDatabaseTable(String name) {
    deleteDatabaseTable(new DeleteDatabaseTableRequest().setName(name));
  }

  /**
   * Delete a Database Table. This removes the table from Unity Catalog only; the Postgres table and
   * its data are kept. Tables in a database catalog cannot be deleted with this method, and synced
   * tables must be deleted with [Delete a Synced Database Table].
   *
   * <p>[Delete a Synced Database Table]:
   * https://docs.databricks.com/api/workspace/database/deletesynceddatabasetable
   */
  public void deleteDatabaseTable(DeleteDatabaseTableRequest request) {
    impl.deleteDatabaseTable(request);
  }

  public void deleteSyncedDatabaseTable(String name) {
    deleteSyncedDatabaseTable(new DeleteSyncedDatabaseTableRequest().setName(name));
  }

  /**
   * Delete a Synced Database Table.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Delete a synced
   * table].
   *
   * <p>[Delete a synced table]: https://docs.databricks.com/api/postgres/v1/delete-synced-table
   */
  public void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest request) {
    impl.deleteSyncedDatabaseTable(request);
  }

  /** Find a Database Instance by its uid rather than by name. */
  public DatabaseInstance findDatabaseInstanceByUid(FindDatabaseInstanceByUidRequest request) {
    return impl.findDatabaseInstanceByUid(request);
  }

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
  public DatabaseCredential generateDatabaseCredential(GenerateDatabaseCredentialRequest request) {
    return impl.generateDatabaseCredential(request);
  }

  public DatabaseCatalog getDatabaseCatalog(String name) {
    return getDatabaseCatalog(new GetDatabaseCatalogRequest().setName(name));
  }

  /**
   * Get a Database Catalog.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a catalog].
   *
   * <p>[Get a catalog]: https://docs.databricks.com/api/postgres/v1/get-catalog
   */
  public DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest request) {
    return impl.getDatabaseCatalog(request);
  }

  public DatabaseInstance getDatabaseInstance(String name) {
    return getDatabaseInstance(new GetDatabaseInstanceRequest().setName(name));
  }

  /**
   * Get a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a project].
   *
   * <p>[Get a project]: https://docs.databricks.com/api/postgres/v1/get-project
   */
  public DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest request) {
    return impl.getDatabaseInstance(request);
  }

  public DatabaseInstanceRole getDatabaseInstanceRole(String instanceName, String name) {
    return getDatabaseInstanceRole(
        new GetDatabaseInstanceRoleRequest().setInstanceName(instanceName).setName(name));
  }

  /**
   * Gets a role for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a role].
   *
   * <p>[Get a role]: https://docs.databricks.com/api/postgres/v1/get-role
   */
  public DatabaseInstanceRole getDatabaseInstanceRole(GetDatabaseInstanceRoleRequest request) {
    return impl.getDatabaseInstanceRole(request);
  }

  public DatabaseTable getDatabaseTable(String name) {
    return getDatabaseTable(new GetDatabaseTableRequest().setName(name));
  }

  /**
   * Get a Database Table. The request fails if the name refers to a synced table or to a table that
   * is not a database table; for synced tables, use [Get a Synced Database Table].
   *
   * <p>[Get a Synced Database Table]:
   * https://docs.databricks.com/api/workspace/database/getsynceddatabasetable
   */
  public DatabaseTable getDatabaseTable(GetDatabaseTableRequest request) {
    return impl.getDatabaseTable(request);
  }

  public SyncedDatabaseTable getSyncedDatabaseTable(String name) {
    return getSyncedDatabaseTable(new GetSyncedDatabaseTableRequest().setName(name));
  }

  /**
   * Get a Synced Database Table.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [Get a synced table].
   *
   * <p>[Get a synced table]: https://docs.databricks.com/api/postgres/v1/get-synced-table
   */
  public SyncedDatabaseTable getSyncedDatabaseTable(GetSyncedDatabaseTableRequest request) {
    return impl.getSyncedDatabaseTable(request);
  }

  public Iterable<DatabaseCatalog> listDatabaseCatalogs(String instanceName) {
    return listDatabaseCatalogs(new ListDatabaseCatalogsRequest().setInstanceName(instanceName));
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public Iterable<DatabaseCatalog> listDatabaseCatalogs(ListDatabaseCatalogsRequest request) {
    return Paginator.newTokenPagination(
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
   * List roles for a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [List roles].
   *
   * <p>[List roles]: https://docs.databricks.com/api/postgres/v1/list-roles
   */
  public Iterable<DatabaseInstanceRole> listDatabaseInstanceRoles(
      ListDatabaseInstanceRolesRequest request) {
    return Paginator.newTokenPagination(
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

  /**
   * List Database Instances.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalent: [List projects].
   *
   * <p>[List projects]: https://docs.databricks.com/api/postgres/v1/list-projects
   */
  public Iterable<DatabaseInstance> listDatabaseInstances(ListDatabaseInstancesRequest request) {
    return Paginator.newTokenPagination(
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

  /** List synced database tables in a Database Instance. */
  public Iterable<SyncedDatabaseTable> listSyncedDatabaseTables(
      ListSyncedDatabaseTablesRequest request) {
    return Paginator.newTokenPagination(
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

  /**
   * Update a Database Instance.
   *
   * <p>For new workloads, Databricks recommends the Postgres API equivalents: [Update a project]
   * and [Update an endpoint].
   *
   * <p>[Update a project]: https://docs.databricks.com/api/postgres/v1/update-project [Update an
   * endpoint]: https://docs.databricks.com/api/postgres/v1/update-endpoint
   */
  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    return impl.updateDatabaseInstance(request);
  }

  /** This API is currently unimplemented, but exposed for Terraform support. */
  public SyncedDatabaseTable updateSyncedDatabaseTable(UpdateSyncedDatabaseTableRequest request) {
    return impl.updateSyncedDatabaseTable(request);
  }

  public DatabaseService impl() {
    return impl;
  }
}
