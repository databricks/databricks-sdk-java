// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

/**
 * These APIs enable administrators to manage published oauth app integrations, which is required
 * for adding/using Published OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 *
 * <p>**Note:** You can only add/use the OAuth published application integrations when OAuth
 * enrollment status is enabled. For more details see :method:OAuthEnrollment/create
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface PublishedAppIntegrationService {
  /**
   * Create Published OAuth App Integration.
   *
   * <p>Create Published OAuth App Integration.
   *
   * <p>You can retrieve the published oauth app integration via :method:get.
   *
   * @param createPublishedAppIntegration a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegration} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegrationOutput} object
   */
  CreatePublishedAppIntegrationOutput create(
      CreatePublishedAppIntegration createPublishedAppIntegration);

  /**
   * Delete Published OAuth App Integration.
   *
   * <p>Delete an existing Published OAuth App Integration. You can retrieve the published oauth app
   * integration via :method:get.
   *
   * @param deletePublishedAppIntegrationRequest a {@link com.databricks.sdk.service.oauth2.DeletePublishedAppIntegrationRequest} object
   */
  void delete(DeletePublishedAppIntegrationRequest deletePublishedAppIntegrationRequest);

  /**
   * Get OAuth Published App Integration.
   *
   * <p>Gets the Published OAuth App Integration for the given integration id.
   *
   * @param getPublishedAppIntegrationRequest a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationRequest} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  GetPublishedAppIntegrationOutput get(
      GetPublishedAppIntegrationRequest getPublishedAppIntegrationRequest);

  /**
   * Get published oauth app integrations.
   *
   * <p>Get the list of published oauth app integrations for the specified Databricks Account
   *
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationsOutput} object
   */
  GetPublishedAppIntegrationsOutput list();

  /**
   * Updates Published OAuth App Integration.
   *
   * <p>Updates an existing published OAuth App Integration. You can retrieve the published oauth
   * app integration via :method:get.
   *
   * @param updatePublishedAppIntegration a {@link com.databricks.sdk.service.oauth2.UpdatePublishedAppIntegration} object
   */
  void update(UpdatePublishedAppIntegration updatePublishedAppIntegration);
}
