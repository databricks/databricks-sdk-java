// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of SqlResultsDownload */
@Generated
class SqlResultsDownloadImpl implements SqlResultsDownloadService {
  private final ApiClient apiClient;

  public SqlResultsDownloadImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteSqlResultsDownloadResponse delete(DeleteSqlResultsDownloadRequest request) {
    String path = "/api/2.0/settings/types/sql_results_download/names/default";
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DeleteSqlResultsDownloadResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SqlResultsDownload get(GetSqlResultsDownloadRequest request) {
    String path = "/api/2.0/settings/types/sql_results_download/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, SqlResultsDownload.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SqlResultsDownload update(UpdateSqlResultsDownloadRequest request) {
    String path = "/api/2.0/settings/types/sql_results_download/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, SqlResultsDownload.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
