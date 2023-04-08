// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Access the history of queries through SQL warehouses. */
public class QueryHistoryAPI {
  private final QueryHistoryService impl;

  /** Regular-use constructor */
  public QueryHistoryAPI(ApiClient apiClient) {
    impl = new QueryHistoryImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueryHistoryAPI(QueryHistoryService mock) {
    impl = mock;
  }

  /**
   * List Queries.
   *
   * <p>List the history of queries through SQL warehouses.
   *
   * <p>You can filter by user ID, warehouse ID, status, and time range.
   */
  public ListQueriesResponse list(ListQueryHistoryRequest request) {
    return impl.list(request);
  }

  public QueryHistoryService impl() {
    return impl;
  }
}
