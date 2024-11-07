// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getTable(), OnlineTable.class, headers);
  }

  @Override
  public void delete(DeleteOnlineTableRequest request) {
    String path = String.format("/api/2.0/online-tables/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public OnlineTable get(GetOnlineTableRequest request) {
    String path = String.format("/api/2.0/online-tables/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, OnlineTable.class, headers);
  }
}
