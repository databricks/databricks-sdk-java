// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to view all the available published OAuth applications in
 * Databricks. Administrators can add the published OAuth applications to their account through the
 * OAuth Published App Integration APIs.
 */
@Generated
public class OAuthPublishedAppsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(OAuthPublishedAppsAPI.class);

  private final OAuthPublishedAppsService impl;

  /** Regular-use constructor */
  public OAuthPublishedAppsAPI(ApiClient apiClient) {
    impl = new OAuthPublishedAppsImpl(apiClient);
  }

  /** Constructor for mocks */
  public OAuthPublishedAppsAPI(OAuthPublishedAppsService mock) {
    impl = mock;
  }

  /**
   * Get all the published OAuth apps.
   *
   * <p>Get all the available published OAuth apps in Databricks.
   */
  public Iterable<PublishedAppOutput> list(ListOAuthPublishedAppsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        GetPublishedAppsOutput::getApps,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public OAuthPublishedAppsService impl() {
    return impl;
  }
}
