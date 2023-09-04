// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an evolving API that facilitates the addition and removal of vizualisations from existing
 * queries within the Databricks Workspace. Data structures may change over time.
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

  public Visualization create(String queryId, String typeValue, Object options) {
    return create(
        new CreateQueryVisualizationRequest()
            .setQueryId(queryId)
            .setType(type)
            .setOptions(options));
  }

  /** Add visualization to a query. */
  public Visualization create(CreateQueryVisualizationRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteQueryVisualizationRequest().setId(id));
  }

  /** Remove visualization. */
  public void delete(DeleteQueryVisualizationRequest request) {
    impl.delete(request);
  }

  public Visualization update(String id) {
    return update(new Visualization().setId(id));
  }

  /** Edit existing visualization. */
  public Visualization update(Visualization request) {
    return impl.update(request);
  }

  public QueryVisualizationsService impl() {
    return impl;
  }
}
