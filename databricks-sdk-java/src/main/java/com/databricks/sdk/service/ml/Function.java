// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Function {
  /** An aggregation function applied over a time window. */
  @JsonProperty("aggregation_function")
  private AggregationFunction aggregationFunction;

  /** Selects the latest value of a single column in a data source */
  @JsonProperty("column_selection")
  private ColumnSelection columnSelection;

  /** Applies a registered Unity Catalog function row-wise to source columns. */
  @JsonProperty("custom_udf")
  private CustomUdf customUdf;

  public Function setAggregationFunction(AggregationFunction aggregationFunction) {
    this.aggregationFunction = aggregationFunction;
    return this;
  }

  public AggregationFunction getAggregationFunction() {
    return aggregationFunction;
  }

  public Function setColumnSelection(ColumnSelection columnSelection) {
    this.columnSelection = columnSelection;
    return this;
  }

  public ColumnSelection getColumnSelection() {
    return columnSelection;
  }

  public Function setCustomUdf(CustomUdf customUdf) {
    this.customUdf = customUdf;
    return this;
  }

  public CustomUdf getCustomUdf() {
    return customUdf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Function that = (Function) o;
    return Objects.equals(aggregationFunction, that.aggregationFunction)
        && Objects.equals(columnSelection, that.columnSelection)
        && Objects.equals(customUdf, that.customUdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationFunction, columnSelection, customUdf);
  }

  @Override
  public String toString() {
    return new ToStringer(Function.class)
        .add("aggregationFunction", aggregationFunction)
        .add("columnSelection", columnSelection)
        .add("customUdf", customUdf)
        .toString();
  }
}
