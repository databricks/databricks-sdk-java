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

  public void delete(String name) {
    delete(new DeleteAppRequest().setName(name));
  }

  /**
   * Delete an application.
   *
   * <p>Delete an application definition
   */
  public void delete(DeleteAppRequest request) {
    impl.delete(request);
  }

  public void get(String name) {
    get(new GetAppRequest().setName(name));
  }

  /**
   * Get definition for an application.
   *
   * <p>Get an application definition
   */
  public void get(GetAppRequest request) {
    impl.get(request);
  }

  public AppsService impl() {
    return impl;
  }
}
