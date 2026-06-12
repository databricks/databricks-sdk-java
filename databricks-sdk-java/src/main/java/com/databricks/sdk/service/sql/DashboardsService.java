// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one. Dashboards can be scheduled using the {@code sql_task} type
 * of the Jobs API, e.g. :method:jobs/create.
 *
 * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
 * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
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
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  void delete(DeleteDashboardRequest deleteDashboardRequest);

  /**
   * Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Fetch a paginated list of dashboard objects.
   *
   * <p><b>Warning</b>: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  ListResponse list(ListDashboardsRequest listDashboardsRequest);

  /**
   * A restored dashboard appears in list views and searches and can be shared.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  void restore(RestoreDashboardRequest restoreDashboardRequest);

  /**
   * Modify this dashboard definition. This operation only affects attributes of the dashboard
   * object. It does not add, modify, or remove widgets.
   *
   * <p><b>Note</b>: You cannot undo this operation.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  Dashboard update(DashboardEditContent dashboardEditContent);
}
