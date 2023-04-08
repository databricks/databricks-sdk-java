// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
 * Databricks SQL. Compute resources are infrastructure resources that provide processing
 * capabilities in the cloud.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface WarehousesService {
  /**
   * Create a warehouse.
   *
   * <p>Creates a new SQL warehouse.
   */
  CreateWarehouseResponse create(CreateWarehouseRequest createWarehouseRequest);

  /**
   * Delete a warehouse.
   *
   * <p>Deletes a SQL warehouse.
   */
  void delete(DeleteWarehouseRequest deleteWarehouseRequest);

  /**
   * Update a warehouse.
   *
   * <p>Updates the configuration for a SQL warehouse.
   */
  void edit(EditWarehouseRequest editWarehouseRequest);

  /**
   * Get warehouse info.
   *
   * <p>Gets the information for a single SQL warehouse.
   */
  GetWarehouseResponse get(GetWarehouseRequest getWarehouseRequest);

  /**
   * Get the workspace configuration.
   *
   * <p>Gets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig();

  /**
   * List warehouses.
   *
   * <p>Lists all SQL warehouses that a user has manager permissions on.
   */
  ListWarehousesResponse list(ListWarehousesRequest listWarehousesRequest);

  /**
   * Set the workspace configuration.
   *
   * <p>Sets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  void setWorkspaceWarehouseConfig(
      SetWorkspaceWarehouseConfigRequest setWorkspaceWarehouseConfigRequest);

  /**
   * Start a warehouse.
   *
   * <p>Starts a SQL warehouse.
   */
  void start(StartRequest startRequest);

  /**
   * Stop a warehouse.
   *
   * <p>Stops a SQL warehouse.
   */
  void stop(StopRequest stopRequest);
}
