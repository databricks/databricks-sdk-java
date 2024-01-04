// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Lakeview */
@Generated
class LakeviewImpl implements LakeviewService {
  private final ApiClient apiClient;

  public LakeviewImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void publish(PublishRequest request) {
    String path =
        String.format("/api/2.0/lakeview/dashboards/%s/published", request.getDashboardId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }
}
