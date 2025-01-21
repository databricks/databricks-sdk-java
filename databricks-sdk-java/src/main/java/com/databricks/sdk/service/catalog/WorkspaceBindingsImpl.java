// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of WorkspaceBindings */
@Generated
class WorkspaceBindingsImpl implements WorkspaceBindingsService {
  private final ApiClient apiClient;

  public WorkspaceBindingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CurrentWorkspaceBindings get(GetWorkspaceBindingRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, CurrentWorkspaceBindings.class, headers);
  }

  @Override
  public WorkspaceBindingsResponse getBindings(GetBindingsRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/bindings/%s/%s",
            request.getSecurableType(), request.getSecurableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, WorkspaceBindingsResponse.class, headers);
  }

  @Override
  public CurrentWorkspaceBindings update(UpdateWorkspaceBindings request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, CurrentWorkspaceBindings.class, headers);
  }

  @Override
  public WorkspaceBindingsResponse updateBindings(UpdateWorkspaceBindingsParameters request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/bindings/%s/%s",
            request.getSecurableType(), request.getSecurableName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, WorkspaceBindingsResponse.class, headers);
  }
}
