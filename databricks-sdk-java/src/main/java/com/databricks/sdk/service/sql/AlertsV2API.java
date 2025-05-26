// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** New version of SQL Alerts */
@Generated
public class AlertsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(AlertsV2API.class);

  private final AlertsV2Service impl;

  /** Regular-use constructor */
  public AlertsV2API(ApiClient apiClient) {
    impl = new AlertsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public AlertsV2API(AlertsV2Service mock) {
    impl = mock;
  }

  public AlertV2 createAlert(AlertV2 alert) {
    return createAlert(new CreateAlertV2Request().setAlert(alert));
  }

  /**
   * Create an alert.
   *
   * <p>Create Alert
   */
  public AlertV2 createAlert(CreateAlertV2Request request) {
    return impl.createAlert(request);
  }

  public AlertV2 getAlert(String id) {
    return getAlert(new GetAlertV2Request().setId(id));
  }

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   */
  public AlertV2 getAlert(GetAlertV2Request request) {
    return impl.getAlert(request);
  }

  /**
   * List alerts.
   *
   * <p>Gets a list of alerts accessible to the user, ordered by creation time.
   */
  public Iterable<AlertV2> listAlerts(ListAlertsV2Request request) {
    return new Paginator<>(
        request,
        impl::listAlerts,
        ListAlertsV2Response::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void trashAlert(String id) {
    trashAlert(new TrashAlertV2Request().setId(id));
  }

  /**
   * Delete an alert.
   *
   * <p>Moves an alert to the trash. Trashed alerts immediately disappear from list views, and can
   * no longer trigger. You can restore a trashed alert through the UI. A trashed alert is
   * permanently deleted after 30 days.
   */
  public void trashAlert(TrashAlertV2Request request) {
    impl.trashAlert(request);
  }

  public AlertV2 updateAlert(String id, AlertV2 alert, String updateMask) {
    return updateAlert(
        new UpdateAlertV2Request().setId(id).setAlert(alert).setUpdateMask(updateMask));
  }

  /**
   * Update an alert.
   *
   * <p>Update alert
   */
  public AlertV2 updateAlert(UpdateAlertV2Request request) {
    return impl.updateAlert(request);
  }

  public AlertsV2Service impl() {
    return impl;
  }
}
