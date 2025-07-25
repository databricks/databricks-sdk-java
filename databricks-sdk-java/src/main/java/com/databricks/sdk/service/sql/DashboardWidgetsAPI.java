// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an evolving API that facilitates the addition and removal of widgets from existing
 * dashboards within the Databricks Workspace. Data structures may change over time.
 */
@Generated
public class DashboardWidgetsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DashboardWidgetsAPI.class);

  private final DashboardWidgetsService impl;

  /** Regular-use constructor */
  public DashboardWidgetsAPI(ApiClient apiClient) {
    impl = new DashboardWidgetsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DashboardWidgetsAPI(DashboardWidgetsService mock) {
    impl = mock;
  }

  /** Adds a widget to a dashboard */
  public Widget create(CreateWidget request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteDashboardWidgetRequest().setId(id));
  }

  /** Removes a widget from a dashboard */
  public void delete(DeleteDashboardWidgetRequest request) {
    impl.delete(request);
  }

  /** Updates an existing widget */
  public Widget update(UpdateWidgetRequest request) {
    return impl.update(request);
  }

  public DashboardWidgetsService impl() {
    return impl;
  }
}
