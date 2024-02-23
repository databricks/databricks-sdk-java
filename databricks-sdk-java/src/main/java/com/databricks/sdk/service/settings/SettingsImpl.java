// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Settings */
@Generated
class SettingsImpl implements SettingsService {
  private final ApiClient apiClient;

  public SettingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDefaultNamespaceSettingResponse deleteDefaultNamespaceSetting(
      DeleteDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, DeleteDefaultNamespaceSettingResponse.class, headers);
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
  public AutomaticClusterUpdateSetting getAutomaticClusterUpdateSetting(
      GetAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, AutomaticClusterUpdateSetting.class, headers);
  }

  @Override
  public CspEnablementSetting getCspEnablementSetting(GetCspEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CspEnablementSetting.class, headers);
  }

  @Override
  public DefaultNamespaceSetting getDefaultNamespaceSetting(
      GetDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, DefaultNamespaceSetting.class, headers);
  }

  @Override
  public EsmEnablementSetting getEsmEnablementSetting(GetEsmEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EsmEnablementSetting.class, headers);
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
  public AutomaticClusterUpdateSetting updateAutomaticClusterUpdateSetting(
      UpdateAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, AutomaticClusterUpdateSetting.class, headers);
  }

  @Override
  public CspEnablementSetting updateCspEnablementSetting(
      UpdateCspEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CspEnablementSetting.class, headers);
  }

  @Override
  public DefaultNamespaceSetting updateDefaultNamespaceSetting(
      UpdateDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, DefaultNamespaceSetting.class, headers);
  }

  @Override
  public EsmEnablementSetting updateEsmEnablementSetting(
      UpdateEsmEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, EsmEnablementSetting.class, headers);
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
