// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * Access the history of queries through SQL warehouses.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueryHistoryService {
	/**
   * List Queries.
   * 
   * List the history of queries through SQL warehouses.
   * 
   * You can filter by user ID, warehouse ID, status, and time range.
   */
  ListQueriesResponse list(ListQueryHistoryRequest listQueryHistoryRequest);
  
}