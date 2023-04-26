// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Access the history of queries through SQL warehouses.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryHistoryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueryHistoryAPI.class);

  private final QueryHistoryService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public QueryHistoryAPI(ApiClient apiClient) {
    impl = new QueryHistoryImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sql.QueryHistoryService} object
   */
  public QueryHistoryAPI(QueryHistoryService mock) {
    impl = mock;
  }

  /**
   * List Queries.
   *
   * <p>List the history of queries through SQL warehouses.
   *
   * <p>You can filter by user ID, warehouse ID, status, and time range.
   *
   * @param request a {@link com.databricks.sdk.service.sql.ListQueryHistoryRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<QueryInfo> list(ListQueryHistoryRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListQueriesResponse::getRes,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryHistoryService} object
   */
  public QueryHistoryService impl() {
    return impl;
  }
}
