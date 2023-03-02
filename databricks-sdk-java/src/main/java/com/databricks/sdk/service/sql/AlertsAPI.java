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
 * The alerts API can be used to perform CRUD operations on alerts. An alert is
 * a Databricks SQL object that periodically runs a query, evaluates a condition
 * of its result, and notifies one or more users and/or alert destinations if
 * the condition was met.
 * 
 * **Note**: Programmatic operations on refresh schedules via the Databricks SQL
 * API are deprecated. Alert refresh schedules can be created, updated, fetched
 * and deleted using Jobs API, e.g. :method:jobs/create.
 */
@Generated("databricks-sdk-generator")
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
     * [DEPRECATED] Create a refresh schedule.
     * 
     * Creates a new refresh schedule for an alert.
     * 
     * **Note:** The structure of refresh schedules is subject to change.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/create to create a job
     * with the alert.
     */
    @Override
    public RefreshSchedule createSchedule(CreateRefreshSchedule request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/refresh-schedules", request.getAlertId());
        return apiClient.POST(path, request, RefreshSchedule.class);
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
     * [DEPRECATED] Delete a refresh schedule.
     * 
     * Deletes an alert's refresh schedule. The refresh schedule specifies when
     * to refresh and evaluate the associated query result.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/delete to delete a job
     * for the alert.
     */
    @Override
    public void deleteSchedule(DeleteScheduleRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/refresh-schedules/%s", request.getAlertId(), request.getScheduleId());
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
     * [DEPRECATED] Get an alert's subscriptions.
     * 
     * Get the subscriptions for an alert. An alert subscription represents
     * exactly one recipient being notified whenever the alert is triggered. The
     * alert recipient is specified by either the `user` field or the
     * `destination` field. The `user` field is ignored if `destination` is
     * non-`null`.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/get to get the
     * subscriptions associated with a job for an alert.
     */
    @Override
    public List<Subscription> getSubscriptions(GetSubscriptionsRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/subscriptions", request.getAlertId());
        return apiClient.GET(path, request, List.class);
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
     * [DEPRECATED] Get refresh schedules.
     * 
     * Gets the refresh schedules for the specified alert. Alerts can have
     * refresh schedules that specify when to refresh and evaluate the
     * associated query result.
     * 
     * **Note:** Although refresh schedules are returned in a list, only one
     * refresh schedule per alert is currently supported. The structure of
     * refresh schedules is subject to change.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/list to list jobs and
     * filter by the alert.
     */
    @Override
    public List<RefreshSchedule> listSchedules(ListSchedulesRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/refresh-schedules", request.getAlertId());
        return apiClient.GET(path, request, List.class);
    }
    
	/**
     * [DEPRECATED] Subscribe to an alert.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/update to subscribe to
     * a job for an alert.
     */
    @Override
    public Subscription subscribe(CreateSubscription request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/subscriptions", request.getAlertId());
        return apiClient.POST(path, request, Subscription.class);
    }
    
	/**
     * [DEPRECATED] Unsubscribe to an alert.
     * 
     * Unsubscribes a user or a destination to an alert.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/update to unsubscribe
     * to a job for an alert.
     */
    @Override
    public void unsubscribe(UnsubscribeRequest request) {
        String path = String.format("/api/2.0/preview/sql/alerts/%s/subscriptions/%s", request.getAlertId(), request.getSubscriptionId());
        apiClient.DELETE(path, request, Void.class);
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