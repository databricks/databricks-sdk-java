// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is
 * a Databricks SQL object that periodically runs a query, evaluates a condition
 * of its result, and notifies one or more users and/or alert destinations if
 * the condition was met.
 * 
 * **Note**: Programmatic operations on refresh schedules via the Databricks SQL
 * API are deprecated. Alert refresh schedules can be created, updated, fetched
 * and deleted using Jobs API, e.g. :method:jobs/create.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface AlertsService {
	/**
     * Create an alert.
     * 
     * Creates an alert. An alert is a Databricks SQL object that periodically
     * runs a query, evaluates a condition of its result, and notifies users or
     * alert destinations if the condition was met.
     */
    Alert create(CreateAlert createAlert);
    
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
    RefreshSchedule createSchedule(CreateRefreshSchedule createRefreshSchedule);
    
	/**
     * Delete an alert.
     * 
     * Deletes an alert. Deleted alerts are no longer accessible and cannot be
     * restored. **Note:** Unlike queries and dashboards, alerts cannot be moved
     * to the trash.
     */
    void delete(DeleteAlertRequest deleteAlertRequest);
    
	/**
     * [DEPRECATED] Delete a refresh schedule.
     * 
     * Deletes an alert's refresh schedule. The refresh schedule specifies when
     * to refresh and evaluate the associated query result.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/delete to delete a job
     * for the alert.
     */
    void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);
    
	/**
     * Get an alert.
     * 
     * Gets an alert.
     */
    Alert get(GetAlertRequest getAlertRequest);
    
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
    List<Subscription> getSubscriptions(GetSubscriptionsRequest getSubscriptionsRequest);
    
	/**
     * Get alerts.
     * 
     * Gets a list of alerts.
     */
    List<Alert> list();
    
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
    List<RefreshSchedule> listSchedules(ListSchedulesRequest listSchedulesRequest);
    
	/**
     * [DEPRECATED] Subscribe to an alert.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/update to subscribe to
     * a job for an alert.
     */
    Subscription subscribe(CreateSubscription createSubscription);
    
	/**
     * [DEPRECATED] Unsubscribe to an alert.
     * 
     * Unsubscribes a user or a destination to an alert.
     * 
     * **Note:** This API is deprecated: Use :method:jobs/update to unsubscribe
     * to a job for an alert.
     */
    void unsubscribe(UnsubscribeRequest unsubscribeRequest);
    
	/**
     * Update an alert.
     * 
     * Updates an alert.
     */
    void update(EditAlert editAlert);
    
}