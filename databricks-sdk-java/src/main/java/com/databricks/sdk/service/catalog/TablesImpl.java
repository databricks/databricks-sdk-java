// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Tables */
class TablesImpl implements TablesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for TablesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public TablesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public TableInfo get(GetTableRequest request) {
    String path = String.format("/api/2.1/unity-catalog/tables/%s", request.getFullName());
    return apiClient.GET(path, request, TableInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListTablesResponse list(ListTablesRequest request) {
    String path = "/api/2.1/unity-catalog/tables";
    return apiClient.GET(path, request, ListTablesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListTableSummariesResponse listSummaries(ListSummariesRequest request) {
    String path = "/api/2.1/unity-catalog/table-summaries";
    return apiClient.GET(path, request, ListTableSummariesResponse.class);
  }
}
