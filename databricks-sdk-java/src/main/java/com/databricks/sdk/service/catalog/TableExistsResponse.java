// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TableExistsResponse {
  /** Whether the table exists or not. */
  @JsonProperty("table_exists")
  private Boolean tableExists;

  public TableExistsResponse setTableExists(Boolean tableExists) {
    this.tableExists = tableExists;
    return this;
  }

  public Boolean getTableExists() {
    return tableExists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableExistsResponse that = (TableExistsResponse) o;
    return Objects.equals(tableExists, that.tableExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableExists);
  }

  @Override
  public String toString() {
    return new ToStringer(TableExistsResponse.class).add("tableExists", tableExists).toString();
  }
}
