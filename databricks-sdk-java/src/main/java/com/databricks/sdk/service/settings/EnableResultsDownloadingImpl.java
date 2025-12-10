// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EnableResultsDownloading */
@Generated
class EnableResultsDownloadingImpl implements EnableResultsDownloadingService {
  private final ApiClient apiClient;

  public EnableResultsDownloadingImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnableResultsDownloading getEnableResultsDownloading() {
    String path = "/api/2.0/settings/types/enable-results-downloading/names/default";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, EnableResultsDownloading.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EnableResultsDownloading patchEnableResultsDownloading(
      UpdateEnableResultsDownloadingRequest request) {
    String path = "/api/2.0/settings/types/enable-results-downloading/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EnableResultsDownloading.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
