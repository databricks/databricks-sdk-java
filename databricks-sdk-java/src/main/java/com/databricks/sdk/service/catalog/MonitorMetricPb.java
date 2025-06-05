// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class MonitorMetricPb {
  @JsonProperty("definition")
  private String definition;

  @JsonProperty("input_columns")
  private Collection<String> inputColumns;

  @JsonProperty("name")
  private String name;

  @JsonProperty("output_data_type")
  private String outputDataType;

  @JsonProperty("type")
  private MonitorMetricType typeValue;

  public MonitorMetricPb setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public MonitorMetricPb setInputColumns(Collection<String> inputColumns) {
    this.inputColumns = inputColumns;
    return this;
  }

  public Collection<String> getInputColumns() {
    return inputColumns;
  }

  public MonitorMetricPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MonitorMetricPb setOutputDataType(String outputDataType) {
    this.outputDataType = outputDataType;
    return this;
  }

  public String getOutputDataType() {
    return outputDataType;
  }

  public MonitorMetricPb setType(MonitorMetricType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public MonitorMetricType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorMetricPb that = (MonitorMetricPb) o;
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
    return new ToStringer(MonitorMetricPb.class)
        .add("definition", definition)
        .add("inputColumns", inputColumns)
        .add("name", name)
        .add("outputDataType", outputDataType)
        .add("typeValue", typeValue)
        .toString();
  }
}
