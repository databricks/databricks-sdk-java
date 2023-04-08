// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Access the history of queries through SQL warehouses.
 */
public class QueryHistoryAPI {
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
    public ListQueriesResponse list(ListQueryHistoryRequest request) {
        return impl.list(request);
    }
    
    public QueryHistoryService impl() {
        return impl;
    }
}