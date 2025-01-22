// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
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
  public void setStatus(Map<String, String> request) {
    String path = "/api/2.0/workspace-conf";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, SetStatusResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
