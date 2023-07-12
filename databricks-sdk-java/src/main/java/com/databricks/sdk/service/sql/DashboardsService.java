// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * In general, there is little need to modify dashboards using the API. However,
 * it can be useful to use dashboard objects to look-up a collection of related
 * query IDs. The API can also be used to duplicate multiple dashboards at once
 * since you can get a dashboard definition with a GET request and then POST it
 * to create a new one. Dashboards can be scheduled using the `sql_task` type of
 * the Jobs API, e.g. :method:jobs/create.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DashboardsService {
	/**
   * Create a dashboard object.
   */
  Dashboard create(CreateDashboardRequest createDashboardRequest);
  
	/**
   * Remove a dashboard.
   * 
   * Moves a dashboard to the trash. Trashed dashboards do not appear in list
   * views or searches, and cannot be shared.
   */
  void delete(DeleteDashboardRequest deleteDashboardRequest);
  
	/**
   * Retrieve a definition.
   * 
   * Returns a JSON representation of a dashboard object, including its
   * visualization and query objects.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);
  
	/**
   * Get dashboard objects.
   * 
   * Fetch a paginated list of dashboard objects.
   */
  ListResponse list(ListDashboardsRequest listDashboardsRequest);
  
	/**
   * Restore a dashboard.
   * 
   * A restored dashboard appears in list views and searches and can be shared.
   */
  void restore(RestoreDashboardRequest restoreDashboardRequest);
  
}