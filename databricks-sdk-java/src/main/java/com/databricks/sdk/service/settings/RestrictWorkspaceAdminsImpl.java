// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of RestrictWorkspaceAdmins */
@Generated
class RestrictWorkspaceAdminsImpl implements RestrictWorkspaceAdminsService {
  private final ApiClient apiClient;

  public RestrictWorkspaceAdminsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteRestrictWorkspaceAdminsSettingResponse delete(
      DeleteRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteRestrictWorkspaceAdminsSettingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RestrictWorkspaceAdminsSetting get(GetRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, RestrictWorkspaceAdminsSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RestrictWorkspaceAdminsSetting update(
      UpdateRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, RestrictWorkspaceAdminsSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
