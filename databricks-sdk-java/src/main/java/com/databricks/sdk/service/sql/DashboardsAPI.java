// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one.
 */
public class DashboardsAPI {
  private final DashboardsService impl;

  /** Regular-use constructor */
  public DashboardsAPI(ApiClient apiClient) {
    impl = new DashboardsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DashboardsAPI(DashboardsService mock) {
    impl = mock;
  }

  /** Create a dashboard object. */
  public Dashboard create(CreateDashboardRequest request) {
    return impl.create(request);
  }

  /**
   * Remove a dashboard.
   *
   * <p>Moves a dashboard to the trash. Trashed dashboards do not appear in list views or searches,
   * and cannot be shared.
   */
  public void delete(DeleteDashboardRequest request) {
    impl.delete(request);
  }

  /**
   * Retrieve a definition.
   *
   * <p>Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  /**
   * Get dashboard objects.
   *
   * <p>Fetch a paginated list of dashboard objects.
   */
  public ListResponse list(ListDashboardsRequest request) {
    return impl.list(request);
  }

  /**
   * Restore a dashboard.
   *
   * <p>A restored dashboard appears in list views and searches and can be shared.
   */
  public void restore(RestoreDashboardRequest request) {
    impl.restore(request);
  }

  public DashboardsService impl() {
    return impl;
  }
}
