// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Manage templated analytics solution for providers.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderProviderAnalyticsDashboardsService {
  /**
   * Create provider analytics dashboard. Returns Marketplace specific `id`. Not to be confused with
   * the Lakeview dashboard id.
   */
  ProviderAnalyticsDashboard create();

  /** Get provider analytics dashboard. */
  ListProviderAnalyticsDashboardResponse get();

  /** Get latest version of provider analytics dashboard. */
  GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion();

  /** Update provider analytics dashboard. */
  UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest updateProviderAnalyticsDashboardRequest);
}
