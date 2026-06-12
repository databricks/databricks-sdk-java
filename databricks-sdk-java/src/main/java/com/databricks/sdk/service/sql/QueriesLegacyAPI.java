// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * These endpoints are used for CRUD operations on query definitions. Query definitions include the
 * target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
 * Queries can be scheduled using the {@code sql_task} type of the Jobs API, e.g.
 * :method:jobs/create.
 *
 * <p><b>Warning</b>: This API is deprecated. Please see the latest version of the Databricks SQL
 * API. <a href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
 */
@Generated
public class QueriesLegacyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QueriesLegacyAPI.class);

  private final QueriesLegacyService impl;

  /** Regular-use constructor */
  public QueriesLegacyAPI(ApiClient apiClient) {
    impl = new QueriesLegacyImpl(apiClient);
  }

  /** Constructor for mocks */
  public QueriesLegacyAPI(QueriesLegacyService mock) {
    impl = mock;
  }

  /**
   * Creates a new query definition. Queries created with this endpoint belong to the authenticated
   * user making the request.
   *
   * <p>The {@code data_source_id} field specifies the ID of the SQL warehouse to run this query
   * against. You can use the Data Sources API to see a complete list of available SQL warehouses.
   * Or you can copy the {@code data_source_id} from an existing query.
   *
   * <p><b>Note</b>: You cannot add a visualization until you create the query.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queries/create instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyQuery create(QueryPostContent request) {
    return impl.create(request);
  }

  public void delete(String queryId) {
    delete(new DeleteQueriesLegacyRequest().setQueryId(queryId));
  }

  /**
   * Moves a query to the trash. Trashed queries immediately disappear from searches and list views,
   * and they cannot be used for alerts. The trash is deleted after 30 days.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queries/delete instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public void delete(DeleteQueriesLegacyRequest request) {
    impl.delete(request);
  }

  public LegacyQuery get(String queryId) {
    return get(new GetQueriesLegacyRequest().setQueryId(queryId));
  }

  /**
   * Retrieve a query object definition along with contextual permissions information about the
   * currently authenticated user.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queries/get instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyQuery get(GetQueriesLegacyRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of queries. Optionally, this list can be filtered by a search term.
   *
   * <p><b>Warning</b>: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queries/list instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public Iterable<LegacyQuery> list(ListQueriesLegacyRequest request) {
    request.setPage(1L);
    return Paginator.newOffsetPagination(
        request,
        impl::list,
        QueryList::getResults,
        response -> {
          Long page = request.getPage();
          if (page == null) {
            page = 1L; // redash uses 1-based pagination
          }
          return request.setPage(page + 1L);
        });
  }

  /**
   * Restore a query that has been moved to the trash. A restored query appears in list views and
   * searches. You can use restored queries for alerts.
   *
   * <p><b>Warning</b>: This API is deprecated. Please see the latest version. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public void restore(RestoreQueriesLegacyRequest request) {
    impl.restore(request);
  }

  /**
   * Modify this query definition.
   *
   * <p><b>Note</b>: You cannot undo this operation.
   *
   * <p><b>Warning</b>: This API is deprecated. Please use :method:queries/update instead. <a
   * href="https://docs.databricks.com/en/sql/dbsql-api-latest.html">Learn more</a>
   */
  public LegacyQuery update(QueryEditContent request) {
    return impl.update(request);
  }

  public QueriesLegacyService impl() {
    return impl;
  }
}
