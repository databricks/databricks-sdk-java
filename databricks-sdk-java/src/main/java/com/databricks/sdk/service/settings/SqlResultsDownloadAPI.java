// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether users within the workspace are allowed to download results from the SQL Editor
 * and AI/BI Dashboards UIs. By default, this setting is enabled (set to `true`)
 */
@Generated
public class SqlResultsDownloadAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SqlResultsDownloadAPI.class);

  private final SqlResultsDownloadService impl;

  /** Regular-use constructor */
  public SqlResultsDownloadAPI(ApiClient apiClient) {
    impl = new SqlResultsDownloadImpl(apiClient);
  }

  /** Constructor for mocks */
  public SqlResultsDownloadAPI(SqlResultsDownloadService mock) {
    impl = mock;
  }

  /** Reverts the SQL Results Download setting to its default value. */
  public DeleteSqlResultsDownloadResponse delete(DeleteSqlResultsDownloadRequest request) {
    return impl.delete(request);
  }

  /** Gets the SQL Results Download setting. */
  public SqlResultsDownload get(GetSqlResultsDownloadRequest request) {
    return impl.get(request);
  }

  /** Updates the SQL Results Download setting. */
  public SqlResultsDownload update(UpdateSqlResultsDownloadRequest request) {
    return impl.update(request);
  }

  public SqlResultsDownloadService impl() {
    return impl;
  }
}
