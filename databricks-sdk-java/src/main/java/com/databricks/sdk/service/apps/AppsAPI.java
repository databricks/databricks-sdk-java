// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Apps run directly on a customer’s Databricks instance, integrate with their data, use and extend
 * Databricks services, and enable users to interact through single sign-on.
 */
@Generated
public class AppsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AppsAPI.class);

  private final AppsService impl;

  /** Regular-use constructor */
  public AppsAPI(ApiClient apiClient) {
    impl = new AppsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AppsAPI(AppsService mock) {
    impl = mock;
  }

  public App waitGetAppActive(String name) throws TimeoutException {
    return waitGetAppActive(name, Duration.ofMinutes(20), null);
  }

  public App waitGetAppActive(String name, Duration timeout, Consumer<App> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<ComputeState> targetStates = Arrays.asList(ComputeState.ACTIVE);
    java.util.List<ComputeState> failureStates =
        Arrays.asList(ComputeState.ERROR, ComputeState.STOPPED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      App poll = get(new GetAppRequest().setName(name));
      ComputeState status = poll.getComputeStatus().getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getComputeStatus() != null) {
        statusMessage = poll.getComputeStatus().getMessage();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach ACTIVE, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("name=%s", name);
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
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public App waitGetAppStopped(String name) throws TimeoutException {
    return waitGetAppStopped(name, Duration.ofMinutes(20), null);
  }

  public App waitGetAppStopped(String name, Duration timeout, Consumer<App> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<ComputeState> targetStates = Arrays.asList(ComputeState.STOPPED);
    java.util.List<ComputeState> failureStates = Arrays.asList(ComputeState.ERROR);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      App poll = get(new GetAppRequest().setName(name));
      ComputeState status = poll.getComputeStatus().getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getComputeStatus() != null) {
        statusMessage = poll.getComputeStatus().getMessage();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach STOPPED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("name=%s", name);
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
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public AppDeployment waitGetDeploymentAppSucceeded(String appName, String deploymentId)
      throws TimeoutException {
    return waitGetDeploymentAppSucceeded(appName, deploymentId, Duration.ofMinutes(20), null);
  }

  public AppDeployment waitGetDeploymentAppSucceeded(
      String appName, String deploymentId, Duration timeout, Consumer<AppDeployment> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<AppDeploymentState> targetStates = Arrays.asList(AppDeploymentState.SUCCEEDED);
    java.util.List<AppDeploymentState> failureStates = Arrays.asList(AppDeploymentState.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      AppDeployment poll =
          getDeployment(
              new GetAppDeploymentRequest().setAppName(appName).setDeploymentId(deploymentId));
      AppDeploymentState status = poll.getStatus().getState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getStatus() != null) {
        statusMessage = poll.getStatus().getMessage();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach SUCCEEDED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("appName=%s, deploymentId=%s", appName, deploymentId);
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
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  public Wait<App, App> create(String name) {
    return create(new CreateAppRequest().setName(name));
  }

  /**
   * Create an app.
   *
   * <p>Creates a new app.
   */
  public Wait<App, App> create(CreateAppRequest request) {
    App response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetAppActive(response.getName(), timeout, callback), response);
  }

  public App delete(String name) {
    return delete(new DeleteAppRequest().setName(name));
  }

  /**
   * Delete an app.
   *
   * <p>Deletes an app.
   */
  public App delete(DeleteAppRequest request) {
    return impl.delete(request);
  }

  public Wait<AppDeployment, AppDeployment> deploy(String appName) {
    return deploy(new CreateAppDeploymentRequest().setAppName(appName));
  }

  /**
   * Create an app deployment.
   *
   * <p>Creates an app deployment for the app with the supplied name.
   */
  public Wait<AppDeployment, AppDeployment> deploy(CreateAppDeploymentRequest request) {
    AppDeployment response = impl.deploy(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetDeploymentAppSucceeded(
                request.getAppName(), response.getDeploymentId(), timeout, callback),
        response);
  }

  public App get(String name) {
    return get(new GetAppRequest().setName(name));
  }

  /**
   * Get an app.
   *
   * <p>Retrieves information for the app with the supplied name.
   */
  public App get(GetAppRequest request) {
    return impl.get(request);
  }

  public AppDeployment getDeployment(String appName, String deploymentId) {
    return getDeployment(
        new GetAppDeploymentRequest().setAppName(appName).setDeploymentId(deploymentId));
  }

  /**
   * Get an app deployment.
   *
   * <p>Retrieves information for the app deployment with the supplied name and deployment id.
   */
  public AppDeployment getDeployment(GetAppDeploymentRequest request) {
    return impl.getDeployment(request);
  }

  public GetAppPermissionLevelsResponse getPermissionLevels(String appName) {
    return getPermissionLevels(new GetAppPermissionLevelsRequest().setAppName(appName));
  }

  /**
   * Get app permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetAppPermissionLevelsResponse getPermissionLevels(GetAppPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public AppPermissions getPermissions(String appName) {
    return getPermissions(new GetAppPermissionsRequest().setAppName(appName));
  }

  /**
   * Get app permissions.
   *
   * <p>Gets the permissions of an app. Apps can inherit permissions from their root object.
   */
  public AppPermissions getPermissions(GetAppPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /**
   * List apps.
   *
   * <p>Lists all apps in the workspace.
   */
  public Iterable<App> list(ListAppsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListAppsResponse::getApps,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<AppDeployment> listDeployments(String appName) {
    return listDeployments(new ListAppDeploymentsRequest().setAppName(appName));
  }

  /**
   * List app deployments.
   *
   * <p>Lists all app deployments for the app with the supplied name.
   */
  public Iterable<AppDeployment> listDeployments(ListAppDeploymentsRequest request) {
    return new Paginator<>(
        request,
        impl::listDeployments,
        ListAppDeploymentsResponse::getAppDeployments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public AppPermissions setPermissions(String appName) {
    return setPermissions(new AppPermissionsRequest().setAppName(appName));
  }

  /**
   * Set app permissions.
   *
   * <p>Sets permissions on an app. Apps can inherit permissions from their root object.
   */
  public AppPermissions setPermissions(AppPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  public Wait<App, App> start(String name) {
    return start(new StartAppRequest().setName(name));
  }

  /**
   * Start an app.
   *
   * <p>Start the last active deployment of the app in the workspace.
   */
  public Wait<App, App> start(StartAppRequest request) {
    App response = impl.start(request);
    return new Wait<>(
        (timeout, callback) -> waitGetAppActive(response.getName(), timeout, callback), response);
  }

  public Wait<App, App> stop(String name) {
    return stop(new StopAppRequest().setName(name));
  }

  /**
   * Stop an app.
   *
   * <p>Stops the active deployment of the app in the workspace.
   */
  public Wait<App, App> stop(StopAppRequest request) {
    App response = impl.stop(request);
    return new Wait<>(
        (timeout, callback) -> waitGetAppStopped(response.getName(), timeout, callback), response);
  }

  public App update(String name) {
    return update(new UpdateAppRequest().setName(name));
  }

  /**
   * Update an app.
   *
   * <p>Updates the app with the supplied name.
   */
  public App update(UpdateAppRequest request) {
    return impl.update(request);
  }

  public AppPermissions updatePermissions(String appName) {
    return updatePermissions(new AppPermissionsRequest().setAppName(appName));
  }

  /**
   * Update app permissions.
   *
   * <p>Updates the permissions on an app. Apps can inherit permissions from their root object.
   */
  public AppPermissions updatePermissions(AppPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public AppsService impl() {
    return impl;
  }
}
