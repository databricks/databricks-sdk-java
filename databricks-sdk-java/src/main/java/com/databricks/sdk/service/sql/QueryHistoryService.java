// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * A service responsible for storing and retrieving the list of queries run against SQL endpoints
 * and serverless compute.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueryHistoryService {
  /**
   * List Queries.
   *
   * <p>List the history of queries through SQL warehouses, and serverless compute.
   *
   * <p>You can filter by user ID, warehouse ID, status, and time range. Most recently started
   * queries are returned first (up to max_results in request). The pagination token returned in
   * response can be used to list subsequent query statuses.
   */
  ListQueriesResponse list(ListQueryHistoryRequest listQueryHistoryRequest);
}
