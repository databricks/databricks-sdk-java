// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These endpoints are used for CRUD operations on query definitions. Query
 * definitions include the target SQL warehouse, query text, name, description,
 * tags, parameters, and visualizations.
 */
public class QueriesAPI {
    private final QueriesService impl;

    /** Regular-use constructor */
    public QueriesAPI(ApiClient apiClient) {
        impl = new QueriesImpl(apiClient);
    }

    /** Constructor for mocks */
    public QueriesAPI(QueriesService mock) {
        impl = mock;
    }
	
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
    public Query create(QueryPostContent request) {
        return impl.create(request);
    }
    
	/**
     * Delete a query.
     * 
     * Moves a query to the trash. Trashed queries immediately disappear from
     * searches and list views, and they cannot be used for alerts. The trash is
     * deleted after 30 days.
     */
    public void delete(DeleteQueryRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get a query definition.
     * 
     * Retrieve a query object definition along with contextual permissions
     * information about the currently authenticated user.
     */
    public Query get(GetQueryRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get a list of queries.
     * 
     * Gets a list of queries. Optionally, this list can be filtered by a search
     * term.
     */
    public QueryList list(ListQueriesRequest request) {
        return impl.list(request);
    }
    
	/**
     * Restore a query.
     * 
     * Restore a query that has been moved to the trash. A restored query
     * appears in list views and searches. You can use restored queries for
     * alerts.
     */
    public void restore(RestoreQueryRequest request) {
        impl.restore(request);
    }
    
	/**
     * Change a query definition.
     * 
     * Modify this query definition.
     * 
     * **Note**: You cannot undo this operation.
     */
    public Query update(QueryEditContent request) {
        return impl.update(request);
    }
    
    public QueriesService impl() {
        return impl;
    }
}