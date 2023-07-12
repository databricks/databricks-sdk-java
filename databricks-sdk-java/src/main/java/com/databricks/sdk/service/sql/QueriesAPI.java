// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These endpoints are used for CRUD operations on query definitions. Query definitions include the
 * target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
 * Queries can be scheduled using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 */
@Generated
public class QueriesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueriesAPI.class);

  private final QueriesService impl;

  /** Regular-use constructor */
  public QueriesAPI(ApiClient apiClient) {
    impl = new QueriesImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueriesAPI(QueriesService mock) {
    impl = mock;
  }

  /**
   * Create a new query definition.
   *
   * <p>Creates a new query definition. Queries created with this endpoint belong to the
   * authenticated user making the request.
   *
   * <p>The `data_source_id` field specifies the ID of the SQL warehouse to run this query against.
   * You can use the Data Sources API to see a complete list of available SQL warehouses. Or you can
   * copy the `data_source_id` from an existing query.
   *
   * <p>**Note**: You cannot add a visualization until you create the query.
   */
  public Query create(QueryPostContent request) {
    return impl.create(request);
  }

  public void delete(String queryId) {
    delete(new DeleteQueryRequest().setQueryId(queryId));
  }

  /**
   * Delete a query.
   *
   * <p>Moves a query to the trash. Trashed queries immediately disappear from searches and list
   * views, and they cannot be used for alerts. The trash is deleted after 30 days.
   */
  public void delete(DeleteQueryRequest request) {
    impl.delete(request);
  }

  public Query get(String queryId) {
    return get(new GetQueryRequest().setQueryId(queryId));
  }

  /**
   * Get a query definition.
   *
   * <p>Retrieve a query object definition along with contextual permissions information about the
   * currently authenticated user.
   */
  public Query get(GetQueryRequest request) {
    return impl.get(request);
  }

  /**
   * Get a list of queries.
   *
   * <p>Gets a list of queries. Optionally, this list can be filtered by a search term.
   */
  public Iterable<Query> list(ListQueriesRequest request) {
    request.setPage(1L);
    return new Paginator<>(
            request,
            impl::list,
            QueryList::getResults,
            response -> {
              Long page = request.getPage();
              if (page == null) {
                page = 1L; // redash uses 1-based pagination
              }
              return request.setPage(page + 1L);
            })
        .withDedupe(Query::getId);
  }

  public void restore(String queryId) {
    restore(new RestoreQueryRequest().setQueryId(queryId));
  }

  /**
   * Restore a query.
   *
   * <p>Restore a query that has been moved to the trash. A restored query appears in list views and
   * searches. You can use restored queries for alerts.
   */
  public void restore(RestoreQueryRequest request) {
    impl.restore(request);
  }

  public Query update(String queryId) {
    return update(new QueryEditContent().setQueryId(queryId));
  }

  /**
   * Change a query definition.
   *
   * <p>Modify this query definition.
   *
   * <p>**Note**: You cannot undo this operation.
   */
  public Query update(QueryEditContent request) {
    return impl.update(request);
  }

  public QueriesService impl() {
    return impl;
  }
}
