// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PercentNullValidityCheck {
  /** List of column names to check for null percentage */
  @JsonProperty("column_names")
  private Collection<String> columnNames;

  /** Optional upper bound; we should use auto determined bounds for now */
  @JsonProperty("upper_bound")
  private Double upperBound;

  public PercentNullValidityCheck setColumnNames(Collection<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public Collection<String> getColumnNames() {
    return columnNames;
  }

  public PercentNullValidityCheck setUpperBound(Double upperBound) {
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
    PercentNullValidityCheck that = (PercentNullValidityCheck) o;
    return Objects.equals(columnNames, that.columnNames)
        && Objects.equals(upperBound, that.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, upperBound);
  }

  @Override
  public String toString() {
    return new ToStringer(PercentNullValidityCheck.class)
        .add("columnNames", columnNames)
        .add("upperBound", upperBound)
        .toString();
  }
}
