// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data
 * objects within Databricks SQL. Compute resources are infrastructure resources
 * that provide processing capabilities in the cloud.
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
     * Creates a new SQL warehouse.
     */
    public CreateWarehouseResponse create(CreateWarehouseRequest request) {
        return impl.create(request);
    }
    
	/**
     * Delete a warehouse.
     * 
     * Deletes a SQL warehouse.
     */
    public void delete(DeleteWarehouseRequest request) {
        impl.delete(request);
    }
    
	/**
     * Update a warehouse.
     * 
     * Updates the configuration for a SQL warehouse.
     */
    public void edit(EditWarehouseRequest request) {
        impl.edit(request);
    }
    
	/**
     * Get warehouse info.
     * 
     * Gets the information for a single SQL warehouse.
     */
    public GetWarehouseResponse get(GetWarehouseRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get the workspace configuration.
     * 
     * Gets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
        return impl.getWorkspaceWarehouseConfig();
    }
    
	/**
     * List warehouses.
     * 
     * Lists all SQL warehouses that a user has manager permissions on.
     */
    public ListWarehousesResponse list(ListWarehousesRequest request) {
        return impl.list(request);
    }
    
	/**
     * Set the workspace configuration.
     * 
     * Sets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
        impl.setWorkspaceWarehouseConfig(request);
    }
    
	/**
     * Start a warehouse.
     * 
     * Starts a SQL warehouse.
     */
    public void start(StartRequest request) {
        impl.start(request);
    }
    
	/**
     * Stop a warehouse.
     * 
     * Stops a SQL warehouse.
     */
    public void stop(StopRequest request) {
        impl.stop(request);
    }
    
    public WarehousesService impl() {
        return impl;
    }
}