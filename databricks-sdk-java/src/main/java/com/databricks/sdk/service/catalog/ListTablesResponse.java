// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListTablesResponse {
  /**
   * Opaque token for pagination. Omitted if there are no more results. page_token should be set to
   * this value for fetching the next page.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of table information objects. */
  @JsonProperty("tables")
  private Collection<TableInfo> tables;

  public ListTablesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTablesResponse setTables(Collection<TableInfo> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<TableInfo> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTablesResponse that = (ListTablesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }
}
