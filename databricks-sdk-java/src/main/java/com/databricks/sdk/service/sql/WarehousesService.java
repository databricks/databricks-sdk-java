// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data
 * objects within Databricks SQL. Compute resources are infrastructure resources
 * that provide processing capabilities in the cloud.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface WarehousesService {
	/**
     * Create a warehouse.
     * 
     * Creates a new SQL warehouse.
     */
    CreateWarehouseResponse create(CreateWarehouseRequest createWarehouseRequest);
    
	/**
     * Delete a warehouse.
     * 
     * Deletes a SQL warehouse.
     */
    void delete(DeleteWarehouseRequest deleteWarehouseRequest);
    
	/**
     * Update a warehouse.
     * 
     * Updates the configuration for a SQL warehouse.
     */
    void edit(EditWarehouseRequest editWarehouseRequest);
    
	/**
     * Get warehouse info.
     * 
     * Gets the information for a single SQL warehouse.
     */
    GetWarehouseResponse get(GetWarehouseRequest getWarehouseRequest);
    
	/**
     * Get the workspace configuration.
     * 
     * Gets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig();
    
	/**
     * List warehouses.
     * 
     * Lists all SQL warehouses that a user has manager permissions on.
     */
    ListWarehousesResponse list(ListWarehousesRequest listWarehousesRequest);
    
	/**
     * Set the workspace configuration.
     * 
     * Sets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest setWorkspaceWarehouseConfigRequest);
    
	/**
     * Start a warehouse.
     * 
     * Starts a SQL warehouse.
     */
    void start(StartRequest startRequest);
    
	/**
     * Stop a warehouse.
     * 
     * Stops a SQL warehouse.
     */
    void stop(StopRequest stopRequest);
    
}