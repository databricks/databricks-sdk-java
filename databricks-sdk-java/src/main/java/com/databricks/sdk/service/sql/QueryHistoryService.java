// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Access the history of queries through SQL warehouses.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
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