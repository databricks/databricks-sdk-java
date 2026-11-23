// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Source Delta table for a streaming detection rule. */
@Generated
public class StreamingSource {
  /** Fully-qualified Unity Catalog table in `catalog.schema.table` form. */
  @JsonProperty("table")
  private String table;

  public StreamingSource setTable(String table) {
    this.table = table;
    return this;
  }

  public String getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamingSource that = (StreamingSource) o;
    return Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamingSource.class).add("table", table).toString();
  }
}
