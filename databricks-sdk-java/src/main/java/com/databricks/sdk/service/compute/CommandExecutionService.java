// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CommandExecutionService {
  /**
   * Cancel a command.
   *
   * <p>Cancels a currently running command within an execution context.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  CancelResponse cancel(CancelCommand cancelCommand);

  /**
   * Get command info.
   *
   * <p>Gets the status of and, if available, the results from a currently executing command.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  CommandStatusResponse commandStatus(CommandStatusRequest commandStatusRequest);

  /**
   * Get status.
   *
   * <p>Gets the status for an execution context.
   */
  ContextStatusResponse contextStatus(ContextStatusRequest contextStatusRequest);

  /**
   * Create an execution context.
   *
   * <p>Creates an execution context for running cluster commands.
   *
   * <p>If successful, this method returns the ID of the new execution context.
   */
  Created create(CreateContext createContext);

  /**
   * Delete an execution context.
   *
   * <p>Deletes an execution context.
   */
  DestroyResponse destroy(DestroyContext destroyContext);

  /**
   * Run a command.
   *
   * <p>Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution.
   */
  Created execute(Command command);
}
