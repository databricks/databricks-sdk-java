// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
 * Databricks SQL. Compute resources are infrastructure resources that provide processing
 * capabilities in the cloud.
 */
public class WarehousesAPI {
  private final WarehousesService impl;

  /** Regular-use constructor */
  public WarehousesAPI(ApiClient apiClient) {
    impl = new WarehousesImpl(apiClient);
  }

  /** Constructor for mocks */
  public WarehousesAPI(WarehousesService mock) {
    impl = mock;
  }

  /**
   * Create a warehouse.
   *
   * <p>Creates a new SQL warehouse.
   */
  public CreateWarehouseResponse create(CreateWarehouseRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteWarehouseRequest().setId(id));
  }

  /**
   * Delete a warehouse.
   *
   * <p>Deletes a SQL warehouse.
   */
  public void delete(DeleteWarehouseRequest request) {
    impl.delete(request);
  }

  public void edit(String id) {
    edit(new EditWarehouseRequest().setId(id));
  }

  /**
   * Update a warehouse.
   *
   * <p>Updates the configuration for a SQL warehouse.
   */
  public void edit(EditWarehouseRequest request) {
    impl.edit(request);
  }

  public GetWarehouseResponse get(String id) {
    return get(new GetWarehouseRequest().setId(id));
  }

  /**
   * Get warehouse info.
   *
   * <p>Gets the information for a single SQL warehouse.
   */
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    return impl.get(request);
  }

  /**
   * Get the workspace configuration.
   *
   * <p>Gets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    return impl.getWorkspaceWarehouseConfig();
  }

  /**
   * List warehouses.
   *
   * <p>Lists all SQL warehouses that a user has manager permissions on.
   */
  public Iterable<EndpointInfo> list(ListWarehousesRequest request) {
    return impl.list(request).getWarehouses();
  }

  /**
   * Set the workspace configuration.
   *
   * <p>Sets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    impl.setWorkspaceWarehouseConfig(request);
  }

  public void start(String id) {
    start(new StartRequest().setId(id));
  }

  /**
   * Start a warehouse.
   *
   * <p>Starts a SQL warehouse.
   */
  public void start(StartRequest request) {
    impl.start(request);
  }

  public void stop(String id) {
    stop(new StopRequest().setId(id));
  }

  /**
   * Stop a warehouse.
   *
   * <p>Stops a SQL warehouse.
   */
  public void stop(StopRequest request) {
    impl.stop(request);
  }

  public WarehousesService impl() {
    return impl;
  }
}
