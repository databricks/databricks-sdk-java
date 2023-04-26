// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface CommandExecutionService {
  /**
   * Cancel a command.
   *
   * <p>Cancels a currently running command within an execution context.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   *
   * @param cancelCommand a {@link com.databricks.sdk.service.compute.CancelCommand} object
   */
  void cancel(CancelCommand cancelCommand);

  /**
   * Get command info.
   *
   * <p>Gets the status of and, if available, the results from a currently executing command.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   *
   * @param commandStatusRequest a {@link com.databricks.sdk.service.compute.CommandStatusRequest} object
   * @return a {@link com.databricks.sdk.service.compute.CommandStatusResponse} object
   */
  CommandStatusResponse commandStatus(CommandStatusRequest commandStatusRequest);

  /**
   * Get status.
   *
   * <p>Gets the status for an execution context.
   *
   * @param contextStatusRequest a {@link com.databricks.sdk.service.compute.ContextStatusRequest} object
   * @return a {@link com.databricks.sdk.service.compute.ContextStatusResponse} object
   */
  ContextStatusResponse contextStatus(ContextStatusRequest contextStatusRequest);

  /**
   * Create an execution context.
   *
   * <p>Creates an execution context for running cluster commands.
   *
   * <p>If successful, this method returns the ID of the new execution context.
   *
   * @param createContext a {@link com.databricks.sdk.service.compute.CreateContext} object
   * @return a {@link com.databricks.sdk.service.compute.Created} object
   */
  Created create(CreateContext createContext);

  /**
   * Delete an execution context.
   *
   * <p>Deletes an execution context.
   *
   * @param destroyContext a {@link com.databricks.sdk.service.compute.DestroyContext} object
   */
  void destroy(DestroyContext destroyContext);

  /**
   * Run a command.
   *
   * <p>Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution.
   *
   * @param command a {@link com.databricks.sdk.service.compute.Command} object
   * @return a {@link com.databricks.sdk.service.compute.Created} object
   */
  Created execute(Command command);
}
