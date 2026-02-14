// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeltaTableSource {
  /** The entity columns of the Delta table. */
  @JsonProperty("entity_columns")
  private Collection<String> entityColumns;

  /** The full three-part (catalog, schema, table) name of the Delta table. */
  @JsonProperty("full_name")
  private String fullName;

  /** The timeseries column of the Delta table. */
  @JsonProperty("timeseries_column")
  private String timeseriesColumn;

  public DeltaTableSource setEntityColumns(Collection<String> entityColumns) {
    this.entityColumns = entityColumns;
    return this;
  }

  public Collection<String> getEntityColumns() {
    return entityColumns;
  }

  public DeltaTableSource setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public DeltaTableSource setTimeseriesColumn(String timeseriesColumn) {
    this.timeseriesColumn = timeseriesColumn;
    return this;
  }

  public String getTimeseriesColumn() {
    return timeseriesColumn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaTableSource that = (DeltaTableSource) o;
    return Objects.equals(entityColumns, that.entityColumns)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(timeseriesColumn, that.timeseriesColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityColumns, fullName, timeseriesColumn);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaTableSource.class)
        .add("entityColumns", entityColumns)
        .add("fullName", fullName)
        .add("timeseriesColumn", timeseriesColumn)
        .toString();
  }
}
