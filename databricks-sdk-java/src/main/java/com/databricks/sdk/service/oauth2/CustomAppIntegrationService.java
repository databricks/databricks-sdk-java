// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs enable administrators to manage custom OAuth app integrations, which is required for
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
   * <p>You can retrieve the custom OAuth app integration via :method:CustomAppIntegration/get.
   */
  CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration createCustomAppIntegration);

  /**
   * Delete an existing Custom OAuth App Integration. You can retrieve the custom OAuth app
   * integration via :method:CustomAppIntegration/get.
   */
  void delete(DeleteCustomAppIntegrationRequest deleteCustomAppIntegrationRequest);

  /** Gets the Custom OAuth App Integration for the given integration id. */
  GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest getCustomAppIntegrationRequest);

  /** Get the list of custom OAuth app integrations for the specified Databricks account */
  GetCustomAppIntegrationsOutput list(
      ListCustomAppIntegrationsRequest listCustomAppIntegrationsRequest);

  /**
   * Updates an existing custom OAuth App Integration. You can retrieve the custom OAuth app
   * integration via :method:CustomAppIntegration/get.
   */
  void update(UpdateCustomAppIntegration updateCustomAppIntegration);
}
