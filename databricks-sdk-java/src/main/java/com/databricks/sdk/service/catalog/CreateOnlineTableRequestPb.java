// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an Online Table */
@Generated
class CreateOnlineTableRequestPb {
  @JsonProperty("table")
  private OnlineTable table;

  public CreateOnlineTableRequestPb setTable(OnlineTable table) {
    this.table = table;
    return this;
  }

  public OnlineTable getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOnlineTableRequestPb that = (CreateOnlineTableRequestPb) o;
    return Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOnlineTableRequestPb.class).add("table", table).toString();
  }
}
