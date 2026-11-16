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
   * <p>The command ID is obtained from a prior successful call to __execute__. Cancellation is
   * asynchronous: this method returns once the request is accepted, and the command moves through
   * the `Cancelling` status before reaching a terminal one. Poll __commandStatus__ to observe the
   * outcome; a cancelled command ends in the `Finished` status with an `error` result that
   * describes the cancellation.
   */
  void cancel(CancelCommand cancelCommand);

  /**
   * Gets the status of and, if available, the results from a currently executing command.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__. Poll this method
   * until the status is one of the terminal values `Finished`, `Error` or `Cancelled`; the
   * `results` field is populated only once the command has reached a terminal status.
   */
  CommandStatusResponse commandStatus(CommandStatusRequest commandStatusRequest);

  /**
   * Gets the status for an execution context.
   *
   * <p>After __Create__, poll this method until the status is `Running` or `Error`. Requests for a
   * context that has been deleted fail with an error instead of returning a status.
   */
  ContextStatusResponse contextStatus(ContextStatusRequest contextStatusRequest);

  /**
   * Creates an execution context for running cluster commands.
   *
   * <p>If successful, this method returns the ID of the new execution context. The context may
   * still be initializing when this method returns, so poll __contextStatus__ until the status is
   * `Running` before running commands in it. This method and the other methods of this API require
   * the CAN ATTACH TO permission on the cluster.
   */
  Created create(CreateContext createContext);

  /**
   * Deletes an execution context.
   *
   * <p>Delete contexts you no longer need, because a cluster can host only a limited number of
   * execution contexts at a time. Deleting a context that no longer exists succeeds, so the call is
   * safe to retry.
   */
  void destroy(DestroyContext destroyContext);

  /**
   * Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution. This
   * method returns as soon as the command is accepted, so poll __commandStatus__ with the returned
   * ID to wait for the command to finish and to read its results.
   */
  Created execute(Command command);
}
