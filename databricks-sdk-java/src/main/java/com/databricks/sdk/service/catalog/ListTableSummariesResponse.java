// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListTableSummariesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListTableSummariesResponse {
  /** Opaque token for pagination. Omitted if there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of table summaries. */
  @JsonProperty("tables")
  private Collection<TableSummary> tables;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTableSummariesResponse} object
   */
  public ListTableSummariesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>tables</code>.</p>
   *
   * @param tables a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListTableSummariesResponse} object
   */
  public ListTableSummariesResponse setTables(Collection<TableSummary> tables) {
    this.tables = tables;
    return this;
  }

  /**
   * <p>Getter for the field <code>tables</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<TableSummary> getTables() {
    return tables;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTableSummariesResponse that = (ListTableSummariesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListTableSummariesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }
}
