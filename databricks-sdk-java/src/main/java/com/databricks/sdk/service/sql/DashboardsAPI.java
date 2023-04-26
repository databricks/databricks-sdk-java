// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DashboardsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DashboardsAPI.class);

  private final DashboardsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public DashboardsAPI(ApiClient apiClient) {
    impl = new DashboardsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sql.DashboardsService} object
   */
  public DashboardsAPI(DashboardsService mock) {
    impl = mock;
  }

  /**
   * Create a dashboard object.
   *
   * @param request a {@link com.databricks.sdk.service.sql.CreateDashboardRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard create(CreateDashboardRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   */
  public void delete(String dashboardId) {
    delete(new DeleteDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Remove a dashboard.
   *
   * <p>Moves a dashboard to the trash. Trashed dashboards do not appear in list views or searches,
   * and cannot be shared.
   *
   * @param request a {@link com.databricks.sdk.service.sql.DeleteDashboardRequest} object
   */
  public void delete(DeleteDashboardRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard get(String dashboardId) {
    return get(new GetDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Retrieve a definition.
   *
   * <p>Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   *
   * @param request a {@link com.databricks.sdk.service.sql.GetDashboardRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Dashboard} object
   */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  /**
   * Get dashboard objects.
   *
   * <p>Fetch a paginated list of dashboard objects.
   *
   * @param request a {@link com.databricks.sdk.service.sql.ListDashboardsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Dashboard> list(ListDashboardsRequest request) {
    request.setPage(1L);
    return new Paginator<>(
            request,
            impl::list,
            ListResponse::getResults,
            response -> {
              Long page = request.getPage();
              if (page == null) {
                page = 1L; // redash uses 1-based pagination
              }
              return request.setPage(page + 1L);
            })
        .withDedupe(Dashboard::getId);
  }

  /**
   * <p>restore.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   */
  public void restore(String dashboardId) {
    restore(new RestoreDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Restore a dashboard.
   *
   * <p>A restored dashboard appears in list views and searches and can be shared.
   *
   * @param request a {@link com.databricks.sdk.service.sql.RestoreDashboardRequest} object
   */
  public void restore(RestoreDashboardRequest request) {
    impl.restore(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.DashboardsService} object
   */
  public DashboardsService impl() {
    return impl;
  }
}
