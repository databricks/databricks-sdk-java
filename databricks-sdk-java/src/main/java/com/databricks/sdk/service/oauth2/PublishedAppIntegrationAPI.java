// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage published OAuth app integrations, which is required
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
   * <p>You can retrieve the published OAuth app integration via
   * :method:PublishedAppIntegration/get.
   */
  public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
    return impl.create(request);
  }

  public void delete(String integrationId) {
    delete(new DeletePublishedAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Delete Published OAuth App Integration.
   *
   * <p>Delete an existing Published OAuth App Integration. You can retrieve the published OAuth app
   * integration via :method:PublishedAppIntegration/get.
   */
  public void delete(DeletePublishedAppIntegrationRequest request) {
    impl.delete(request);
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
   * <p>Get the list of published OAuth app integrations for the specified Databricks account
   */
  public Iterable<GetPublishedAppIntegrationOutput> list(
      ListPublishedAppIntegrationsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        GetPublishedAppIntegrationsOutput::getApps,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void update(String integrationId) {
    update(new UpdatePublishedAppIntegration().setIntegrationId(integrationId));
  }

  /**
   * Updates Published OAuth App Integration.
   *
   * <p>Updates an existing published OAuth App Integration. You can retrieve the published OAuth
   * app integration via :method:PublishedAppIntegration/get.
   */
  public void update(UpdatePublishedAppIntegration request) {
    impl.update(request);
  }

  public PublishedAppIntegrationService impl() {
    return impl;
  }
}
