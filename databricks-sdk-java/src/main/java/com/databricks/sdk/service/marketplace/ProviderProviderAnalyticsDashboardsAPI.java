// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/** Manage templated analytics solution for providers. */
@Generated
public class ProviderProviderAnalyticsDashboardsAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(ProviderProviderAnalyticsDashboardsAPI.class);

  private final ProviderProviderAnalyticsDashboardsService impl;

  /** Regular-use constructor */
  public ProviderProviderAnalyticsDashboardsAPI(ApiClient apiClient) {
    impl = new ProviderProviderAnalyticsDashboardsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderProviderAnalyticsDashboardsAPI(ProviderProviderAnalyticsDashboardsService mock) {
    impl = mock;
  }

  /**
   * Creates the Provider Analytics Dashboard in the caller's workspace from the latest template.
   * Fails if the dashboard already exists. Returns the Marketplace-specific `id` of the dashboard
   * record, which is distinct from the AI/BI dashboard ID.
   */
  public ProviderAnalyticsDashboard create() {
    return impl.create();
  }

  /**
   * Gets the Provider Analytics Dashboard that was created for the caller's account. Returns an
   * empty response if the dashboard has not been created yet.
   */
  public ListProviderAnalyticsDashboardResponse get() {
    return impl.get();
  }

  /** Gets the latest available version of the Provider Analytics Dashboard template. */
  public GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion() {
    return impl.getLatestVersion();
  }

  /**
   * Updates the Provider Analytics Dashboard to a newer version of the template. The requested
   * version must be newer than the version that the dashboard currently uses.
   */
  public UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest request) {
    return impl.update(request);
  }

  public ProviderProviderAnalyticsDashboardsService impl() {
    return impl;
  }
}
