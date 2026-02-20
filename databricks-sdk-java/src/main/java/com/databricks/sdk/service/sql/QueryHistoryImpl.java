// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListQueriesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
