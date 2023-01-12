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
    Alert create(EditAlert editAlert);
    
	/**
     * Create a refresh schedule.
     * 
     * Creates a new refresh schedule for an alert.
     * 
     * **Note:** The structure of refresh schedules is subject to change.
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
     * Delete a refresh schedule.
     * 
     * Deletes an alert's refresh schedule. The refresh schedule specifies when
     * to refresh and evaluate the associated query result.
     */
    void deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);
    
	/**
     * Get an alert.
     * 
     * Gets an alert.
     */
    Alert get(GetAlertRequest getAlertRequest);
    
	/**
     * Get an alert's subscriptions.
     * 
     * Get the subscriptions for an alert. An alert subscription represents
     * exactly one recipient being notified whenever the alert is triggered. The
     * alert recipient is specified by either the `user` field or the
     * `destination` field. The `user` field is ignored if `destination` is
     * non-`null`.
     */
    List<Subscription> getSubscriptions(GetSubscriptionsRequest getSubscriptionsRequest);
    
	/**
     * Get alerts.
     * 
     * Gets a list of alerts.
     */
    List<Alert> list();
    
	/**
     * Get refresh schedules.
     * 
     * Gets the refresh schedules for the specified alert. Alerts can have
     * refresh schedules that specify when to refresh and evaluate the
     * associated query result.
     * 
     * **Note:** Although refresh schedules are returned in a list, only one
     * refresh schedule per alert is currently supported. The structure of
     * refresh schedules is subject to change.
     */
    List<RefreshSchedule> listSchedules(ListSchedulesRequest listSchedulesRequest);
    
	/**
     * Subscribe to an alert.
     */
    Subscription subscribe(CreateSubscription createSubscription);
    
	/**
     * Unsubscribe to an alert.
     * 
     * Unsubscribes a user or a destination to an alert.
     */
    void unsubscribe(UnsubscribeRequest unsubscribeRequest);
    
	/**
     * Update an alert.
     * 
     * Updates an alert.
     */
    void update(EditAlert editAlert);
    
}