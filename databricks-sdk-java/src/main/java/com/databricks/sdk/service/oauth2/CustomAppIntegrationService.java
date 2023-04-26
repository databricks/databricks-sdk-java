// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

/**
 * These APIs enable administrators to manage custom oauth app integrations, which is required for
 * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 *
 * <p>**Note:** You can only add/use the OAuth custom application integrations when OAuth enrollment
 * status is enabled. For more details see :method:OAuthEnrollment/create
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface CustomAppIntegrationService {
  /**
   * Create Custom OAuth App Integration.
   *
   * <p>Create Custom OAuth App Integration.
   *
   * <p>You can retrieve the custom oauth app integration via :method:get.
   *
   * @param createCustomAppIntegration a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput} object
   */
  CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration createCustomAppIntegration);

  /**
   * Delete Custom OAuth App Integration.
   *
   * <p>Delete an existing Custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:get.
   *
   * @param deleteCustomAppIntegrationRequest a {@link com.databricks.sdk.service.oauth2.DeleteCustomAppIntegrationRequest} object
   */
  void delete(DeleteCustomAppIntegrationRequest deleteCustomAppIntegrationRequest);

  /**
   * Get OAuth Custom App Integration.
   *
   * <p>Gets the Custom OAuth App Integration for the given integration id.
   *
   * @param getCustomAppIntegrationRequest a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationRequest} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest getCustomAppIntegrationRequest);

  /**
   * Get custom oauth app integrations.
   *
   * <p>Get the list of custom oauth app integrations for the specified Databricks Account
   *
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationsOutput} object
   */
  GetCustomAppIntegrationsOutput list();

  /**
   * Updates Custom OAuth App Integration.
   *
   * <p>Updates an existing custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:get.
   *
   * @param updateCustomAppIntegration a {@link com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration} object
   */
  void update(UpdateCustomAppIntegration updateCustomAppIntegration);
}
