// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;

/**
 * Apps run directly on a customer’s Databricks instance, integrate with their data, use and extend
 * Databricks services, and enable users to interact through single sign-on.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AppsService {
  /**
   * Create an app.
   *
   * <p>Creates a new app.
   */
  App create(CreateAppRequest createAppRequest);

  /**
   * Delete an app.
   *
   * <p>Deletes an app.
   */
  App delete(DeleteAppRequest deleteAppRequest);

  /**
   * Create an app deployment.
   *
   * <p>Creates an app deployment for the app with the supplied name.
   */
  AppDeployment deploy(CreateAppDeploymentRequest createAppDeploymentRequest);

  /**
   * Get an app.
   *
   * <p>Retrieves information for the app with the supplied name.
   */
  App get(GetAppRequest getAppRequest);

  /**
   * Get an app deployment.
   *
   * <p>Retrieves information for the app deployment with the supplied name and deployment id.
   */
  AppDeployment getDeployment(GetAppDeploymentRequest getAppDeploymentRequest);

  /**
   * Get app permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetAppPermissionLevelsResponse getPermissionLevels(
      GetAppPermissionLevelsRequest getAppPermissionLevelsRequest);

  /**
   * Get app permissions.
   *
   * <p>Gets the permissions of an app. Apps can inherit permissions from their root object.
   */
  AppPermissions getPermissions(GetAppPermissionsRequest getAppPermissionsRequest);

  /**
   * List apps.
   *
   * <p>Lists all apps in the workspace.
   */
  ListAppsResponse list(ListAppsRequest listAppsRequest);

  /**
   * List app deployments.
   *
   * <p>Lists all app deployments for the app with the supplied name.
   */
  ListAppDeploymentsResponse listDeployments(ListAppDeploymentsRequest listAppDeploymentsRequest);

  /**
   * Set app permissions.
   *
   * <p>Sets permissions on an object, replacing existing permissions if they exist. Deletes all
   * direct permissions if none are specified. Objects can inherit permissions from their root
   * object.
   */
  AppPermissions setPermissions(AppPermissionsRequest appPermissionsRequest);

  /**
   * Start an app.
   *
   * <p>Start the last active deployment of the app in the workspace.
   */
  App start(StartAppRequest startAppRequest);

  /**
   * Stop an app.
   *
   * <p>Stops the active deployment of the app in the workspace.
   */
  App stop(StopAppRequest stopAppRequest);

  /**
   * Update an app.
   *
   * <p>Updates the app with the supplied name.
   */
  App update(UpdateAppRequest updateAppRequest);

  /**
   * Update app permissions.
   *
   * <p>Updates the permissions on an app. Apps can inherit permissions from their root object.
   */
  AppPermissions updatePermissions(AppPermissionsRequest appPermissionsRequest);
}
