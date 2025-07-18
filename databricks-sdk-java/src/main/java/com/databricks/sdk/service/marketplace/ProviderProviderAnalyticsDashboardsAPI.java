// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
   * Create provider analytics dashboard. Returns Marketplace specific `id`. Not to be confused with
   * the Lakeview dashboard id.
   */
  public ProviderAnalyticsDashboard create() {
    return impl.create();
  }

  /** Get provider analytics dashboard. */
  public ListProviderAnalyticsDashboardResponse get() {
    return impl.get();
  }

  /** Get latest version of provider analytics dashboard. */
  public GetLatestVersionProviderAnalyticsDashboardResponse getLatestVersion() {
    return impl.getLatestVersion();
  }

  /** Update provider analytics dashboard. */
  public UpdateProviderAnalyticsDashboardResponse update(
      UpdateProviderAnalyticsDashboardRequest request) {
    return impl.update(request);
  }

  public ProviderProviderAnalyticsDashboardsService impl() {
    return impl;
  }
}
