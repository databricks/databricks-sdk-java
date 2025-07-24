// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Controls whether users can download notebook results. By default, this setting is enabled. */
@Generated
public class EnableResultsDownloadingAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnableResultsDownloadingAPI.class);

  private final EnableResultsDownloadingService impl;

  /** Regular-use constructor */
  public EnableResultsDownloadingAPI(ApiClient apiClient) {
    impl = new EnableResultsDownloadingImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnableResultsDownloadingAPI(EnableResultsDownloadingService mock) {
    impl = mock;
  }

  /** Gets the Notebook results download setting. */
  public EnableResultsDownloading getEnableResultsDownloading() {
    return impl.getEnableResultsDownloading();
  }

  /**
   * Updates the Notebook results download setting. The model follows eventual consistency, which
   * means the get after the update operation might receive stale values for some time.
   */
  public EnableResultsDownloading patchEnableResultsDownloading(
      UpdateEnableResultsDownloadingRequest request) {
    return impl.patchEnableResultsDownloading(request);
  }

  public EnableResultsDownloadingService impl() {
    return impl;
  }
}
