// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * These endpoints are used for CRUD operations on query definitions. Query definitions include the
 * target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
 * Queries can be scheduled using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
 *
 * <p>**Warning**: This API is deprecated. Please see the latest version of the Databricks SQL API.
 * [Learn more]
 *
 * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueriesLegacyService {
  /**
   * Creates a new query definition. Queries created with this endpoint belong to the authenticated
   * user making the request.
   *
   * <p>The `data_source_id` field specifies the ID of the SQL warehouse to run this query against.
   * You can use the Data Sources API to see a complete list of available SQL warehouses. Or you can
   * copy the `data_source_id` from an existing query.
   *
   * <p>**Note**: You cannot add a visualization until you create the query.
   *
   * <p>**Warning**: This API is deprecated. Please use :method:queries/create instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyQuery create(QueryPostContent queryPostContent);

  /**
   * Moves a query to the trash. Trashed queries immediately disappear from searches and list views,
   * and they cannot be used for alerts. The trash is deleted after 30 days.
   *
   * <p>**Warning**: This API is deprecated. Please use :method:queries/delete instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  void delete(DeleteQueriesLegacyRequest deleteQueriesLegacyRequest);

  /**
   * Retrieve a query object definition along with contextual permissions information about the
   * currently authenticated user.
   *
   * <p>**Warning**: This API is deprecated. Please use :method:queries/get instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyQuery get(GetQueriesLegacyRequest getQueriesLegacyRequest);

  /**
   * Gets a list of queries. Optionally, this list can be filtered by a search term.
   *
   * <p>**Warning**: Calling this API concurrently 10 or more times could result in throttling,
   * service degradation, or a temporary ban.
   *
   * <p>**Warning**: This API is deprecated. Please use :method:queries/list instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  QueryList list(ListQueriesLegacyRequest listQueriesLegacyRequest);

  /**
   * Restore a query that has been moved to the trash. A restored query appears in list views and
   * searches. You can use restored queries for alerts.
   *
   * <p>**Warning**: This API is deprecated. Please see the latest version. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  void restore(RestoreQueriesLegacyRequest restoreQueriesLegacyRequest);

  /**
   * Modify this query definition.
   *
   * <p>**Note**: You cannot undo this operation.
   *
   * <p>**Warning**: This API is deprecated. Please use :method:queries/update instead. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/en/sql/dbsql-api-latest.html
   */
  LegacyQuery update(QueryEditContent queryEditContent);
}
