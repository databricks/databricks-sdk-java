// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EnableNotebookTableClipboard */
@Generated
class EnableNotebookTableClipboardImpl implements EnableNotebookTableClipboardService {
  private final ApiClient apiClient;

  public EnableNotebookTableClipboardImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnableNotebookTableClipboard getEnableNotebookTableClipboard() {
    String path = "/api/2.0/settings/types/enable-notebook-table-clipboard/names/default";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, EnableNotebookTableClipboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EnableNotebookTableClipboard patchEnableNotebookTableClipboard(
      UpdateEnableNotebookTableClipboardRequest request) {
    String path = "/api/2.0/settings/types/enable-notebook-table-clipboard/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EnableNotebookTableClipboard.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
