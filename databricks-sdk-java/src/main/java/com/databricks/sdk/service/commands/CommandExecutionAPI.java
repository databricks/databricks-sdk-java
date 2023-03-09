// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.commands;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running
 * Databricks Clusters.
 */
public class CommandExecutionAPI implements CommandExecutionService {
    private final ApiClient apiClient;

    public CommandExecutionAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Cancel a command.
     * 
     * Cancels a currently running command within an execution context.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    @Override
    public void cancel(CancelCommand request) {
        String path = "/api/1.2/commands/cancel";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get command info.
     * 
     * Gets the status of and, if available, the results from a currently
     * executing command.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    @Override
    public CommandStatusResponse commandStatus(CommandStatusRequest request) {
        String path = "/api/1.2/commands/status";
        return apiClient.GET(path, request, CommandStatusResponse.class);
    }
    
	/**
     * Get status.
     * 
     * Gets the status for an execution context.
     */
    @Override
    public ContextStatusResponse contextStatus(ContextStatusRequest request) {
        String path = "/api/1.2/contexts/status";
        return apiClient.GET(path, request, ContextStatusResponse.class);
    }
    
	/**
     * Create an execution context.
     * 
     * Creates an execution context for running cluster commands.
     * 
     * If successful, this method returns the ID of the new execution context.
     */
    @Override
    public Created create(CreateContext request) {
        String path = "/api/1.2/contexts/create";
        return apiClient.POST(path, request, Created.class);
    }
    
	/**
     * Delete an execution context.
     * 
     * Deletes an execution context.
     */
    @Override
    public void destroy(DestroyContext request) {
        String path = "/api/1.2/contexts/destroy";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Run a command.
     * 
     * Runs a cluster command in the given execution context, using the provided
     * language.
     * 
     * If successful, it returns an ID for tracking the status of the command's
     * execution.
     */
    @Override
    public Created execute(Command request) {
        String path = "/api/1.2/commands/execute";
        return apiClient.POST(path, request, Created.class);
    }
    
}