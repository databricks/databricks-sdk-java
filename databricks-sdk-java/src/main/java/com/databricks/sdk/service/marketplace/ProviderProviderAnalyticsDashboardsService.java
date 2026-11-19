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
   * Creates the Provider Analytics Dashboard in the caller's workspace from the latest template.
   * Fails if the dashboard already exists. Returns the Marketplace-specific `id` of the dashboard
   * record, which is distinct from the AI/BI dashboard ID.
   */
  ProviderAnalyticsDashboard create();

  /**
   * Gets the Provider Analytics Dashboard that was created for the caller's account. Returns an
   * empty response if the dashboard has not been created yet.
   */
  ListProviderAnalyticsDashboardResponse get();

  /** Gets the latest available version of the Provider Analytics Dashboard template. */
  GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion();

  /**
   * Updates the Provider Analytics Dashboard to a newer version of the template. The requested
   * version must be newer than the version that the dashboard currently uses.
   */
  UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest updateProviderAnalyticsDashboardRequest);
}
