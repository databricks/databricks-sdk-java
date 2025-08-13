// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Database */
@Generated
class DatabaseImpl implements DatabaseService {
  private final ApiClient apiClient;

  public DatabaseImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DatabaseCatalog createDatabaseCatalog(CreateDatabaseCatalogRequest request) {
    String path = "/api/2.0/database/catalogs";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getCatalog()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseCatalog.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstance createDatabaseInstance(CreateDatabaseInstanceRequest request) {
    String path = "/api/2.0/database/instances";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDatabaseInstance()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseInstance.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstanceRole createDatabaseInstanceRole(
      CreateDatabaseInstanceRoleRequest request) {
    String path = String.format("/api/2.0/database/instances/%s/roles", request.getInstanceName());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getDatabaseInstanceRole()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseInstanceRole.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseTable createDatabaseTable(CreateDatabaseTableRequest request) {
    String path = "/api/2.0/database/tables";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTable()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SyncedDatabaseTable createSyncedDatabaseTable(CreateSyncedDatabaseTableRequest request) {
    String path = "/api/2.0/database/synced_tables";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getSyncedTable()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, SyncedDatabaseTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatabaseCatalog(DeleteDatabaseCatalogRequest request) {
    String path = String.format("/api/2.0/database/catalogs/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatabaseInstance(DeleteDatabaseInstanceRequest request) {
    String path = String.format("/api/2.0/database/instances/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatabaseInstanceRole(DeleteDatabaseInstanceRoleRequest request) {
    String path =
        String.format(
            "/api/2.0/database/instances/%s/roles/%s",
            request.getInstanceName(), request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatabaseTable(DeleteDatabaseTableRequest request) {
    String path = String.format("/api/2.0/database/tables/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteSyncedDatabaseTable(DeleteSyncedDatabaseTableRequest request) {
    String path = String.format("/api/2.0/database/synced_tables/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstance findDatabaseInstanceByUid(FindDatabaseInstanceByUidRequest request) {
    String path = "/api/2.0/database/instances:findByUid";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseInstance.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseCredential generateDatabaseCredential(GenerateDatabaseCredentialRequest request) {
    String path = "/api/2.0/database/credentials";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseCredential.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseCatalog getDatabaseCatalog(GetDatabaseCatalogRequest request) {
    String path = String.format("/api/2.0/database/catalogs/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseCatalog.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstance getDatabaseInstance(GetDatabaseInstanceRequest request) {
    String path = String.format("/api/2.0/database/instances/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseInstance.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstanceRole getDatabaseInstanceRole(GetDatabaseInstanceRoleRequest request) {
    String path =
        String.format(
            "/api/2.0/database/instances/%s/roles/%s",
            request.getInstanceName(), request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseInstanceRole.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseTable getDatabaseTable(GetDatabaseTableRequest request) {
    String path = String.format("/api/2.0/database/tables/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DatabaseTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SyncedDatabaseTable getSyncedDatabaseTable(GetSyncedDatabaseTableRequest request) {
    String path = String.format("/api/2.0/database/synced_tables/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, SyncedDatabaseTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseCatalogsResponse listDatabaseCatalogs(ListDatabaseCatalogsRequest request) {
    String path =
        String.format("/api/2.0/database/instances/%s/catalogs", request.getInstanceName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseCatalogsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseInstanceRolesResponse listDatabaseInstanceRoles(
      ListDatabaseInstanceRolesRequest request) {
    String path = String.format("/api/2.0/database/instances/%s/roles", request.getInstanceName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseInstanceRolesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatabaseInstancesResponse listDatabaseInstances(ListDatabaseInstancesRequest request) {
    String path = "/api/2.0/database/instances";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDatabaseInstancesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListSyncedDatabaseTablesResponse listSyncedDatabaseTables(
      ListSyncedDatabaseTablesRequest request) {
    String path =
        String.format("/api/2.0/database/instances/%s/synced_tables", request.getInstanceName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListSyncedDatabaseTablesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseCatalog updateDatabaseCatalog(UpdateDatabaseCatalogRequest request) {
    String path = String.format("/api/2.0/database/catalogs/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatabaseCatalog()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseCatalog.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatabaseInstance updateDatabaseInstance(UpdateDatabaseInstanceRequest request) {
    String path = String.format("/api/2.0/database/instances/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatabaseInstance()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DatabaseInstance.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SyncedDatabaseTable updateSyncedDatabaseTable(UpdateSyncedDatabaseTableRequest request) {
    String path = String.format("/api/2.0/database/synced_tables/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getSyncedTable()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, SyncedDatabaseTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
