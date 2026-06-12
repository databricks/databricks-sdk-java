// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the {@code sql_task} type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p><b>Warning</b>: This API is deprecated. Please see the latest version of the Databricks SQL
 * API. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AlertsLegacyService {
  /**
   * Creates an alert. An alert is a Databricks SQL object that periodically runs a query, evaluates
   * a condition of its result, and notifies users or notification destinations if the condition was
   * met.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/create instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  LegacyAlert create(CreateAlert createAlert);

  /**
   * Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. <b>Note</b>:
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/delete instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  void delete(DeleteAlertsLegacyRequest deleteAlertsLegacyRequest);

  /**
   * Gets an alert.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/get instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  LegacyAlert get(GetAlertsLegacyRequest getAlertsLegacyRequest);

  /**
   * Gets a list of alerts.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/list instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  Collection<LegacyAlert> list();

  /**
   * Updates an alert.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:alerts/update instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  void update(EditAlert editAlert);
}
