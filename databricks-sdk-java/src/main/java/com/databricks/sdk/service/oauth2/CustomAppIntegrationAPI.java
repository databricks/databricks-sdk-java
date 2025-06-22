// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage custom OAuth app integrations, which is required for
 * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 */
@Generated
public class CustomAppIntegrationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CustomAppIntegrationAPI.class);

  private final CustomAppIntegrationService impl;

  /** Regular-use constructor */
  public CustomAppIntegrationAPI(ApiClient apiClient) {
    impl = new CustomAppIntegrationImpl(apiClient);
  }

  /** Constructor for mocks */
  public CustomAppIntegrationAPI(CustomAppIntegrationService mock) {
    impl = mock;
  }

  /**
   * Create Custom OAuth App Integration.
   *
   * <p>You can retrieve the custom OAuth app integration via :method:CustomAppIntegration/get.
   */
  public CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration request) {
    return impl.create(request);
  }

  public void delete(String integrationId) {
    delete(new DeleteCustomAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Delete an existing Custom OAuth App Integration. You can retrieve the custom OAuth app
   * integration via :method:CustomAppIntegration/get.
   */
  public void delete(DeleteCustomAppIntegrationRequest request) {
    impl.delete(request);
  }

  public GetCustomAppIntegrationOutput get(String integrationId) {
    return get(new GetCustomAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /** Gets the Custom OAuth App Integration for the given integration id. */
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    return impl.get(request);
  }

  /** Get the list of custom OAuth app integrations for the specified Databricks account */
  public Iterable<GetCustomAppIntegrationOutput> list(ListCustomAppIntegrationsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        GetCustomAppIntegrationsOutput::getApps,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void update(String integrationId) {
    update(new UpdateCustomAppIntegration().setIntegrationId(integrationId));
  }

  /**
   * Updates an existing custom OAuth App Integration. You can retrieve the custom OAuth app
   * integration via :method:CustomAppIntegration/get.
   */
  public void update(UpdateCustomAppIntegration request) {
    impl.update(request);
  }

  public CustomAppIntegrationService impl() {
    return impl;
  }
}
