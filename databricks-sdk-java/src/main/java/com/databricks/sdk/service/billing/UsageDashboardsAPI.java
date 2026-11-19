// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * These APIs manage usage dashboards for this account. Usage dashboards enable you to gain insights
 * into your usage with pre-built dashboards: visualize breakdowns, analyze tag attributions, and
 * identify cost drivers.
 */
@Generated
public class UsageDashboardsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(UsageDashboardsAPI.class);

  private final UsageDashboardsService impl;

  /** Regular-use constructor */
  public UsageDashboardsAPI(ApiClient apiClient) {
    impl = new UsageDashboardsImpl(apiClient);
  }

  /** Constructor for mocks */
  public UsageDashboardsAPI(UsageDashboardsService mock) {
    impl = mock;
  }

  /**
   * Imports a pre-built usage dashboard of the given type into a workspace. Each call imports a new
   * dashboard, even if the caller already created one of the same type in that workspace. The
   * caller must be an account admin and a user of the target workspace. See
   * https://docs.databricks.com/admin/account-settings/usage.html.
   */
  public CreateBillingUsageDashboardResponse create(CreateBillingUsageDashboardRequest request) {
    return impl.create(request);
  }

  /**
   * Gets the most recent usage dashboard of the given type that the caller created. The response is
   * empty if no such dashboard exists, if it has been deleted, or if the caller can no longer
   * access its workspace.
   */
  public GetBillingUsageDashboardResponse get(GetBillingUsageDashboardRequest request) {
    return impl.get(request);
  }

  public UsageDashboardsService impl() {
    return impl;
  }
}
