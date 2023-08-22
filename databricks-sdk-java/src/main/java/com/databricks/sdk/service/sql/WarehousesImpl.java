// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateWarehouseResponse.class, headers);
  }

  @Override
  public void delete(DeleteWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void edit(EditWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/edit", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetWarehouseResponse.class, headers);
  }

  @Override
  public GetWarehousePermissionLevelsResponse getWarehousePermissionLevels(
      GetWarehousePermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/warehouses/%s/permissionLevels", request.getWarehouseId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetWarehousePermissionLevelsResponse.class, headers);
  }

  @Override
  public WarehousePermissions getWarehousePermissions(GetWarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, WarehousePermissions.class, headers);
  }

  @Override
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    String path = "/api/2.0/sql/config/warehouses";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetWorkspaceWarehouseConfigResponse.class, headers);
  }

  @Override
  public ListWarehousesResponse list(ListWarehousesRequest request) {
    String path = "/api/2.0/sql/warehouses";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListWarehousesResponse.class, headers);
  }

  @Override
  public WarehousePermissions setWarehousePermissions(WarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, WarehousePermissions.class, headers);
  }

  @Override
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    String path = "/api/2.0/sql/config/warehouses";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, Void.class, headers);
  }

  @Override
  public void start(StartRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/start", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void stop(StopRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/stop", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public WarehousePermissions updateWarehousePermissions(WarehousePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/warehouses/%s", request.getWarehouseId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, WarehousePermissions.class, headers);
  }
}
