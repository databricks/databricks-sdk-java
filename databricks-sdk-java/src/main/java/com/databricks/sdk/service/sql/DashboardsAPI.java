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
 * In general, there is little need to modify dashboards using the API. However,
 * it can be useful to use dashboard objects to look-up a collection of related
 * query IDs. The API can also be used to duplicate multiple dashboards at once
 * since you can get a dashboard definition with a GET request and then POST it
 * to create a new one.
 */
@Generated("databricks-sdk-generator")
public class DashboardsAPI implements DashboardsService {
    private final ApiClient apiClient;

    public DashboardsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a dashboard object.
     */
    @Override
    public Dashboard create(CreateDashboardRequest request) {
        String path = "/api/2.0/preview/sql/dashboards";
        return apiClient.POST(path, request, Dashboard.class);
    }
    
	/**
     * Remove a dashboard.
     * 
     * Moves a dashboard to the trash. Trashed dashboards do not appear in list
     * views or searches, and cannot be shared.
     */
    @Override
    public void delete(DeleteDashboardRequest request) {
        String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Retrieve a definition.
     * 
     * Returns a JSON representation of a dashboard object, including its
     * visualization and query objects.
     */
    @Override
    public Dashboard get(GetDashboardRequest request) {
        String path = String.format("/api/2.0/preview/sql/dashboards/%s", request.getDashboardId());
        return apiClient.GET(path, request, Dashboard.class);
    }
    
	/**
     * Get dashboard objects.
     * 
     * Fetch a paginated list of dashboard objects.
     */
    @Override
    public ListResponse list(ListDashboardsRequest request) {
        String path = "/api/2.0/preview/sql/dashboards";
        return apiClient.GET(path, request, ListResponse.class);
    }
    
	/**
     * Restore a dashboard.
     * 
     * A restored dashboard appears in list views and searches and can be
     * shared.
     */
    @Override
    public void restore(RestoreDashboardRequest request) {
        String path = String.format("/api/2.0/preview/sql/dashboards/trash/%s", request.getDashboardId());
        apiClient.POST(path, request, Void.class);
    }
    
}