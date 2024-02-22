// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of DefaultNamespace */
@Generated
class DefaultNamespaceImpl implements DefaultNamespaceService {
  private final ApiClient apiClient;

  public DefaultNamespaceImpl(ApiClient apiClient) {
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
  public DefaultNamespaceSetting getDefaultNamespaceSetting(
      GetDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, DefaultNamespaceSetting.class, headers);
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
}
