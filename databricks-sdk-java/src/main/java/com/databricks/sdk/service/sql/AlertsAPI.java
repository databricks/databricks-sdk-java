// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met.
 */
public class AlertsAPI {
  private final AlertsService impl;

  /** Regular-use constructor */
  public AlertsAPI(ApiClient apiClient) {
    impl = new AlertsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AlertsAPI(AlertsService mock) {
    impl = mock;
  }

  /**
   * Create an alert.
   *
   * <p>Creates an alert. An alert is a Databricks SQL object that periodically runs a query,
   * evaluates a condition of its result, and notifies users or notification destinations if the
   * condition was met.
   */
  public Alert create(CreateAlert request) {
    return impl.create(request);
  }

  /**
   * Delete an alert.
   *
   * <p>Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note:**
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   */
  public void delete(DeleteAlertRequest request) {
    impl.delete(request);
  }

  /**
   * Get an alert.
   *
   * <p>Gets an alert.
   */
  public Alert get(GetAlertRequest request) {
    return impl.get(request);
  }

  /**
   * Get alerts.
   *
   * <p>Gets a list of alerts.
   */
  public List<Alert> list() {
    return impl.list();
  }

  /**
   * Update an alert.
   *
   * <p>Updates an alert.
   */
  public void update(EditAlert request) {
    impl.update(request);
  }

  public AlertsService impl() {
    return impl;
  }
}
