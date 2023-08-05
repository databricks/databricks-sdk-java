// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public TableInfo get(GetTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    return apiClient.GET(path, request, TableInfo.class, "application/json");
  }

  @Override
  public ListTablesResponse list(ListTablesRequest request) {
    String path = "/api/2.1/unity-catalog/tables";
    return apiClient.GET(path, request, ListTablesResponse.class, "application/json");
  }

  @Override
  public ListTableSummariesResponse listSummaries(ListSummariesRequest request) {
    String path = "/api/2.1/unity-catalog/table-summaries";
    return apiClient.GET(path, request, ListTableSummariesResponse.class, "application/json");
  }

  @Override
  public void update(UpdateTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    apiClient.PATCH(path, request, Void.class);
  }
}
