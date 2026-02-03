// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class BackfillSource {
  /**
   * The Delta table source containing the historic data to backfill. Only the delta table name is
   * used for backfill, the entity columns and timeseries column are ignored as they are defined by
   * the associated KafkaSource.
   */
  @JsonProperty("delta_table_source")
  private DeltaTableSource deltaTableSource;

  public BackfillSource setDeltaTableSource(DeltaTableSource deltaTableSource) {
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
    BackfillSource that = (BackfillSource) o;
    return Objects.equals(deltaTableSource, that.deltaTableSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSource);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillSource.class)
        .add("deltaTableSource", deltaTableSource)
        .toString();
  }
}
