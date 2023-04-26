// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Warehouses */
class WarehousesImpl implements WarehousesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for WarehousesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WarehousesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateWarehouseResponse create(CreateWarehouseRequest request) {
    String path = "/api/2.0/sql/warehouses";
    return apiClient.POST(path, request, CreateWarehouseResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void edit(EditWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/edit", request.getId());
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
    return apiClient.GET(path, request, GetWarehouseResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    String path = "/api/2.0/sql/config/warehouses";
    return apiClient.GET(path, GetWorkspaceWarehouseConfigResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListWarehousesResponse list(ListWarehousesRequest request) {
    String path = "/api/2.0/sql/warehouses";
    return apiClient.GET(path, request, ListWarehousesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    String path = "/api/2.0/sql/config/warehouses";
    apiClient.PUT(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void start(StartRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/start", request.getId());
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void stop(StopRequest request) {
    String path = String.format("/api/2.0/sql/warehouses/%s/stop", request.getId());
    apiClient.POST(path, request, Void.class);
  }
}
