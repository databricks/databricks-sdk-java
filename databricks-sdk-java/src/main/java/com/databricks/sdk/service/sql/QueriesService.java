// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

/**
 * These endpoints are used for CRUD operations on query definitions. Query definitions include the
 * target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface QueriesService {
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
   *
   * @param queryPostContent a {@link com.databricks.sdk.service.sql.QueryPostContent} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  Query create(QueryPostContent queryPostContent);

  /**
   * Delete a query.
   *
   * <p>Moves a query to the trash. Trashed queries immediately disappear from searches and list
   * views, and they cannot be used for alerts. The trash is deleted after 30 days.
   *
   * @param deleteQueryRequest a {@link com.databricks.sdk.service.sql.DeleteQueryRequest} object
   */
  void delete(DeleteQueryRequest deleteQueryRequest);

  /**
   * Get a query definition.
   *
   * <p>Retrieve a query object definition along with contextual permissions information about the
   * currently authenticated user.
   *
   * @param getQueryRequest a {@link com.databricks.sdk.service.sql.GetQueryRequest} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  Query get(GetQueryRequest getQueryRequest);

  /**
   * Get a list of queries.
   *
   * <p>Gets a list of queries. Optionally, this list can be filtered by a search term.
   *
   * @param listQueriesRequest a {@link com.databricks.sdk.service.sql.ListQueriesRequest} object
   * @return a {@link com.databricks.sdk.service.sql.QueryList} object
   */
  QueryList list(ListQueriesRequest listQueriesRequest);

  /**
   * Restore a query.
   *
   * <p>Restore a query that has been moved to the trash. A restored query appears in list views and
   * searches. You can use restored queries for alerts.
   *
   * @param restoreQueryRequest a {@link com.databricks.sdk.service.sql.RestoreQueryRequest} object
   */
  void restore(RestoreQueryRequest restoreQueryRequest);

  /**
   * Change a query definition.
   *
   * <p>Modify this query definition.
   *
   * <p>**Note**: You cannot undo this operation.
   *
   * @param queryEditContent a {@link com.databricks.sdk.service.sql.QueryEditContent} object
   * @return a {@link com.databricks.sdk.service.sql.Query} object
   */
  Query update(QueryEditContent queryEditContent);
}
