// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Token-based Lakeview APIs for embedding dashboards in external applications. */
@Generated
public class LakeviewEmbeddedAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakeviewEmbeddedAPI.class);

  private final LakeviewEmbeddedService impl;

  /** Regular-use constructor */
  public LakeviewEmbeddedAPI(ApiClient apiClient) {
    impl = new LakeviewEmbeddedImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakeviewEmbeddedAPI(LakeviewEmbeddedService mock) {
    impl = mock;
  }

  public GetPublishedDashboardTokenInfoResponse getPublishedDashboardTokenInfo(String dashboardId) {
    return getPublishedDashboardTokenInfo(
        new GetPublishedDashboardTokenInfoRequest().setDashboardId(dashboardId));
  }

  /**
   * Get a required authorization details and scopes of a published dashboard to mint an OAuth
   * token.
   */
  public GetPublishedDashboardTokenInfoResponse getPublishedDashboardTokenInfo(
      GetPublishedDashboardTokenInfoRequest request) {
    return impl.getPublishedDashboardTokenInfo(request);
  }

  public LakeviewEmbeddedService impl() {
    return impl;
  }
}
