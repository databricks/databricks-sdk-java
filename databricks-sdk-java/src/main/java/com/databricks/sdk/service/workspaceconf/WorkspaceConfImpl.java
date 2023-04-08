// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspaceconf;

import com.databricks.sdk.client.ApiClient;
import java.util.Map;
import org.apache.http.client.methods.*;

/** Package-local implementation of WorkspaceConf */
class WorkspaceConfImpl implements WorkspaceConfService {
  private final ApiClient apiClient;

  public WorkspaceConfImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Map<String, String> getStatus(GetStatus request) {
    String path = "/api/2.0/workspace-conf";
    return apiClient.GET(path, request, Map.class);
  }

  @Override
  public void setStatus(Map<String, String> request) {
    String path = "/api/2.0/workspace-conf";
    apiClient.PATCH(path, request, Void.class);
  }
}
