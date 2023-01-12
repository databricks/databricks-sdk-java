// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These endpoints are used for CRUD operations on query definitions. Query
 * definitions include the target SQL warehouse, query text, name, description,
 * tags, execution schedule, parameters, and visualizations.
 */
@Generated("databricks-sdk-generator")
public class QueriesAPI implements QueriesService {
    private final ApiClient apiClient;

    public QueriesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    @Override
    public Query create(QueryPostContent request) {
        String path = "/api/2.0/preview/sql/queries";
        return apiClient.POST(path, request, Query.class);
    }
    
	/**
     * Delete a query.
     * 
     * Moves a query to the trash. Trashed queries immediately disappear from
     * searches and list views, and they cannot be used for alerts. The trash is
     * deleted after 30 days.
     */
    @Override
    public void delete(DeleteQueryRequest request) {
        String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a query definition.
     * 
     * Retrieve a query object definition along with contextual permissions
     * information about the currently authenticated user.
     */
    @Override
    public Query get(GetQueryRequest request) {
        String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
        return apiClient.GET(path, request, Query.class);
    }
    
	/**
     * Get a list of queries.
     * 
     * Gets a list of queries. Optionally, this list can be filtered by a search
     * term.
     */
    @Override
    public QueryList list(ListQueriesRequest request) {
        String path = "/api/2.0/preview/sql/queries";
        return apiClient.GET(path, request, QueryList.class);
    }
    
	/**
     * Restore a query.
     * 
     * Restore a query that has been moved to the trash. A restored query
     * appears in list views and searches. You can use restored queries for
     * alerts.
     */
    @Override
    public void restore(RestoreQueryRequest request) {
        String path = String.format("/api/2.0/preview/sql/queries/trash/%s", request.getQueryId());
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Change a query definition.
     * 
     * Modify this query definition.
     * 
     * **Note**: You cannot undo this operation.
     */
    @Override
    public Query update(QueryPostContent request) {
        String path = String.format("/api/2.0/preview/sql/queries/%s", request.getQueryId());
        return apiClient.POST(path, request, Query.class);
    }
    
}