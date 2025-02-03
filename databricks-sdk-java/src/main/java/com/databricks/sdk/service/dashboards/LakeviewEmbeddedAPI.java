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

  public void getPublishedDashboardEmbedded(String dashboardId) {
    getPublishedDashboardEmbedded(
        new GetPublishedDashboardEmbeddedRequest().setDashboardId(dashboardId));
  }

  /**
   * Read a published dashboard in an embedded ui.
   *
   * <p>Get the current published dashboard within an embedded context.
   */
  public void getPublishedDashboardEmbedded(GetPublishedDashboardEmbeddedRequest request) {
    impl.getPublishedDashboardEmbedded(request);
  }

  public LakeviewEmbeddedService impl() {
    return impl;
  }
}
