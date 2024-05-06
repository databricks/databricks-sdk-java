// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

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
   * Create an App.
   *
   * <p>Creates a new app.
   */
  App create(CreateAppRequest createAppRequest);

  /**
   * Create an App Deployment.
   *
   * <p>Creates an app deployment for the app with the supplied name.
   */
  AppDeployment createDeployment(CreateAppDeploymentRequest createAppDeploymentRequest);

  /**
   * Delete an App.
   *
   * <p>Deletes an app.
   */
  void delete(DeleteAppRequest deleteAppRequest);

  /**
   * Get an App.
   *
   * <p>Retrieves information for the app with the supplied name.
   */
  App get(GetAppRequest getAppRequest);

  /**
   * Get an App Deployment.
   *
   * <p>Retrieves information for the app deployment with the supplied name and deployment id.
   */
  AppDeployment getDeployment(GetAppDeploymentRequest getAppDeploymentRequest);

  /**
   * Get App Environment.
   *
   * <p>Retrieves app environment.
   */
  AppEnvironment getEnvironment(GetAppEnvironmentRequest getAppEnvironmentRequest);

  /**
   * List Apps.
   *
   * <p>Lists all apps in the workspace.
   */
  ListAppsResponse list(ListAppsRequest listAppsRequest);

  /**
   * List App Deployments.
   *
   * <p>Lists all app deployments for the app with the supplied name.
   */
  ListAppDeploymentsResponse listDeployments(ListAppDeploymentsRequest listAppDeploymentsRequest);

  /**
   * Stop an App.
   *
   * <p>Stops the active deployment of the app in the workspace.
   */
  void stop(StopAppRequest stopAppRequest);

  /**
   * Update an App.
   *
   * <p>Updates the app with the supplied name.
   */
  App update(UpdateAppRequest updateAppRequest);
}
