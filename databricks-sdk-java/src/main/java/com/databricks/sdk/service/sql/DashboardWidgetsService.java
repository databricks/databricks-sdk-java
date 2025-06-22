// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * This is an evolving API that facilitates the addition and removal of widgets from existing
 * dashboards within the Databricks Workspace. Data structures may change over time.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DashboardWidgetsService {

  Widget create(CreateWidget createWidget);

  void delete(DeleteDashboardWidgetRequest deleteDashboardWidgetRequest);

  Widget update(CreateWidget createWidget);
}
