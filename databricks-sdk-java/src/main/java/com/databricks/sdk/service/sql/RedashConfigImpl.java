// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of RedashConfig */
@Generated
class RedashConfigImpl implements RedashConfigService {
  private final ApiClient apiClient;

  public RedashConfigImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ClientConfig getConfig() {
    String path = "/api/2.0/redash-v2/config";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ClientConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
