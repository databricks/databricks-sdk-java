// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of BillableUsage */
@Generated
class BillableUsageImpl implements BillableUsageService {
  private final ApiClient apiClient;

  public BillableUsageImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DownloadResponse download(DownloadRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/usage/download", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "text/plain");
      return apiClient.execute(req, DownloadResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
