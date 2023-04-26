// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface TablesService {
  /**
   * Delete a table.
   *
   * <p>Deletes a table from the specified parent catalog and schema. The caller must be the owner
   * of the parent catalog, have the **USE_CATALOG** privilege on the parent catalog and be the
   * owner of the parent schema, or be the owner of the table and have the **USE_CATALOG** privilege
   * on the parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * @param deleteTableRequest a {@link com.databricks.sdk.service.catalog.DeleteTableRequest} object
   */
  void delete(DeleteTableRequest deleteTableRequest);

  /**
   * Get a table.
   *
   * <p>Gets a table from the metastore for a specific catalog and schema. The caller must be a
   * metastore admin, be the owner of the table and have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema, or be the owner of the table and
   * have the **SELECT** privilege on it as well.
   *
   * @param getTableRequest a {@link com.databricks.sdk.service.catalog.GetTableRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.TableInfo} object
   */
  TableInfo get(GetTableRequest getTableRequest);

  /**
   * List tables.
   *
   * <p>Gets an array of all tables for the current metastore under the parent catalog and schema.
   * The caller must be a metastore admin or an owner of (or have the **SELECT** privilege on) the
   * table. For the latter case, the caller must also be the owner or have the **USE_CATALOG**
   * privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent schema. There is
   * no guarantee of a specific ordering of the elements in the array.
   *
   * @param listTablesRequest a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesResponse} object
   */
  ListTablesResponse list(ListTablesRequest listTablesRequest);

  /**
   * List table summaries.
   *
   * <p>Gets an array of summaries for tables for a schema and catalog within the metastore. The
   * table summaries returned are either:
   *
   * <p>* summaries for all tables (within the current metastore and parent catalog and schema),
   * when the user is a metastore admin, or: * summaries for all tables and schemas (within the
   * current metastore and parent catalog) for which the user has ownership or the **SELECT**
   * privilege on the table and ownership or **USE_SCHEMA** privilege on the schema, provided that
   * the user also has ownership or the **USE_CATALOG** privilege on the parent catalog.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the array.
   *
   * @param listSummariesRequest a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTableSummariesResponse} object
   */
  ListTableSummariesResponse listSummaries(ListSummariesRequest listSummariesRequest);
}
