// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class BackfillSource {
  /**
   * The full three-part name (catalog, schema, name) of the Delta table containing the historical
   * data to backfill.
   */
  @JsonProperty("delta_table_name")
  private String deltaTableName;

  /**
   * Deprecated: Use delta_table_name instead. Kept for backwards compatibility. The Delta table
   * source containing the historical data to backfill. Only the delta table name is used for
   * backfill, other fields are ignored.
   */
  @JsonProperty("delta_table_source")
  private DeltaTableSource deltaTableSource;

  public BackfillSource setDeltaTableName(String deltaTableName) {
    this.deltaTableName = deltaTableName;
    return this;
  }

  public String getDeltaTableName() {
    return deltaTableName;
  }

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
    return Objects.equals(deltaTableName, that.deltaTableName)
        && Objects.equals(deltaTableSource, that.deltaTableSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableName, deltaTableSource);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillSource.class)
        .add("deltaTableName", deltaTableName)
        .add("deltaTableSource", deltaTableSource)
        .toString();
  }
}
