// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * These endpoints are used for CRUD operations on query definitions. Query
 * definitions include the target SQL warehouse, query text, name, description,
 * tags, execution schedule, parameters, and visualizations.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface QueriesService {
	/**
     * Create a new query definition.
     * 
     * Creates a new query definition. Queries created with this endpoint belong
     * to the authenticated user making the request.
     * 
     * The `data_source_id` field specifies the ID of the SQL warehouse to run
     * this query against. You can use the Data Sources API to see a complete
     * list of available SQL warehouses. Or you can copy the `data_source_id`
     * from an existing query.
     * 
     * **Note**: You cannot add a visualization until you create the query.
     */
    Query create(QueryPostContent queryPostContent);
    
	/**
     * Delete a query.
     * 
     * Moves a query to the trash. Trashed queries immediately disappear from
     * searches and list views, and they cannot be used for alerts. The trash is
     * deleted after 30 days.
     */
    void delete(DeleteQueryRequest deleteQueryRequest);
    
	/**
     * Get a query definition.
     * 
     * Retrieve a query object definition along with contextual permissions
     * information about the currently authenticated user.
     */
    Query get(GetQueryRequest getQueryRequest);
    
	/**
     * Get a list of queries.
     * 
     * Gets a list of queries. Optionally, this list can be filtered by a search
     * term.
     */
    QueryList list(ListQueriesRequest listQueriesRequest);
    
	/**
     * Restore a query.
     * 
     * Restore a query that has been moved to the trash. A restored query
     * appears in list views and searches. You can use restored queries for
     * alerts.
     */
    void restore(RestoreQueryRequest restoreQueryRequest);
    
	/**
     * Change a query definition.
     * 
     * Modify this query definition.
     * 
     * **Note**: You cannot undo this operation.
     */
    Query update(QueryPostContent queryPostContent);
    
}