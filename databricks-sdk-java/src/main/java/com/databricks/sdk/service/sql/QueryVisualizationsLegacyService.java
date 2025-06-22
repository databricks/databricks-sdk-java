// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * This is an evolving API that facilitates the addition and removal of vizualisations from existing
 * queries within the Databricks Workspace. Data structures may change over time.
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
public interface QueryVisualizationsLegacyService {
  /**
   * Creates visualization in the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/create instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyVisualization create(
      CreateQueryVisualizationsLegacyRequest createQueryVisualizationsLegacyRequest);

  /**
   * Removes a visualization from the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/delete instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  void delete(DeleteQueryVisualizationsLegacyRequest deleteQueryVisualizationsLegacyRequest);

  /**
   * Updates visualization in the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/update instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyVisualization update(LegacyVisualization legacyVisualization);
}
