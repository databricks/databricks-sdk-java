// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of LakeviewEmbedded */
@Generated
class LakeviewEmbeddedImpl implements LakeviewEmbeddedService {
  private final ApiClient apiClient;

  public LakeviewEmbeddedImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void getPublishedDashboardEmbedded(GetPublishedDashboardEmbeddedRequest request) {
    String path =
        String.format(
            "/api/2.0/lakeview/dashboards/%s/published/embedded", request.getDashboardId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, GetPublishedDashboardEmbeddedResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
