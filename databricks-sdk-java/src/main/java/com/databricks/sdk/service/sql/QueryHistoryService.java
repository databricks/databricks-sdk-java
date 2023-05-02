// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * Access the history of queries through SQL warehouses.
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
   * <p>List the history of queries through SQL warehouses.
   *
   * <p>You can filter by user ID, warehouse ID, status, and time range.
   */
  ListQueriesResponse list(ListQueryHistoryRequest listQueryHistoryRequest);
}
