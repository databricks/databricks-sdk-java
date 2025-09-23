// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Generated
public class TablesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TablesAPI.class);

  private final TablesService impl;

  /** Regular-use constructor */
  public TablesAPI(ApiClient apiClient) {
    impl = new TablesImpl(apiClient);
  }

  /** Constructor for mocks */
  public TablesAPI(TablesService mock) {
    impl = mock;
  }

  /**
   * Creates a new table in the specified catalog and schema.
   *
   * <p>To create an external delta table, the caller must have the **EXTERNAL_USE_SCHEMA**
   * privilege on the parent schema and the **EXTERNAL_USE_LOCATION** privilege on the external
   * location. These privileges must always be granted explicitly, and cannot be inherited through
   * ownership or **ALL_PRIVILEGES**.
   *
   * <p>Standard UC permissions needed to create tables still apply: **USE_CATALOG** on the parent
   * catalog (or ownership of the parent catalog), **CREATE_TABLE** and **USE_SCHEMA** on the parent
   * schema (or ownership of the parent schema), and **CREATE_EXTERNAL_TABLE** on external location.
   *
   * <p>The **columns** field needs to be in a Spark compatible format, so we recommend you use
   * Spark to create these tables. The API itself does not validate the correctness of the column
   * spec. If the spec is not Spark compatible, the tables may not be readable by Databricks
   * Runtime.
   *
   * <p>NOTE: The Create Table API for external clients only supports creating **external delta
   * tables**. The values shown in the respective enums are all values supported by Databricks,
   * however for this specific Create Table API, only **table_type** **EXTERNAL** and
   * **data_source_format** **DELTA** are supported. Additionally, column masks are not supported
   * when creating tables through this API.
   */
  public TableInfo create(CreateTableRequest request) {
    return impl.create(request);
  }

  public void delete(String fullName) {
    delete(new DeleteTableRequest().setFullName(fullName));
  }

  /**
   * Deletes a table from the specified parent catalog and schema. The caller must be the owner of
   * the parent catalog, have the **USE_CATALOG** privilege on the parent catalog and be the owner
   * of the parent schema, or be the owner of the table and have the **USE_CATALOG** privilege on
   * the parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public void delete(DeleteTableRequest request) {
    impl.delete(request);
  }

  public TableExistsResponse exists(String fullName) {
    return exists(new ExistsRequest().setFullName(fullName));
  }

  /**
   * Gets if a table exists in the metastore for a specific catalog and schema. The caller must
   * satisfy one of the following requirements: * Be a metastore admin * Be the owner of the parent
   * catalog * Be the owner of the parent schema and have the **USE_CATALOG** privilege on the
   * parent catalog * Have the **USE_CATALOG** privilege on the parent catalog and the
   * **USE_SCHEMA** privilege on the parent schema, and either be the table owner or have the
   * **SELECT** privilege on the table. * Have **BROWSE** privilege on the parent catalog * Have
   * **BROWSE** privilege on the parent schema
   */
  public TableExistsResponse exists(ExistsRequest request) {
    return impl.exists(request);
  }

  public TableInfo get(String fullName) {
    return get(new GetTableRequest().setFullName(fullName));
  }

  /**
   * Gets a table from the metastore for a specific catalog and schema. The caller must satisfy one
   * of the following requirements: * Be a metastore admin * Be the owner of the parent catalog * Be
   * the owner of the parent schema and have the **USE_CATALOG** privilege on the parent catalog *
   * Have the **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on
   * the parent schema, and either be the table owner or have the **SELECT** privilege on the table.
   */
  public TableInfo get(GetTableRequest request) {
    return impl.get(request);
  }

  public Iterable<TableInfo> list(String catalogName, String schemaName) {
    return list(new ListTablesRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /**
   * Gets an array of all tables for the current metastore under the parent catalog and schema. The
   * caller must be a metastore admin or an owner of (or have the **SELECT** privilege on) the
   * table. For the latter case, the caller must also be the owner or have the **USE_CATALOG**
   * privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent schema. There is
   * no guarantee of a specific ordering of the elements in the array.
   */
  public Iterable<TableInfo> list(ListTablesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListTablesResponse::getTables,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<TableSummary> listSummaries(String catalogName) {
    return listSummaries(new ListSummariesRequest().setCatalogName(catalogName));
  }

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
  public Iterable<TableSummary> listSummaries(ListSummariesRequest request) {
    return new Paginator<>(
        request,
        impl::listSummaries,
        ListTableSummariesResponse::getTables,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Change the owner of the table. The caller must be the owner of the parent catalog, have the
   * **USE_CATALOG** privilege on the parent catalog and be the owner of the parent schema, or be
   * the owner of the table and have the **USE_CATALOG** privilege on the parent catalog and the
   * **USE_SCHEMA** privilege on the parent schema.
   */
  public void update(UpdateTableRequest request) {
    impl.update(request);
  }

  public TablesService impl() {
    return impl;
  }
}
