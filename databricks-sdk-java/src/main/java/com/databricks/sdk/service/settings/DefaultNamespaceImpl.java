// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteDefaultNamespaceSettingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultNamespaceSetting get(GetDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DefaultNamespaceSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultNamespaceSetting update(UpdateDefaultNamespaceSettingRequest request) {
    String path = "/api/2.0/settings/types/default_namespace_ws/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DefaultNamespaceSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
