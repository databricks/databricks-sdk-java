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
  public DeleteDefaultNamespaceSettingResponse delete(
      DeleteDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE", path, request, DeleteDefaultNamespaceSettingResponse.class, headers);
  }

  @Override
  public DefaultNamespaceSetting get(GetDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, DefaultNamespaceSetting.class, headers);
  }

  @Override
  public DefaultNamespaceSetting update(UpdateDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, DefaultNamespaceSetting.class, headers);
  }
}
