// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
 * This API only supports (classic) all-purpose clusters. Serverless compute is not supported.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CommandExecutionService {
  /**
   * Cancels a currently running command within an execution context.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  void cancel(CancelCommand cancelCommand);

  /**
   * Gets the status of and, if available, the results from a currently executing command.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  CommandStatusResponse commandStatus(CommandStatusRequest commandStatusRequest);

  /** Gets the status for an execution context. */
  ContextStatusResponse contextStatus(ContextStatusRequest contextStatusRequest);

  /**
   * Creates an execution context for running cluster commands.
   *
   * <p>If successful, this method returns the ID of the new execution context.
   */
  Created create(CreateContext createContext);

  /** Deletes an execution context. */
  void destroy(DestroyContext destroyContext);

  /**
   * Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution.
   */
  Created execute(Command command);
}
