// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of WorkspaceSettingsV2 */
@Generated
class WorkspaceSettingsV2Impl implements WorkspaceSettingsV2Service {
  private final ApiClient apiClient;

  public WorkspaceSettingsV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Setting getPublicWorkspaceSetting(GetPublicWorkspaceSettingRequest request) {
    String path = String.format("/api/2.1/settings/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Setting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceSettingsMetadataResponse listWorkspaceSettingsMetadata(
      ListWorkspaceSettingsMetadataRequest request) {
    String path = "/api/2.1/settings-metadata";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListWorkspaceSettingsMetadataResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Setting patchPublicWorkspaceSetting(PatchPublicWorkspaceSettingRequest request) {
    String path = String.format("/api/2.1/settings/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getSetting()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Setting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
