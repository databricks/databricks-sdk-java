// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A table resides in the third layer of Unity Catalog’s three-level namespace. It contains rows of
 * data. To create a table, users must have CREATE_TABLE and USE_SCHEMA permissions on the schema,
 * and they must have the USE_CATALOG permission on its parent catalog. To query a table, users must
 * have the SELECT permission on the table, and they must have the USE_CATALOG permission on its
 * parent catalog and the USE_SCHEMA permission on its parent schema.
 *
 * <p>A table can be managed or external. From an API perspective, a __VIEW__ is a particular kind
 * of table (rather than a managed or external table).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TablesService {
  /**
   * Deletes a table from the specified parent catalog and schema. The caller must be the owner of
   * the parent catalog, have the **USE_CATALOG** privilege on the parent catalog and be the owner
   * of the parent schema, or be the owner of the table and have the **USE_CATALOG** privilege on
   * the parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  void delete(DeleteTableRequest deleteTableRequest);

  /**
   * Gets if a table exists in the metastore for a specific catalog and schema. The caller must
   * satisfy one of the following requirements: * Be a metastore admin * Be the owner of the parent
   * catalog * Be the owner of the parent schema and have the USE_CATALOG privilege on the parent
   * catalog * Have the **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA**
   * privilege on the parent schema, and either be the table owner or have the SELECT privilege on
   * the table. * Have BROWSE privilege on the parent catalog * Have BROWSE privilege on the parent
   * schema.
   */
  TableExistsResponse exists(ExistsRequest existsRequest);

  /**
   * Gets a table from the metastore for a specific catalog and schema. The caller must satisfy one
   * of the following requirements: * Be a metastore admin * Be the owner of the parent catalog * Be
   * the owner of the parent schema and have the USE_CATALOG privilege on the parent catalog * Have
   * the **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the
   * parent schema, and either be the table owner or have the SELECT privilege on the table.
   */
  TableInfo get(GetTableRequest getTableRequest);

  /**
   * Gets an array of all tables for the current metastore under the parent catalog and schema. The
   * caller must be a metastore admin or an owner of (or have the **SELECT** privilege on) the
   * table. For the latter case, the caller must also be the owner or have the **USE_CATALOG**
   * privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent schema. There is
   * no guarantee of a specific ordering of the elements in the array.
   */
  ListTablesResponse list(ListTablesRequest listTablesRequest);

  /**
   * Gets an array of summaries for tables for a schema and catalog within the metastore. The table
   * summaries returned are either:
   *
   * <p>* summaries for tables (within the current metastore and parent catalog and schema), when
   * the user is a metastore admin, or: * summaries for tables and schemas (within the current
   * metastore and parent catalog) for which the user has ownership or the **SELECT** privilege on
   * the table and ownership or **USE_SCHEMA** privilege on the schema, provided that the user also
   * has ownership or the **USE_CATALOG** privilege on the parent catalog.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the array.
   */
  ListTableSummariesResponse listSummaries(ListSummariesRequest listSummariesRequest);

  /**
   * Change the owner of the table. The caller must be the owner of the parent catalog, have the
   * **USE_CATALOG** privilege on the parent catalog and be the owner of the parent schema, or be
   * the owner of the table and have the **USE_CATALOG** privilege on the parent catalog and the
   * **USE_SCHEMA** privilege on the parent schema.
   */
  void update(UpdateTableRequest updateTableRequest);
}
