// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
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

  /** Creates an alert. */
  public Alert create(CreateAlertRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new TrashAlertRequest().setId(id));
  }

  /**
   * Moves an alert to the trash. Trashed alerts immediately disappear from searches and list views,
   * and can no longer trigger. You can restore a trashed alert through the UI. A trashed alert is
   * permanently deleted after 30 days.
   */
  public void delete(TrashAlertRequest request) {
    impl.delete(request);
  }

  public Alert get(String id) {
    return get(new GetAlertRequest().setId(id));
  }

  /** Gets an alert. */
  public Alert get(GetAlertRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of alerts accessible to the user, ordered by creation time. **Warning:** Calling
   * this API concurrently 10 or more times could result in throttling, service degradation, or a
   * temporary ban.
   */
  public Iterable<ListAlertsResponseAlert> list(ListAlertsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListAlertsResponse::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates an alert. */
  public Alert update(UpdateAlertRequest request) {
    return impl.update(request);
  }

  public AlertsService impl() {
    return impl;
  }
}
