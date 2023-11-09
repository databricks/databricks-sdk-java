// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * Lakehouse Apps run directly on a customer’s Databricks instance, integrate with their data, use
 * and extend Databricks services, and enable users to interact through single sign-on.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AppsService {
  /**
   * Create and deploy an application.
   *
   * <p>Creates and deploys an application.
   */
  DeploymentStatus create(DeployAppRequest deployAppRequest);

  /**
   * Delete an application.
   *
   * <p>Delete an application definition
   */
  DeleteAppResponse deleteApp(DeleteAppRequest deleteAppRequest);

  /**
   * Get definition for an application.
   *
   * <p>Get an application definition
   */
  GetAppResponse getApp(GetAppRequest getAppRequest);

  /**
   * Get deployment status for an application.
   *
   * <p>Get deployment status for an application
   */
  DeploymentStatus getAppDeploymentStatus(
      GetAppDeploymentStatusRequest getAppDeploymentStatusRequest);

  /**
   * List all applications.
   *
   * <p>List all available applications
   */
  ListAppsResponse getApps();

  /**
   * Get deployment events for an application.
   *
   * <p>Get deployment events for an application
   */
  ListAppEventsResponse getEvents(GetEventsRequest getEventsRequest);
}
