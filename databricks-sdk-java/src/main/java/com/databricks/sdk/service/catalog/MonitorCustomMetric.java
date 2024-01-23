// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorCustomMetric {
  /**
   * Jinja template for a SQL expression that specifies how to compute the metric. See [create
   * metric definition].
   *
   * <p>[create metric definition]:
   * https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition
   */
  @JsonProperty("definition")
  private String definition;

  /** Columns on the monitored table to apply the custom metrics to. */
  @JsonProperty("input_columns")
  private Collection<String> inputColumns;

  /** Name of the custom metric. */
  @JsonProperty("name")
  private String name;

  /** The output type of the custom metric. */
  @JsonProperty("output_data_type")
  private String outputDataType;

  /** The type of the custom metric. */
  @JsonProperty("type")
  private MonitorCustomMetricType typeValue;

  public MonitorCustomMetric setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public MonitorCustomMetric setInputColumns(Collection<String> inputColumns) {
    this.inputColumns = inputColumns;
    return this;
  }

  public Collection<String> getInputColumns() {
    return inputColumns;
  }

  public MonitorCustomMetric setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MonitorCustomMetric setOutputDataType(String outputDataType) {
    this.outputDataType = outputDataType;
    return this;
  }

  public String getOutputDataType() {
    return outputDataType;
  }

  public MonitorCustomMetric setType(MonitorCustomMetricType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public MonitorCustomMetricType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorCustomMetric that = (MonitorCustomMetric) o;
    return Objects.equals(definition, that.definition)
        && Objects.equals(inputColumns, that.inputColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(outputDataType, that.outputDataType)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, inputColumns, name, outputDataType, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorCustomMetric.class)
        .add("definition", definition)
        .add("inputColumns", inputColumns)
        .add("name", name)
        .add("outputDataType", outputDataType)
        .add("typeValue", typeValue)
        .toString();
  }
}
