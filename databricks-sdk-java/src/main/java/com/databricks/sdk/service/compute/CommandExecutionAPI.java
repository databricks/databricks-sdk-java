// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
 */
@Generated
public class CommandExecutionAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CommandExecutionAPI.class);

  private final CommandExecutionService impl;

  /** Regular-use constructor */
  public CommandExecutionAPI(ApiClient apiClient) {
    impl = new CommandExecutionImpl(apiClient);
  }

  /** Constructor for mocks */
  public CommandExecutionAPI(CommandExecutionService mock) {
    impl = mock;
  }

  public CommandStatusResponse waitCommandStatusCommandExecutionCancelled(
      String clusterId, String commandId, String contextId) throws TimeoutException {
    return waitCommandStatusCommandExecutionCancelled(
        clusterId, commandId, contextId, Duration.ofMinutes(20), null);
  }

  public CommandStatusResponse waitCommandStatusCommandExecutionCancelled(
      String clusterId,
      String commandId,
      String contextId,
      Duration timeout,
      Consumer<CommandStatusResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<CommandStatus> targetStates = Arrays.asList(CommandStatus.CANCELLED);
    java.util.List<CommandStatus> failureStates = Arrays.asList(CommandStatus.ERROR);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      CommandStatusResponse poll =
          commandStatus(
              new CommandStatusRequest()
                  .setClusterId(clusterId)
                  .setCommandId(commandId)
                  .setContextId(contextId));
      CommandStatus status = poll.getStatus();
      statusMessage = String.format("current status: %s", status);
      if (poll.getResults() != null) {
        statusMessage = poll.getResults().getCause();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach CANCELLED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix =
          String.format(
              "clusterId=%s, commandId=%s, contextId=%s", clusterId, commandId, contextId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public CommandStatusResponse waitCommandStatusCommandExecutionFinishedOrError(
      String clusterId, String commandId, String contextId) throws TimeoutException {
    return waitCommandStatusCommandExecutionFinishedOrError(
        clusterId, commandId, contextId, Duration.ofMinutes(20), null);
  }

  public CommandStatusResponse waitCommandStatusCommandExecutionFinishedOrError(
      String clusterId,
      String commandId,
      String contextId,
      Duration timeout,
      Consumer<CommandStatusResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<CommandStatus> targetStates =
        Arrays.asList(CommandStatus.FINISHED, CommandStatus.ERROR);
    java.util.List<CommandStatus> failureStates =
        Arrays.asList(CommandStatus.CANCELLED, CommandStatus.CANCELLING);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      CommandStatusResponse poll =
          commandStatus(
              new CommandStatusRequest()
                  .setClusterId(clusterId)
                  .setCommandId(commandId)
                  .setContextId(contextId));
      CommandStatus status = poll.getStatus();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg =
            String.format("failed to reach FINISHED or ERROR, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix =
          String.format(
              "clusterId=%s, commandId=%s, contextId=%s", clusterId, commandId, contextId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public ContextStatusResponse waitContextStatusCommandExecutionRunning(
      String clusterId, String contextId) throws TimeoutException {
    return waitContextStatusCommandExecutionRunning(
        clusterId, contextId, Duration.ofMinutes(20), null);
  }

  public ContextStatusResponse waitContextStatusCommandExecutionRunning(
      String clusterId,
      String contextId,
      Duration timeout,
      Consumer<ContextStatusResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<ContextStatus> targetStates = Arrays.asList(ContextStatus.RUNNING);
    java.util.List<ContextStatus> failureStates = Arrays.asList(ContextStatus.ERROR);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      ContextStatusResponse poll =
          contextStatus(new ContextStatusRequest().setClusterId(clusterId).setContextId(contextId));
      ContextStatus status = poll.getStatus();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach RUNNING, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("clusterId=%s, contextId=%s", clusterId, contextId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Cancel a command.
   *
   * <p>Cancels a currently running command within an execution context.
   *
   * <p>The command ID is obtained from a prior successful call to __execute__.
   */
  public Wait<CommandStatusResponse, CancelResponse> cancel(CancelCommand request) {
    CancelResponse response = impl.cancel(request);
    return new Wait<>(
        (timeout, callback) ->
            waitCommandStatusCommandExecutionCancelled(
                request.getClusterId(),
                request.getCommandId(),
                request.getContextId(),
                timeout,
                callback),
        response);
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
  public Wait<ContextStatusResponse, Created> create(CreateContext request) {
    Created response = impl.create(request);
    return new Wait<>(
        (timeout, callback) ->
            waitContextStatusCommandExecutionRunning(
                request.getClusterId(), response.getId(), timeout, callback),
        response);
  }

  public DestroyResponse destroy(String clusterId, String contextId) {
    return destroy(new DestroyContext().setClusterId(clusterId).setContextId(contextId));
  }

  /**
   * Delete an execution context.
   *
   * <p>Deletes an execution context.
   */
  public DestroyResponse destroy(DestroyContext request) {
    return impl.destroy(request);
  }

  /**
   * Run a command.
   *
   * <p>Runs a cluster command in the given execution context, using the provided language.
   *
   * <p>If successful, it returns an ID for tracking the status of the command's execution.
   */
  public Wait<CommandStatusResponse, Created> execute(Command request) {
    Created response = impl.execute(request);
    return new Wait<>(
        (timeout, callback) ->
            waitCommandStatusCommandExecutionFinishedOrError(
                request.getClusterId(),
                response.getId(),
                request.getContextId(),
                timeout,
                callback),
        response);
  }

  public CommandExecutionService impl() {
    return impl;
  }
}
