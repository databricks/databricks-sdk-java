// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AutomaticClusterUpdate */
@Generated
class AutomaticClusterUpdateImpl implements AutomaticClusterUpdateService {
  private final ApiClient apiClient;

  public AutomaticClusterUpdateImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AutomaticClusterUpdateSetting get(GetAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, AutomaticClusterUpdateSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AutomaticClusterUpdateSetting update(UpdateAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, AutomaticClusterUpdateSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
