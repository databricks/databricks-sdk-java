// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A service responsible for storing and retrieving the list of queries run against SQL endpoints
 * and serverless compute.
 */
@Generated
public class QueryHistoryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueryHistoryAPI.class);

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
   * List the history of queries through SQL warehouses, and serverless compute.
   *
   * <p>You can filter by user ID, warehouse ID, status, and time range. Most recently started
   * queries are returned first (up to max_results in request). The pagination token returned in
   * response can be used to list subsequent query statuses.
   */
  public ListQueriesResponse list(ListQueryHistoryRequest request) {
    return impl.list(request);
  }

  public QueryHistoryService impl() {
    return impl;
  }
}
