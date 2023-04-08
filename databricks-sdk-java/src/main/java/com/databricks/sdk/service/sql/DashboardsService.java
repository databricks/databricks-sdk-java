// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface DashboardsService {
  /** Create a dashboard object. */
  Dashboard create(CreateDashboardRequest createDashboardRequest);

  /**
   * Remove a dashboard.
   *
   * <p>Moves a dashboard to the trash. Trashed dashboards do not appear in list views or searches,
   * and cannot be shared.
   */
  void delete(DeleteDashboardRequest deleteDashboardRequest);

  /**
   * Retrieve a definition.
   *
   * <p>Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Get dashboard objects.
   *
   * <p>Fetch a paginated list of dashboard objects.
   */
  ListResponse list(ListDashboardsRequest listDashboardsRequest);

  /**
   * Restore a dashboard.
   *
   * <p>A restored dashboard appears in list views and searches and can be shared.
   */
  void restore(RestoreDashboardRequest restoreDashboardRequest);
}
