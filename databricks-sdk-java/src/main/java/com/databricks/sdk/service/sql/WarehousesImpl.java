// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Warehouses */
@Generated
class WarehousesImpl implements WarehousesService {
  private final ApiClient apiClient;

  public WarehousesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateWarehouseResponse create(CreateWarehouseRequest request) {
    String path = "/api/2.0/sql/warehouses";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateWarehouseResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
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
  public void edit(EditWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/edit", request.getId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetWarehouseResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetWarehousePermissionLevelsResponse getPermissionLevels(
      GetWarehousePermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/warehouses/%s/permissionLevels", request.getWarehouseId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetWarehousePermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WarehousePermissions getPermissions(GetWarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WarehousePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    String path = "/api/2.0/sql/config/warehouses";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetWorkspaceWarehouseConfigResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWarehousesResponse list(ListWarehousesRequest request) {
    String path = "/api/2.0/sql/warehouses";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListWarehousesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WarehousePermissions setPermissions(WarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WarehousePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    String path = "/api/2.0/sql/config/warehouses";
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void start(StartRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/start", request.getId());
    try {
      Request req = new Request("POST", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void stop(StopRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/stop", request.getId());
    try {
      Request req = new Request("POST", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WarehousePermissions updatePermissions(WarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WarehousePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
