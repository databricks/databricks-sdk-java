// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * These endpoints are used for CRUD operations on query definitions. Query definitions include the
 * target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
 * Queries can be scheduled using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
 * version.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueriesLegacyService {
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
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queries/create instead.
   */
  LegacyQuery create(QueryPostContent queryPostContent);

  /**
   * Delete a query.
   *
   * <p>Moves a query to the trash. Trashed queries immediately disappear from searches and list
   * views, and they cannot be used for alerts. The trash is deleted after 30 days.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queries/delete instead.
   */
  void delete(DeleteQueriesLegacyRequest deleteQueriesLegacyRequest);

  /**
   * Get a query definition.
   *
   * <p>Retrieve a query object definition along with contextual permissions information about the
   * currently authenticated user.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queries/get instead.
   */
  LegacyQuery get(GetQueriesLegacyRequest getQueriesLegacyRequest);

  /**
   * Get a list of queries.
   *
   * <p>Gets a list of queries. Optionally, this list can be filtered by a search term.
   *
   * <p>**Warning**: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queries/list instead.
   */
  QueryList list(ListQueriesLegacyRequest listQueriesLegacyRequest);

  /**
   * Restore a query.
   *
   * <p>Restore a query that has been moved to the trash. A restored query appears in list views and
   * searches. You can use restored queries for alerts.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
   * version.
   */
  void restore(RestoreQueriesLegacyRequest restoreQueriesLegacyRequest);

  /**
   * Change a query definition.
   *
   * <p>Modify this query definition.
   *
   * <p>**Note**: You cannot undo this operation.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:queries/update instead.
   */
  LegacyQuery update(QueryEditContent queryEditContent);
}
