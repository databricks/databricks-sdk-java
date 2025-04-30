// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertV2OperandColumn {
  /** */
  @JsonProperty("aggregation")
  private Aggregation aggregation;

  /** */
  @JsonProperty("display")
  private String display;

  /** */
  @JsonProperty("name")
  private String name;

  public AlertV2OperandColumn setAggregation(Aggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  public Aggregation getAggregation() {
    return aggregation;
  }

  public AlertV2OperandColumn setDisplay(String display) {
    this.display = display;
    return this;
  }

  public String getDisplay() {
    return display;
  }

  public AlertV2OperandColumn setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2OperandColumn that = (AlertV2OperandColumn) o;
    return Objects.equals(aggregation, that.aggregation)
        && Objects.equals(display, that.display)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, display, name);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2OperandColumn.class)
        .add("aggregation", aggregation)
        .add("display", display)
        .add("name", name)
        .toString();
  }
}
