// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Map;
import org.apache.http.client.methods.*;

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
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructMapType(Map.class, Object.class, Object.class);
    try {
      return apiClient.getObjectMapper().readValue(apiClient.GET(path, request, Map.class), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void setStatus(Map<String, String> request) {
    String path = "/api/2.0/workspace-conf";
    apiClient.PATCH(path, request, Void.class);
  }
}
