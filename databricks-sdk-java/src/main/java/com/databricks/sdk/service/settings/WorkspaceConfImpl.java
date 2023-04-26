// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import java.util.Map;
import org.apache.http.client.methods.*;

/** Package-local implementation of WorkspaceConf */
class WorkspaceConfImpl implements WorkspaceConfService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for WorkspaceConfImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WorkspaceConfImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Map<String, String> getStatus(GetStatusRequest request) {
    String path = "/api/2.0/workspace-conf";
    return apiClient.GET(path, request, Map.class);
  }

  /** {@inheritDoc} */
  @Override
  public void setStatus(Map<String, String> request) {
    String path = "/api/2.0/workspace-conf";
    apiClient.PATCH(path, request, Void.class);
  }
}
