// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage published oauth app integrations, which is required
 * for adding/using Published OAuth App Integration like Tableau Desktop for Databricks in AWS
 * cloud.
 */
@Generated
public class PublishedAppIntegrationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PublishedAppIntegrationAPI.class);

  private final PublishedAppIntegrationService impl;

  /** Regular-use constructor */
  public PublishedAppIntegrationAPI(ApiClient apiClient) {
    impl = new PublishedAppIntegrationImpl(apiClient);
  }

  /** Constructor for mocks */
  public PublishedAppIntegrationAPI(PublishedAppIntegrationService mock) {
    impl = mock;
  }

  /**
   * Create Published OAuth App Integration.
   *
   * <p>Create Published OAuth App Integration.
   *
   * <p>You can retrieve the published oauth app integration via
   * :method:PublishedAppIntegration/get.
   */
  public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
    return impl.create(request);
  }

  public DeletePublishedAppIntegrationOutput delete(String integrationId) {
    return delete(new DeletePublishedAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Delete Published OAuth App Integration.
   *
   * <p>Delete an existing Published OAuth App Integration. You can retrieve the published oauth app
   * integration via :method:PublishedAppIntegration/get.
   */
  public DeletePublishedAppIntegrationOutput delete(DeletePublishedAppIntegrationRequest request) {
    return impl.delete(request);
  }

  public GetPublishedAppIntegrationOutput get(String integrationId) {
    return get(new GetPublishedAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Get OAuth Published App Integration.
   *
   * <p>Gets the Published OAuth App Integration for the given integration id.
   */
  public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
    return impl.get(request);
  }

  /**
   * Get published oauth app integrations.
   *
   * <p>Get the list of published oauth app integrations for the specified Databricks account
   */
  public Iterable<GetPublishedAppIntegrationOutput> list() {
    return impl.list().getApps();
  }

  public UpdatePublishedAppIntegrationOutput update(String integrationId) {
    return update(new UpdatePublishedAppIntegration().setIntegrationId(integrationId));
  }

  /**
   * Updates Published OAuth App Integration.
   *
   * <p>Updates an existing published OAuth App Integration. You can retrieve the published oauth
   * app integration via :method:PublishedAppIntegration/get.
   */
  public UpdatePublishedAppIntegrationOutput update(UpdatePublishedAppIntegration request) {
    return impl.update(request);
  }

  public PublishedAppIntegrationService impl() {
    return impl;
  }
}
