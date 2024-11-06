// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an evolving API that facilitates the addition and removal of vizualisations from existing
 * queries within the Databricks Workspace. Data structures may change over time.
 *
 * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
 * version. [Learn more]
 *
 * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
 */
@Generated
public class QueryVisualizationsLegacyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueryVisualizationsLegacyAPI.class);

  private final QueryVisualizationsLegacyService impl;

  /** Regular-use constructor */
  public QueryVisualizationsLegacyAPI(ApiClient apiClient) {
    impl = new QueryVisualizationsLegacyImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueryVisualizationsLegacyAPI(QueryVisualizationsLegacyService mock) {
    impl = mock;
  }

  public LegacyVisualization create(String queryId, String typeValue, Object options) {
    return create(
        new CreateQueryVisualizationsLegacyRequest()
            .setQueryId(queryId)
            .setType(typeValue)
            .setOptions(options));
  }

  /**
   * Add visualization to a query.
   *
   * <p>Creates visualization in the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/create instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public LegacyVisualization create(CreateQueryVisualizationsLegacyRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteQueryVisualizationsLegacyRequest().setId(id));
  }

  /**
   * Remove visualization.
   *
   * <p>Removes a visualization from the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/delete instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public void delete(DeleteQueryVisualizationsLegacyRequest request) {
    impl.delete(request);
  }

  public LegacyVisualization update(String id) {
    return update(new LegacyVisualization().setId(id));
  }

  /**
   * Edit existing visualization.
   *
   * <p>Updates visualization in the query.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queryvisualizations/update instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  public LegacyVisualization update(LegacyVisualization request) {
    return impl.update(request);
  }

  public QueryVisualizationsLegacyService impl() {
    return impl;
  }
}
