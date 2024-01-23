// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Tables */
@Generated
class TablesImpl implements TablesService {
  private final ApiClient apiClient;

  public TablesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void delete(DeleteTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public TableExistsResponse exists(ExistsRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s/exists", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, TableExistsResponse.class, headers);
  }

  @Override
  public TableInfo get(GetTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, TableInfo.class, headers);
  }

  @Override
  public ListTablesResponse list(ListTablesRequest request) {
    String path = "/api/2.1/unity-catalog/tables";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListTablesResponse.class, headers);
  }

  @Override
  public ListTableSummariesResponse listSummaries(ListSummariesRequest request) {
    String path = "/api/2.1/unity-catalog/table-summaries";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListTableSummariesResponse.class, headers);
  }

  @Override
  public void update(UpdateTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }
}
