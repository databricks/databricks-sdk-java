// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.commands;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
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
   * <p>Cancels a currently running command within an execution context.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  public void cancel(CancelCommand request) {
    impl.cancel(request);
  }

  public CommandStatusResponse commandStatus(String clusterId, String contextId, String commandId) {
    return commandStatus(
        new CommandStatusRequest()
            .setClusterId(clusterId)
            .setContextId(contextId)
            .setCommandId(commandId));
  }

  /**
   * Get command info.
   *
   * <p>Gets the status of and, if available, the results from a currently executing command.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  public CommandStatusResponse commandStatus(CommandStatusRequest request) {
    return impl.commandStatus(request);
  }

  public ContextStatusResponse contextStatus(String clusterId, String contextId) {
    return contextStatus(
        new ContextStatusRequest().setClusterId(clusterId).setContextId(contextId));
  }

  /**
   * Get status.
   *
   * <p>Gets the status for an execution context.
   */
  public ContextStatusResponse contextStatus(ContextStatusRequest request) {
    return impl.contextStatus(request);
  }

  /**
   * Create an execution context.
   *
   * <p>Creates an execution context for running cluster commands.
   *
   * <p>If successful, this method returns the ID of the new execution context.
   */
  public Created create(CreateContext request) {
    return impl.create(request);
  }

  public void destroy(String clusterId, String contextId) {
    destroy(new DestroyContext().setClusterId(clusterId).setContextId(contextId));
  }

  /**
   * Delete an execution context.
   *
   * <p>Deletes an execution context.
   */
  public void destroy(DestroyContext request) {
    impl.destroy(request);
  }

  /**
   * Run a command.
   *
   * <p>Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution.
   */
  public Created execute(Command request) {
    return impl.execute(request);
  }

  public CommandExecutionService impl() {
    return impl;
  }
}
