// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
 * object that periodically runs a query, evaluates a condition of its result, and notifies one or
 * more users and/or notification destinations if the condition was met. Alerts can be scheduled
 * using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
 * version. [Learn more]
 *
 * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
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
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/create instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyAlert create(CreateAlert createAlert);

  /**
   * Deletes an alert. Deleted alerts are no longer accessible and cannot be restored. **Note**:
   * Unlike queries and dashboards, alerts cannot be moved to the trash.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/delete instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  void delete(DeleteAlertsLegacyRequest deleteAlertsLegacyRequest);

  /**
   * Gets an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/get instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyAlert get(GetAlertsLegacyRequest getAlertsLegacyRequest);

  /**
   * Gets a list of alerts.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/list instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  Collection<LegacyAlert> list();

  /**
   * Updates an alert.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:alerts/update instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  void update(EditAlert editAlert);
}
