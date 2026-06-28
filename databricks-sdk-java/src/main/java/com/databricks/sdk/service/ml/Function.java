// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Function {
  /** An aggregation function applied over a time window. */
  @JsonProperty("aggregation_function")
  private AggregationFunction aggregationFunction;

  /** Selects the latest value of a single column in a data source */
  @JsonProperty("column_selection")
  private ColumnSelection columnSelection;

  /**
   * Deprecated: Use the function oneof with AggregationFunction instead. Kept for backwards
   * compatibility. Extra parameters for parameterized functions.
   */
  @JsonProperty("extra_parameters")
  private Collection<FunctionExtraParameter> extraParameters;

  /**
   * Deprecated: Use the function oneof with AggregationFunction instead. Kept for backwards
   * compatibility. The type of the function.
   */
  @JsonProperty("function_type")
  private FunctionFunctionType functionType;

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

  public Function setExtraParameters(Collection<FunctionExtraParameter> extraParameters) {
    this.extraParameters = extraParameters;
    return this;
  }

  public Collection<FunctionExtraParameter> getExtraParameters() {
    return extraParameters;
  }

  public Function setFunctionType(FunctionFunctionType functionType) {
    this.functionType = functionType;
    return this;
  }

  public FunctionFunctionType getFunctionType() {
    return functionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Function that = (Function) o;
    return Objects.equals(aggregationFunction, that.aggregationFunction)
        && Objects.equals(columnSelection, that.columnSelection)
        && Objects.equals(extraParameters, that.extraParameters)
        && Objects.equals(functionType, that.functionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationFunction, columnSelection, extraParameters, functionType);
  }

  @Override
  public String toString() {
    return new ToStringer(Function.class)
        .add("aggregationFunction", aggregationFunction)
        .add("columnSelection", columnSelection)
        .add("extraParameters", extraParameters)
        .add("functionType", functionType)
        .toString();
  }
}
