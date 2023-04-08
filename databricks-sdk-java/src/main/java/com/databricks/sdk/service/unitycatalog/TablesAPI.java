// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * A table resides in the third layer of Unity Catalog’s three-level namespace. It contains rows of
 * data. To create a table, users must have CREATE_TABLE and USE_SCHEMA permissions on the schema,
 * and they must have the USE_CATALOG permission on its parent catalog. To query a table, users must
 * have the SELECT permission on the table, and they must have the USE_CATALOG permission on its
 * parent catalog and the USE_SCHEMA permission on its parent schema.
 *
 * <p>A table can be managed or external. From an API perspective, a __VIEW__ is a particular kind
 * of table (rather than a managed or external table).
 */
public class TablesAPI {
  private final TablesService impl;

  /** Regular-use constructor */
  public TablesAPI(ApiClient apiClient) {
    impl = new TablesImpl(apiClient);
  }

  /** Constructor for mocks */
  public TablesAPI(TablesService mock) {
    impl = mock;
  }

  public void delete(String fullName) {
    delete(new DeleteTableRequest().setFullName(fullName));
  }

  /**
   * Delete a table.
   *
   * <p>Deletes a table from the specified parent catalog and schema. The caller must be the owner
   * of the parent catalog, have the **USE_CATALOG** privilege on the parent catalog and be the
   * owner of the parent schema, or be the owner of the table and have the **USE_CATALOG** privilege
   * on the parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public void delete(DeleteTableRequest request) {
    impl.delete(request);
  }

  public TableInfo get(String fullName) {
    return get(new GetTableRequest().setFullName(fullName));
  }

  /**
   * Get a table.
   *
   * <p>Gets a table from the metastore for a specific catalog and schema. The caller must be a
   * metastore admin, be the owner of the table and have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema, or be the owner of the table and
   * have the **SELECT** privilege on it as well.
   */
  public TableInfo get(GetTableRequest request) {
    return impl.get(request);
  }

  public ListTablesResponse list(String catalogName, String schemaName) {
    return list(new ListTablesRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /**
   * List tables.
   *
   * <p>Gets an array of all tables for the current metastore under the parent catalog and schema.
   * The caller must be a metastore admin or an owner of (or have the **SELECT** privilege on) the
   * table. For the latter case, the caller must also be the owner or have the **USE_CATALOG**
   * privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent schema. There is
   * no guarantee of a specific ordering of the elements in the array.
   */
  public ListTablesResponse list(ListTablesRequest request) {
    return impl.list(request);
  }

  public ListTableSummariesResponse listSummaries(String catalogName) {
    return listSummaries(new ListSummariesRequest().setCatalogName(catalogName));
  }

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
   */
  public ListTableSummariesResponse listSummaries(ListSummariesRequest request) {
    return impl.listSummaries(request);
  }

  public TablesService impl() {
    return impl;
  }
}
