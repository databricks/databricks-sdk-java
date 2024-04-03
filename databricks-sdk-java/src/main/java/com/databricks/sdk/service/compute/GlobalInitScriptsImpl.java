// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of GlobalInitScripts */
@Generated
class GlobalInitScriptsImpl implements GlobalInitScriptsService {
  private final ApiClient apiClient;

  public GlobalInitScriptsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateResponse create(GlobalInitScriptCreateRequest request) {
    String path = "/api/2.0/global-init-scripts";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateResponse.class, headers);
  }

  @Override
  public void delete(DeleteGlobalInitScriptRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public GlobalInitScriptDetailsWithContent get(GetGlobalInitScriptRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GlobalInitScriptDetailsWithContent.class, headers);
  }

  @Override
  public ListGlobalInitScriptsResponse list() {
    String path = "/api/2.0/global-init-scripts";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListGlobalInitScriptsResponse.class, headers);
  }

  @Override
  public void update(GlobalInitScriptUpdateRequest request) {
    String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, UpdateResponse.class, headers);
  }
}
