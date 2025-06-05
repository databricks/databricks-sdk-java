// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListTablesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("tables")
  private Collection<TableInfo> tables;

  public ListTablesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTablesResponsePb setTables(Collection<TableInfo> tables) {
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
    ListTablesResponsePb that = (ListTablesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }
}
