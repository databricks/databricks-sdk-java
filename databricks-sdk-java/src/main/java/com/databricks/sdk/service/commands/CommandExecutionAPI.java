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
public class CommandExecutionAPI {
    private final CommandExecutionService impl;

    /** Regular-use constructor */
    public CommandExecutionAPI(ApiClient apiClient) {
        impl = new CommandExecutionImpl(apiClient);
    }

    /** Constructor for mocks */
    public CommandExecutionAPI(CommandExecutionService mock) {
        impl = mock;
    }
	
	/**
     * Cancel a command.
     * 
     * Cancels a currently running command within an execution context.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    public void cancel(CancelCommand request) {
        impl.cancel(request);
    }
    
	/**
     * Get command info.
     * 
     * Gets the status of and, if available, the results from a currently
     * executing command.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    public CommandStatusResponse commandStatus(CommandStatusRequest request) {
        return impl.commandStatus(request);
    }
    
	/**
     * Get status.
     * 
     * Gets the status for an execution context.
     */
    public ContextStatusResponse contextStatus(ContextStatusRequest request) {
        return impl.contextStatus(request);
    }
    
	/**
     * Create an execution context.
     * 
     * Creates an execution context for running cluster commands.
     * 
     * If successful, this method returns the ID of the new execution context.
     */
    public Created create(CreateContext request) {
        return impl.create(request);
    }
    
	/**
     * Delete an execution context.
     * 
     * Deletes an execution context.
     */
    public void destroy(DestroyContext request) {
        impl.destroy(request);
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
    public Created execute(Command request) {
        return impl.execute(request);
    }
    
    public CommandExecutionService impl() {
        return impl;
    }
}