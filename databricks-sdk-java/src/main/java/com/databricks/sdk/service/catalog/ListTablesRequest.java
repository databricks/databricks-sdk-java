// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List tables
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListTablesRequest {
  /** Name of parent catalog for tables of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /** Whether delta metadata should be included in the response. */
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  /**
   * Maximum number of tables to return (page length). If not set, all accessible tables in the
   * schema are returned. If set to:
   *
   * <p>* greater than 0, page length is the minimum of this value and a server configured value. *
   * equal to 0, page length is set to a server configured value. * lesser than 0, invalid parameter
   * error.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
  @QueryParam("page_token")
  private String pageToken;

  /** Parent schema of tables. */
  @QueryParam("schema_name")
  private String schemaName;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   */
  public ListTablesRequest setCatalogName(String catalogName) {
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
   * <p>Setter for the field <code>includeDeltaMetadata</code>.</p>
   *
   * @param includeDeltaMetadata a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   */
  public ListTablesRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  /**
   * <p>Getter for the field <code>includeDeltaMetadata</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  /**
   * <p>Setter for the field <code>maxResults</code>.</p>
   *
   * @param maxResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   */
  public ListTablesRequest setMaxResults(Long maxResults) {
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
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   */
  public ListTablesRequest setPageToken(String pageToken) {
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
   * <p>Setter for the field <code>schemaName</code>.</p>
   *
   * @param schemaName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTablesRequest} object
   */
  public ListTablesRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaName() {
    return schemaName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTablesRequest that = (ListTablesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName, includeDeltaMetadata, maxResults, pageToken, schemaName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListTablesRequest.class)
        .add("catalogName", catalogName)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}
