// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DataSource {
  /** */
  @JsonProperty("delta_table_source")
  private DeltaTableSource deltaTableSource;

  public DataSource setDeltaTableSource(DeltaTableSource deltaTableSource) {
    this.deltaTableSource = deltaTableSource;
    return this;
  }

  public DeltaTableSource getDeltaTableSource() {
    return deltaTableSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSource that = (DataSource) o;
    return Objects.equals(deltaTableSource, that.deltaTableSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSource);
  }

  @Override
  public String toString() {
    return new ToStringer(DataSource.class).add("deltaTableSource", deltaTableSource).toString();
  }
}
