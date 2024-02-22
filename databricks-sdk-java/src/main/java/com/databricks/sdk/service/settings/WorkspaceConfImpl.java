// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of WorkspaceConf */
@Generated
class WorkspaceConfImpl implements WorkspaceConfService {
  private final ApiClient apiClient;

  public WorkspaceConfImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Map<String, String> getStatus(GetStatusRequest request) {
    String path = "/api/2.0/workspace-conf";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getStringMap(path, request, headers);
  }

  @Override
  public SetStatusResponse setStatus(Map<String, String> request) {
    String path = "/api/2.0/workspace-conf";
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, SetStatusResponse.class, headers);
  }
}
