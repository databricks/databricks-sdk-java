// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs enable administrators to manage published OAuth app integrations, which is required
 * for adding/using Published OAuth App Integration like Tableau Desktop for Databricks in AWS
 * cloud.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PublishedAppIntegrationService {
  /**
   * Create Published OAuth App Integration.
   *
   * <p>Create Published OAuth App Integration.
   *
   * <p>You can retrieve the published OAuth app integration via
   * :method:PublishedAppIntegration/get.
   */
  CreatePublishedAppIntegrationOutput create(
      CreatePublishedAppIntegration createPublishedAppIntegration);

  /**
   * Delete Published OAuth App Integration.
   *
   * <p>Delete an existing Published OAuth App Integration. You can retrieve the published OAuth app
   * integration via :method:PublishedAppIntegration/get.
   */
  void delete(DeletePublishedAppIntegrationRequest deletePublishedAppIntegrationRequest);

  /**
   * Get OAuth Published App Integration.
   *
   * <p>Gets the Published OAuth App Integration for the given integration id.
   */
  GetPublishedAppIntegrationOutput get(
      GetPublishedAppIntegrationRequest getPublishedAppIntegrationRequest);

  /**
   * Get published oauth app integrations.
   *
   * <p>Get the list of published OAuth app integrations for the specified Databricks account
   */
  GetPublishedAppIntegrationsOutput list(
      ListPublishedAppIntegrationsRequest listPublishedAppIntegrationsRequest);

  /**
   * Updates Published OAuth App Integration.
   *
   * <p>Updates an existing published OAuth App Integration. You can retrieve the published OAuth
   * app integration via :method:PublishedAppIntegration/get.
   */
  void update(UpdatePublishedAppIntegration updatePublishedAppIntegration);
}
