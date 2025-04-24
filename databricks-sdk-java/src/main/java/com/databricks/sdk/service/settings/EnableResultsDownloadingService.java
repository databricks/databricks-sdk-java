// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether users can download notebook results. By default, this setting is enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EnableResultsDownloadingService {
  /**
   * Get the Enable Results Downloading setting.
   *
   * <p>Gets the Enable Results Downloading setting.
   */
  EnableResultsDownloading getEnableResultsDownloading();

  /**
   * Update the Enable Results Downloading setting.
   *
   * <p>Updates the Enable Results Downloading setting. The model follows eventual consistency,
   * which means the get after the update operation might receive stale values for some time.
   */
  EnableResultsDownloading patchEnableResultsDownloading(
      UpdateEnableResultsDownloadingRequest updateEnableResultsDownloadingRequest);
}
