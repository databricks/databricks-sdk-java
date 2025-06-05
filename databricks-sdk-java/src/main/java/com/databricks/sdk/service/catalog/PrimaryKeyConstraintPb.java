// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PrimaryKeyConstraintPb {
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  @JsonProperty("name")
  private String name;

  @JsonProperty("timeseries_columns")
  private Collection<String> timeseriesColumns;

  public PrimaryKeyConstraintPb setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public PrimaryKeyConstraintPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PrimaryKeyConstraintPb setTimeseriesColumns(Collection<String> timeseriesColumns) {
    this.timeseriesColumns = timeseriesColumns;
    return this;
  }

  public Collection<String> getTimeseriesColumns() {
    return timeseriesColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrimaryKeyConstraintPb that = (PrimaryKeyConstraintPb) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(timeseriesColumns, that.timeseriesColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, timeseriesColumns);
  }

  @Override
  public String toString() {
    return new ToStringer(PrimaryKeyConstraintPb.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("timeseriesColumns", timeseriesColumns)
        .toString();
  }
}
