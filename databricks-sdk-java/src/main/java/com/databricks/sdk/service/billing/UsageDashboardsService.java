// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage usage dashboards for this account. Usage dashboards enable you to gain insights
 * into your usage with pre-built dashboards: visualize breakdowns, analyze tag attributions, and
 * identify cost drivers.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface UsageDashboardsService {
  /** Create a usage dashboard specified by workspaceId, accountId, and dashboard type. */
  CreateBillingUsageDashboardResponse create(
      CreateBillingUsageDashboardRequest createBillingUsageDashboardRequest);

  /** Get a usage dashboard specified by workspaceId, accountId, and dashboard type. */
  GetBillingUsageDashboardResponse get(
      GetBillingUsageDashboardRequest getBillingUsageDashboardRequest);
}
