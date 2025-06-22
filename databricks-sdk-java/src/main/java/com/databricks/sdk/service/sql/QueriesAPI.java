// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The queries API can be used to perform CRUD operations on queries. A query is a Databricks SQL
 * object that includes the target SQL warehouse, query text, name, description, tags, and
 * parameters. Queries can be scheduled using the `sql_task` type of the Jobs API, e.g.
 * :method:jobs/create.
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

  /** Creates a query. */
  public Query create(CreateQueryRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new TrashQueryRequest().setId(id));
  }

  /**
   * Moves a query to the trash. Trashed queries immediately disappear from searches and list views,
   * and cannot be used for alerts. You can restore a trashed query through the UI. A trashed query
   * is permanently deleted after 30 days.
   */
  public void delete(TrashQueryRequest request) {
    impl.delete(request);
  }

  public Query get(String id) {
    return get(new GetQueryRequest().setId(id));
  }

  /** Gets a query. */
  public Query get(GetQueryRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of queries accessible to the user, ordered by creation time. **Warning:** Calling
   * this API concurrently 10 or more times could result in throttling, service degradation, or a
   * temporary ban.
   */
  public Iterable<ListQueryObjectsResponseQuery> list(ListQueriesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListQueryObjectsResponse::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Visualization> listVisualizations(String id) {
    return listVisualizations(new ListVisualizationsForQueryRequest().setId(id));
  }

  /** Gets a list of visualizations on a query. */
  public Iterable<Visualization> listVisualizations(ListVisualizationsForQueryRequest request) {
    return new Paginator<>(
        request,
        impl::listVisualizations,
        ListVisualizationsForQueryResponse::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Query update(String id, String updateMask) {
    return update(new UpdateQueryRequest().setId(id).setUpdateMask(updateMask));
  }

  /** Updates a query. */
  public Query update(UpdateQueryRequest request) {
    return impl.update(request);
  }

  public QueriesService impl() {
    return impl;
  }
}
