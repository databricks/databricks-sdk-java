// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an evolving API that facilitates the addition and removal of visualizations from existing
 * queries in the Databricks Workspace. Data structures can change over time.
 */
@Generated
public class QueryVisualizationsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueryVisualizationsAPI.class);

  private final QueryVisualizationsService impl;

  /** Regular-use constructor */
  public QueryVisualizationsAPI(ApiClient apiClient) {
    impl = new QueryVisualizationsImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueryVisualizationsAPI(QueryVisualizationsService mock) {
    impl = mock;
  }

  /** Adds a visualization to a query. */
  public Visualization create(CreateVisualizationRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteVisualizationRequest().setId(id));
  }

  /** Removes a visualization. */
  public void delete(DeleteVisualizationRequest request) {
    impl.delete(request);
  }

  /** Updates a visualization. */
  public Visualization update(UpdateVisualizationRequest request) {
    return impl.update(request);
  }

  public QueryVisualizationsService impl() {
    return impl;
  }
}
