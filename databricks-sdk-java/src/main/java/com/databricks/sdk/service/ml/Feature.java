// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Feature {
  /** The description of the feature. */
  @JsonProperty("description")
  private String description;

  /** The filter condition applied to the source data before aggregation. */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /** The full three-part name (catalog, schema, name) of the feature. */
  @JsonProperty("full_name")
  private String fullName;

  /** The function by which the feature is computed. */
  @JsonProperty("function")
  private Function function;

  /** The input columns from which the feature is computed. */
  @JsonProperty("inputs")
  private Collection<String> inputs;

  /** Lineage context information for this feature. */
  @JsonProperty("lineage_context")
  private LineageContext lineageContext;

  /** The data source of the feature. */
  @JsonProperty("source")
  private DataSource source;

  /** The time window in which the feature is computed. */
  @JsonProperty("time_window")
  private TimeWindow timeWindow;

  public Feature setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Feature setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public Feature setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public Feature setFunction(Function function) {
    this.function = function;
    return this;
  }

  public Function getFunction() {
    return function;
  }

  public Feature setInputs(Collection<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public Collection<String> getInputs() {
    return inputs;
  }

  public Feature setLineageContext(LineageContext lineageContext) {
    this.lineageContext = lineageContext;
    return this;
  }

  public LineageContext getLineageContext() {
    return lineageContext;
  }

  public Feature setSource(DataSource source) {
    this.source = source;
    return this;
  }

  public DataSource getSource() {
    return source;
  }

  public Feature setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Feature that = (Feature) o;
    return Objects.equals(description, that.description)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(function, that.function)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(lineageContext, that.lineageContext)
        && Objects.equals(source, that.source)
        && Objects.equals(timeWindow, that.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        filterCondition,
        fullName,
        function,
        inputs,
        lineageContext,
        source,
        timeWindow);
  }

  @Override
  public String toString() {
    return new ToStringer(Feature.class)
        .add("description", description)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .add("function", function)
        .add("inputs", inputs)
        .add("lineageContext", lineageContext)
        .add("source", source)
        .add("timeWindow", timeWindow)
        .toString();
  }
}
