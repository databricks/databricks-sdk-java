// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is
 * a Databricks SQL object that periodically runs a query, evaluates a condition
 * of its result, and notifies one or more users and/or alert destinations if
 * the condition was met.
 */
public class AlertsAPI implements AlertsService {
    private final ApiClient apiClient;

    public AlertsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create an alert.
     * 
     * Creates an alert. An alert is a Databricks SQL object that periodically
     * runs a query, evaluates a condition of its result, and notifies users or
     * alert destinations if the condition was met.
     */
    @Override
    public Alert create(CreateAlert request) {
        String path = "/api/2.0/preview/sql/alerts";
        return apiClient.POST(path, request, Alert.class);
    }
    
	/**
     * Delete an alert.
     * 
     * Deletes an alert. Deleted alerts are no longer accessible and cannot be
     * restored. **Note:** Unlike queries and dashboards, alerts cannot be moved
     * to the trash.
     */
    @Override
    public void delete(DeleteAlertRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get an alert.
     * 
     * Gets an alert.
     */
    @Override
    public Alert get(GetAlertRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
        return apiClient.GET(path, request, Alert.class);
    }
    
	/**
     * Get alerts.
     * 
     * Gets a list of alerts.
     */
    @Override
    public List<Alert> list() {
        String path = "/api/2.0/preview/sql/alerts";
        return apiClient.GET(path, List.class);
    }
    
	/**
     * Update an alert.
     * 
     * Updates an alert.
     */
    @Override
    public void update(EditAlert request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s", request.getAlertId());
        apiClient.PUT(path, request, Void.class);
    }
    
}