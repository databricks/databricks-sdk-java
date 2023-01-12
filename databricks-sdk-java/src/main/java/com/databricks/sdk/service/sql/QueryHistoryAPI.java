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
 * Access the history of queries through SQL warehouses.
 */
@Generated("databricks-sdk-generator")
public class QueryHistoryAPI implements QueryHistoryService {
    private final ApiClient apiClient;

    public QueryHistoryAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * List Queries.
     * 
     * List the history of queries through SQL warehouses.
     * 
     * You can filter by user ID, warehouse ID, status, and time range.
     */
    @Override
    public ListQueriesResponse list(ListQueryHistoryRequest request) {
        String path = "/api/2.0/sql/history/queries";
        return apiClient.GET(path, request, ListQueriesResponse.class);
    }
    
}