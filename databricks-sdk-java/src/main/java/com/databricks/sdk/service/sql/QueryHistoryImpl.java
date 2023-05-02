// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

/** Package-local implementation of QueryHistory */
@Generated
class QueryHistoryImpl implements QueryHistoryService {
  private final ApiClient apiClient;

  public QueryHistoryImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListQueriesResponse list(ListQueryHistoryRequest request) {
    String path = "/api/2.0/sql/history/queries";
    return apiClient.GET(path, request, ListQueriesResponse.class);
  }
}
