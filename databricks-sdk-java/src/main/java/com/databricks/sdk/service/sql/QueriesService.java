// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * The queries API can be used to perform CRUD operations on queries. A query is a Databricks SQL
 * object that includes the target SQL warehouse, query text, name, description, tags, and
 * parameters. Queries can be scheduled using the `sql_task` type of the Jobs API, e.g.
 * :method:jobs/create.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueriesService {
  /** Creates a query. */
  Query create(CreateQueryRequest createQueryRequest);

  /**
   * Moves a query to the trash. Trashed queries immediately disappear from searches and list views,
   * and cannot be used for alerts. You can restore a trashed query through the UI. A trashed query
   * is permanently deleted after 30 days.
   */
  void delete(TrashQueryRequest trashQueryRequest);

  /** Gets a query. */
  Query get(GetQueryRequest getQueryRequest);

  /**
   * Gets a list of queries accessible to the user, ordered by creation time. **Warning:** Calling
   * this API concurrently 10 or more times could result in throttling, service degradation, or a
   * temporary ban.
   */
  ListQueryObjectsResponse list(ListQueriesRequest listQueriesRequest);

  /** Gets a list of visualizations on a query. */
  ListVisualizationsForQueryResponse listVisualizations(
      ListVisualizationsForQueryRequest listVisualizationsForQueryRequest);

  /** Updates a query. */
  Query update(UpdateQueryRequest updateQueryRequest);
}
