// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one. Dashboards can be scheduled using the `sql_task` type of
 * the Jobs API, e.g. :method:jobs/create.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DashboardsService {
  /**
   * Moves a dashboard to the trash. Trashed dashboards do not appear in list views or searches, and
   * cannot be shared.
   */
  void delete(DeleteDashboardRequest deleteDashboardRequest);

  /**
   * Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Fetch a paginated list of dashboard objects.
   *
   * <p>**Warning**: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   */
  ListResponse list(ListDashboardsRequest listDashboardsRequest);

  /** A restored dashboard appears in list views and searches and can be shared. */
  void restore(RestoreDashboardRequest restoreDashboardRequest);

  /**
   * Modify this dashboard definition. This operation only affects attributes of the dashboard
   * object. It does not add, modify, or remove widgets.
   *
   * <p>**Note**: You cannot undo this operation.
   */
  Dashboard update(DashboardEditContent dashboardEditContent);
}
