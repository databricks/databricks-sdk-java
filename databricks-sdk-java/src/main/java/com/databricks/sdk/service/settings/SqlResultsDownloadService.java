// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether users within the workspace are allowed to download results from the SQL Editor
 * and AI/BI Dashboards UIs. By default, this setting is enabled (set to `true`)
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SqlResultsDownloadService {
  /**
   * Delete the SQL Results Download setting.
   *
   * <p>Reverts the SQL Results Download setting to its default value.
   */
  DeleteSqlResultsDownloadResponse delete(
      DeleteSqlResultsDownloadRequest deleteSqlResultsDownloadRequest);

  /**
   * Get the SQL Results Download setting.
   *
   * <p>Gets the SQL Results Download setting.
   */
  SqlResultsDownload get(GetSqlResultsDownloadRequest getSqlResultsDownloadRequest);

  /**
   * Update the SQL Results Download setting.
   *
   * <p>Updates the SQL Results Download setting.
   */
  SqlResultsDownload update(UpdateSqlResultsDownloadRequest updateSqlResultsDownloadRequest);
}
