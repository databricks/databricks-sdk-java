// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListTableSummariesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of table summaries. */
  @JsonProperty("tables")
  private Collection<TableSummary> tables;

  public ListTableSummariesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTableSummariesResponse setTables(Collection<TableSummary> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<TableSummary> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTableSummariesResponse that = (ListTableSummariesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTableSummariesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }
}
