// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EnableExportNotebook */
@Generated
class EnableExportNotebookImpl implements EnableExportNotebookService {
  private final ApiClient apiClient;

  public EnableExportNotebookImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnableExportNotebook getEnableExportNotebook() {
    String path = "/api/2.0/settings/types/enable-export-notebook/names/default";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, EnableExportNotebook.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EnableExportNotebook patchEnableExportNotebook(UpdateEnableExportNotebookRequest request) {
    String path = "/api/2.0/settings/types/enable-export-notebook/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, EnableExportNotebook.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
