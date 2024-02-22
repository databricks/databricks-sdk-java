// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of RestrictWorkspaceAdmins */
@Generated
class RestrictWorkspaceAdminsImpl implements RestrictWorkspaceAdminsService {
  private final ApiClient apiClient;

  public RestrictWorkspaceAdminsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteRestrictWorkspaceAdminsSettingResponse deleteRestrictWorkspaceAdminsSetting(
      DeleteRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(
        path, request, DeleteRestrictWorkspaceAdminsSettingResponse.class, headers);
  }

  @Override
  public RestrictWorkspaceAdminsSetting getRestrictWorkspaceAdminsSetting(
      GetRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, RestrictWorkspaceAdminsSetting.class, headers);
  }

  @Override
  public RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      UpdateRestrictWorkspaceAdminsSettingRequest request) {
    String path = "/api/2.0/settings/types/restrict_workspace_admins/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, RestrictWorkspaceAdminsSetting.class, headers);
  }
}
