// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
 * Databricks SQL. Compute resources are infrastructure resources that provide processing
 * capabilities in the cloud.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WarehousesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WarehousesAPI.class);

  private final WarehousesService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WarehousesAPI(ApiClient apiClient) {
    impl = new WarehousesImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sql.WarehousesService} object
   */
  public WarehousesAPI(WarehousesService mock) {
    impl = mock;
  }

  /**
   * <p>waitGetWarehouseDeleted.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseDeleted(String id) throws TimeoutException {
    return waitGetWarehouseDeleted(id, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetWarehouseDeleted.</p>
   *
   * @param id a {@link java.lang.String} object
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseDeleted(
      String id, Duration timeout, Consumer<GetWarehouseResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<State> targetStates = Arrays.asList(State.DELETED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GetWarehouseResponse poll = get(new GetWarehouseRequest().setId(id));
      State status = poll.getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getHealth() != null) {
        statusMessage = poll.getHealth().getSummary();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      String prefix = String.format("id=%s", id);
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
   * <p>waitGetWarehouseRunning.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseRunning(String id) throws TimeoutException {
    return waitGetWarehouseRunning(id, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetWarehouseRunning.</p>
   *
   * @param id a {@link java.lang.String} object
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseRunning(
      String id, Duration timeout, Consumer<GetWarehouseResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<State> targetStates = Arrays.asList(State.RUNNING);
    java.util.List<State> failureStates = Arrays.asList(State.STOPPED, State.DELETED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GetWarehouseResponse poll = get(new GetWarehouseRequest().setId(id));
      State status = poll.getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getHealth() != null) {
        statusMessage = poll.getHealth().getSummary();
      }
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

      String prefix = String.format("id=%s", id);
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
   * <p>waitGetWarehouseStopped.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseStopped(String id) throws TimeoutException {
    return waitGetWarehouseStopped(id, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetWarehouseStopped.</p>
   *
   * @param id a {@link java.lang.String} object
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetWarehouseResponse waitGetWarehouseStopped(
      String id, Duration timeout, Consumer<GetWarehouseResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<State> targetStates = Arrays.asList(State.STOPPED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GetWarehouseResponse poll = get(new GetWarehouseRequest().setId(id));
      State status = poll.getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getHealth() != null) {
        statusMessage = poll.getHealth().getSummary();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      String prefix = String.format("id=%s", id);
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
   * Create a warehouse.
   *
   * <p>Creates a new SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.CreateWarehouseRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, CreateWarehouseResponse> create(
      CreateWarehouseRequest request) {
    CreateWarehouseResponse response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(response.getId(), timeout, callback),
        response);
  }

  /**
   * <p>delete.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> delete(String id) {
    return delete(new DeleteWarehouseRequest().setId(id));
  }

  /**
   * Delete a warehouse.
   *
   * <p>Deletes a SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.DeleteWarehouseRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> delete(DeleteWarehouseRequest request) {
    impl.delete(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseDeleted(request.getId(), timeout, callback));
  }

  /**
   * <p>edit.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> edit(String id) {
    return edit(new EditWarehouseRequest().setId(id));
  }

  /**
   * Update a warehouse.
   *
   * <p>Updates the configuration for a SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.EditWarehouseRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> edit(EditWarehouseRequest request) {
    impl.edit(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(request.getId(), timeout, callback));
  }

  /**
   * <p>get.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse get(String id) {
    return get(new GetWarehouseRequest().setId(id));
  }

  /**
   * Get warehouse info.
   *
   * <p>Gets the information for a single SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.GetWarehouseRequest} object
   * @return a {@link com.databricks.sdk.service.sql.GetWarehouseResponse} object
   */
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    return impl.get(request);
  }

  /**
   * Get the workspace configuration.
   *
   * <p>Gets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   *
   * @return a {@link com.databricks.sdk.service.sql.GetWorkspaceWarehouseConfigResponse} object
   */
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    return impl.getWorkspaceWarehouseConfig();
  }

  /**
   * List warehouses.
   *
   * <p>Lists all SQL warehouses that a user has manager permissions on.
   *
   * @param request a {@link com.databricks.sdk.service.sql.ListWarehousesRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<EndpointInfo> list(ListWarehousesRequest request) {
    return impl.list(request).getWarehouses();
  }

  /**
   * Set the workspace configuration.
   *
   * <p>Sets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   *
   * @param request a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    impl.setWorkspaceWarehouseConfig(request);
  }

  /**
   * <p>start.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> start(String id) {
    return start(new StartRequest().setId(id));
  }

  /**
   * Start a warehouse.
   *
   * <p>Starts a SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.StartRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> start(StartRequest request) {
    impl.start(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(request.getId(), timeout, callback));
  }

  /**
   * <p>stop.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> stop(String id) {
    return stop(new StopRequest().setId(id));
  }

  /**
   * Stop a warehouse.
   *
   * <p>Stops a SQL warehouse.
   *
   * @param request a {@link com.databricks.sdk.service.sql.StopRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetWarehouseResponse, Void> stop(StopRequest request) {
    impl.stop(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseStopped(request.getId(), timeout, callback));
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.WarehousesService} object
   */
  public WarehousesService impl() {
    return impl;
  }
}
