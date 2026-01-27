// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RangeValidityCheck {
  /** List of column names to check for range validity */
  @JsonProperty("column_names")
  private Collection<String> columnNames;

  /** Lower bound for the range */
  @JsonProperty("lower_bound")
  private Double lowerBound;

  /** Upper bound for the range */
  @JsonProperty("upper_bound")
  private Double upperBound;

  public RangeValidityCheck setColumnNames(Collection<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public Collection<String> getColumnNames() {
    return columnNames;
  }

  public RangeValidityCheck setLowerBound(Double lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  public Double getLowerBound() {
    return lowerBound;
  }

  public RangeValidityCheck setUpperBound(Double upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  public Double getUpperBound() {
    return upperBound;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RangeValidityCheck that = (RangeValidityCheck) o;
    return Objects.equals(columnNames, that.columnNames)
        && Objects.equals(lowerBound, that.lowerBound)
        && Objects.equals(upperBound, that.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, lowerBound, upperBound);
  }

  @Override
  public String toString() {
    return new ToStringer(RangeValidityCheck.class)
        .add("columnNames", columnNames)
        .add("lowerBound", lowerBound)
        .add("upperBound", upperBound)
        .toString();
  }
}
