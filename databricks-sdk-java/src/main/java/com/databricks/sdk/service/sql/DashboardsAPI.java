// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * In general, there is little need to modify dashboards using the API. However, it can be useful to
 * use dashboard objects to look-up a collection of related query IDs. The API can also be used to
 * duplicate multiple dashboards at once since you can get a dashboard definition with a GET request
 * and then POST it to create a new one. Dashboards can be scheduled using the {@code sql_task} type
 * of the Jobs API, e.g. :method:jobs/create.
 *
 * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
 * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
 */
@Generated
public class DashboardsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DashboardsAPI.class);

  private final DashboardsService impl;

  /** Regular-use constructor */
  public DashboardsAPI(ApiClient apiClient) {
    impl = new DashboardsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DashboardsAPI(DashboardsService mock) {
    impl = mock;
  }

  public void delete(String dashboardId) {
    delete(new DeleteDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Moves a dashboard to the trash. Trashed dashboards do not appear in list views or searches, and
   * cannot be shared.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  public void delete(DeleteDashboardRequest request) {
    impl.delete(request);
  }

  public Dashboard get(String dashboardId) {
    return get(new GetDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Returns a JSON representation of a dashboard object, including its visualization and query
   * objects.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  /**
   * Fetch a paginated list of dashboard objects.
   *
   * <p><b>Warning</b>: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  public Iterable<Dashboard> list(ListDashboardsRequest request) {
    request.setPage(1L);
    return Paginator.newOffsetPagination(
        request,
        impl::list,
        ListResponse::getResults,
        response -> {
          Long page = request.getPage();
          if (page == null) {
            page = 1L; // redash uses 1-based pagination
          }
          return request.setPage(page + 1L);
        });
  }

  /**
   * A restored dashboard appears in list views and searches and can be shared.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  public void restore(RestoreDashboardRequest request) {
    impl.restore(request);
  }

  /**
   * Modify this dashboard definition. This operation only affects attributes of the dashboard
   * object. It does not add, modify, or remove widgets.
   *
   * <p><b>Note</b>: You cannot undo this operation.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use the AI/BI Dashboards API instead. <a
   * href="https://docs.databricks.com/en/dashboards/">Learn more</a>
   */
  public Dashboard update(DashboardEditContent request) {
    return impl.update(request);
  }

  public DashboardsService impl() {
    return impl;
  }
}
