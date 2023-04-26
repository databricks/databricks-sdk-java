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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface WarehousesService {
  /**
   * Create a warehouse.
   *
   * <p>Creates a new SQL warehouse.
   *
   * @param createWarehouseRequest a {@link com.databricks.sdk.service.sql.CreateWarehouseRequest} object
   * @return a {@link com.databricks.sdk.service.sql.CreateWarehouseResponse} object
   */
  CreateWarehouseResponse create(CreateWarehouseRequest createWarehouseRequest);

  /**
   * Delete a warehouse.
   *
   * <p>Deletes a SQL warehouse.
   *
   * @param deleteWarehouseRequest a {@link com.databricks.sdk.service.sql.DeleteWarehouseRequest} object
   */
  void delete(DeleteWarehouseRequest deleteWarehouseRequest);

  /**
   * Update a warehouse.
   *
   * <p>Updates the configuration for a SQL warehouse.
   *
   * @param editWarehouseRequest a {@link com.databricks.sdk.service.sql.EditWarehouseRequest} object
   */
  void edit(EditWarehouseRequest editWarehouseRequest);

  /**
   * Get warehouse info.
   *
   * <p>Gets the information for a single SQL warehouse.
   *
   * @param getWarehouseRequest a {@link com.databricks.sdk.service.sql.GetWarehouseRequest} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  GetWarehouseResponse get(GetWarehouseRequest getWarehouseRequest);

  /**
   * Get the workspace configuration.
   *
   * <p>Gets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   *
   * @return a {@link com.databricks.sdk.service.sql.GetWorkspaceWarehouseConfigResponse} object
   */
  GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig();

  /**
   * List warehouses.
   *
   * <p>Lists all SQL warehouses that a user has manager permissions on.
   *
   * @param listWarehousesRequest a {@link com.databricks.sdk.service.sql.ListWarehousesRequest} object
   * @return a {@link com.databricks.sdk.service.sql.ListWarehousesResponse} object
   */
  ListWarehousesResponse list(ListWarehousesRequest listWarehousesRequest);

  /**
   * Set the workspace configuration.
   *
   * <p>Sets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   *
   * @param setWorkspaceWarehouseConfigRequest a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  void setWorkspaceWarehouseConfig(
      SetWorkspaceWarehouseConfigRequest setWorkspaceWarehouseConfigRequest);

  /**
   * Start a warehouse.
   *
   * <p>Starts a SQL warehouse.
   *
   * @param startRequest a {@link com.databricks.sdk.service.sql.StartRequest} object
   */
  void start(StartRequest startRequest);

  /**
   * Stop a warehouse.
   *
   * <p>Stops a SQL warehouse.
   *
   * @param stopRequest a {@link com.databricks.sdk.service.sql.StopRequest} object
   */
  void stop(StopRequest stopRequest);
}
