// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs provide specific management operations for Lakeview dashboards. Generic resource
 * management can be done with Workspace API (import, export, get-status, list, delete).
 */
@Generated
public class LakeviewAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakeviewAPI.class);

  private final LakeviewService impl;

  /** Regular-use constructor */
  public LakeviewAPI(ApiClient apiClient) {
    impl = new LakeviewImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakeviewAPI(LakeviewService mock) {
    impl = mock;
  }

  public void publish(String dashboardId) {
    publish(new PublishRequest().setDashboardId(dashboardId));
  }

  /**
   * Publish dashboard.
   *
   * <p>Publish the current draft dashboard.
   */
  public void publish(PublishRequest request) {
    impl.publish(request);
  }

  public LakeviewService impl() {
    return impl;
  }
}
