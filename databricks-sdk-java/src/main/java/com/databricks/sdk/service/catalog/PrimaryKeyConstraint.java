// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PrimaryKeyConstraint {
  /** Column names for this constraint. */
  @JsonProperty("child_columns")
  private Collection<String> childColumns;

  /** The name of the constraint. */
  @JsonProperty("name")
  private String name;

  /** True if the constraint is RELY, false or unset if NORELY. */
  @JsonProperty("rely")
  private Boolean rely;

  /** Column names that represent a timeseries. */
  @JsonProperty("timeseries_columns")
  private Collection<String> timeseriesColumns;

  public PrimaryKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public PrimaryKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PrimaryKeyConstraint setRely(Boolean rely) {
    this.rely = rely;
    return this;
  }

  public Boolean getRely() {
    return rely;
  }

  public PrimaryKeyConstraint setTimeseriesColumns(Collection<String> timeseriesColumns) {
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
    PrimaryKeyConstraint that = (PrimaryKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(rely, that.rely)
        && Objects.equals(timeseriesColumns, that.timeseriesColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, rely, timeseriesColumns);
  }

  @Override
  public String toString() {
    return new ToStringer(PrimaryKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("rely", rely)
        .add("timeseriesColumns", timeseriesColumns)
        .toString();
  }
}
