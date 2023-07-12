// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is
 * a Databricks SQL object that periodically runs a query, evaluates a condition
 * of its result, and notifies one or more users and/or notification
 * destinations if the condition was met. Alerts can be scheduled using the
 * `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 */
@Generated
public class AlertsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AlertsAPI.class);

  private final AlertsService impl;

  /** Regular-use constructor */
  public AlertsAPI(ApiClient apiClient) {
    impl = new AlertsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AlertsAPI(AlertsService mock) {
    impl = mock;
  }
  

	
	
  public Alert create(String name, AlertOptions options, String queryId) {
    return create(new CreateAlert()
      .setName(name)
      .setOptions(options)
      .setQueryId(queryId));
  }
  

	/**
   * Create an alert.
   * 
   * Creates an alert. An alert is a Databricks SQL object that periodically
   * runs a query, evaluates a condition of its result, and notifies users or
   * notification destinations if the condition was met.
   */
  public Alert create(CreateAlert request) {
    return impl.create(request);
  }
  
	
  public void delete(String alertId) {
    delete(new DeleteAlertRequest()
      .setAlertId(alertId));
  }
  

	/**
   * Delete an alert.
   * 
   * Deletes an alert. Deleted alerts are no longer accessible and cannot be
   * restored. **Note:** Unlike queries and dashboards, alerts cannot be moved
   * to the trash.
   */
  public void delete(DeleteAlertRequest request) {
    impl.delete(request);
  }
  
	
  public Alert get(String alertId) {
    return get(new GetAlertRequest()
      .setAlertId(alertId));
  }
  

	/**
   * Get an alert.
   * 
   * Gets an alert.
   */
  public Alert get(GetAlertRequest request) {
    return impl.get(request);
  }
  
	

	/**
   * Get alerts.
   * 
   * Gets a list of alerts.
   */
  public Iterable<Alert> list() {
    return impl.list();
  }
  
	
  public void update(String name, AlertOptions options, String queryId, String alertId) {
    update(new EditAlert()
      .setName(name)
      .setOptions(options)
      .setQueryId(queryId)
      .setAlertId(alertId));
  }
  

	/**
   * Update an alert.
   * 
   * Updates an alert.
   */
  public void update(EditAlert request) {
    impl.update(request);
  }
  
  public AlertsService impl() {
    return impl;
  }
}












