// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  /** Create a usage dashboard specified by workspaceId, accountId, and dashboard type. */
  public CreateBillingUsageDashboardResponse create(CreateBillingUsageDashboardRequest request) {
    return impl.create(request);
  }

  /** Get a usage dashboard specified by workspaceId, accountId, and dashboard type. */
  public GetBillingUsageDashboardResponse get(GetBillingUsageDashboardRequest request) {
    return impl.get(request);
  }

  public UsageDashboardsService impl() {
    return impl;
  }
}
