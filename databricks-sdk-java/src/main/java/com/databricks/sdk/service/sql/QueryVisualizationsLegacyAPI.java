// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * This is an evolving API that facilitates the addition and removal of vizualisations from existing
 * queries within the Databricks Workspace. Data structures may change over time.
 *
 * <p><b>Warning</b>: This API is deprecated. Please see the latest version of the Databricks SQL
 * API. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
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

  /**
   * Creates visualization in the query.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queryvisualizations/create
   * instead. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyVisualization create(CreateQueryVisualizationsLegacyRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteQueryVisualizationsLegacyRequest().setId(id));
  }

  /**
   * Removes a visualization from the query.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queryvisualizations/delete
   * instead. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public void delete(DeleteQueryVisualizationsLegacyRequest request) {
    impl.delete(request);
  }

  /**
   * Updates visualization in the query.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queryvisualizations/update
   * instead. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyVisualization update(LegacyVisualization request) {
    return impl.update(request);
  }

  public QueryVisualizationsLegacyService impl() {
    return impl;
  }
}
