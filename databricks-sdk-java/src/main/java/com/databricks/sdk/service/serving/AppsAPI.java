// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lakehouse Apps run directly on a customer’s Databricks instance, integrate with their data, use
 * and extend Databricks services, and enable users to interact through single sign-on.
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

  public DeploymentStatus create(AppManifest manifest) {
    return create(new DeployAppRequest().setManifest(manifest));
  }

  /**
   * Create and deploy an application.
   *
   * <p>Creates and deploys an application.
   */
  public DeploymentStatus create(DeployAppRequest request) {
    return impl.create(request);
  }

  public DeleteAppResponse deleteApp(String name) {
    return deleteApp(new DeleteAppRequest().setName(name));
  }

  /**
   * Delete an application.
   *
   * <p>Delete an application definition
   */
  public DeleteAppResponse deleteApp(DeleteAppRequest request) {
    return impl.deleteApp(request);
  }

  public GetAppResponse getApp(String name) {
    return getApp(new GetAppRequest().setName(name));
  }

  /**
   * Get definition for an application.
   *
   * <p>Get an application definition
   */
  public GetAppResponse getApp(GetAppRequest request) {
    return impl.getApp(request);
  }

  public DeploymentStatus getAppDeploymentStatus(String deploymentId) {
    return getAppDeploymentStatus(
        new GetAppDeploymentStatusRequest().setDeploymentId(deploymentId));
  }

  /**
   * Get deployment status for an application.
   *
   * <p>Get deployment status for an application
   */
  public DeploymentStatus getAppDeploymentStatus(GetAppDeploymentStatusRequest request) {
    return impl.getAppDeploymentStatus(request);
  }

  /**
   * List all applications.
   *
   * <p>List all available applications
   */
  public ListAppsResponse getApps() {
    return impl.getApps();
  }

  public ListAppEventsResponse getEvents(String name) {
    return getEvents(new GetEventsRequest().setName(name));
  }

  /**
   * Get deployment events for an application.
   *
   * <p>Get deployment events for an application
   */
  public ListAppEventsResponse getEvents(GetEventsRequest request) {
    return impl.getEvents(request);
  }

  public AppsService impl() {
    return impl;
  }
}
