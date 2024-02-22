// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs enable administrators to manage custom oauth app integrations, which is required for
 * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CustomAppIntegrationService {
  /**
   * Create Custom OAuth App Integration.
   *
   * <p>Create Custom OAuth App Integration.
   *
   * <p>You can retrieve the custom oauth app integration via :method:CustomAppIntegration/get.
   */
  CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration createCustomAppIntegration);

  /**
   * Delete Custom OAuth App Integration.
   *
   * <p>Delete an existing Custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:CustomAppIntegration/get.
   */
  DeleteCustomAppIntegrationOutput delete(
      DeleteCustomAppIntegrationRequest deleteCustomAppIntegrationRequest);

  /**
   * Get OAuth Custom App Integration.
   *
   * <p>Gets the Custom OAuth App Integration for the given integration id.
   */
  GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest getCustomAppIntegrationRequest);

  /**
   * Get custom oauth app integrations.
   *
   * <p>Get the list of custom oauth app integrations for the specified Databricks account
   */
  GetCustomAppIntegrationsOutput list();

  /**
   * Updates Custom OAuth App Integration.
   *
   * <p>Updates an existing custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:CustomAppIntegration/get.
   */
  UpdateCustomAppIntegrationOutput update(UpdateCustomAppIntegration updateCustomAppIntegration);
}
