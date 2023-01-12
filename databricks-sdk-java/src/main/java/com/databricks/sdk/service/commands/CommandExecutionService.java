// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.commands;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running
 * Databricks Clusters.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface CommandExecutionService {
	/**
     * Cancel a command.
     * 
     * Cancels a currently running command within an execution context.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    void cancel(CancelCommand cancelCommand);
    
	/**
     * Get command info.
     * 
     * Gets the status of and, if available, the results from a currently
     * executing command.
     * 
     * The command ID is obtained from a prior successful call to __execute__.
     */
    CommandStatusResponse commandStatus(CommandStatusRequest commandStatusRequest);
    
	/**
     * Get status.
     * 
     * Gets the status for an execution context.
     */
    ContextStatusResponse contextStatus(ContextStatusRequest contextStatusRequest);
    
	/**
     * Create an execution context.
     * 
     * Creates an execution context for running cluster commands.
     * 
     * If successful, this method returns the ID of the new execution context.
     */
    Created create(CreateContext createContext);
    
	/**
     * Delete an execution context.
     * 
     * Deletes an execution context.
     */
    void destroy(DestroyContext destroyContext);
    
	/**
     * Run a command.
     * 
     * Runs a cluster command in the given execution context, using the provided
     * language.
     * 
     * If successful, it returns an ID for tracking the status of the command's
     * execution.
     */
    Created execute(Command command);
    
}