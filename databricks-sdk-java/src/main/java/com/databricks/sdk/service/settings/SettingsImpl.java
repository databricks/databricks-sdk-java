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
  public DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(
      DeleteDefaultWorkspaceNamespaceRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, null, DeleteDefaultWorkspaceNamespaceResponse.class, headers);
  }

  @Override
  public DefaultNamespaceSetting readDefaultWorkspaceNamespace(
      ReadDefaultWorkspaceNamespaceRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, DefaultNamespaceSetting.class, headers);
  }

  @Override
  public DefaultNamespaceSetting updateDefaultWorkspaceNamespace(
      UpdateDefaultWorkspaceNamespaceRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, DefaultNamespaceSetting.class, headers);
  }
}
