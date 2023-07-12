// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



/**
 * Access the history of queries through SQL warehouses.
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
   * List Queries.
   * 
   * List the history of queries through SQL warehouses.
   * 
   * You can filter by user ID, warehouse ID, status, and time range.
   */
  public Iterable<QueryInfo> list(ListQueryHistoryRequest request) {
    return new Paginator<>(request, impl::list, ListQueriesResponse::getRes, response -> {
      String token = response.getNextPageToken();
      if (token == null) {
        return null;
      }
      return request.setPageToken(token);
    });
  }
  
  public QueryHistoryService impl() {
    return impl;
  }
}












