// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

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
 * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
 * Databricks SQL. Compute resources are infrastructure resources that provide processing
 * capabilities in the cloud.
 */
@Generated
public class WarehousesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WarehousesAPI.class);

  private final WarehousesService impl;

  /** Regular-use constructor */
  public WarehousesAPI(ApiClient apiClient) {
    impl = new WarehousesImpl(apiClient);
  }

  /** Constructor for mocks */
  public WarehousesAPI(WarehousesService mock) {
    impl = mock;
  }

  public GetWarehouseResponse waitGetWarehouseRunning(String id) throws TimeoutException {
    return waitGetWarehouseRunning(id, Duration.ofMinutes(20), null);
  }

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

  public GetWarehouseResponse waitGetWarehouseStopped(String id) throws TimeoutException {
    return waitGetWarehouseStopped(id, Duration.ofMinutes(20), null);
  }

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
   */
  public Wait<GetWarehouseResponse, CreateWarehouseResponse> create(
      CreateWarehouseRequest request) {
    CreateWarehouseResponse response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(response.getId(), timeout, callback),
        response);
  }

  public void delete(String id) {
    delete(new DeleteWarehouseRequest().setId(id));
  }

  /**
   * Delete a warehouse.
   *
   * <p>Deletes a SQL warehouse.
   */
  public void delete(DeleteWarehouseRequest request) {
    impl.delete(request);
  }

  public Wait<GetWarehouseResponse, Void> edit(String id) {
    return edit(new EditWarehouseRequest().setId(id));
  }

  /**
   * Update a warehouse.
   *
   * <p>Updates the configuration for a SQL warehouse.
   */
  public Wait<GetWarehouseResponse, Void> edit(EditWarehouseRequest request) {
    impl.edit(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(request.getId(), timeout, callback));
  }

  public GetWarehouseResponse get(String id) {
    return get(new GetWarehouseRequest().setId(id));
  }

  /**
   * Get warehouse info.
   *
   * <p>Gets the information for a single SQL warehouse.
   */
  public GetWarehouseResponse get(GetWarehouseRequest request) {
    return impl.get(request);
  }

  public GetWarehousePermissionLevelsResponse getPermissionLevels(String warehouseId) {
    return getPermissionLevels(
        new GetWarehousePermissionLevelsRequest().setWarehouseId(warehouseId));
  }

  /**
   * Get SQL warehouse permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetWarehousePermissionLevelsResponse getPermissionLevels(
      GetWarehousePermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public WarehousePermissions getPermissions(String warehouseId) {
    return getPermissions(new GetWarehousePermissionsRequest().setWarehouseId(warehouseId));
  }

  /**
   * Get SQL warehouse permissions.
   *
   * <p>Gets the permissions of a SQL warehouse. SQL warehouses can inherit permissions from their
   * root object.
   */
  public WarehousePermissions getPermissions(GetWarehousePermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /**
   * Get the workspace configuration.
   *
   * <p>Gets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  public GetWorkspaceWarehouseConfigResponse getWorkspaceWarehouseConfig() {
    return impl.getWorkspaceWarehouseConfig();
  }

  /**
   * List warehouses.
   *
   * <p>Lists all SQL warehouses that a user has manager permissions on.
   */
  public Iterable<EndpointInfo> list(ListWarehousesRequest request) {
    return impl.list(request).getWarehouses();
  }

  public WarehousePermissions setPermissions(String warehouseId) {
    return setPermissions(new WarehousePermissionsRequest().setWarehouseId(warehouseId));
  }

  /**
   * Set SQL warehouse permissions.
   *
   * <p>Sets permissions on a SQL warehouse. SQL warehouses can inherit permissions from their root
   * object.
   */
  public WarehousePermissions setPermissions(WarehousePermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Set the workspace configuration.
   *
   * <p>Sets the workspace level configuration that is shared by all SQL warehouses in a workspace.
   */
  public void setWorkspaceWarehouseConfig(SetWorkspaceWarehouseConfigRequest request) {
    impl.setWorkspaceWarehouseConfig(request);
  }

  public Wait<GetWarehouseResponse, Void> start(String id) {
    return start(new StartRequest().setId(id));
  }

  /**
   * Start a warehouse.
   *
   * <p>Starts a SQL warehouse.
   */
  public Wait<GetWarehouseResponse, Void> start(StartRequest request) {
    impl.start(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseRunning(request.getId(), timeout, callback));
  }

  public Wait<GetWarehouseResponse, Void> stop(String id) {
    return stop(new StopRequest().setId(id));
  }

  /**
   * Stop a warehouse.
   *
   * <p>Stops a SQL warehouse.
   */
  public Wait<GetWarehouseResponse, Void> stop(StopRequest request) {
    impl.stop(request);
    return new Wait<>(
        (timeout, callback) -> waitGetWarehouseStopped(request.getId(), timeout, callback));
  }

  public WarehousePermissions updatePermissions(String warehouseId) {
    return updatePermissions(new WarehousePermissionsRequest().setWarehouseId(warehouseId));
  }

  /**
   * Update SQL warehouse permissions.
   *
   * <p>Updates the permissions on a SQL warehouse. SQL warehouses can inherit permissions from
   * their root object.
   */
  public WarehousePermissions updatePermissions(WarehousePermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public WarehousesService impl() {
    return impl;
  }
}
