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
public class WarehousesAPI implements WarehousesService {
    private final ApiClient apiClient;

    public WarehousesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a warehouse.
     * 
     * Creates a new SQL warehouse.
     */
    @Override
    public CreateWarehouseResponse create(CreateWarehouseRequest request) {
        String path = "/api/2.0/sql/warehouses";
        return apiClient.POST(path, request, CreateWarehouseResponse.class);
    }
    
	/**
     * Delete a warehouse.
     * 
     * Deletes a SQL warehouse.
     */
    @Override
    public void delete(DeleteWarehouseRequest request) {
        String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Update a warehouse.
     * 
     * Updates the configuration for a SQL warehouse.
     */
    @Override
    public void edit(EditWarehouseRequest request) {
        String path = String.format("/api/2.0/sql/warehouses/%s/edit", request.getId());
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get warehouse info.
     * 
     * Gets the information for a single SQL warehouse.
     */
    @Override
    public GetWarehouseResponse get(GetWarehouseRequest request) {
        String path = String.format("/api/2.0/sql/warehouses/%s", request.getId());
        return apiClient.GET(path, request, GetWarehouseResponse.class);
    }
    
	/**
     * Get the workspace configuration.
     * 
     * Gets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    @Override
    public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
        String path = "/api/2.0/sql/config/warehouses";
        return apiClient.GET(path, GetWorkspaceWarehouseConfigResponse.class);
    }
    
	/**
     * List warehouses.
     * 
     * Lists all SQL warehouses that a user has manager permissions on.
     */
    @Override
    public ListWarehousesResponse list(ListWarehousesRequest request) {
        String path = "/api/2.0/sql/warehouses";
        return apiClient.GET(path, request, ListWarehousesResponse.class);
    }
    
	/**
     * Set the workspace configuration.
     * 
     * Sets the workspace level configuration that is shared by all SQL
     * warehouses in a workspace.
     */
    @Override
    public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
        String path = "/api/2.0/sql/config/warehouses";
        apiClient.PUT(path, request, Void.class);
    }
    
	/**
     * Start a warehouse.
     * 
     * Starts a SQL warehouse.
     */
    @Override
    public void start(StartRequest request) {
        String path = String.format("/api/2.0/sql/warehouses/%s/start", request.getId());
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Stop a warehouse.
     * 
     * Stops a SQL warehouse.
     */
    @Override
    public void stop(StopRequest request) {
        String path = String.format("/api/2.0/sql/warehouses/%s/stop", request.getId());
        apiClient.POST(path, request, Void.class);
    }
    
}