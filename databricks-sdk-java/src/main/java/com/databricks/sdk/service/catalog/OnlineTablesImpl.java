// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of OnlineTables */
@Generated
class OnlineTablesImpl implements OnlineTablesService {
  private final ApiClient apiClient;

  public OnlineTablesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public OnlineTable create(CreateOnlineTableRequest request) {
    String path = "/api/2.0/online-tables";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTable()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, OnlineTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteOnlineTableRequest request) {
    String path = String.format("/api/2.0/online-tables/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public OnlineTable get(GetOnlineTableRequest request) {
    String path = String.format("/api/2.0/online-tables/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, OnlineTable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
