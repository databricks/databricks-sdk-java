// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List table summaries
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSummariesRequest {
  /** Name of parent catalog for tables of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /** Maximum number of tables to return (page length). Defaults to 10000. */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * A sql LIKE pattern (% and _) for schema names. All schemas will be returned if not set or
   * empty.
   */
  @QueryParam("schema_name_pattern")
  private String schemaNamePattern;

  /**
   * A sql LIKE pattern (% and _) for table names. All tables will be returned if not set or empty.
   */
  @QueryParam("table_name_pattern")
  private String tableNamePattern;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   */
  public ListSummariesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   */
  public ListSummariesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxResults</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxResults() {
    return maxResults;
  }

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   */
  public ListSummariesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPageToken() {
    return pageToken;
  }

  /**
   * <p>Setter for the field <code>schemaNamePattern</code>.</p>
   *
   * @param schemaNamePattern a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   */
  public ListSummariesRequest setSchemaNamePattern(String schemaNamePattern) {
    this.schemaNamePattern = schemaNamePattern;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaNamePattern</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaNamePattern() {
    return schemaNamePattern;
  }

  /**
   * <p>Setter for the field <code>tableNamePattern</code>.</p>
   *
   * @param tableNamePattern a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListSummariesRequest} object
   */
  public ListSummariesRequest setTableNamePattern(String tableNamePattern) {
    this.tableNamePattern = tableNamePattern;
    return this;
  }

  /**
   * <p>Getter for the field <code>tableNamePattern</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTableNamePattern() {
    return tableNamePattern;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSummariesRequest that = (ListSummariesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaNamePattern, that.schemaNamePattern)
        && Objects.equals(tableNamePattern, that.tableNamePattern);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName, maxResults, pageToken, schemaNamePattern, tableNamePattern);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListSummariesRequest.class)
        .add("catalogName", catalogName)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaNamePattern", schemaNamePattern)
        .add("tableNamePattern", tableNamePattern)
        .toString();
  }
}
